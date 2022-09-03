package wrapperclass;
/**
 *
 * @author  AsaphDexter
 * Wrapper class in Java
Wrapper class in java provides the mechanism to convert primitive into object and object into primitive.
Since J2SE 5.0, autoboxing and unboxing feature converts primitive into object and object into primitive automatically. 
*The automatic conversion of primitive into object is known and autoboxing and vice-versa unboxing.
One of the eight classes of java.lang package are known as wrapper class in java. 
* The list of eight wrapper classes are given below:
 */
public class WrapperClass {

    public static void main(String[] args) {
        // Wrapper class Example: Primitive to Wrapper
        //Converting int into Integer  
int a = 44;  
Integer i = a;//converting int into Integer  
Integer j = a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
  
System.out.println(a+ " " + i + " " +j);  
}
}  
    
    

