package polynomial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


 class polynomial {

	double arr[]=new double[30];
	
	public void assign_coef(double coefficient, int exponent) {
		arr[exponent]=arr[exponent]+coefficient;
	}

	public void view_coef() {
		int a=0;
		for(int i=0;i<30;i++){
			if(arr[i]!=0){
				if(a==0){
					a++;
					System.out.print(arr[i]+"X^"+i);
				}
				else{
					if(arr[i]>0){
					System.out.print("+");
				System.out.print(arr[i]+"X^"+i);}
					else{
					System.out.print("");
					System.out.print(arr[i]+"X^"+i);
					}
				}
			}
	
		}
		
		
	}
public polynomial add(polynomial p){
	polynomial aadd=new polynomial();
	for(int i=0;i<30;i++){
		aadd.arr[i]=this.arr[i]+p.arr[i];
	}

return aadd;
}
public polynomial reduce(polynomial p){
	polynomial areduce=new polynomial();
	for(int i=0;i<30;i++){
		areduce.arr[i]=this.arr[i]-p.arr[i];
	}
	return areduce;
}

public polynomial ride(polynomial b) {
	polynomial ride=new polynomial();
	for(int i=0;i<30;i++)
		{
		double lan=this.arr[i];
		for(int j=0;j<30;j++){
			if(lan!=0&&b.arr[j]!=0){		
			ride.arr[i+j]=lan*b.arr[j];
				}
			}
		}
	
	return ride;
}

public polynomial divide(polynomial b) {
	polynomial adivide=new polynomial();
	for(int i=0;i<30;i++)
		{
		double lan=this.arr[i];
		for(int j=0;j<30;j++){
			if(lan!=0&&b.arr[j]!=0){		
			adivide.arr[i-j]=lan/b.arr[j];
				}
			}
		}
	
	return adivide;
}
}
public class testPoly
{
 static void print_menu(){
      System.out.println("---------------The Commands---------------");
      System.out.println("s - set the current polynomial to work on");
      System.out.println("l - use the assign_coef function");
      System.out.println("v - use the view_coef function");
      System.out.println("q - quit");
      System.out.println("+ - use the add function");
      System.out.println("* - use the ride function");
      System.out.println("- - use the reduce function");
      System.out.println("/ - use the divide function");
      System.out.println("------------------------------------------");
 }
 static char get_command()throws IOException{
      String command; 
      BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
      System.out.print(">");
   command=in.readLine();
   return command.charAt(0);
 }
 static int set_current()throws IOException{
     char command;
     do{
             System.out.println("Enter the polynomial you want to work on:(a,b,c)");
          command=get_command();
     }while((command<'a')||(command>=('a'+3)));
     return command-'a';
 }
 static void test_assign(polynomial test)throws IOException{
     double coefficient;
     int exponent;
     BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter exponent:");
     exponent=Integer.parseInt(in.readLine());
     System.out.print("Enter coefficient:");
     coefficient=Double.parseDouble(in.readLine());
     test.assign_coef(coefficient,exponent);
     System.out.println("After assigning:");
     test.view_coef();
 }
 public static void main(String args[])throws IOException
 {
    polynomial p[]=new polynomial[3];
    p[0]=new polynomial();
    p[1]=new polynomial();
    p[2]=new polynomial();
    int current_index=0;
    char command;
    do{
         print_menu();
         command=get_command();
         switch(command){
            case 's':
                current_index=set_current();
                break;
            case 'l':
                test_assign(p[current_index]);
                break;
            case 'v':
                System.out.println((char)(current_index+'a')+":");
                p[current_index].view_coef();
                break;
            case 'q':
                break;
            case '+':
            	polynomial temp=(p[0].add(p[1]));
            	temp.view_coef();
            	break;
            case'*':
            	polynomial cheng=(p[0].ride(p[1]));
            	cheng.view_coef();
            	break;
            case'-':
            	polynomial cap=(p[0].reduce(p[1]));
            	cap.view_coef();
            	break;
            default:
                System.out.println("Invalid command.");
         }
    }while(command!='q');          
 }
}

