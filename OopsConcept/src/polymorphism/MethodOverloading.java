package polymorphism;

public class MethodOverloading {
  int methodSum(int a,int b){
	  int sum=a+b;
	  System.out.println(sum);
	   return sum ;
   }
  int methodSum(char a) {
int	value=a;
System.out.println(value);
return a;
     }
  class main{
  public static void main(String[] args) {
	MethodOverloading obj=new MethodOverloading();
	obj.methodSum('A');
	obj.methodSum(2, 3);
}
}
}