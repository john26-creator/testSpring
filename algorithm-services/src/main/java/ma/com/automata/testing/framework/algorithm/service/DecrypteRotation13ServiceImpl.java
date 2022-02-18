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

	private String CHAR_RESULT = null;
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
	public String decode(String input) {
		CHAR_RESULT = null;
		for (int i = 1; i <= input.toUpperCase().length(); i++) {
			char c = input.charAt(i - 1);
			char res = c;
			if (Character.isAlphabetic(c)) {
				res = (char) ((c - 13));
			}
//			log.info("Result is {}", res);
//			if (CHAR_RESULT == null) {
//				CHAR_RESULT = "";
//			}
			CHAR_RESULT = CHAR_RESULT + res;
		}
		String res = CHAR_RESULT;
		return res;
	}

	// -------------------------------------- Protected methods

	// -------------------------------------- Public methods

	// -------------------------------------- Setters and Getters

}
