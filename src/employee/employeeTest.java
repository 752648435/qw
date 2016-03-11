package employee;

public class employeeTest {
	public static void main(String[] args) {
		BasePlusCommissionEmployee bse1,bse2;
		bse1=new BasePlusCommissionEmployee();
		System.out.println(bse1);
		System.out.println("总收入="+bse1.earnings());
		bse2=new BasePlusCommissionEmployee("zhangsan",12345,5000,0.2,500);
		System.out.println(bse2);
		System.out.println("总收入="+bse2.earnings());
	}
}