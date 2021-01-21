import java.util.*;
public class MettlPos {
	public static String Right(String val) {
		if(val.equals("E")) 
			return "S";
		else if(val.equals("S"))
			return "W";
		else if(val.equals("W"))
			return "N";
		else if(val.equals("N"))
			return "E";
		else
		return null; 
	}
   public static void main(String args[]) {
	   Scanner in = new Scanner(System.in);
	   String s = "";
	   int x = in.nextInt();
	   int y = in.nextInt();
	   in.nextLine();
	   String start = in.nextLine();
	   String directions = in.nextLine();
	   String startSplit[] = start.split("-");
	   String dirSplit[] = directions.split(" ");
	   for(int i=0;i<dirSplit.length;i++) {
		   if(dirSplit[i].equals("R"))
			   s = Right(startSplit[2]);
		       System.out.println(s);
		       break;
	   }
	    in.close();  
   }
}
