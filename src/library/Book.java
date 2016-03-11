package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Book {
    int id;
    String name;
    int amount;
    void set(int i,String n,int a)
    {
    	i=id; n=name; a=amount;
    }
    @SuppressWarnings("unused")
	void input()throws IOException
    {
    	System.out.println("输入书的id：");
  	    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    int choice=Integer.parseInt(in.readLine());
	    System.out.println("输入书的名称");
  	    BufferedReader in1=new BufferedReader(new InputStreamReader(System.in));
	    int choice1=Integer.parseInt(in1.readLine());
	    System.out.println("输入书的数量");
  	    BufferedReader in11=new BufferedReader(new InputStreamReader(System.in));
	    int choice11=Integer.parseInt(in11.readLine());
    }
    public String toString()
    {
		return "name"+":"+name+"	 "+"id"+":"+id+"\n"+"amount"+"="+amount;
    	
    }
    void output()
    {
    	System.out.println("书的id是：" + id);
    	System.out.println("书的名称是：" + name);
    	System.out.println("书的数量是：" + amount);
    }
}