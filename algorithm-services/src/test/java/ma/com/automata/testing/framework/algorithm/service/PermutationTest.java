package com.automata.testing.framework.algorithm.service;
/*
 * Copyright: Copyright (c) Automata akt.io 2021
 */

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.automata.testing.framework.algorithm.service.PermutationServiceImpl;
import com.automata.testing.framework.algorithm.service.IPermutationService;

/**
 * Dependencies
 */

/**
 * Unit test for algorithms.
 * 
 * @author GELIBERT
 */
@SpringBootTest(classes = PermutationServiceImpl.class)
public class PermutationTest {

	// -------------------------------------- Inner classes

	// -------------------------------------- public static attributes

	// -------------------------------------- private static attributes

	// -------------------------------------- private attributes

	/**
	 * Permutation service to use.
	 */
	private IPermutationService permutationService;


	// -------------------------------------- public attributes

	// -------------------------------------- Constructor

	// -------------------------------------- Public static methods

	// -------------------------------------- Private static methods

	// -------------------------------------- Private methods

	// -------------------------------------- Protected methods

	// -------------------------------------- Public methods

	
	/**
	 * Testing the ROT 13 Algorithm.
	 */
	@Test
	public void permutEvenTest() {
		// Testing with data ABC, that should be changed in NOP
		permutationService = new PermutationServiceImpl ();
		String res = permutationService.permutEven("KAYA");

		Assertions.assertEquals("AKAY", res);

	}

	/**
	 * Testing Synchronous encoding and decoding.
	 */
	@Test
	public void permutOddTest() {
		permutationService = new PermutationServiceImpl ();
		String res = permutationService.permutOdd("KAYAK");

		Assertions.assertEquals("AKAYX", res);
	}

	// -------------------------------------- Setters and Getters

}
