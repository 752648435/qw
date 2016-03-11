package employee;

public class BasePlusCommissionEmployee extends CommissionEmployee{		//是指总收入是基本工资+销售额提成比例的雇员
	double baseSalary;		// 基本工资
	BasePlusCommissionEmployee(String name,int id, double grossSales,double commissionRate, double baseSalary) 
	{
		this.name=name;
		this.id=id;
		this.grossSales=grossSales;
		this.commissionRate=commissionRate;
		this.baseSalary=baseSalary;
	}
	BasePlusCommissionEmployee(){
		}
		
		double getbaseSalary(){
			return baseSalary;
		}
		public double earnings() {

			return baseSalary+grossSales*commissionRate;
		}
		public	String toString(){
			 return "name"+":"+name+" "+"id"+":"+id+"\n"+"grossSales"+"="+grossSales
					 +" "+"commissionRate"+"="+commissionRate+"\n"+"baseSalary"+"="+baseSalary;
		}
}
