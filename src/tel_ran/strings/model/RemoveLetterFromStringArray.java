package tel_ran.strings.model;

public class RemoveLetterFromStringArray extends RemoveLetterFromString {

	public RemoveLetterFromStringArray(String string, char letter) {
		super(string, letter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String removeLetter() {
		char[] arrayOfChar = string.toCharArray();
		int length = arrayOfChar.length;
		int j = 0;
		for(int i = 0; i < length; i++){
			if(arrayOfChar[i] == letter) {
				arrayOfChar[i] = 0;
				j++;
			}
		}
		char[] arrayNew = new char[length - j];
		int indexNew = 0;
		for(int i = 0; i < length; i++){
			if(arrayOfChar[i] != 0) {
				arrayNew[indexNew++] = arrayOfChar[i];
			}
		}
		return new String(arrayNew);
	}

}
