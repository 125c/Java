package Hello;

public class Time1test {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Time1 t=new Time1(18,36,27);
		System.out.println("已建立新的 Time1 物件，時間內容："+t.toUniversalString());
		t.setTime1(5, 25, 26);
		System.out.println("修改 Time1 物件，24小時制："+t.toUniversalString());
		System.out.println("修改 Time1 物件，12小時制："+t.toString());
		
		try {
			t.setTime1(69,15, 30);
			System.out.println("修改 Time1 物件，時間內容："+t.toUniversalString());
		}catch(IllegalArgumentException ex) {
			System.out.println("企圖修改 Time1 物件，發生例外狀況："+t.toUniversalString());
		}
		
		Time1 t1=new Time1();
		System.out.println("已建立新的 Time1 物件，時間內容："+t1.toUniversalString());
		t1.setTime1(9,22, 22);
		System.out.println("修改 Time1 物件，24小時制："+t1.toUniversalString());
		System.out.println("修改 Time1 物件，12小時制："+t1.toString());
		
		Time1 t2=new Time1();
		System.out.println("已建立新的 Time1 物件，時間內容："+t2.toUniversalString());//沒有參數所以00:00:00
		t2.hour=12;
		int hour=t2.hour;
		t2.minute=15;
		t2.second=18;
		System.out.println("修改 Time1 物件，24小時制："+t2.toUniversalString());
		System.out.println("ε٩(๑> ₃ <)۶з");
		Time2 T1=new Time2(2);
		Time2 T2=new Time2(2,41);
		Time2 T3=new Time2(2,41,38);
		Time2 T4=new Time2(2,41,38,314);
		System.out.println("已建立新的 Time2 物件，時間內容："+T1.toUniversalString());
		System.out.println("已建立新的 Time2 物件，時間內容："+T2.toUniversalString());
		System.out.println("已建立新的 Time2 物件，時間內容："+T3.toUniversalString());
		System.out.println("已建立新的 Time2 物件，時間內容："+T4.toUniversalString());
		System.out.println("ｽﾞｲ₍₍ (ง ˘ω˘ )ว ⁾⁾ ⁽⁽ 〪ɾ( ˘ω˘ 〫ɩ ) ₎₎ｽﾞｲ");
		T1.setTime(12, 0, 0,0);
		T2.setTime(12, 31, 0,0);
		T3.setTime(12, 31, 28,0);
		T4.setTime(12, 31, 28,469);
		System.out.println("修改 Time2 物件，12小時制："+T1.toString());
		System.out.println("修改 Time2 物件，12小時制："+T2.toString());
		System.out.println("修改 Time2 物件，12小時制："+T3.toString());
		System.out.println("修改 Time2 物件，12小時制："+T4.toString());
		System.out.println("◢▆▅▄▃崩╰(〒皿〒)╯潰▃▄▅▇◣");
		
		int Hour=T1.getHour();
		System.out.println("T1的hour屬性值＝"+Hour);
		T1.setHour(13);
		System.out.println("T1的hour屬性值＝"+T1.getHour());
		
		int Minute=T2.getMinute();
		System.out.println("T2的Minute屬性值＝"+Minute);
		T2.setMinute(13);
		System.out.println("T2的Minute屬性值＝"+T2.getMinute());
		
		int Second=T3.getSecond();
		System.out.println("T3的Second屬性值＝"+Second);
		T3.setSecond(13);
		System.out.println("T3的Second屬性值＝"+T3.getSecond());
		//T4.setTime(12, 31, 28,469);
		int Millisecond=T4.getMillisecond();
		System.out.println("T4的Millisecond屬性值＝"+Millisecond);
		T4.setMillisecond(13);
		System.out.println("T4的Millisecond屬性值＝"+T4.getMillisecond());
		System.out.println("(ｏﾟﾛﾟ)┌┛Σ(ﾉ´*ω*`)ﾉ");
		
		try {
			T4.setTime(69,15, 30,456);//因為time2的settime有4個參數
			System.out.println("修改 Time1 物件，時間內容："+T4.toUniversalString());
		}catch(IllegalArgumentException ex) {
			System.out.println("企圖修改 Time1 物件，發生例外狀況："+T4.toUniversalString());
		}
		
	}
	


}
