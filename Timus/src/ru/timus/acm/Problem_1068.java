package ru.timus.acm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1068 {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		short n = Short.parseShort(reader.readLine());
		int result = 0;

		if (n < 1) {

			for (short i = n; i <= 1; i++) {
				result=(n+1)*(2-(n))/2;
			}
		} else {
			result = (1 + n) * n / 2;
		}
		System.out.println(result);
	}

}
