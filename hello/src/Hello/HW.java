package Hello;
import java.util.Scanner;
public class HW {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
//為了可以讓人輸入數值		
		Scanner number=new Scanner(System.in);
////		被乘數=n						
		int  n=number.nextInt();
//		被乘數*乘數
//		1*1=1 2*1=2 3*1=3
//		1*2=2 2*2=4 3*2=6
//		1*3=3 2*3=6 3*3=9
//		                 n m n*n
//		System.out.print(1*1=1 2*1=2 3*1=3);
//		System.out.println();
		int m=0,i=0,to=1;
		for(m=1;m<10;m++) {
			for(i=to;i<=n;i++){				
				System.out.print(i+"×"+m+"＝"+(i*m)+" ");
				if(i%3==0) {break;};
			}System.out.println();
			
			if((i%3==0)&&(m==9)) {
				System.out.println("------------");
				m=1;
				to=i+1;				
			}	
		}
			
		
//		
//		System.out.print("請輸入1-9整數:");		
//		Scanner number=new Scanner(System.in);
//		int n=0;
//		int a;
//		int to=1;
//		n=number.nextInt();
//		
//		if(n>0&&n<10) {
//			for(int b=1;b<=9;b++) {				
//				for(a=to;a<=n;a++) {	
//					if(a*b<10) {
//						System.out.print(a+"×"+b+"＝"+(a*b)+"  ");
//					}else{
//						System.out.print(a+"×"+b+"＝"+(a*b)+" ");
//					 }					
//					if(a%3==0) {break;}					
//				}System.out.println("");	
//				
//					if((a==3)&&(b==9)) {
//						to=4;
//						System.out.println("---------------------");
//						b=0;}
//					
//					if((a==6)&&(b==9)) {
//						to=7;
//						System.out.println("---------------------");
//						b=0;}
//			}
//		}else {			
//			System.out.print("亂輸入！！！欠尻嗎？");
//		}
			
		number.close();
	}
}