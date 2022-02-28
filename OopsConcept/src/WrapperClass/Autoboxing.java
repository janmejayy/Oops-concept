package WrapperClass;

public class Autoboxing {
	public static void main(String[] args) {
		
	//Autoboxing converting primitive datatype into object
	int a =10;
	Integer b=Integer.valueOf(a);//converting explicitly from int to Integer
	System.out.println(b);
	int c=139;
	Integer d=c;
	System.out.println(d);//converting implicitly from int to Integer
}
}