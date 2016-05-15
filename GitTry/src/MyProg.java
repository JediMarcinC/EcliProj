
public class MyProg {

	public static void main(String[] args) {
		MyProg mp = new MyProg();
		System.out.println(mp.multi(4,6));
		System.out.println(mp.say("Hello"));

	}
	
	public String say(String s) {
		return s+"\b\b";
	}
	
	public int multi(int a, int b) {
		return a*b;
	}
	
	
	

}
