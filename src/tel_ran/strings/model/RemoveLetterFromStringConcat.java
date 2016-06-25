package tel_ran.strings.model;

public class RemoveLetterFromStringConcat extends RemoveLetterFromString {

	public RemoveLetterFromStringConcat(String string, char letter) {
		super(string, letter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String removeLetter() {
		String res = "";
		int length = string.length();
		for(int i = 0; i < length; i++){
			char ch = string.charAt(i);
			if(letter != ch) res+=ch;
		}
		return res;
	}

}
