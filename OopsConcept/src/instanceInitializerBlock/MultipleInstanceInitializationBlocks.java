package instanceInitializerBlock;

public class MultipleInstanceInitializationBlocks {

}
class IIB1 {
    // Instance Initialization Block - 1
    {
        System.out.println("IIB1 block");
    }
 
    // Instance Initialization Block - 2
    {
        System.out.println("IIB2 block");
    }
 
    // Constructor of class GfG
    IIB1() { System.out.println("Constructor Called"); }
 
    // Instance Initialization Block - 3
    {
        System.out.println("IIB3 block");
    }
}
class Gfgmain{
    // main function
    public static void main(String[] args)
    {
        IIB1 a = new IIB1();
    }
}