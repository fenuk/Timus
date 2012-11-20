package ru.timus.acm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_1787 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String[] inputData = new String[2];

		inputData[0] = reader.readLine();
		inputData[1] = reader.readLine();

		List<Integer> turnedCarsData, approachedCarsData;

		turnedCarsData = Problem_1787.parseInputString(inputData[0]);
		approachedCarsData = Problem_1787.parseInputString(inputData[1]);

		int result = 0;

		for (int i : approachedCarsData) {
			if ((turnedCarsData.get(0)) < i) {

				result = result + (i - turnedCarsData.get(0));

			} else {
				if (result >= (turnedCarsData.get(0) - i)) {

					result = result - (turnedCarsData.get(0) - i);

				} else {

					result = 0;
				}
			}
		}
		System.out.println(result);

		// int turnedCars, approachedCars;

		/*
		 * turnedCars = Problem_1787.getTurnedCarCount(turnedCarsData);
		 * approachedCars =
		 * Problem_1787.getApproachedCarCount(approachedCarsData);
		 * 
		 * int result = approachedCars - turnedCars;
		 * 
		 * System.out.println(result>0?result:0);
		 */

	}

	private static List<Integer> parseInputString(String input) {

		List<Integer> results = new ArrayList<Integer>();

		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {

			results.add(Integer.parseInt(matcher.group()));
		}
		return results;

	}

	private static int getTurnedCarCount(List<Integer> turnedCarsData) {

		return turnedCarsData.get(0) * turnedCarsData.get(1);

	}

	private static int getApproachedCarCount(List<Integer> approachedCarsData) {

		int sum = 0;
		for (int i : approachedCarsData) {
			sum += i;

		}
		return sum;
	}
}
