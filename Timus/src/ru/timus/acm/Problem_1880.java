package ru.timus.acm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_1880 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		List<Integer> resultNumbers = new ArrayList<Integer>();
		int inputNumberCount = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder sb = new StringBuilder();

		for (byte i = 0; i < 3; i++) {
			inputNumberCount += Integer.parseInt(reader.readLine());
			sb.append(reader.readLine()).append(" ");
		}

		int[] inputNumbers = new int[inputNumberCount];

		Problem_1880.processInputString(sb.toString(), inputNumbers);

		// System.out.println(inputNumbers);

		for (int i = 0; i < inputNumbers.length; i++) {

			int element = inputNumbers[i];
			int quantity = 0;

			for (int y = 0; y < inputNumbers.length; y++) {

				if (element == inputNumbers[y]) {
					quantity++;
				}
			}
			if (quantity == 3) {
				resultNumbers.add(element);
				inputNumbers[i] = 0;
			}
		}

		System.out.println(resultNumbers.size());

	}

	private static void processInputString(String input, int[] inputNumbers) {

		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher(input);

		int i = 0;
		while (matcher.find()) {
			inputNumbers[i] = (Integer.parseInt(matcher.group()));
			i++;
		}

	}

}
