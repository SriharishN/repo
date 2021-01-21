
public class SBAccount extends Account{
    double amount ;
    double interestRate = 4;
    SBAccount(double amount){
    	this.amount = amount;
    }
    
	public double calculateInterest() {
    	   return (amount*interestRate)/100;
      }
}
