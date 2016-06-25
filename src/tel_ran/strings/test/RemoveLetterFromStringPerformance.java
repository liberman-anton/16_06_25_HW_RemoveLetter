package tel_ran.strings.test;

import tel_ran.strings.model.RemoveLetterFromString;

public class RemoveLetterFromStringPerformance {
	private int lengthString;
	private int nRuns;
	private RemoveLetterFromString removeLetter;
	public RemoveLetterFromStringPerformance(int lengthString, int nRuns) {
		super();
		this.lengthString = lengthString;
		this.nRuns = nRuns;
	}
	public void setRemoveLetter(RemoveLetterFromString removeLetter) {
		this.removeLetter = removeLetter;
	}
	public long run(){
		String string = getString();
		removeLetter.setString(string);
		removeLetter.setLetter('l');
		long timeStart=System.currentTimeMillis();
		runRemove();
		return System.currentTimeMillis()-timeStart;
	}
	private void runRemove() {
		for(int i = 0; i < nRuns; i++){
			removeLetter.removeLetter();
		}
	}
	private String getString() {
		StringBuilder builder = new StringBuilder();		
		for(int i = 0; i < lengthString; i++){
			if(i%10 == 0) builder.append('l');
			else builder.append('a');
		}
		return builder.toString();
	}
}
