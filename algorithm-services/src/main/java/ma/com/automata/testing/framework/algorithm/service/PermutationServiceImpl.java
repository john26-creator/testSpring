package com.automata.testing.framework.algorithm.service;

public class PermutationServiceImpl implements IPermutationService {
	
	@Override
	public String permutEven (String input) {
		if (input == null || input.isEmpty()) {
            return str;
		}
		if (input.length()%2 == 1) {
			return permutOdd(input);
		}
		else {
			char[] ch = input.toCharArray();
			for (int i = 0; i < ch.length-1; i+=2) {
				swap(i);
			}
			return new String(ch);
		}
	}
	
	@Override
    public String permutOdd (String input) {
		if (input == null || input.isEmpty()) {
            return str;
		}
		if (input.length()%2 == 0) {
			return permutEven(input);
		}
		else {
			return permutEven(input)+"X";
		}
	}
	
	
	private static char[] swap(int index)
    {
            // Swapping the characters
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }
  
        return ch;
    }

}
