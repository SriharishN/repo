import java.util.ArrayList;
import java.util.Scanner;

public class Xplore1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
		Accounts[] accts = new Accounts[4];
		String acc,cust;
		int id;
		double amt, checkAmt;
		for(int i=0;i<accts.length;i++) {
			id = in.nextInt();
			in.nextLine();
			cust = in.nextLine();
			acc = in.nextLine();
			amt = in.nextDouble();
			accts[i] = new Accounts(id,cust,acc,amt);
		}
		checkAmt = in.nextDouble();
		Accounts[] getOutput = getDiscount(accts, checkAmt);
		for(int i=0;i<getOutput.length;i++) {
			System.out.println(getOutput[i].getId()+" "+getOutput[i].getCustType()+" "+getOutput[i].getAccType()+" "+getOutput[i].getAmount());
		}
		in.close();
		
	}
   public static Accounts[] getDiscount(Accounts accs[],double check) {
	   ArrayList<Accounts> ls = new ArrayList<Accounts>();
	   for(int i=0;i<accs.length;i++) {
		   if(accs[i].getAmount() == check) {
			   ls.add(accs[i]);
		   }
	   }
	   Accounts arr[] = ls.toArray(new Accounts[ls.size()]);    //toArray(new Accounts[ls.size()]);
	   /*
	   for(int i=0;i<accs.length;i++) {
		   if(accs[i].getCustType().equals("new") && accs[i].getAccType().equals("discount")) {
			   accs[i].setAmount(accs[i].getAmount() - check);
		   }
		   if(accs[i].getCustType().equals("regular") && accs[i].getAccType().equals("corporate")) {
			   accs[i].setAmount((accs[i].getAmount() + check)* 0.10);
		   }
	   }*/
	   
	   return arr;
   }
	
	
}
class Accounts{
	private int id;
	private String custType;
	private String accType;
	private double amount;
	
	public Accounts(int id,String cust,String acc,double amt) {
		this.id = id;
		this.custType = cust;
		this.accType = acc;
		this.amount = amt;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCustType(String cust) {
		this.custType = cust;
	}
	public void setAccType(String acc) {
		this.accType = acc;
	}
	public void setAmount(double amt) {
		this.amount = amt;
	}
	public int getId(){
		return this.id;
	}
	public String getCustType() {
		return this.custType;
	}
	public String getAccType() {
		return this.accType;
	}
	public double getAmount() {
		return this.amount;
	}
}