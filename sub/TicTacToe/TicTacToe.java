import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class TicTacToe {

	public static void main(String[] args) {
		char[] arr=new char[9];
		Arrays.fill(arr, 'P');
		
		TreeSet<Integer> set=new TreeSet<>();
		
		//fill treeset
		for(int i=1;i<=9;i++)
			set.add(i);
		
		boolean win=false, XPlayer=false, OPlayer=false;
		String board="\t ||\t || \n"
				+ "    7    ||   8  ||   9   \n "
				+ "\t ||\t ||\t  \n"
				+ "==========================\n"
				+ "\t ||\t ||\t  \n"
				+ "    4    ||   5  ||   6    \n"
				+ " \t ||\t ||\t  \n"
				+ "==========================\n"
				+ "\t ||\t ||\t  \n"
				+ "    1    ||   2  ||   3    \n"
				+ " \t ||\t ||\t";

		System.out.println("\n\n"+board);
		System.out.println(set);
		while(!board.contains("[1-9]")||win) 
		{
			String spotP1="",spotP2="";
			Scanner pInput=new Scanner(System.in);
			
			
			//Player X Starts
			
			 
			 while(!spotP1.matches("[0-9]")||set.contains(Integer.parseInt(spotP1)))
			 {
					System.out.print("\nPlayer X go first input your spot: ");
					spotP1=pInput.next()+"";
					set.remove(Integer.parseInt(spotP1));
			 }
			
			
			if(arr[Integer.parseInt(spotP1)-1]=='P')
				arr[Integer.parseInt(spotP1)-1]='X';
			
			board=board.replace(spotP1.charAt(0), 'X');
			System.out.println("\n\n");
			System.out.println("\n\n"+board);
			
			if(		(arr[0]=='X'&&arr[1]=='X'&&arr[2]=='X')
					||	(arr[0]=='X'&&arr[3]=='X'&&arr[6]=='X')
					||  (arr[6]=='X'&&arr[7]=='X'&&arr[8]=='X')
					||  (arr[8]=='X'&&arr[5]=='X'&&arr[2]=='X')
					||  (arr[8]=='X'&&arr[4]=='X'&&arr[0]=='X')
					||  (arr[6]=='X'&&arr[4]=='X'&&arr[2]=='X')
					||  (arr[5]=='X'&&arr[4]=='X'&&arr[3]=='X')
					||  (arr[7]=='X'&&arr[4]=='X'&&arr[1]=='X')
				  )
				{
					win=true;
					XPlayer=true;
				}
					//Do samething for O Player
					
				
				

					if(set.isEmpty())
					{
						System.out.println("DRAW");
						break;
					}
					if(win) 
					{
						if(XPlayer)
						{
							System.out.println("X PLAYER WINS!");
							break;
						}
						else
						{
							System.out.println("O PLAYER WINS!");
							break;
						}
					}
					
				
			
			
			//Player O Starts
			 
			while(!spotP2.matches("[0-9]")||set.contains(Integer.parseInt(spotP1)))
			{
				System.out.print("\nPlayer O go first input your spot: ");
				spotP2=pInput.next()+"";
				set.remove(Integer.parseInt(spotP2));
			}
			
			if(arr[Integer.parseInt(spotP2)-1]=='P')
				arr[Integer.parseInt(spotP2)-1]='O';
			
			board=board.replace(spotP2.charAt(0), 'O');
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\n\n"+board);
			//Check for winning patterns here
			
				//Do samething for O Player
				if(		(arr[0]=='O'&&arr[1]=='O'&&arr[2]=='O')
					||	(arr[0]=='O'&&arr[3]=='O'&&arr[6]=='O')
					||  (arr[6]=='O'&&arr[7]=='O'&&arr[8]=='O')
					||  (arr[8]=='O'&&arr[5]=='O'&&arr[2]=='O')
					||  (arr[8]=='O'&&arr[4]=='O'&&arr[0]=='O')
					||  (arr[6]=='O'&&arr[4]=='O'&&arr[2]=='O')
					||  (arr[5]=='O'&&arr[4]=='O'&&arr[3]=='O')
					||  (arr[7]=='O'&&arr[4]=='O'&&arr[1]=='O')
				  )
				{
					win=true;
					OPlayer=true;
				}
			
			
			
				if(set.isEmpty())
				{
					System.out.println("DRAW");
					break;
				}
				if(win) 
				{
					if(XPlayer)
					{
						System.out.println("X PLAYER WINS!");
						break;
					}
					else
					{
						System.out.println("O PLAYER WINS!");
						break;
					}
				}
				
			
		}
		
	}
	
	
	
	

}
