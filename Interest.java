import java.util.*;
import java.lang.*;

public class CompoundInterest{
	public static void main(String[] args){
	Scanner s1 = new Scanner(System.in);
	
	//initialize variables
	System.out.println("How much money do you want to put in the bank?   :");
	double principal = s1.nextDouble();
	double currentAmount = principal;
	
	System.out.println("At what interest rate?   :");
  	double interestRate = s1.nextDouble()/100;
	
	System.out.println("Compounding how many times per year (e.g. 4 for quarterly compound rate, or 1 for yearly)?   :");
  	double compoundFrequency = (1/s1.nextDouble());
	
	System.out.println("Compounding for how many periods?   :");
  	double totalPeriodsCompounding = s1.nextDouble();
	
	double totalInterestEarned = 0;
	double currentPeriod = compoundFrequency;
	String[] table = new String[1 + totalPeriodsCompounding];
	table[
	
	
	
	
	
	}	
}
