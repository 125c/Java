package interfaceClass;

public class InterfaceClassTest {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i;

		Payable payableArray[] = new Payable[8];
		payableArray[0]= new CommissionEmployee("志郎","炭","qqq",60000,0.01);
		payableArray[1]= new CommissionEmployee("豆子","迷","qqqw",5000,0.1);
		payableArray[2]= new BasePlusCommissionEmployee("沒有輸","大哥","qqqwe",60000,0.1,10);
		payableArray[3]= new BasePlusCommissionEmployee("柯南","名偵探","wwwwwe",5000,0.1,10);
		payableArray[4]= new WeekSalaryPlusCommissionEmployee("也強威","丁祈","rrrrrw",40000,0.1,5000);
		payableArray[5]= new SalariedEmployee("夢子","蛇肯","qqqq",10000);
		payableArray[6]= new invoice("A001","冷戰熱鬥",1000,20);
		payableArray[7]= new invoice("A002","火龍的高利貸",1500,4);
		for(i=0;i<payableArray.length;i++) 
		{
			System.out.printf("%s%d%s :%n%s%n","第 ",i+1," 筆付款資料",payableArray[i].toString());
//			payableArray[2].setGrossSales(150);
			((CommissionEmployee)payableArray[2]).setGrossSales(150);
			((BasePlusCommissionEmployee)payableArray[i]).setBaseSalary(i);
			if(payableArray[i] instanceof BasePlusCommissionEmployee) 
			{
				((BasePlusCommissionEmployee)payableArray[i]).setBaseSalary(1.1*((BasePlusCommissionEmployee)payableArray[i]).getBaseSalary());
				System.out.printf("%n%s%n%n%s:%n%s","符合加薪條件，底薪+獎金的員工","底薪+一成後，薪資資料",payableArray[i].toString());
			}
		}
	
	}
}
