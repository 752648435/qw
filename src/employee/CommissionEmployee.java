package employee;

public class CommissionEmployee extends Employee{		//是指总收入是销售额提成比例的雇员
	double grossSales;		//销售额
	double commissionRate; 		//提成比例
	double getgrossSales(){
    	return grossSales;
    }
    double getcommissionRate(){
    	return commissionRate;
    }
}


