package ru.timus.acm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_1264 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		int[] inputNumbers = new int[2];

		Problem_1264.processInputString(reader.readLine(), inputNumbers);
		
		System.out.println(inputNumbers[0]*(inputNumbers[1]+1));
		
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
