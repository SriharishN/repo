import java.util.*;
public class prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner in = new Scanner(System.in);
		    String input = in.nextLine();
	        char arr[] = input.toCharArray();
		    ArrayList<Character> list = new ArrayList<Character>();
	        list.add(arr[0]);
	        for(int i=0;i<arr.length-1;i++){
	                if(arr[i] != arr[i+1]){
	                    list.add(arr[i+1]);
	                }
	        }
	        StringBuffer sb = new StringBuffer();
	        for(char c:list) {
	        	sb.append(c);
	        }
	        System.out.println(sb.toString());
	        System.out.println(sb.reverse().toString());
	        in.close();
}
}
