package tel_ran.strings.model;

public abstract class RemoveLetterFromString {
	protected String string;
	protected char letter;
	public RemoveLetterFromString(String string, char letter) {
		super();
		this.string = string;
		this.letter = letter;
	}
	public void setString(String string) {
		this.string = string;
	}
	public void setLetter(char letter) {
		this.letter = letter;
	}
	public abstract String removeLetter();
}
