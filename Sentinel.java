import java.awt.*;
import java.util.*;


//this echoes user input until they use a keyword to quit program
public class Sentinel{
	public static void main(String[]args){
		Scanner console = new Scanner(System.in);
		System.out.printf("This program echoes input when user hits enter (esc to quit)\n");
		
		//listening
		while(true){
			String s =  console.nextLine();
			for(int i = 0; i < s.length(); i++){
				if((int)s.charAt(i) == 27){
					System.out.println("user terminated program");
					return;
				}	
			}
			System.out.println(s);
		}
	}
	
}
