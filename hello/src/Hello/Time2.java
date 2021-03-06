package Hello;

public class Time2 {
	private int hour;//0-23
	private int minute;//0-59
	private int second;//0-59
	private int millisecond;//0-999
	
	public Time2() {
		this.hour=0;
		this.minute=0;
		this.second=0;
		this.millisecond=0;
	}
	public Time2(int hour) {
		if((hour<0)||(hour>=24)) {
			throw new IllegalArgumentException("輸入的 \"小時\"時間錯誤，0-24:");
		}
		this.hour=hour;
		this.minute=0;
		this.second=0;
		this.millisecond=0;
	}
	public Time2(int hour,int minute) {//多載
		this(hour,minute,0,0);
//		if((hour<0)||(hour>=24)) {
//			throw new IllegalArgumentException("輸入的 \"小時\"時間錯誤，0-24:");
//		}
//		if((minute<0)||(minute>=60)) {
//			throw new IllegalArgumentException("輸入的 \"分鐘\"時間錯誤，0-59:");
//		}
//		this.hour=hour;
//		this.minute=minute;
//		this.second=0;
//		this.millisecond=0;
	}
	public Time2(int hour,int minute,int second) {
		this(hour,minute,second,0);
//		if((hour<0)||(hour>=24)) {
//			throw new IllegalArgumentException("輸入的 \"小時\"時間錯誤，0-24:");
//		}
//		if((minute<0)||(minute>=60)) {
//			throw new IllegalArgumentException("輸入的 \"分鐘\"時間錯誤，0-59:");
//		}
//		if((second<0)||(second>=60)) {
//			throw new IllegalArgumentException("輸入的 \"秒\"時間錯誤，0-59:");
//		}
//		this.hour=hour;
//		this.minute=minute;
//		this.second=second;
//		this.millisecond=0;
	}
	public Time2(int hour,int minute,int second,int millisecond) {
		if((hour<0)||(hour>=24)) {
			throw new IllegalArgumentException("輸入的 \"小時\"時間錯誤，0-23:");
		}
		if((minute<0)||(minute>=60)) {
			throw new IllegalArgumentException("輸入的 \"分鐘\"時間錯誤，0-59:");
		}
		if((second<0)||(second>=60)) {
			throw new IllegalArgumentException("輸入的 \"秒\"時間錯誤，0-59:");
		}
		if((millisecond<0)||(millisecond>=1000)) {
			throw new IllegalArgumentException("輸入的 \"秒\"時間錯誤，0-999:");
		}
		this.hour=hour;
		this.minute=minute;
		this.second=second;
		this.millisecond=millisecond;
	}
	
	public int getHour() {//存取方法 accessor method
		return this.hour;
	} 
	public void setHour(int hour) { //修改方法 mutator method
		if((hour<0)||(hour>=24)) {
			throw new IllegalArgumentException("輸入的 \"小時\"時間錯誤，超過合理範圍！");
		}
		this.hour=hour;
	}
	public int getMinute() {
		if((minute<0)||(minute>=60)) {
			throw new IllegalArgumentException("輸入的 \"分鐘\"時間錯誤，超過合理範圍！");
		}
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if((second<0)||(second>=60)) {
			throw new IllegalArgumentException("輸入的 \"秒\"時間錯誤，超過合理範圍！");
		}
		this.second = second;
	}
	public int getMillisecond() {
		return millisecond;
	}
	public void setMillisecond(int millisecond) {
		if((millisecond<0)||(millisecond>=1000)) {
			throw new IllegalArgumentException("輸入的 \"秒\"時間錯誤，0-999:");
		}
		this.millisecond = millisecond;
	}
	public void setTime(int hour ,int minute,int second, int millisecond) {
//		this(hour,minute,second,millisecond);
		if((hour<0)||(hour>=24)) {
			throw new IllegalArgumentException("輸入的 \"小時\"時間錯誤，超過合理範圍！");
		}
		if((minute<0)||(minute>=60)) {
			throw new IllegalArgumentException("輸入的 \"分鐘\"時間錯誤，超過合理範圍！");
		}
		if((second<0)||(second>=60)) {
			throw new IllegalArgumentException("輸入的 \"秒\"時間錯誤，超過合理範圍！");
		}
		if((millisecond<0)||(millisecond>=1000)) {
			throw new IllegalArgumentException("輸入的 \"毫秒\"時間錯誤，超過合理範圍！");
		}
		this.hour=hour;
		this.minute=minute;
		this.second=second;
		this.millisecond=millisecond;
	}
	
	
	
	public String toUniversalString() {
		
		return String.format("%02d:%02d:%02d.%03d",hour,this.minute,this.second,this.millisecond);
		
	}
	public String toString() {
		return String.format("%d:%2d:%2d %s", ((hour==0||hour==12)?12:(hour%12)),minute,second,millisecond,((hour<12)?"AM":"PM"));//s字串的意思
		
	}
}
