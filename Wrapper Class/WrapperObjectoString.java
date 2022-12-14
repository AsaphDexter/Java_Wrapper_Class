package wrapperclass;
/**
 *
 * @author AsaphDexter
 * Another useful method is the toString() method, which is used to convert wrapper objects to strings.
In the following example, we convert an Integer to a String, and use the length() method of the String class 
*to output the length of the "string":
 */
public class WrapperObjectoString {
    public static void main(String[] args) {
    Integer myInt = 400;
    String myString = myInt.toString();
    System.out.println(myString.length());
  }
}
