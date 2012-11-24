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
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		int n = Integer.parseInt(reader.readLine());
		int result = 0;

		if (n < 1) {

			for (int i = n; i <= 1; i++) {
				result += i;
			}
		}else{
			for(int i =1; i<=n; i++){
				result+=i;
			}
		}
		System.out.println(result);
	}

}
