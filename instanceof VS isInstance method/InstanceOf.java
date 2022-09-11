class InstanceOf{
  public static void main(String[] args) {
    // is instance operater is used to check the object is particular type or not
    //Syntax: X instanceof Y here X is object and Y is Class/interaface names
    // null instanceof Y is always false
    // it is before we know the class /interaface first
    Thread t = new Thread();
    System.out.println(t instanceof Runnable); // true
    System.out.println(t instanceof Object); // true
    System.out.println(t instanceof Thread); // true
    // System.out.println(t instanceof String); // error: Thread cannot be converted to String

    String str = new String("chintha");
    System.out.println(str instanceof Object); // true
    // System.out.println(str instanceof Thread); // error : String cannot be converted to Thread
  }
}
