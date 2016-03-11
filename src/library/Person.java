package library;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Person {
     String name;
     String sex;
     public Person()
     {
    	 this( " " , " ");
     }
   	
	public Person(String aname, String asex) {
		name=aname;
		sex=asex;
	}
	@SuppressWarnings("unused")
	void input()throws IOException
     {
		System.out.println("输入人名：");
  	    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    int choice=Integer.parseInt(in.readLine());
	    System.out.println("输入性别：");
  	    BufferedReader in1=new BufferedReader(new InputStreamReader(System.in));
	    int choice1=Integer.parseInt(in1.readLine());
	   
     }
     void set(String n,String s)
     {
    	 n=name; s=sex;
     }
     public String toString()
     {
		return "name"+":"+name+"	 "+"sex"+":"+sex+"\n";
    	 
     }
     void output() 
     {
    	 
     }
     /*    String getName()
     {
    	 return name;
     }
     String getSex()
     {
    	 return sex;
     }
*/    	 
 
}