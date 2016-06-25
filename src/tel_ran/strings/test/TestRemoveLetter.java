package tel_ran.strings.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tel_ran.strings.model.RemoveLetterFromString;
import tel_ran.strings.model.RemoveLetterFromStringArray;
import tel_ran.strings.model.RemoveLetterFromStringConcat;
import tel_ran.strings.model.RemoveLetterFromStringReplace;

public class TestRemoveLetter {

	@Before
	public void setUp() throws Exception {
		}

	@Test
	public void test() {
		RemoveLetterFromString removeLetter1 = new RemoveLetterFromStringConcat("asdhk", 'h');
		assertEquals("asdk",removeLetter1.removeLetter());
		RemoveLetterFromString removeLetter2 = new RemoveLetterFromStringReplace("asdhk", 'h');
		assertEquals("asdk",removeLetter2.removeLetter());
		RemoveLetterFromString removeLetter3 = new RemoveLetterFromStringArray("asdhk", 'h');
		assertEquals("asdk",removeLetter3.removeLetter());
	}

}
