package tel_run.strings.controller;

import tel_ran.strings.model.RemoveLetterFromString;
import tel_ran.strings.model.RemoveLetterFromStringArray;
import tel_ran.strings.model.RemoveLetterFromStringConcat;
import tel_ran.strings.model.RemoveLetterFromStringReplace;
import tel_ran.strings.test.RemoveLetterFromStringPerformance;

public class RemoveLetterPerformanceTestAppl {
	private static final int LENGTH_STRING = 2000;
	private static final int N_RUNS = 1000;
	static RemoveLetterFromStringPerformance performanceTest = 
			new RemoveLetterFromStringPerformance(LENGTH_STRING, N_RUNS);
	public static void main(String[] args) {
		System.out.println("Performance test with string length = " + LENGTH_STRING +
				" amount of runs " + N_RUNS);
		runTest(new RemoveLetterFromStringConcat(null, '\0'), "Concatination");
		runTest(new RemoveLetterFromStringReplace(null, '\0'), "Replace");
		runTest(new RemoveLetterFromStringArray(null, '\0'), "Array");
	}
	private static void runTest(RemoveLetterFromString removeLetterFromString, String className) {
		performanceTest.setRemoveLetter(removeLetterFromString);
		System.out.println(className + " running time for " + performanceTest.run());

	}
}
