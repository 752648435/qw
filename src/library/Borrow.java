package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Borrow {
    Person p;
    Book b;
    String personName;
    String bookName;
    void input(Person persons[],int n_persons,Book books[],int n_books)throws IOException{
	    System.out.println("请输入借书人姓名:");
	    BufferedReader in1=new BufferedReader(new InputStreamReader(System.in));
	    String name1=in1.readLine();
	    for(int i=0;i<n_persons;i++){
	    	if(name1.equals(persons[i].name)){
	    		personName=name1;
	    		System.out.println("请输入书名:");
	    		BufferedReader in2=new BufferedReader(new InputStreamReader(System.in));
	    	    String name2=in2.readLine();
	    	    for(int j=0;j<n_books;j++){
	    	    	if(name2.equals(books[j].name)){
	    	    		bookName=name2;
	    	    		System.out.println("书的信息如下：");
	    	    		books[j].output();
	    	    		System.out.println("按1借书，按0返回。");
	    	    		BufferedReader in3=new BufferedReader(new InputStreamReader(System.in));
		    		    int choice=Integer.parseInt(in3.readLine());
		    		    if(choice==1){
		    		    	if(books[j].amount!=0){
		    		    	books[j].amount--;
		    		    	System.out.println("借书成功！");
	    	    	        }else{
		    		    		System.out.println("对不起！该书已被借完！");
	    	    	        }
	    		        }else{
	    		        	break;
	    		        }
	    	        }else{
	    	    	   	System.out.println("该书不存在！");
	    	        }
	           }
	    	}
       }
    }
    void output(){ 
    	System.out.println("借书人姓名："+personName);
    	System.out.println("书名："+bookName);
    }
}