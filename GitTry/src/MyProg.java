
public class MyProg {

	public static void main(String[] args) {
		MyProg mp = new MyProg();
		System.out.println(mp.multi(4,6));
		System.out.println(mp.echo("Hello", 2));

	}
	public int multi(int a, int b) {
		return a*b;
	}
	
	public String echo(String input, int x) {
		String output="";
		for (int i=0; i<x; i++) {
			output+=input+" ";
		}
		return output;
	}
	
	public void printMe() {
		System.out.println("It's me, MyProg.");
	}

}
