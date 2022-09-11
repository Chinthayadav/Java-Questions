class Isinstancemethod{
  public static void main(String[] args) throws Exception{
    // isInstance() method is used to check whether object is particular type or not at dynamically provide class/interface names
    //class/interaface names are not know before we checking ,for this purpose it is used to whether object is particular type or not
    Thread t = new Thread();
    System.out.println(Class.forName(args[0]).isInstance(t));
    System.out.println(t.getClass().getName());
  }
}


//In the compilation
// javac Isinstancemethod.java
// java Isinstancemethod java.lang.Runnable // true
// java Isinstancemethod java.lang.Object // true
// java Isinstancemethod java.lang.Thread // true 
