import java.util.*;
public class pracs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt(),i=1,count=0,k=0,flag=0;
        if(num%2 == 0){
        	num = num/2;
            while(count <=num){  
                for(int j=2;j<=i/2;j++){
                    if(i%j == 0){
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0){
                    k = i;
                    count++;
                }
                 flag = 0;
                 i++;
            } System.out.println(k);
        }else{
              int t1 =0, t2 =1, nexterm,count1=0;
              while(count1<=num/2) {
            	  count1++;
            	  nexterm = t1+t2;
            	  t1 = t2;
            	  t2 = nexterm;
              }System.out.println(t1);
        }
        in.close();
	}

}
