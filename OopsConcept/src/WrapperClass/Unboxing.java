package WrapperClass;

public class Unboxing {
public static void main(String[] args) {
	//process of converting wrapper type into primitive data type 
	Integer i=new Integer(10);
	int a=i.intValue();//this method is removed since java 5 thats why it is depricated
	System.out.println(a);
	int b=i;//converting implicitly
	System.out.println(b);
	
	
	
	
}
}
