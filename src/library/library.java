package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class library {
    static Person persons[];
    Book books[];
    static Borrow borrows[];
    static int n_persons;
	int n_books;
	static int n_borrows;
    library()
    {
    	persons=new Person[100];
    	books=new Book[100];
    	borrows=new Borrow[1000];
    	n_persons=0;n_books=0;n_borrows=0;
    }
    static int input_person()throws IOException		//输入一个人的信息
    {
    	//System.out.println("input teacher(1) or student(2)?");
  	    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    int choice=Integer.parseInt(in.readLine());
	    if(choice==1)
	    	  persons[n_persons]=new Teacher();
	    else
	    	  persons[n_persons]=new Student();
	    persons[n_persons++].input();
		return choice;
    }
  
	static
	int input_book()throws IOException		//输入一种书的信息 
    {
    	System.out.println("输入一个书的信息");
  	    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    int choice=Integer.parseInt(in.readLine());
		return choice;
	    
    }
   
	static
	int input_borrow()throws IOException		 //输入一笔借书交易
    {

    	System.out.println("输入一种借书交易");
  	    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    int choice=Integer.parseInt(in.readLine());
		return choice;
	   
    }
    static int output_borrow() throws IOException  //输出一笔借书交易
    {
    	int i;
    	for(i=0;i<n_borrows;i++)
    		borrows[i].output();
		return i;
    }
    public static void main(String args[])throws IOException
    {
    	/*
    	library l;
    	l=new library();
    	*/
    	int i;
    	for(i=1;i<=2;i++)
    	    library.input_person();
    	for(i=1;i<=2;i++)
    	    library.input_book();
    	
    	library.input_borrow();
    	library.output_borrow();          	
    }
    //................................................
    static void print_menu(){
        System.out.println("---------------The Commands---------------");
        System.out.println("1 - 请输入人员信息");
        System.out.println("2 - 请输入图书信息");
        System.out.println("3 - 借书");
        System.out.println("4 - 还书");
        System.out.println("5 - 显示借书情况");
        System.out.println("6 - 显示库存信息");
        System.out.println("7 - 退出");
     
        System.out.println("------------------------------------------");
   }
   static char get_command()throws IOException{
        String command; 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("/n");
     command=in.readLine();
     return command.charAt(0);
   }
  
   public static void main1(String args[])throws IOException
   {
      library p[]=new library[3];
      p[0]=new library();
      p[1]=new library();
      p[2]=new library();
      int current_index=0;
      char command;
      do{
           print_menu();
           command=get_command();
           switch(command){
         
              case '1':
                  current_index=input_person();
                  break;
              case '2':
            	  current_index=input_book();
                  break;
              case '3':
            	  current_index=input_borrow();
                  break;
              case '4':
            	  current_index=output_borrow();
              	break;
              case'5':
            	  current_index=input_book();
              	break;
              case'6':
            	  current_index=input_book();
              	break;
              
              default:
                  System.out.println("退出");
           }
      }while(command!='7');          
   }
}