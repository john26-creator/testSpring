package com.automata.testing.framework.algorithm.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/*
 * Copyright: Copyright (c) Automata akt.io 2021
 */

/**
 * Dependencies
 */

/**
 * This is a very simple way to manage the encryption service.
 * 
 * @author GELIBERT
 */
@Service
@Slf4j
public class EncrypteRotation13ServiceImpl implements IEncryptionService {

	// -------------------------------------- Inner classes

	// -------------------------------------- public static attributes

	// -------------------------------------- private static attributes

	/**
	 * Storing the last character we handled.
	 */
	private String CHAR_RESULT = null;

	// -------------------------------------- private attributes

	// -------------------------------------- public attributes

	// -------------------------------------- Constructor

	// -------------------------------------- Public static methods

	// -------------------------------------- Private static methods

	// -------------------------------------- Private methods

	// -------------------------------------- Protected methods

	// -------------------------------------- Public methods

	@Override
	public synchronized String encode(String input) {
		CHAR_RESULT = null;
		for (int i = 1; i <= input.toUpperCase().length(); i++) {
			char c = input.charAt(i - 1);
			char res = c;
			if (Character.isAlphabetic(c)) {
				res = (char) ((c + 13));
			}
//			log.info("Result is {}", res);
			if (CHAR_RESULT == null) {
				CHAR_RESULT = "";
			}
			CHAR_RESULT = CHAR_RESULT + res;
		}
		String res = CHAR_RESULT;
		return res;
	}

	// -------------------------------------- Setters and Getters

}
