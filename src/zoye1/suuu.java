package zoye1;
public class suuu{
public static void main(String[] args){
	int i,j,flag;
	for(i=2;i<=100;i++){
		flag=1;
		for(j=2;j<i;j++)
			if(i%j==0)
			{
				flag=0;
				break;
			}
			if(i%j==1) System.out.println(i);
			
		}
	}
}
