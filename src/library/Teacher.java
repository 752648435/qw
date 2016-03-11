package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Teacher extends Person {
    String department,title;  
    
    public Teacher()
    {
    	this(" "," ");
    }
    Teacher(String adepartment, String atitle)
    {
    	department = adepartment;
    	title = atitle;
	}
	@SuppressWarnings("unused")
	void input()throws IOException
    {

    	System.out.println("输入公寓：");
  	    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    int choice=Integer.parseInt(in.readLine());
	    System.out.println("输入头衔");
  	    BufferedReader in1=new BufferedReader(new InputStreamReader(System.in));
	    int choice1=Integer.parseInt(in1.readLine());
	    
    }
    void set(String n,String s,String d,String t)
    {
    	 n=name; s=sex; d=department; t=title;
    }
    public String toString()
    {
		return super.toString()+"department"+":"+department+"	 "+"title"+":"+title+"\n";
    	
    }
}