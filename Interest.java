import java.util.*;
import java.lang.*;

public class Interest{
	public static void main(String[] args){
	Scanner s1 = new Scanner(System.in);
	
	//initialize variables
	System.out.println("How much money do you want to put in the bank?   :");
	double principal = s1.nextDouble();
	double currentAmount = principal;
	double totalDeposited = principal;
	System.out.println("At what interest rate?   :");
  	double interestRate = s1.nextDouble()/100;
	System.out.println("Compounding how many times per year (e.g. 4 for quarterly compound rate, or 1 for yearly)?   :");
  	double compoundFrequency = (1/s1.nextDouble());
	System.out.println("Compounding for how many periods?   :");
  	double totalPeriodsCompounding = s1.nextDouble();
	double totalInterestEarned = 0;
	double currentPeriod = 0;
	String[] table = new String[1 + totalPeriodsCompounding];
	table[0] = "| Period | Rate | current amount | Interest Earned |";
	
	
	//allows user to add variably sized deposit each period
	//and saves the data in a table to be printed at the end 
	for(int i = 1; i < totalPeriodsCompounding; i++){
  	currentPeriod += compoundFrequency;
  	System.out.println("How much do you deposit this term?  :");
	double depositAmount = s1.nextDouble();
	totalDeposited += depositAmount;
	currentAmount += depositAmount;	
	currentAmount += principal * Math.pow( 1+ (interestRate / compoundFrequency), compoundFrequency * currentPeriod);  	
	  	
	  	
	  	
	totalInterestEarned = currentAmount - totalDeposited;
	table[i] = String.format("%f      %f      %f     %f\n", currentPeriod, interestRate, currentAmount, totalInterestEarned);
	}
	
	
	
}	
	
	
	
	
	//calculate interest


	
	
	
	
	// deposit method
	
		
	  	
		
	
		
}
