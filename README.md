# Java-Questions
Most Imp Java Interview Questions must know to everyone before attending java interview

The difference between new operater and newInstance method where to use ,when to use .....most we discussed in the coding
1. new is an operator to create an objects , if we know class name at the beginning 
then we can create an object by using new operator .
2. newInstance( ) is a method presenting class " Class " , which can be used to 
create object.
3. If we don't know the class name at the beginning and its available dynamically 
Runtime then we should go for newInstance() method 
4. public class Test {
5. public static void main(String[] args) Throws Exception {
6. Object o=Class.forName(arg[0]).newInstance( ) ;
7. System.out.println(o.getClass().getName( ) );
8. }
9. }
10. If dynamically provide class name is not available then we will get the 
RuntimeException saying ClassNotFoundException 
11. To use newInstance( ) method compulsory corresponding class should contains 
no argument constructor , otherwise we will get the RuntimeException saying 
InstantiationException.
