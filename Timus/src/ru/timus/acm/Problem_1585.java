package ru.timus.acm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1585 {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int count = Integer.parseInt(reader.readLine());
		int e = 0, m = 0, l = 0;
		int pinguins[] = new int[count];
		for (int i = 0; i < count; i++) {
			pinguins[i] = reader.readLine().length();
		}
		for (int pinguin : pinguins) {
			switch (pinguin) {
			case 15:
				e++;
				break;
			case 16:
				m++;
				break;
			default:
				l++;
				break;
			}
		}
		if (e > m) {
			if (e > l) {
				System.out.println("Emperor Penguin");
			} else {
				System.out.println("Little Penguin");
			}
		} else {
			if (m > l) {
				System.out.println("Macaroni Penguin");
			} else {
				System.out.println("Little Penguin");
			}
		}
	}
}
