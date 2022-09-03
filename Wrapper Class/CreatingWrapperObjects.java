package wrapperclass;
/**
 *
 * @author AsaphDexter
 * 
 * To create a wrapper object, use the wrapper class instead of the primitive type. 
 * To get the value, you can just print the object:
 */
public class CreatingWrapperObjects {
     public static void main(String[] args) { 
    Integer myInt = 4; 
    Double myDouble = 4.99; 
    Character myChar = 'A'; 
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
 }   
}

/*Since you're now working with objects, you can use certain methods to get information about the specific object.
For example, the following methods are used to get the value associated with the corresponding wrapper object: 
intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().
This example will output the same result as the example above:*/