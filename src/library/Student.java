package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student extends Person {
    String department,speciality,number;
    Student()
    {
    	this("", "", "");
    }
    public Student(String adepartment, String aspeciality, String anumber)
    {
		department=adepartment;
		speciality=aspeciality;
		number=anumber;
	}
	@SuppressWarnings("unused")
	void input()throws IOException
    {
    	System.out.println("输入公寓：");
  	    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    int choice=Integer.parseInt(in.readLine());
	    System.out.println("输入专业");
  	    BufferedReader in1=new BufferedReader(new InputStreamReader(System.in));
	    int choice1=Integer.parseInt(in1.readLine());
	    System.out.println("输入number");
  	    BufferedReader in11=new BufferedReader(new InputStreamReader(System.in));
	    int choice11=Integer.parseInt(in11.readLine());
    }
    void set(String n,String s,String d,String spec,String num)
    {
    	n=name; s=sex; d=department; spec=speciality; num=number;
    }
    public String toString()
    {
		return "name"+":"+name+"	 "+"sex"+":"+sex+"\n" + "department"+":"+department+"	 "+"speciality"+":"+speciality+"   "
				+"number"+":"+number+"\n";
    	
    }
}