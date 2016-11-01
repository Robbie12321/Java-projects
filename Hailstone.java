import java.util.*;

public class Hailstone{
	public static void main(String[] args){
		Scanner s1 = new Scanner(System.in);
	//initialize and inform user of program function
	System.out.println("This program performs operations on a given integer to create a hailstone sequence of given length. The hailstone sequence is formed by operations: (if odd (3x+1) if even (x/2). The purpose is to find if all hailstone sequences end the same way.");
	System.out.println("please enter an integer for the sequence:");
	long num = s1.nextLong();
	System.out.println("please enter an integer to denote number of times oepration is performed (n):");
	long n = s1.nextLong();
	System.out.println("");
	//System.out.Println("please enter desired operation for odd integers");
	//String odd = s1.next();
	//System.out.Println("please enter desired operation for odd integers");
	//String even = s1.next();
	System.out.print("Hailstone sequence = " + num + ",");	
	for(int i = 0; i < n; i++){
		num = function(num);
		System.out.print(num + ",");	
	}
	System.out.println("");
	return;
}

	//static method performs the math equation
	private static long function(long num){
		if(num%2 == 1){
			num = num*3+1;
			return num;
		}else{
			num = num/2;
			return num;
		}

	}
}
