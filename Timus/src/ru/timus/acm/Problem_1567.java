package ru.timus.acm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1567 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String inputString = reader.readLine();
		int count = 0;

		for (int i = 0; i < inputString.length(); i++) {

			switch (inputString.charAt(i)) {
			case 'a':
			case 'd':
			case 'g':
			case 'j':
			case 'm':
			case 'p':
			case 's':
			case 'v':
			case 'y':
			case '.':
			case ' ':
				count += 1;
				break;
			case 'b':
			case 'e':
			case 'h':
			case 'k':
			case 'n':
			case 'q':
			case 't':
			case 'w':
			case 'z':
			case ',':
				count += 2;
				break;
			case 'c':
			case 'f':
			case 'i':
			case 'l':
			case 'o':
			case 'r':
			case 'u':
			case 'x':
			case '!':
				count += 3;
				break;
			default:
				break;
			}

		}
		System.out.println(count);

	}

}
