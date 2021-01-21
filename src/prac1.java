import java.util.*;
public class prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner(System.in);
       int num = in.nextInt();
       int count =0;
       if(num%2 == 1) {
    	   int a = 1,com = 2;
    	   while(count<num/2) {
    		   count++;
    		   a = a * com;
    		   //System.out.println(a);
    	   }System.out.println(a);
       }else {
    	   int b = 1,com = 3,count1=0;
    	   while(count1<num/2-1) {
    		   count1++;
    		   b = b*com;
    		   //System.out.println(b);
    	   }
    	   System.out.println(b);
       }in.close();
	}

}
