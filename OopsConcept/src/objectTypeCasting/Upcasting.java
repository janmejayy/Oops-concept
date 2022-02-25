package objectTypeCasting;

public class Upcasting {
}
class Vehicle {
	void method() {
		System.out.println("running ");
	}
}
class Bike extends Vehicle{
	@Override
	void method() {System.out.println("BIKE running");
		
	}
}
class Engine{
	public static void main(String[] args) {
		Vehicle v=new Bike();
		v.method();
	}
}