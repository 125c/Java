package Hello;

public class EmployeeExtendTest {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CommissionEmployeeExtV1 Employee_01 = new CommissionEmployeeExtV1("狗卷","棘","a001",2000,0.9);

		CommissionEmployeeExtV1 Employee_011 = new CommissionEmployeeExtV1("狗卷","棘11","a001",2000,0.9);
		CommissionEmployeeExtV2 Employee_012 = new CommissionEmployeeExtV2("狗卷","棘12","a001",2000,0.9);
		CommissionEmployeeExtV3 Employee_013 = new CommissionEmployeeExtV3("狗卷","棘13","a001",2000,0.9);

		System.out.println("Employee_01的first name："+Employee_01.firstName);
		Employee_01.firstName="夜神";
		System.out.println("Employee_01的first name："+Employee_01.firstName);
		//新放的值蓋過原本的，即使沒有設定set first name
		Employee_01.idNumber="Q003";
		System.out.println("Employee_01的idNumber："+Employee_01.idNumber);
		Employee_01.CommissionRate=-200;
		System.out.println("Employee_01的CommissionRate："+Employee_01.CommissionRate);
		//可以違反原本的規則
		System.out.println(Employee_011);
		System.out.println(Employee_012);
		System.out.println(Employee_013);
		
		
		try {
			CommissionEmployee employee_02=new CommissionEmployee("林","Boy","a002",-2000,0.9);
			//這裡是薪水錯誤
			System.out.println("產生一個新員工:"+employee_02.toString());
		}catch(IllegalArgumentException ex) {
			System.out.println("產生一個員工物件，發生例外狀況："+ex.toString());
		}
		try 
		{
			CommissionEmployee employee_03=new CommissionEmployee("陳","大天","a002",2000,-0.9); 
			//這裡是分潤錯誤
			System.out.println("產生一個新員工:"+employee_03.toString());
		}catch(IllegalArgumentException ex) 
		{
			System.out.println("產生一個員工物件，發生例外狀況："+ex.toString());
		}
		try 
		{
			BasePlusCommissionEmployee employee_04=new BasePlusCommissionEmployee("黃","毫平","a003",2000,0.9,10); 
			System.out.println("產生一個新員工:"+employee_04.toString());
		}catch(IllegalArgumentException ex) 
		{
			System.out.println("產生一個員工物件，發生例外狀況："+ex.toString());
		}
		try 
		{
			BasePlusCommissionEmployee employee_05=new BasePlusCommissionEmployee("J","im","a004",40,0.3,2000); 
			System.out.println("產生一個新員工:"+employee_05.toString());
		}catch(IllegalArgumentException ex) 
		{
			System.out.println("產生一個員工物件，發生例外狀況："+ex.toString());
		}
		
		try {
			employee employee_03=new employee("五條","悟",new Date(1990,11,1),new Date(1970,2,2));
//			這裡要月份錯誤	
			System.out.println("產生一個新員工:"+employee_03.toString());
		}catch(IllegalArgumentException ex) {
			System.out.println("產生一個員工物件，發生例外狀況："+ex.toString());
			}
		try 
		{
			employee employee_04=new employee("狗卷","棘",new Date(1990,1,1),new Date(1970,2,2));
//			這裡要正常	
			System.out.println("產生一個新員工:"+employee_04.toString());
		}catch(IllegalArgumentException ex) 
		{
			System.out.println("產生一個員工物件，發生例外狀況："+ex.toString());
		}
		
	}

}
