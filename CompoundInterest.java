import java.util.*;
import java.lang.*;

public class CompoundInterest{
	public static void main(String[] args){
	Scanner s1 = new Scanner(System.in);
	
	///////////////
	//initializing/getting variables from user: principalAmount, Amount, totalAdded, interest rate, compoundFrequency, totalTermsCompounding, totalinterestearned
	///////////////
	//get inital investment from user and make sure it's formatted
	double Amount = 0;
	System.out.println("How much money do you want to put in the bank?   :");
	//while (!s1.hasNextDouble()) {	
  		Amount = s1.nextDouble();
  		
  		System.out.println("Amount = :" + Amount);
  		double pricipalAmount = Amount;
  		double totalAdded = Amount;
  	//}
  	//get interest rate from user and make sure it's formatted
	double interestRate = 0;
	//while (!s1.hasNextDouble()) {
  		System.out.println("At what interest rate?   :");
  		interestRate = s1.nextDouble()/100;
  	//}
  	
  	//get compound frequency from user and make sure it's formatted
	double compoundFrequency = 0;
	//while (!s1.hasNextDouble()) {
  		System.out.println("Compounding how many times per year (e.g. 4 for quarterly compound rate)?   :");
  		compoundFrequency = (1/s1.nextDouble());
  		System.out.println("compoundFrequency = : " + compoundFrequency);
  	//}
  	
  	//get compound frequency from user and make sure it's formatted
	double totalTermsCompounding = 0;
	//while (!s1.hasNextDouble()) {
  		System.out.println("Compounding for how many terms?   :");
  		totalTermsCompounding = s1.nextDouble();
  		System.out.println("totalTermsCompounding = :" + totalTermsCompounding);
  	//} 	
  	
  	double totalInterestEarned = 0;
  	//////////////
  	//////////////
  	
  	
  	//save first line of table as a string
  	String[] table = new String[((int)totalTermsCompounding+1)];
  	table[0] = "Term:      Rate:       Balance before deposit:      Total Interest Earned:      New Deposit:      Balance after deposit:";
  	System.out.println("table[0] = :" + table[0]);
  	table[1] = String.format("1          %f          0                            0                           %f                %f\n", interestRate, Amount, Amount);
  	 				 
	
	//update current term and method returns balance at quarter or year's end
	double term = compoundFrequency;
	Amount = calculateInterest(Amount, interestRate, compoundFrequency,  term);
	System.out.println("Amount = :" + Amount);
	
  	//method to put new money in the bank and add data to string array.
  	for(int i = 1; i < totalTermsCompounding; i++){
  	term += compoundFrequency;
  	Amount = deposit(s1, Amount , interestRate, compoundFrequency,  term, i, table);
  	
  	}
  	
  	
  	//end by printing table of data
  	for(int i = 0; i < totalTermsCompounding; i++){
  		System.out.println(table[i]);
  	}
}








	//METHOD returns balance at quarter or year's end using compound interest formula
	//P = P(1+(r/n))^(nt)
	private static double calculateInterest(double Amount, double interestRate, double compoundFrequency, double term){
		double newTotal = Amount*(Math.pow(1+(interestRate/compoundFrequency),compoundFrequency*term));
		return newTotal;
	}	




	//METHOD to put new money in the bank and save data as a string to be printed at the end
	private static double deposit(Scanner s1, double Amount, double interestRate, double compoundFrequency, double term, int i, String[] table){ 
		double depositAmount = 0;
		//while (!s1.hasNextDouble()) {
	  		System.out.println("How much do you deposit this term?  :");
	  		depositAmount = s1.nextDouble();
	  	//}
	  	table[i] = String.format("%d      %f      %f     %f      %f\n", i, interestRate, Amount, depositAmount, (Amount+depositAmount));
	  	
		Amount = calculateInterest(Amount, interestRate, compoundFrequency,  term);
		return Amount;
	}
}





















