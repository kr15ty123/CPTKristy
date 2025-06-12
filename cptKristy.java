import arc.*;

public class cptKristy{
	public static void main(String[] args){
		Console con = new Console();
		//Kristy Lor
		//Guess the Secret Word
		//2025-06-12
		//Version 8.47
	
		//varibles
		String strTheme;
		String strP;
		String strL;
		String strAT;
		String strQ;
		String strMenu = "";
		String strWord;
		String strName;
		String strFruits;
		
		//Title Screen
		con.println("Guess the Secret Word");
		con.println("(P)lay");
		con.println("(L)eaderboard");
		con.println("(A)dd Theme");
		con.println("(Q)uit");
		strMenu = con.readLine();
		con.clear();

		//play game
		if(strMenu.equalsIgnoreCase("P")){
		}
		if(strMenu.equalsIgnoreCase("q")){
			con.closeConsole();
		}
		if(strMenu.equalsIgnoreCase("l")){
		TextOutputFile Leaderboard = new TextOutputFile("Leaderboard.txt");
		}
		
		if(strMenu.equalsIgnoreCase("a")){
			con.clear();
			TextInputFile Quizzes = new TextInputFile("themes.txt");
			while(Quizzes.eof() != true){
			strTheme = con.readLine();
			con.println(""+strTheme);
		}
		
		//opening files
		con.println("What is your name?");
		strName = con.readLine();
		con.println("Themes: ");
			TextInputFile theme = new TextInputFile("themes.txt");	
			while(theme.eof()!=true){
			strTheme = theme.readLine();
			con.println(""+strTheme);
			
		}
		strTheme = con.readLine();
		if(strTheme.equalsIgnoreCase("fruits")){
			TextInputFile fruits = new TextInputFile("fruits.txt");
			while(fruits.eof()!=true){
				strFruits = con.readLine();
			con.println(""+strFruits);
			
			}
			}
	
		}

	}
}
