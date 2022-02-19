package com.automata.testing.framework.algorithm.service;

public class PermutationServiceImpl implements IPermutationService {

	@Override
	public String permutEven(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		if (input.length() % 2 == 1) {
			return permutOdd(input);
		} else {
			char[] ch = input.toCharArray();
			for (int i = 0; i < ch.length - 1; i += 2) {
				swap(ch, i);
			}
			return new String(ch);
		}
	}

	@Override
	public String permutOdd(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		if (input.length() % 2 == 0) {
			return permutEven(input);
		} else {
			String s1 = permutEven(input.substring(0, input.length()-1));
			char s2 = (char) (input.charAt(input.length() - 1) + 13);
			return s1 + s2;
		}
	}

	private static char[] swap(char[] ch, int index) {
		// Swapping the characters
		char temp = ch[index];
		ch[index] = ch[index + 1];
		ch[index + 1] = temp;
		return ch;
	}

}
