package Hello;

public class Time1 {
	public int hour;//0-23
	public int minute;//0-59
	public int second;//0-59
	public Time1() {
		this.hour=0;
		this.minute=0;
		this.second=0;
	}
	
	public Time1( int h ,int minute,int second) {
		if((h<0)||(h>=24)) {
			throw new IllegalArgumentException("輸入的 \"小時\"時間錯誤，超過合理範圍！");
		}
		if((minute<0)||(minute>=59)) {
			throw new IllegalArgumentException("輸入的 \"分鐘\"時間錯誤，超過合理範圍！");
		}
		if((second<0)||(second>=59)) {
			throw new IllegalArgumentException("輸入的 \"秒\"時間錯誤，超過合理範圍！");
		}
		
		hour=h;
		this.minute=minute;
		this.second=second;
	}
	public void setTime1(int hour ,int minute,int second) {
		if((hour<0)||(hour>=24)) {
			throw new IllegalArgumentException("輸入的 \"小時\"時間錯誤，超過合理範圍！");
		}
		if((minute<0)||(minute>=60)) {
			throw new IllegalArgumentException("輸入的 \"分鐘\"時間錯誤，超過合理範圍！");
		}
		if((second<0)||(second>=60)) {
			throw new IllegalArgumentException("輸入的 \"秒\"時間錯誤，超過合理範圍！");
		}
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public String toUniversalString() {
		String outputString;
		outputString=String.format("%02d:%02d:%02d",hour,this.minute,this.second);
		
		 //d整數的意思18:36:40
		return outputString;
	}
	public String toString() {
		return String.format("%d:%2d:%2d %s", ((hour==0||hour==12)?12:(hour%12)),minute,second,((hour<12)?"AM":"PM"));//s字串的意思
		//3行合成1行6:36:40 PM
	}

}
