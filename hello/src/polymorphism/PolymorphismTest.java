package polymorphism;

//import Hello.CommissionEmployee;不能import 繼承了hello的CommissionEmployee 但彼此沒有繼承關係 [擁有相同父類別的物件] 

public class PolymorphismTest {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i;
		CommissionEmployee employeeArray[] = new CommissionEmployee[5];
		employeeArray[0]= new CommissionEmployee("志郎","炭","qqq",60000,0.01);
		employeeArray[1]= new CommissionEmployee("豆子","迷","qqqw",5000,0.1);
//		BasePlusCommissionEmployee employee_03=new BasePlusCommissionEmployee("志郎","炭","123123",60000,0.1,10);
		employeeArray[2]= new BasePlusCommissionEmployee("志郎","炭","qqqwe",60000,0.1,10);
		employeeArray[3]= new BasePlusCommissionEmployee("豆子","迷","wwwwwe",5000,0.1,10);
		employeeArray[4]= new WeekSalaryPlusCommissionEmployee("也強威","丁祈","rrrrrw",40000,0.1,5000);
		for(i=0;i<employeeArray.length;i++) 
		{
			System.out.printf("%s%d%s :%n%n%s%n%n","第 ",i+1," 位員工資料",employeeArray[i].toString());
		
//			不能把toString()改為getWeekSalary()
//			System.out.printf("%s%d%s :%n%n%s%n%n","第 ",i+1," 位員工資料",employeeArray[i].getWeekSalary());
		}

	}

}
