package Hello;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		//employee employee_01 = new employee("電","火球",new Date(1972,5,8),new Date(1970,5,8));
		
		CommissionEmployee CommissionEmployee_01 = new CommissionEmployee("狗卷","棘","a001",2000,0.9);
		
//		System.out.println(employee_01);
		System.out.println(CommissionEmployee_01);
//		try {
//			employee employee_02=new employee("月","月鳥",new Date(1990,1,1),new Date(1970,2,2)); 
////			這裡要日期錯誤
//			System.out.println("產生一個新員工:"+employee_02.toString());
//		}catch(IllegalArgumentException ex) {
//			System.out.println("產生一個員工物件，發生例外狀況："+ex.toString());
//		}
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
