import java.util.*;
public class Pracs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner in = new Scanner(System.in);
		    int id,id1;
		    String name,name1;
		    double age,age1;
		    Student stud[] = new Student[5]; 
		    for(int i=0;i<stud.length;i++){
		      id = in.nextInt(); in.nextLine();
		      name = in.nextLine();
		      age = in.nextDouble();
		      stud[i] = new Student(id,name,age);
		    }
		    id1 = in.nextInt(); in.nextLine();
		    name1 = in.nextLine();
		    age1 = in.nextDouble();
		    Student rep = new Student(id1,name1,age1);
		    Student getVal = replace(stud,rep);
		    System.out.println("Value Replaced");
		    System.out.println(getVal.getId()+" "+getVal.getName()+" "+getVal.getAge());
		    Arrays.sort(stud);
		    System.out.println("After Changing the list will be");
		    for(int i=0;i<stud.length;i++){
		      System.out.println(stud[i].getId()+" "+stud[i].getName()+" "+stud[i].getAge());
		    }
		    in.close();
		  }
		  public static Student replace(Student stud[], Student rep){
		    Student temp;
		    int k=0;
		    for(int i=0;i<stud.length;i++){
		         if(stud[i].getId() == rep.getId()){
		             temp = stud[i];
		             stud[i] = rep;
		             rep = temp;
		             k = i;
		             break;
		         }
		    }
		    return stud[k];
		  }
		}
		class Student implements Comparable<Student>{
		  private int id;
		  private String name;
		  private double age;
		  Student(int id,String name,double age){
		    this.id = id;
		    this.name = name;
		    this.age = age;
		  }
		  public void setName(String name){
		    this.name = name;
		  }
		  public void setId(int id){
		    this.id = id;
		  }
		  public void setAge(double age){
		    this.age = age;
		  }
		  public String getName(){
		    return this.name;
		  }
		  public int getId(){
		    return this.id;
		  }
		  public double getAge(){
		    return this.age;
		  }
		  public int compareTo(Student ob){
		    return (int)((this.name.compareTo(ob.getName())==0)?(((this.age - ob.getAge())==0)?(this.id-ob.getId()):this.age - ob.getAge()):this.name.compareTo(ob.getName()));
		  }
		}

		


		