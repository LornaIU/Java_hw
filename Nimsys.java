import java.util.Scanner;

public class Nimsys {
    int stoneBalance;
    Scanner keyboard = new Scanner(System.in);   //scanner
    Boolean isPlaying =  true;                //identify whether execute while loop
    
    
   enum Cmd{                                 //four patterns
	   start,
	   exit,
	   help,
	   commands
   }
    
    
    public static void main(String[] args) {    	
    	Nimsys nimsys = new Nimsys();  //produce new nimsys
    	nimsys.PlayGame();
    }
    
    
    public void PlayGame() {
    	System.out.println("Welcome to Nim\n");
    	System.out.println("Please enter a command to continue\n");
    	while(isPlaying) {                                            //when while loop is true, execute; otherwise, break
    		
    		System.out.print("$ ");
    		String input = keyboard.next();
    		System.out.print("\n");    		
    		String[] lineSplit = input.split(" ");      //no comma
    		Cmd inputCmd = Cmd.valueOf(lineSplit[0].toLowerCase());  //convert all the characters to the lower case
    		switch(inputCmd) {
    		case start:
    		{
    			startgame();
    			break;
    		    		}
    		
    		case exit:{
    			
    			System.out.print("Thank you for playing Nim");
    			System.exit(0);
    			break;
    		}
    			
    		case help:
    		{
    			System.out.println("Type \'commands\' to list all available commands");
    			System.out.println("Type \'start\' to play game");
    			System.out.println("Player tp remove the last stone loses!");
    			isPlaying();
    			break;
    		}
    		
    		case commands:
    		{
    			System.out.println(": start\n: exit \n: help \n: commands\n ");
    			isPlaying();
    			break;
    		}
    		default:{
    		
    			break;
    			
    		}
    		}}}
    
    
    
    private void isPlaying() {
		// TODO Auto-generated method stub
		
	}

	public void startgame() {
    	String playOrNot;
        NimPlayer Player1 = new NimPlayer();  //allocate new memory space
        System.out.print("Please enter Player 1's name : " );
        String name1 = keyboard.next();
        System.out.print("");
         

        NimPlayer Player2 = new NimPlayer(); 
        System.out.print("Please enter Player 2's name : ");
        String name2 = keyboard.next();
        System.out.print("");

        do {            
            System.out.print("Enter upper bound : ");
            int removeUpBound = keyboard.nextInt();
            System.out.print("");         
            System.out.print("Enter initial number of stones :");
            int totalStone = keyboard.nextInt();
            System.out.println("");

          
            NimPlayer numStone = new NimPlayer();            // bring new object to be used
            numStone.initialStone(totalStone);
            System.out.print(numStone.stoneBalance + " stones left:");
            numStone.printStar(totalStone);

           
            while (numStone.stoneBalance > 0) {     //Player1's turn
                Player1.enterName(name1);                   // pass the name
                Player1.Player1Turn();
                int takeStone = keyboard.nextInt();
                while (takeStone > removeUpBound) {
                    System.out.print(
                            "Upper bound limit exceed, upper bound maxium choice is " +removeUpBound);
                    System.out.println("\n");
                    Player1.Player1Turn();
                    takeStone = keyboard.nextInt();
                }

                numStone.removeStones(takeStone);
                System.out.println();

                if (numStone.stoneBalance > 0) {      //Player2's turn
                    System.out.print(numStone.stoneBalance + " stones left:");
                    numStone.printStar(numStone.stoneBalance);
                } else if (numStone.stoneBalance <= 0) {
                    System.out.println("Game Over\n" + name2 + " wins!\n");
                    break;
                }

                
                Player2.enterName(name2); 
                Player2.Player2Turn();
                int takeStone2 = keyboard.nextInt();    //scanner
                while (takeStone2 > removeUpBound ) {                 
                    System.out.println(
                            "Upper bound limit exceed, upper bound maxium choice is " +removeUpBound);
                    System.out.println("n");
                    Player2.Player2Turn();
                    takeStone2 = keyboard.nextInt();
                }
                numStone.removeStones(takeStone2);
                System.out.println();

                if (numStone.stoneBalance > 0) {
                    System.out.print(numStone.stoneBalance + " stones left:");
                    numStone.printStar(numStone.stoneBalance);
                } else if (numStone.stoneBalance <= 0) {
                    System.out.println("Game Over\n" + name1 + " wins!\n");
                    break;
                }

            }
            System.out.print("Do you want to play again (Y/N):");
            playOrNot = keyboard.next();
           
        } while (playOrNot.equals("Y"));

    }
}



