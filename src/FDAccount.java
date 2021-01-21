
public class FDAccount extends Account{
    int noOfDays;
    int ageOfACHolder;
    public FDAccount(int amount,int days,int age) {
    	this.noOfDays = days;
    	this.amount = amount;
    	this.ageOfACHolder = age;
    }
    
    
    public double calculateInterest() {
    	if(amount<=10000000) {
    		  if(noOfDays >= 7 && noOfDays<=14) {
    			  if(ageOfACHolder<=60) {
    			  interestRate = 4.50;
    			  return (amount * interestRate)/100;
    		  }else {
    			  interestRate = 5.00;
    			  return (amount * interestRate)/100;
    		  }
    		  }else  if(noOfDays >= 15 && noOfDays<=29) {
    			 if(ageOfACHolder<=60) {
    			  interestRate = 4.75;
    			  return (amount * interestRate)/100;
    		  }else {
    			  interestRate = 5.25;
    			  return (amount * interestRate)/100;
    		  }
    	}else  if(noOfDays >= 30 && noOfDays<=45) {
			 if(ageOfACHolder<=60) {
   			  interestRate = 5.50;
   			  return (amount * interestRate)/100;
   		  }else {
   			  interestRate = 6.00;
   			  return (amount * interestRate)/100;
   		  }
   	}else  if(noOfDays >= 45 && noOfDays<= 60) {
		 if(ageOfACHolder<=60) {
			  interestRate = 7.00;
			  return (amount * interestRate)/100;
		  }else {
			  interestRate = 7.50;
			  return (amount * interestRate)/100;
		  }
	}else  if(noOfDays >= 61 && noOfDays<=184) {
		 if(ageOfACHolder<=60) {
			  interestRate = 7.50;
			  return (amount * interestRate)/100;
		  }else {
			  interestRate = 8.00;
			  return (amount * interestRate)/100;
		  }
	}else  if(noOfDays >= 185 && noOfDays<=365) {
		 if(ageOfACHolder<=60) {
			  interestRate = 8.00;
			  return (amount * interestRate)/100;
		  }else {
			  interestRate = 8.50;
			  return (amount * interestRate)/100;
		  }
	}
    		  
    	}else {
    		 if(noOfDays >= 7 && noOfDays<=14) {
    			 interestRate = 6.50;
    			 return (amount*interestRate)/100;
    		 }else if(noOfDays >= 15 && noOfDays<=45) {
    			 interestRate = 6.75;
    			 return (amount*interestRate)/100;
    		 } else if(noOfDays >= 45 && noOfDays<=60) {
    			 interestRate = 8.00;
    			 return (amount*interestRate)/100;
    		 }else if(noOfDays >= 61 && noOfDays<=184) {
    			 interestRate = 8.50;
    			 return (amount*interestRate)/100;
    		 }else if(noOfDays >= 185 && noOfDays<=365) {
    			 interestRate = 10.00;
    			 return (amount*interestRate)/100;
    		 }
    	}
    	return 0.0;
    }
}
