package com.automata.testing.framework.algorithm.service;

import lombok.extern.slf4j.Slf4j;

/*
 * Copyright: Copyright (c) Automata akt.io 2021
 */

/**
 * Dependencies
 */

/**
 * Basic Decryption Management Service Impl
 * 
 * @author GELIBERT
 */
@Slf4j
public class DecrypteRotation13ServiceImpl implements IDecryptionService {

	// -------------------------------------- Inner classes

	// -------------------------------------- public static attributes

	// -------------------------------------- private static attributes

	// -------------------------------------- private attributes

	// -------------------------------------- public attributes

	// -------------------------------------- Constructor

	// -------------------------------------- Public static methods

	// -------------------------------------- Private static methods

	// -------------------------------------- Private methods

	@Override
	public String decode(String inputs) {
		char[] inputArray = inputs.toCharArray();
		return decodeInputs (inputArray);
	}
	
	private String decodeInputs (char [] input) {
		for (int i = 0; i < input.length; i++) {
			char currentChar = input[i];
			input[i] = decodeChar(currentChar);
		}
		return new String(input);
	}
	
	private char decodeChar (char currentChar) {
		return (char) ((currentChar - 13));
	}

	// -------------------------------------- Protected methods

	// -------------------------------------- Public methods

	// -------------------------------------- Setters and Getters

}
