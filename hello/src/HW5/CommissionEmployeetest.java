package HW5;

public class CommissionEmployeetest {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CommissionEmployee zz=new CommissionEmployee("五條","悟","123",20,0.9);
		CommissionEmployee xx=new CommissionEmployee();
		CommissionEmployee aa=new CommissionEmployee("aa");
		CommissionEmployee qq=new CommissionEmployee("五條","悟","123");
//		(String firstName,String lastName,String idNumber,double grossSales,double CommissionRate) 
		System.out.println(zz);
		System.out.println(zz.firstName);
		System.out.println("( ˘･з･)");
		System.out.println(xx);
		System.out.println(aa);
		System.out.println(qq);
		System.out.println("( ˘･з･)");
		BasePlusCommissionEmployee cc=new BasePlusCommissionEmployee("五條","悟","123",20,0.9,100);
		System.out.println(cc);
	}

}
