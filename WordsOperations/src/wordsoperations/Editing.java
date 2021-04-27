package wordsoperations;

public class Editing {
	// scope #23
	
	public static void subEditing (String wordtoEdit) {
		// scope #24
		Operations.print("Substring from 3: ");
		Operations.print(wordtoEdit.substring(3));
		Operations.linebreak();
		
		Operations.print("Substring from 3 to 6: ");
		Operations.print(wordtoEdit.substring(3, 6));
		Operations.linebreak();
		
		Operations.print("Position @: ");
		Operations.print(wordtoEdit.indexOf("@"));
		Operations.linebreak();
		
		Operations.print("Domain: ");
		Operations.print(wordtoEdit.substring(wordtoEdit.indexOf("@"), wordtoEdit.length()));
		Operations.linebreak();
		
		Operations.print("User: ");
		Operations.print(wordtoEdit.substring(0,wordtoEdit.indexOf("@")));
		Operations.linebreak();
		
		Operations.print("New email: ");
		Operations.print(wordtoEdit.substring(0,wordtoEdit.indexOf("@")) + "@" +  "java.com");
		Operations.linebreak();
		
		
		
		
		
	}
	

}
