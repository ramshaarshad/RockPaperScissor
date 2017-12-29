import java.util.Scanner;
import javax.swing.JOptionPane;
public class RockPaperScissors {
public static void main(String[] args)
{
Scanner ra=new Scanner(System.in);

JOptionPane.showMessageDialog(null,"We are going to play rock paper scissors!");
JOptionPane.showMessageDialog(null, "Please choose 1 for rock, 2 for paper, and 3 for scissors");

int yourChoice;
System.out.print("Enter your choice as an integer value: ");
yourChoice=ra.nextInt();

int rock=1;
int paper=2;
int scissors=3;

int compChoice=(int)(3*Math.random())+1;
switch(compChoice)
{
case 1:
{
	System.out.println("The computer played a "+compChoice+" which is a rock!");
	if(yourChoice==2 || compChoice==1)
	{
		System.out.println("You chose "+paper+" and the computer chose "+rock+" so you won!");
	}
	break;
	}
case 2:
{
	System.out.println("The computer played a "+compChoice+" which is paper!");
	if(yourChoice==3 || compChoice==2)
	{
		System.out.println("You chose "+scissors+" and the computer chose "+paper+" so you won!");
	}
	break;
}
case 3:
{
	System.out.println("The computer played a "+compChoice+" which is scissors!");
	if(yourChoice==1 || compChoice==3)
	{
		System.out.println("You chose "+rock+" and the computer chose "+scissors+" so you won!");
	}
	break;
}


}

if(compChoice==1 || yourChoice==3)

	System.out.println("Sorry, the computer won this round. Try again!");

if(compChoice==2 || yourChoice==1)

if(compChoice==3 || yourChoice==2)

	System.out.println("Sorry, the computer won this round. Try again!");

	
if(compChoice==1 && yourChoice==1)

	System.out.println("It's a tie!");

if(compChoice==3 && yourChoice==3)

	System.out.println("It's a tie!");

if(compChoice==2 && yourChoice==2)

	System.out.println("It's a tie!");


for(int i=1; i<=3; i++)
{
	int loop=(int)(3*Math.random())+1;
	int loop2=(int)(3*Math.random())+1;
	System.out.println("You chose a "+loop+" and the computer chose "+loop2);
}
System.exit(0);
}
}
/*
Enter your choice as an integer value: 2
The computer played a 1 which is a rock!
You chose 2 and the computer chose 1 so you won!
Sorry, the computer won this round. Try again!
You chose a 2 and the computer chose 3
You chose a 3 and the computer chose 1
You chose a 3 and the computer chose 2
*/






