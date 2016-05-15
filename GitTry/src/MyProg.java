
public class MyProg {
	int count=0;

	public static void main(String[] args) {
		MyProg mp = new MyProg();
		System.out.println(mp.multi(4,6));
		System.out.println(mp.echo("Hello", 2));

	}
	public int multi(int a, int b) {
		System.out.println("Multiplying");
		count++;
		return a*b;
	}
	
	public String echo(String input, int x) {
		String output="";
		for (int i=0; i<x; i++) {
			output+=input+" ";
		}
		return output;
	}
	
	public void doNothing() {	}
	
	public boolean hasMultiBeenDone() {
		return count>0;
	}
	
	public void printMe() {
		System.out.println("It's a branch of variant1, variant 1-1");
	}

}
