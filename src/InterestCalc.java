import java.util.*;
@SuppressWarnings("serial")
class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}


public class InterestCalc{
     public void checkValue(int amount)throws MyException{
    	 if(amount<0) {
    		 throw new MyException("Invalid amount. Please enter the non-negative values");
    	 }
     }
    	 public void checkAge(int age)throws MyException{
    		 if(age<0||(age<18)||(age>115)) {
    			 throw new MyException("Invalid age. Please enter proper age");
    		 }
    	 }
    	 public void checkMonth(int month)throws MyException{
    		 if(month<0) {
    			 throw new MyException("Invalid Number of month. Please enter non-negative values");
    		 }
    	 }
    	 public void checkDays(int Days)throws MyException{
    		 if(Days<0) {
    			 throw new MyException("Invalid Number of days. Please enter non-negative values");
    		 }
    	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterestCalc val = new InterestCalc();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Account acc;
		while(true) {
		System.out.println("MAIN MENU\n----------");
		System.out.println("1. Interest Calculator - SB");
		System.out.println("2. Interest Calculator - FD");
		System.out.println("3. Interest Calculator - RD");
		System.out.println("4. Exit");
		System.out.println("Enter your option (1..4): ");
		int choice = in.nextInt();
		int amount,numDays,age,numMonth;
		switch(choice) {
		case 1:
			System.out.print("Enter the Average amount in your account: ");
			try {
			amount = in.nextInt();
			val.checkValue(amount);
			acc = new SBAccount(amount);
			System.out.println("Interest gained: Rs. "+(int)acc.calculateInterest());
			}catch(MyException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			try {
			    System.out.print("Enter the FD Amount: ");
			    amount = in.nextInt();
			    System.out.print("\nEnter the number of days: ");
			    numDays = in.nextInt();
			    System.out.println("\nEnter your age: ");
			    age = in.nextInt();
			    val.checkValue(amount);
			    val.checkDays(numDays);
			    val.checkAge(age);
			    acc= new FDAccount(amount,numDays,age);
			    System.out.println("Interest gained: Rs. "+(int)acc.calculateInterest());
			}
			catch(MyException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			try {
		    System.out.print("Enter the RD Amount: ");
		    amount = in.nextInt();
		    System.out.print("\nEnter the number of months: ");
		    numMonth = in.nextInt();
		    System.out.print("\nEnter your age: ");
		    age = in.nextInt();
		    val.checkValue(amount);
		    val.checkMonth(numMonth);
		    val.checkAge(age);
		    acc = new RDAccount(amount,numMonth,age);
		    System.out.println("Interest gained: Rs. "+(int)acc.calculateInterest());
			}
			catch(MyException e) {
				System.out.println(e.getMessage());
			}
			break;
		    case 4:
		    	System.out.println("Exiting!!... Thanks for Using Our Application");
			System.exit(0);
		}
		
		}
	
	}

}
