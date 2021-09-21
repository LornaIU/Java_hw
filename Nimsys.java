import java.util.Scanner;


public class Nimsys {
    int stoneBalance;
    Scanner keyboard = new Scanner(System.in);
    Boolean isPlaying =  true;
      
   enum Cmd{
    Scanner keyboard = new Scanner(System.in);   //scanner
    Boolean isPlaying =  true;                //identify whether execute while loop
    
    
   enum Cmd{                                 //four patterns
	   start,
	   exit,
	   help
   }
    
    
    public static void main(String[] args) {
    	
    	Nimsys nimsys = new Nimsys();
    public static void main(String[] args) {    	
    	Nimsys nimsys = new Nimsys();  //produce new nimsys
    	nimsys.PlayGame();
    }
    

    public void PlayGame() {
    	System.out.println("Welcome to Nim\n");
    	System.out.println("Please enter a command to continue\n");
    	while(isPlaying) {
    	while(isPlaying) {                                            //when while loop is true, execute; otherwise, break
    		
    		System.out.print("$ ");
    		String input = keyboard.next();
    		System.out.print("\n");
    		
    		
    		String[] lineSplit = input.split(" ");
    		Cmd inputCmd = Cmd.valueOf(lineSplit[0].toLowerCase());
    		 
    		String[] lineSplit = input.split(" ");      //no comma
    		Cmd inputCmd = Cmd.valueOf(lineSplit[0].toLowerCase());  //convert all the characters to the lower case
    		switch(inputCmd) {
    		case start:
    		{
    			startgame();
    			break;
    		    		}
    		
    		}
    		
    		case exit:{
    			
    			System.out.print("Thank you for playing Nim");
    			System.exit(0);
    			break;
    			isPlaying();
    			break;
    		}
    		default:{
    		
    			break;
    			
    		}
    		}}}
    



	public void startgame() {
    	String playOrNot;
        NimPlayer Player1 = new NimPlayer();
        NimPlayer Player1 = new NimPlayer();  //allocate new memory space
        System.out.print("Please enter Player 1's name : " );
        String name1 = keyboard.next();
        System.out.print("");

            System.out.println("");

          
            NimPlayer numStone = new NimPlayer(); 
            NimPlayer numStone = new NimPlayer();            // bring new object to be used
            numStone.initialStone(totalStone);
            System.out.print(numStone.stoneBalance + " stones left:");
            numStone.printStar(totalStone);

           
            while (numStone.stoneBalance > 0) {
            while (numStone.stoneBalance > 0) {      //Player1's turn
                
                Player1.enterName(name1); 
                Player1.enterName(name1);                   // pass the name
                Player1.Player1Turn();
                int takeStone = keyboard.nextInt();
                while (takeStone > removeUpBound || takeStone <= 0) {
                while (takeStone > removeUpBound) {
                    System.out.print(
                            "Upper bound limit exceed, upper bound maxium choice is " +removeUpBound);
                    System.out.println("\n");

                numStone.removeStones(takeStone);
                System.out.println();

                if (numStone.stoneBalance > 0) {
                if (numStone.stoneBalance > 0) {      //Player2's turn
                    System.out.print(numStone.stoneBalance + " stones left:");
                    numStone.printStar(numStone.stoneBalance);
                } else if (numStone.stoneBalance <= 0) {

                Player2.enterName(name2); 
                Player2.Player2Turn();
                int takeStone2 = keyboard.nextInt();
                while (takeStone2 > removeUpBound || takeStone2 <= 0) {
                int takeStone2 = keyboard.nextInt();    //scanner
                while (takeStone2 > removeUpBound ) {                 
                    System.out.println(
                            "Upper bound limit exceed, upper bound maxium choice is " +removeUpBound);
                    System.out.println("n");
