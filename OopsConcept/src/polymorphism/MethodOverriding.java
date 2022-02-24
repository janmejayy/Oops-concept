package polymorphism;

public class MethodOverriding { 
		  void run()
		  {System.out.println("Vehicle is running");}  
		}  
		

class Bike2 extends MethodOverriding{  
	    @Override	 
        void run(){
	                System.out.println("Bike is running safely");
		  }  
class Bike3 extends MethodOverriding{  
		@Override	 
        void run(){
		            System.out.println("Bike3 is running safely");
			  }  
class overriding{			  		  
		  public static void main(String args[]){  
			  MethodOverriding obj = new MethodOverriding();//creating object  
		       obj.run();//
		  }  
		}  
}}