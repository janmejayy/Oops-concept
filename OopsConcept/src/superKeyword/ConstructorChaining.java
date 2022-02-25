package superKeyword;

public class ConstructorChaining {

}
class College{
	College(){
		System.out.println("college constructor");
	}
}
class Exam1 extends College{
	//it is calling super() implicity means calling its parent class first
	Exam1(){
		System.out.println("Exam1 constructor");
	}
}
class Exam2 extends Exam1{
	//it is calling super() implicity means calling its parent class first
	Exam2(){
		System.out.println("Exam2 constructor");
	}
}
class Exam3 extends Exam2{
	//it is calling super() implicity means calling its parent class first
	Exam3(){
		System.out.println("Exam3 constructor");
	}
}
class Result{
	public static void main(String[] args) {
		Exam3 e=new Exam3();
	}
}