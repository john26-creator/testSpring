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

	// -------------------------------------- private attributes

	// -------------------------------------- public attributes

	// -------------------------------------- Constructor

	// -------------------------------------- Public static methods

	// -------------------------------------- Private static methods

	// -------------------------------------- Private methods

	// -------------------------------------- Protected methods

	// -------------------------------------- Public methods


	@Override
	public String encode(String inputs) {
		inputs = inputs.toUpperCase();
		char[] inputArray = inputs.toCharArray();
		
		return encodeInputs (inputArray);
	}
	
	private String encodeInputs (char [] input) {
		
		for (int i = 0; i < input.length; i++) {
			char currentChar = input[i];
			
			if (Character.isAlphabetic(currentChar)) {
				input[i] = encodeChar (currentChar);
			}
		}
		return new String(input);
	}
	
	private char encodeChar (char currentChar) {
		return (char) ((currentChar + 13));
	}
	// -------------------------------------- Setters and Getters

}
