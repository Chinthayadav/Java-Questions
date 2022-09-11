class Student
{

}

class Customer
{

}

class Newinstancemethod {

  public static void main(String[] args) throws Exception {
   // dynamically created objects classes Syntax:Class.forName(args[0]).newInstance();
    Object o = Class.forName(args[0]).newInstance();
    System.out.println("The object created for " +o.getClass().getName());

  }
}
// here .class file not found at runtime for dynamically providing class names
// error:classnotfound exception
