package Interface;

public class DefaultMethod {

}
interface Drawable{  
void draw();  
default void msg(){System.out.println("default method");}  
}  
class Rectangle implements Drawable{  
	@Override
public void draw(){System.out.println("drawing rectangle");}  
}  
class TestInterfaceDefault{  
public static void main(String args[]){  
Rectangle d=new Rectangle();  
d.draw();  
d.msg();  
}}  