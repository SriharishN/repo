
public class RDAccount extends Account {
     int noOfMonths;
     int ageOfACHolder;
     double monthlyAmount;
     public RDAccount(int amount,int numDays,int age) {
    	 this.amount = amount;
    	 this.noOfMonths = numDays;
    	 this.ageOfACHolder = age;
     }
    
     public double calculateInterest() {
    	 if(noOfMonths == 6) {
    		 if(ageOfACHolder<=60) {
    		 interestRate = 7.50;
    		 return (interestRate * amount)/100;
    	 }else {
    		 interestRate = 8.00;
    		 return (interestRate * amount)/100;
    	 }
    	 }
    	 else if(noOfMonths == 9) {
    		 if(ageOfACHolder<=60) {
    		 interestRate = 7.75;
    		 return (interestRate * amount)/100;
    	 }else {
    		 interestRate = 8.25;
    		 return (interestRate * amount)/100;
    	 }
     }
     else if(noOfMonths == 12) {
    	 if(ageOfACHolder<=60) {
    		 interestRate = 8.00;
    		 return (interestRate * amount)/100;
    	 }else {
    		 interestRate = 8.50;
    		 return (interestRate * amount)/100;
    	 }
     	 }
     else if(noOfMonths == 15) {
    	 if(ageOfACHolder<=60) {
    		 interestRate = 8.25;
    		 return (interestRate * amount)/100;
    	 }else {
    		 interestRate = 8.75;
    		 return (interestRate * amount)/100;
    	 }
     	 }
     else if(noOfMonths == 18) {
    	 if(ageOfACHolder<=60) {
    		 interestRate = 8.50;
    		 return (interestRate * amount)/100;
    	 }else {
    		 interestRate = 9.00;
    		 return (interestRate * amount)/100;
    	 }
     	 }
     else if(noOfMonths == 21) {
    	 if(ageOfACHolder<=60) {
    		 interestRate = 8.75;
    		 return (interestRate * amount)/100;
    	 }else {
    		 interestRate = 9.25;
    		 return (interestRate * amount)/100;
    	 }
     	 }
    
    	 
    	 
    	 return 0.0;
}
}
