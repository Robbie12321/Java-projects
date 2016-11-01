import java.util.*;

public class Hailstone{
	public static void main(String[] args){
		Scanner s1 = new Scanner(System.in);
	//initialize and inform user of program function
	System.out.println("This program performs operations on a given integer to create a hailstone sequence of given length. The hailstone sequence is formed by operations: (if odd (3x+1) if even (x/2). The purpose is to find if all hailstone sequences end the same way.");
	System.out.println("please enter a starting integer for the sequence:");
	long num = s1.nextLong();
	System.out.println("please enter a value n where n = number of times operation is performed:");
	long n = s1.nextLong();
	System.out.println("please enter the number of different operations defining the sequence. e.g. 2 if there is one operattion for odd numbers, and 1 operation for even numbers:");
	int numOperations = s1.nextInt();
	String[] operations = new String[numOperations];
	for(int i = 0; i < numOperations; i++){
		System.out.println("please enter formula" + i);
		operations[i] = s1.next();
	}

	System.out.println("please enter corresponding conditions (in java friendly format) for respective operations implementation. e.g. \"x%2 == 0\" for condition x is even");
	String[] conditions = new String[numOperations];
        for(int i = 0; i < numOperations; i++){
                System.out.println("please enter formula" + i);
                conditions[i] = s1.next();
        }

	System.out.println("");

	System.out.print("sequence = " + num + ",");
	int count = 0; //keeps count of operations and conditions arrays	
	for(int i = 0; i < n; i++){
		num = function(num,operations,conditions,count);
		System.out.print(num + ",");
		count++;	
	}
	System.out.println("");
	return;
}

	//static method performs the math equation
	private static long function(long num, String[] operations, String[] conditions, int count){
		for(numOperations)
		if(num%2 == 1){
			num = num*3+1;
			return num;
		}else{
			num = num/2;
			return num;
		}

	}
}
