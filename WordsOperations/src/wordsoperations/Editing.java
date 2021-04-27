package wordsoperations;

public class Editing {
	// scope #23
	
	public static void subEditing (String wordtoEdit) {
		// scope #24
		Operations.print("Operartion #1");
		Operations.print("Substring from 3: ");
		Operations.print(wordtoEdit.substring(3));
		Operations.linebreak();Operations.linebreak();
		
		Operations.print("Operartion #2");
		Operations.print("Substring from 4 to 10: ");
		Operations.print(wordtoEdit.substring(4, 10));
		Operations.linebreak();	Operations.linebreak();
		
		Operations.print("Operartion #3");
		Operations.print("Substring from 1 to 6: ");
		Operations.print(wordtoEdit.substring(1, 6));
		Operations.linebreak();	Operations.linebreak();
		
		Operations.print("Operartion #4");
		Operations.print("Position @: ");
		Operations.print(wordtoEdit.indexOf("@"));
		Operations.linebreak();Operations.linebreak();
		
		
		Operations.print("Operartion #5");
		Operations.print("Domain: ");
		Operations.print(wordtoEdit.substring(wordtoEdit.indexOf("@")+1,wordtoEdit.length()));
		Operations.linebreak();Operations.linebreak();
		
		
		Operations.print("Operartion #6");
		Operations.print("User: ");
		Operations.print(wordtoEdit.substring(0,wordtoEdit.indexOf("@") +1));
		Operations.linebreak();Operations.linebreak();
		
		Operations.print("Operartion #7");
		Operations.print("New email: ");
		Operations.print(wordtoEdit.substring(0,wordtoEdit.indexOf("@"))+ "@"+"java.com");
		Operations.linebreak();Operations.linebreak();
		
		
		
		
		
	}
	

}
