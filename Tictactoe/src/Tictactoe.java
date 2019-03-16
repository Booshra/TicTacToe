import java.util.Scanner;

public class Tictactoe {
	Scanner sc=new Scanner(System.in);
	char [] array={'0','1','2','3','4','5','6','7','8','9'};
	static char turn='X';
	
	 public void play(){
	 print(array);
	 System.out.println("X's will play first. Enter a slot number to place X in:");
	 
	 while (true) {
			int numInput;
			 
				numInput = sc.nextInt();
				if (!(numInput > 0 && numInput <= 9)) {
					System.out.println("Invalid input; re-enter slot number:");
					continue;
				}
				
				if (array[numInput]==(char)(numInput+'0')) {
					array[numInput] = turn;
					if (turn=='X') {
						turn = 'O';
						
					} else {
						
						turn = 'X';
					}
					print(array);
				boolean result=check(array);
				if (result==true) {
				if(turn=='X') {
					System.out.println("Congratulations! player2 have won! Thanks for playing.");
					break;
				} else {
					System.out.println("Congratulations! player1 have won! Thanks for playing.");
					break;
				}
			}
				else {
					boolean c=checkdraw(array);
					if(c==false) {
						System.out.println("It's a draw! Thanks for playing.");
						break;}
					else {continue;
					}
			}
				}
				else {
					System.out.println("Slot already taken; re-enter slot number:");
					continue;
				}

	 
	 }
	 }
	 
	 public boolean check(char [] a){
		    boolean t=false;
		    if(a[1]==a[2]&& a[2]==a[3]) t=true;
		    else if  (a[4]==a[5]&& a[5]==a[6]) t=true;
		    else if  (a[7]==a[8]&&a[8]==a[9]) t=true;
		    else if   (a[1]==a[4]&&a[4]==a[7]) t=true;
		    else if  (a[2]==a[5]&&a[5]==a[8]) t=true;
		    else if  (a[3]==a[6]&&a[6]==a[9]) t=true;
		    else if  (a[1]==a[5]&&a[5]==a[9]) t=true;
		    else if  (a[3]==a[5]&&a[5]==a[7]) t=true;
		    else t=false;
		    return t;
		  }
	 
	 public void print(char [] a){
		    System.out.println("|"+a[1]+ " |"+a[2]+ " |"+a[3]+" |");
		    System.out.println("|--|--|--|");
		    System.out.println("|"+a[4]+ " |"+a[5]+ " |"+a[6]+" |");
		    System.out.println("|--|--|--|");
		    System.out.println("|"+a[7]+ " |"+a[8]+ " |"+a[9]+" |");
		  }
	 public boolean checkdraw(char[]a) {
		 boolean b=true;
		 
			 if((a[1]=='X'||a[1]=='O')&& (a[2]=='X'||a[2]=='O') && (a[3]=='X'||a[3]=='O')&& (a[4]=='X'||a[4]=='O')&&(a[5]=='X'||a[5]=='O')&&(a[6]=='X'||a[6]=='O')&&(a[7]=='X'||a[7]=='O')&&(a[8]=='X'||a[8]=='O')&&(a[9]=='X'||a[9]=='O')) b=false;
			 
		 
		 return b;
	 }
}
