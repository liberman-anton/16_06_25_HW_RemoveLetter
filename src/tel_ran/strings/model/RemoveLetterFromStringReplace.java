package tel_ran.strings.model;

public class RemoveLetterFromStringReplace extends RemoveLetterFromString {

	public RemoveLetterFromStringReplace(String string, char letter) {
		super(string, letter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String removeLetter() {
		//String res = string.replaceAll(((Character)letter).toString(), "");
		String res = string.replace(letter, '\0');
		return res;
	}

}
