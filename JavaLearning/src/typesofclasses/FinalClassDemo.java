package typesofclasses;

/*final*/ class BaseClass {
   void Display() {
      System.out.print("This is Display() method of BaseClass.");
   }
}
class DerivedClass extends BaseClass { //Compile-time error - can't inherit final class
   void Display() {
      System.out.print("This is Display() method of DerivedClass.");
   }
}
public class FinalClassDemo {
   public static void main(String[] arg) {
      DerivedClass d = new DerivedClass();
      d.Display();
   }
}


