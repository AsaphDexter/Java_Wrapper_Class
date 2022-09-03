package wrapperclass;
/**
 *
 * @author AsaphDexter
 */
public class WrappertoPrimitive {
   public static void main(String args[]){    
//Converting Integer to int    
Integer a = 4;    
int i = a;//converting Integer to int  
int j = a;//unboxing, now compiler will write a.intValue() internally    
    
System.out.println(a + " " + i + " "+j);    
} 
}
