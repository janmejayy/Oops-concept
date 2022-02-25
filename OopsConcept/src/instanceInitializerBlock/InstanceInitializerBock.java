package instanceInitializerBlock;

public class InstanceInitializerBock {

}
//Instance Initialization Block
class GfG {
 // Instance Initialization Block
 {
     System.out.println("IIB block");
 }

 // Constructor of GfG class
 GfG() { System.out.println("Constructor Called"); }
 public static void main(String[] args)
 {
     IIB1 a = new IIB1();
 }
}