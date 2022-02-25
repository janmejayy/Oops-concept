package superKeyword;

class SuperKeywordWithConstructors {

}
class School
{
    School()
    {
        System.out.println("school class Constructor");
    }
}
  
/* subclass Student extending the Person class */
class Exam extends School
{
    Exam()
    {
        // invoke or call parent class constructor
        super();//this statement should be first statement in derived class
  
        System.out.println("exam class Constructor");
    }
}
  
/* Driver program to test*/
class Test3
{
    public static void main(String[] args)
    {
        Exam s = new Exam();
    }
}