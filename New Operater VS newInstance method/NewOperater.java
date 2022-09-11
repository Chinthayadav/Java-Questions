class NewOperater {
  public static void main(String[] args) {
    NewOperater t = new NewOperater();
        // NewOperater t1 = new NewOperater(10);  here it shoews error because no arguments to passed in parametr
        // NewOperater t2 = new NewOperater("chintha");
        System.out.println(t); // defalut answer it shown in hashcode
        // System.out.println(t2);
        // System.out.println(t1);
  }
}

// .class file will not at run time it shoews
// Run time exception is :"noClassdefFound"
//new operater is used to created an object ,before we knowing the class name at the begginnig
//If we don't know class name at the beggining we can't created the object
