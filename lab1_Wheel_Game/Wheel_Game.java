
import java.util.Scanner;
public class Wheel_Game {
	public static void main (String[] args) {
		System.out.print("Enter Clue:");
		Scanner clue_string = new Scanner (System.in);
		String clue=clue_string.nextLine();
		System.out.print("Enter Answer:");
		Scanner answer_string = new Scanner (System.in);
		String answer=answer_string.nextLine();
		answer=answer.toUpperCase();
		int space_counter=0;
		while (space_counter<20)
		{
			System.out.println();
			space_counter ++;
		}
		boolean success=false;
		int guess_times=0;
		String output="";
		String final_guess="";
		while(success==false)
		{
		int checking_enter=0;
		String finding_char="";
		if(guess_times==0) 
		{
			finding_char="RSTLNE";
			guess_times++;
		}
		else if(guess_times==1) 
		{
			
			System.out.print("Enter your answer with trhee consonants and one vowel ordinally: ");
			Scanner first = new Scanner (System.in);
			String first_guess=first.nextLine();
			first_guess=first_guess.toUpperCase();
			for (int y=0;y<3;y++)
			{	if(first_guess.charAt(3)=='A'||first_guess.charAt(3)=='E'||first_guess.charAt(3)=='I'||first_guess.charAt(3)=='O'||first_guess.charAt(3)=='U')
					if(first_guess.charAt(y)!='A'&&first_guess.charAt(y)!='E'&&first_guess.charAt(y)!='I'&&first_guess.charAt(y)!='O'&&first_guess.charAt(y)!='U')
						checking_enter++;
			}
			if(checking_enter!=3||first_guess.length()!=4)
			{
				checking_enter=0;
				System.out.println("Your entering does not meet the requirements!");
				continue;
			}
			finding_char=first_guess;
			guess_times++;
		}
		else if(guess_times>=2) 
		{
			System.out.print("Enter your guess answer: ");
			Scanner guess = new Scanner (System.in);
			final_guess=guess.nextLine();
			final_guess=final_guess.toUpperCase();
			guess_times++;
		}
		if(guess_times<=2)
		{
			String output_guess="";
			for(char target_char : answer.toCharArray())
			{
				if(finding_char.indexOf(target_char)==-1)
					output_guess=output_guess+"_ ";
				else 
					output_guess=output_guess+target_char+" ";
			}
			if(guess_times==1)
				output=output_guess;
			if(output_guess.equals(output)==false)
			{
				for(int x=0;x<output_guess.length();x++)
				{
					if(output.charAt(x)=='_'&&output_guess.charAt(x)!='_')
					{
						char[] temp_output = output.toCharArray();
						temp_output[x]=output_guess.charAt(x);
						output=String.valueOf(temp_output);
					}	
				}
			}
		}
		if(guess_times>2)
			{
			if(final_guess.equals(answer)==true)
			{
				String final_output="";
				for(char target_char : answer.toCharArray())
				{
					final_output=final_output+target_char+" ";
				}
				System.out.println("Answer: \""+final_output+"\"");
				success=true;
				System.out.println("succeed!!!");
			}
			else if(guess_times==5)
				{	
				success=true;
				System.out.println("Running out of three guesses, You Fail!");
				}
			}
		
		if(success==false)
		{ System.out.println("Clue: \""+ clue+"\"");
		  System.out.println("Answer: \""+output+"\"");}
		}		
	}
}
