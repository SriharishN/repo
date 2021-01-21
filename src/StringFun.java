import java.util.*;
import java.lang.*;
public class StringFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String name = "how aryze you";
         String arr[] = name.split(" ");
         for(int i=0;i<arr.length;i++) {
        	 if(i==0) {
             System.out.println(arr[i].replaceAll("[aeiou]", "\\$"));       	 
          }if(i==1) {
        	  System.out.println(arr[i].replaceAll("[^aeiou]", "#"));
          }if(i==2) {
        	  System.out.println(arr[i].toUpperCase());
          }
         }

	}

}
