package fasttrackjava;
public class This {
	This th;
	{
		
	 th=new This();
	}
public This() {
	System.out.println("This executed");
}
public static void main(String[] args) {
	new This();
}
}
