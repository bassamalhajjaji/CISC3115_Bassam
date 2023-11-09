//Bassam Alhajjaji
// HW 9

/* 13.1
 * The correct answer is (d) */

/* 13.3
 * a. True - An abstract class cannot be instantiated with the `new` operator.
 * b. True - An abstract class can be extended by another class.
 * c. False - A subclass of a nonabstract superclass can be declared as abstract.
 * d. False - A subclass can override a concrete (non-abstract) method and declare it
 * as abstract, but this would also require the subclass to be abstract.
 * e. True - An abstract method cannot be static, since it must be implemented by
 * a subclass, and static methods cannot be overridden.*/

/* 13.4
 * What that code is trying to do is create an integer wrapper
 * classand then use it to create a double wrapper class.An
 * Integercannot be casted into a Double--they are different
 * classes and onecannot morph during execution. Instead,
 * the value of theinteger must be used to create new Double.*/

/* 13.5
 * an exception at runtime occurs for class casting exception
 * it occurred because its not an instance of Double */

/* 13.6
 * it displays the integer and decimal value of 3 */

/* 13.7
 * Compile error occurs as the variable x is a number and there
 * is no compareTo() method for x. */

/* 13.8
 * Compile error occurs because the casting operator occurs
 * prior to the member access operator ".". */

/* 13.13
 * Instance cannot be created new A() because interfaces
 * are abstract and cannot be instantiated. */

/* 13.14
 * Reference variable x with Type A can be declared. */

/* 13.15
 * the correct answer is (d) */

/* 13.16
 * it must override the m1 method with public visibility,
 * because all interface methods are implicity public.
 * class B implements A{
 * public void m1(){
 * System.out.println("m1");
 * }
 * } */

/* 13.17
 * True */

/* 13.18
 * public int compareTo(String o) */

/* 13.19
 * No because the compareTo method in the Integer class expects
 * ab Integer object as its argument, you can make it work like this:
 * System.out.println(n1.compareTo((Integer) n2)); */

/* 13.20
 * Implementing comparable interface is beneficial because it allows
 * objects of a class to be used with algorithms that need ordering. */

/* 13.21
 * person class does not implement a comparable interface but in class
 * test its being used with Arrays.sort */

/* 13.22
 * clone() method cant be invoked without implementing java.lang.Cloneable */

/* 13.23
 * document does not have question 13.11 listed. */

/* 13.24
 * true
 * false
 * true */

/* 13.25
 * true
 * false
 * list is [New York]
 * list1 is [New York]
 * list2.get(0) is New York
 * list2.size() is 1 */

/* 13.26
 * Cloneable interface needs to be implemented and provide a public clone()
 * method. clone() as it is protected by default. */

/* 13.29
 * a. True
 * b. True
 * c. True
 * d. False
 * e. False */