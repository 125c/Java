package Hello;

public class Java12 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int arryInt[]=new int[14];
		arryInt[0]=1;
		arryInt[1]=2;
		arryInt[2]=22;
		arryInt[3]=333;
		arryInt[4]=13;
		arryInt[5]=23;
		arryInt[6]=34;
		arryInt[7]=45;
		arryInt[8]=56;
		arryInt[9]=78;
		int arryInt_1[]= {11,22,333,44,55,66,77,88};
		for(int i=0;i<8;i++) {
			System.out.println("arryInt["+i+"]:"+arryInt[i]);
		}
		System.out.println("陣列arryInt的元素個數:"+arryInt.length);
		for(int i=0;i<8;i++) {
			System.out.println("arryInt_1["+i+"]:"+arryInt_1[i]);
		}
		System.out.print("陣列arryInt的元素個數"+arryInt_1.length);
	}

}
