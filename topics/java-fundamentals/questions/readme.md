# Questions

## Beginner

### OOP

<details>
<summary>1. What are the OOPs concepts?</summary>

> **Answer:**
>
> * Inheritance - Inheritance provides a powerful and natural mechanism for organizing and structuring your software.

This section explains how classes inherit state and behavior from their superclasses, and explains how to derive one
class from another using the simple syntax provided by the Java programming language.

> * Encapsulation - The localization of knowledge within a module. Because objects encapsulate data and implementation,

the user of an object can view the object as a black box that provides services. Instance variables and methods can be added,
deleted, or changed, but as long as the services provided by the object remain the same, code that uses the object
can continue to use it without being rewritten.

> * Polymorphism - Allows handling data types and methods generically using the same interface. In polymorphic overriding,

subtypes redefine a method they have inherited. In polymorphic overloading, there may be several versions of the
same method, with different parameters.

</details>

<details>
<summary>2. What is the difference between abstract class and interface in Java?</summary>

> **Answer:**
> Methods in interface are implicitly abstract. Since Java 8 interfaces can have default methods with

implementations, but default methods have been added for backwards compatibility so that existing interfaces can use
lambda expressions. Default methods in an interface cannot be static or final. An abstract class can have any type of
instance of methods.

> Members of an interface are public by default. Variables declared in interface are always final and can also be static.

An abstract class can have any type of variable.

> An interface should be implemented using keyword implements. An abstract class should be extended using keyword extends.

An interface can extend only another interface.

> A class in java can only extend one abstract class, but can implement multiple interfaces.
>
> An interface cannot be instantiated and cannot have a constructor. Abstract classes cannot be instantiated but can have

a constructor, they also can be invoked if they have 'main' method.

</details>

<details>
<summary>3. What are access modifiers and what kinds of access modifiers does Java have?</summary>

> **Answer:**
>
> * private - visible to class only.
> * Default access - no modifier. Methods, variables and classes are visible only to the package.
> * protected - visible to the package and all subclasses.
> * public - visible for everyone.

</details>

<details>
<summary>4. What are JRE, JDK and JVM? </summary>

> **Answer:**
> JRE is Java Runtime Environment which provides minimal required components to run a Java application. JDK is Java

Development Kit which provides environment to develop and run Java applications. JVM is Java Virtual Machine, JVM is
virtual runtime environment used for executing Java bytecode and ensures Java multiplatform functionality. JVM is part
of JRE and JDK.

</details>

<details>
<summary>5. Explain public static void main(String args[]). </summary>

> **Answer:**
> main() in Java is the entry point for any Java program. It is always written as public static void main(String\[] args).
>
> * public: Public is an access modifier, which is used to specify who can access this method. Public means that this

Method will be accessible by any Class.

> * static: It is a keyword in java which identifies it is class-based. main() is made static in Java so that it can be

accessed without creating the instance of a Class. In case, main is not made static then the compiler will throw an error
as main() is called by the JVM before any objects are made and only static methods can be directly invoked via the class.

> * void: It is the return type of the method. Void defines the method which will not return any value.
> * main: It is the name of the method which is searched by JVM as a starting point for an application with a particular

signature only. It is the method where the main execution occurs.

> * String args\[]: It is the parameter passed to the main method.

</details>

<details>
<summary>6. What is a package in Java? List down various advantages of packages. </summary>

> **Answer:**
> Packages in Java are the collection of related classes and interfaces which are bundled together. By using packages,

developers can easily modularize the code and optimize its reuse. Also, the code within the packages can be imported by
other classes and reused. Below I have listed down a few of its advantages:

> * Packages help in avoiding name clashes
> * They provide easier access control on the code
> * Packages can also contain hidden classes which are not visible to the outer classes and only used within the package
> * Creates a proper hierarchical structure which makes it easier to locate the related classes

</details>

<details>
<summary>7. Is Java a pure object oriented language? If not why?</summary>

> **Answer:**
> There are seven qualities to be satisfied for a programming language to be pure Object Oriented. They are:
>
> * Encapsulation/Data Hiding
> * Inheritance
> * Polymorphism
> * Abstraction
> * All predefined types are objects
> * All operations are performed by sending messages to objects
> * All user defined types are objects.
>
> Java does satisfy most of them. Java supports Encapsulation at class and package level, it supports Abstraction, Inheritance

and Polymorphism, and all user defined types are also objects. But there are predefined types are not objects in Java therefore
operations can't be performed by sending messages to objects. Data types in Java which are not objects:

> * primitive data types e.g. boolean, char, short, int, long, float, double, different kinds of arithmetic
> * logical and bitwise operator e.g. +, -. \*, /, &&, || etc.
>
> Java also got some functional programming touch in Java 8. That's why it is not a pure object oriented language.

</details>

<details>
<summary>8. Can we overload a static method in Java? Can we override it?</summary>

> **Answer:**
> In terms of method overloading static method are just like normal methods and in order to overload static method you

need to provide another static method with same name but different method signature. Static overloaded method are
resolved using Static Binding during compile time. Overloading method in Java is completely different than overriding
method and we can not override static method in Java but we can certainly overload static method in Java.

</details>

<details>
<summary>9. Can we make a class both final and abstract at the same time? </summary>

> **Answer:**
> No, you cannot apply both final and abstract keyword at the class same time because they are exactly opposite of each other.

A final class in Java cannot be extended and you cannot use an abstract class without extending and make it a concrete class.
As per Java specification, the compiler will throw an error if you try to make a class abstract and final at the same time.

</details>

<details>
<summary>10. What is covariant method overriding in Java? </summary>

> **Answer:**
> Covariant method overriding was introduced in Java 5. It helps to remove type casting on client side, by allowing to

return subtype of actually return type of overridden method. Covariant method overriding can be really useful, while overriding
methods which returns object e.g. clone() method. Since clone() return object every client needs to cast on to appropriate
subclass, not any more. By using covariant overriding, we can directly return subtype instead of object.

</details>

### Language Basics

<details>
<summary>11. What are .equals() and .hashcode() used for? Provide examples. What are hashcode and equals guarantees? </summary>

> **Answer:**
> .equals() indicates whether some other object is "equal to" this one. The default implementation in the JDK is

based on memory location — two objects are equal if and only if they are stored in the same memory address. .hashcode()
returns a hash code value for the object. This method is supported for the benefit of hash tables such as those
provided by HashMap. Developers should override both methods in order to achieve a fully working equality mechanism
— it's not enough to just implement the equals() method.

> Java hashCode() and equals() method are used in Hash table based implementations in java for storing and retrieving

data. The implementation of equals() and hashCode() should follow these rules.

> * If o1.equals(o2), then o1.hashCode() == o2.hashCode() should always be true.
> * If o1.hashCode() == o2.hashCode is true, it doesn’t mean that o1.equals(o2) will be true.

</details>

<details>
<summary>12. What are the different kinds of variables defined in java programming language? </summary>

> **Answer:**
> There are basically two different kinds of variables in Java programming language - Primitive variables and Reference variables.

Primitive variables contain primitive literal values, where as reference variables contain a reference to an Object.

</details>

<details>
<summary>13. What are the different kinds of variables defined in java programming language according to scope? </summary>

> **Answer:**
> Based on scope, variables can be of four different types - Class variables, Instance variables, Local variables and Parameters.

Scope of a variable is determined based on where it is declared within a java class.

> * Class variable (Static fields) - Class variables are variables declared within the class body, outside of any methods or

blocks, and declared with 'static' keyword. Class variables have the longest scope. They are created when the class is
loaded, and remain in memory as long as the class remains loaded in JVM.

> * Instance variables (Non-static fields) - Instance variable are variables declared within the class body, outside of

any method or block, and declared without 'static' keyword. Instance variables have the second highest scope. Instance
variables are created when a new class instance is created, and live until the instance is removed from memory.

> * Local Variables - Local variables are variables declared within a method body. They live only as long as the method

in which it is declared remains on the stack.

> * Block variables - Block variables are variables declared within a block such as an init block or within a for loop.

They live only during the execution of the block and are the shortest living variables.

</details>

<details>
<summary>14. What are primitive data types? What are the primitive data types supported by Java programming language?</summary>

> **Answer:**
> Primitive data types are data types that are predefined in Java programming language and named by a reserved keyword. Java

programming language supports eight different primitive types - byte, short, int, long, float, double, boolean and char.

> * byte, short, int and long are integer number types. byte has 8 bits and is the smallest integer number type. long has 64 bits and

is the biggest integer number type. The default value for all integer number types is 0.

> * float and double are floating-point number types. doubles are bigger than floats. The default value for floating-point

number types is 0.0

> * boolean has a true or false value.
> * char contains a single, 16-bit unicode value.

</details>

<details>
<summary>15. What is Primitive Casting in Java programming language?</summary>

> **Answer:**
> Primitive Casting is used to convert primitive values from one data type to another. For example, an int value can be

assigned to a float data type, or a double value can be assigned to an int data type. Casting can be either implicit or explicit.

> * Implicit Casting: In implicit casting the conversion happens automatically, without writing specific code to do the

conversion. Implicit casting happens when you convert or assign a smaller value, like a byte, to a larger data type such as an int.

> * Explicit Casting: In explicit casting code has to be specifically written to perform the conversion from one primitive

type to another. Explicit casting is done by using the syntax (data_type) where data_type is the data type that the cast
is being applied to. Explicit casting happens when you convert or assign a larger value to a smaller data type.

</details>

<details>
<summary>16. What are Primitive Literals?</summary>

> **Answer:**
> Primitive Literals are the code representation of values of primitive data types. For example 'a' is a char literal,

100 is an int literal, 'false' is a boolean literal and 2345.456 is a double literal.

> * Integer Literals: Integer number types in the Java programming language can be represented in four different ways -

decimal (base 10), octal (base 8), hexadecimal (base 16) and binary (base 2). You will use decimal representation in most cases;
and rarely, if ever, use the other representations.

> * Floating-point Literals: Floating point literals are defined by a number, followed by a decimal point and then followed

by more numbers representing the fraction. Example: 23435363.4336633. Floating-point literals are of type double by default
which is 64 bits. If you want to assign a floating-point literal to a float variable you have to suffix the literal with either
'F' or 'f' (like 23435363.4336633F), else you will get a compilation error of a possible loss of precision. If you want
to assign a floating-point literal to a double variable can optionally suffix the literal with either 'D' or 'd' (like 23435363.4336633D).
It is optional since floating-point literals are of type double by default.

> * Boolean Literals: Boolean literals are code representations of boolean data types and can be defined only as either

'true' or 'false'. Some programming languages use numbers, usually 0 and 1, to represent boolean data type. But in Java
programming language numbers are not allowed to represent boolean data types.

> * Char literals: char literals are represented by a single character in single quotes

</details>

<details>
<summary>17. What are Logical Operators?</summary>

> **Answer:**
>
> * && - AND operator returns true if both of the operands evaluate to true. If the operand on the left returns false, it returns false

without evaluating the operand on the right.

> * || - OR operator returns true if at least one of the operands evaluate to true. If the operand on the left returns true, it returns true

without evaluating the operand on the right.

> * != - NOT EQUAL operator returns true if operands are not equal, and false if they are equal.
> * \== - EQUAL operator returns true if operands are equal, and false if they are not.

</details>

<details>
<summary>18. What is the difference between ++x and x++ under increment operators?</summary>

> **Answer:**
> In ++x, the value of x will get incremented before it is used in the expression.

In x++, the previous value is used in the expression first, and after that x is modified.

</details>

<details>
<summary>19. What are Bitwise Logical Operators?</summary>

> **Answer:**
>
> * \~ - Not Operator inverts all the bits of the operand. For example, \~1101 = 0010.
> * & - AND operator fulfils two conditions: 1 bit if both operands are 1, 0 for all others. For example, 1101 & 0110 = 0100.
> * \| - OR operator will result in 1 if any of the operand has 1. For example, 1101 | 0110 = 1111.
> * ^ - XOR operator will result in 1 if operands are unequal. For example, 1101 ^ 0110 = 1011.
> * << and >> - left-shift and right-shift operators shift  all the bits in a value to the left/right.

</details>

<details>
<summary>20. What are Loops in Java? What types of loops does Java support? </summary>

> **Answer:**
> Looping is used in programming to execute a statement or a block of statement repeatedly. Java offers three different

types of loops: for, while, and do-while.

> * A for loop provides a way to iterate over a range of values. It's most useful when we know in advance how many times a

task is going to be repeated.

> * A while loop can execute a block of statements while a particular condition is true.
> * A do-while is a variation of a while statement in which the evaluation of the boolean expression is at the bottom of the loop.

This guarantees that the code will execute at least once.

</details>

<details>
<summary>21. What is an infinite loop in Java? Explain with an example. </summary>

> **Answer:**
> An infinite loop is an instruction sequence in Java that loops endlessly when a functional exit isn’t met. This type

of loop can be the result of a programming error or may also be a deliberate action based on the application behavior.
An infinite loop will terminate automatically once the application exits.

</details>

<details>
<summary>22. Why Java is platform independent? </summary>

> **Answer:**
> Java is called platform independent because of its byte codes which can run on any system irrespective of its underlying

operating system.

</details>

<details>
<summary>23. What is Stack Memory and Heap Space in Java?</summary>

> **Answer:**
> Stack Memory in Java is used for static memory allocation and the execution of a thread. It contains primitive

values that are specific to a method and references to objects that are in a heap, referred from the method.
Access to this memory is in Last-In-First-Out (LIFO) order. Whenever a new method is called, a new block on
top of the stack is created which contains values specific to that method, like primitive variables and references to objects.
When the method finishes execution, it’s corresponding stack frame is flushed, the flow goes back to the
calling method and space becomes available for the next method.

> Heap space in Java is used for dynamic memory allocation for Java objects and JRE classes at the runtime.
> New objects are always created in heap space and the references to this objects are stored in stack memory.

These objects have global access and can be accessed from anywhere in the application.

> This memory model is further broken into smaller parts called generations, these are:
>
> * 'Young Generation' – this is where all new objects are allocated and aged. A minor Garbage collection occurs when this fills up
> * 'Old or Tenured Generation' – this is where long surviving objects are stored. When objects are stored in the Young Generation,

a threshold for the object's age is set and when that threshold is reached, the object is moved to the old generation

> * 'Permanent Generation' – this consists of JVM metadata for the runtime classes and application methods

</details>

<details>
<summary>24. What is the difference between equals() and == in Java? </summary>

> **Answer:**
> Equals() method is defined in Object class in Java and used for checking equality of two objects defined by business logic.

“==” or equality operator in Java is a binary operator provided by Java programming language and used to compare primitives
and objects. *public boolean equals(Object o)* is the method provided by the Object class. The default implementation uses
\== operator to compare two objects. For example: method can be overridden like String class. equals() method is used to
compare the values of two objects.

</details>

<details>
<summary>25. What is the difference between Local variable and Instance variable?</summary>

> **Answer:**
> Local variables are declared inside a method or a block whereas instance variables inside a class but outside a method.
>
> Instance variables are given default values, is null if it's an object reference, 0 if it's an int.
>
> Local variables don't get default values, and therefore need to be explicitly initialized (and the compiler usually complains if you fail to do this)
>
> Local variables are visible only in the method or block they are declared whereas instance variables can be seen by all methods in the class.
>
> Local variables are created when a method is called and destroyed when the method exits whereas instance variables are created using new and destroyed by the garbage collector when there are no reference to them.

</details>

<details>
<summary>26. What are transient variables in Java programming language? </summary>

> **Answer:**
> Transient variable is a variable whose value is not serialized during serialization of the object. During de-serialization

of the object, transient primitive variables are initialized to their default values. Transient reference variables are
initialized to null.

</details>

<details>
<summary>27. Why is specifying data type mandatory In Java? </summary>

> **Answer:**
> Java is known as strictly typed language as it is mandatory to specify a data type of variable before a variable name.

It is used by a compiler to help programmer avoid any mistakes such as storing String values to integer variables. Before
reading or assigning a value, that variable must have been declared.

</details>

<details>
<summary>28. What is Wrapper classes?</summary>

> **Answer:**
> Each of Java's eight primitive data types has a class dedicated to it. These are known as wrapper classes because they

"wrap" the primitive data type into an object of that class. The wrapper classes are part of the java.lang package,
which is imported by default into all Java programs.

> The wrapper classes in java servers two primary purposes.
>
> To provide a mechanism to ‘wrap’ primitive values in an object so that primitives can do activities

reserved for the objects like being added to ArrayList, Hashset, HashMap etc. collection.

> To provide an assortment of utility functions for primitives like converting primitive types to

and from string objects, converting to various bases like binary, octal or hexadecimal, or comparing various objects

</details>

<details>
<summary>29. What is Autoboxing?</summary>

> **Answer:**
> Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their

corresponding object wrapper classes. For example, converting an int to an Integer, a double to a Double,
and so on. If the conversion goes the other way, this is called unboxing.

</details>

<details>
<summary>30. How does Java programming language pass primitive variables to methods - by value or by reference?</summary>

> **Answer:**
> In Java, primitive variables are passed to methods by value. More specifically, a copy of the primitive value is passed

to the method. If the passed value changes in the method, it does not change the original value.

</details>

<details>
<summary>31. Is Java primitive data type stored on stack or heap?</summary>

> **Answer:**
> Primitive types declared locally will be on the stack while primitive types that are defined as part of an object instance

or static variables are stored on the heap.

</details>

<details>
<summary>32. How is == operator different for objects and primitive types?</summary>

> **Answer:**
> For objects or references, == operator check if the reference on left and right points to the same object.

For primitive types or variables, == operator check if the variable on left and right holds the same value.

</details>

<details>
<summary>33. What is the difference between logical and bitwise operators?</summary>

> **Answer:**
> Logical operators work on boolean expressions and return boolean values (either true or false), whereas bitwise operators

work on binary digits of integer values (long, int, short, char, and byte) and return an integer.

</details>

<details>
<summary>34. What is instanceOf operator? </summary>

> **Answer:**
> The operator instanceOf is used to verify if the specified object is the instance of specified class or interface.

It returns true if object is an instance of specified class (and its children) or interface (and its implementations).
instanceOf operator is used to avoid ClassCastException.

</details>

<details>
<summary>35. Describe the switch statement. What object types can be used in the switch clause?</summary>

> **Answer:**
> Switch allows the selection of several execution paths based on a variables' value. Each path is labeled with case or default,

the switch statement evaluates each case expression for a match and executes all statements that follow the matching label
until a break statement is found. If it can't find a match, the default block will be executed instead. We can use byte,
short, char, int, their wrapped versions, enums and Strings as switch values.

</details>

<details>
<summary>36. What happens when we forget to put a break statement in a case clause of a switch?</summary>

> **Answer:**
> The switch statement falls-trough. This means that it will continue the execution of all case labels until if finds a

break statement, even though those labels don't match the expression's value.

</details>

<details>
<summary>37. What is an enhanced for loop?</summary>

> **Answer:**
> Is another syntax of the for statement designed to iterate through all the elements of a collection, array, enum or any

object implementing the Iterable interface:

>```java
> for (String aString : arrayOfStrings) {}
>```

</details>

<details>
<summary>38. What is the difference between an unlabeled and a labeled break statement?</summary>

> **Answer:**
> An unlabeled break statement terminates the innermost switch, for, while or do-while statement, whereas a labeled break

ends the execution of an outer statement.

</details>

<details>
<summary>39. What is the difference between continue and break statement? </summary>

> **Answer:**
> Break and continue are two important keywords used in Loops. When a break keyword is used in a loop, loop is broken instantly

while when continue keyword is used, current iteration is broken and loop continues with next iteration.

</details>

<details>
<summary>40. Is String a data type in java? </summary>

> **Answer:**
> String is not a primitive data type in java. When a string is created in java, it's actually an object of Java.Lang.String

class that gets created. After creation of this string object, all built-in methods of String class can be used on the string object.

</details>

<details>
<summary>41. What is special about string objects as compared to objects of other derived types? </summary>

> **Answer:**
> One special thing about string objects is that you can create string objects without using new operator i.e using string literals.

This is not possible with other derived types (except wrapper classes). One more special thing about strings is that you can
concatenate two string objects using ‘+’. This is the relaxation java gives to string objects as they will be used most of the
time while coding. And also java provides string constant pool to store the string objects.

</details>

<details>
<summary>42. Does String is thread-safe in Java? </summary>

> **Answer:**
> Strings are immutable, so we can’t change it’s value in program. Hence it’s thread-safe and can be safely used in multi-threaded environment.

</details>

<details>
<summary>43. What is Java String Pool? </summary>

> **Answer:**
> Java String pool refers to a collection of Strings which are stored in heap memory. In this, whenever a new object is

created, String pool first checks whether the object is already present in the pool or not. If it is present, then the
same reference is returned to the variable else new object will be created in the String pool and the respective reference
will be returned.

</details>

<details>
<summary>44. Why do you Need String Constant Pool? </summary>

> **Answer:**
> String objects are most used objects in the development of any kind of applications. Therefore, there has to be a special

arrangement to store these objects. String Constant Pool is one such special arrangement. In string constant pool, there will
be no two objects with the same content. Heap memory can have any number of objects with same content.

</details>

<details>
<summary>45. Are Interned Strings Eligible for Garbage Collection in Java? </summary>

> **Answer:**
> Yes, all Strings in the string pool are eligible for garbage collection if there are no references from the program.

</details>

<details>
<summary>46. What do you understand by immutability of Java String objects? </summary>

> **Answer:**
> Strings in Java programming language are immutable, i.e. once a string object is created its value cannot be changed.

When you change the value of a string reference variable, internally the java virtual machine creates a new string in
memory and returns that value. The old string still exists in memory but is not being referenced.

</details>

<details>
<summary>47. What are the benefits of Strings being immutable? </summary>

> **Answer:**
>
> * The string pool is only possible if the strings, once created, are never changed, as they are supposed to be reused
> * The code can safely pass a string to another method, knowing that it can't be altered by that method
> * Immutably automatically makes this class thread-safe
> * Since this class is thread-safe, there is no need to synchronize common data, which in turn improves performance
> * Since they are guaranteed to not change, their hashcode can be easily cached

</details>

<details>
<summary>48. Why Java Strings are immutable in nature? </summary>

> **Answer:**
> In Java, string objects are immutable in nature which simply means once the String object is created its state cannot

be modified. Whenever you try to update the value of that object instead of updating the values of that particular object,
Java creates a new string object. Java String objects are immutable as String objects are generally cached in the String pool.
Since String literals are usually shared between multiple clients, action from one client might affect the rest. It
enhances security, caching, synchronization, and performance of the application.

</details>

<details>
<summary>49. What do you know about case folding? </summary>

> **Answer:**
> The ToLower() method returns a copy of the string converted to lowercase. Similarly, the ToUpper() method returns a copy

converted to uppercase. The CapWords() method returns a copy where the first letter of each word is capitalized.

</details>

 <details>
<summary>50. How to transform Char into a String? </summary>

> **Answer:**
> A char represents one character in Java. But in most cases, we need a String. So to perform transforming use *String.valueOf(char)*

</details>

<details>
<summary>51. What difference between Blank String and Empty String? </summary>

> **Answer:**
> A string is empty if it's null or has length zero. Whereas a string is blank if it's null or contains only whitespace characters.

</details>

<details>
<summary>52. How to check if a String is empty in Java? </summary>

> **Answer:**
> There are many ways to check if a String is empty in Java e.g. you can check its length. If the length of String is zero

then it's empty. Otherwise, you can also use the isEmpty() method which returns true if String is empty. Though, you need
to be careful with requirements e.g. a String may contain whitespace which will look empty but length will not be zero.

</details>

<details>
<summary>53. How do you convert a String to an Integer and an Integer to a String in Java programming language? </summary>

> **Answer:**
>
> * The Integer wrapper class Java.lang.Integer provides two static methods, Integer.parseInt() and Integer.valueOf() that

convert Strings to Integers. Integer.parseInt() returns a primitive int value whereas Integer.valueOf() returns an Integer object.

> * There are two ways to convert an Integer to a String. Using the static methods Integer.toString() and String.valueOf().

</details>

<details>
<summary>54. How Can We Compare Two Strings in Java? </summary>

> **Answer:**
> We can compare strings in two different ways: by using equal to operator ( == ) and by using the equals() method.

Both are quite different from each other:

> * The operator (str1 == str2) checks for referential equality
> * The method (str1.equals(str2)) checks for lexical equality
>
> Though, it's true that if two strings are lexically equal, then *str1.intern() == str2.intern()* is also true.

Typically, for comparing two Strings for their content, we should always use String.equals.

</details>

<details>
<summary>55. What is the difference in String pool between Java 6 and 7? </summary>

> **Answer:**
> Prior to Java 7, the Sring pool was located on meta-space where class metadata was stored but from JDK 7 onwards it's

moved into heap space.

</details>

<details>
<summary>56. What is string intern? </summary>

> **Answer:**
> String object in the string constant pool is called as String Intern. You can create an exact copy of heap memory string

object in string constant pool. This process of creating an exact copy of heap memory string object in the string constant
pool is called interning. intern() method is used for interning.

</details>

<details>
<summary>57. Why Char array is preferred over String for storing password? </summary>

> **Answer:**
> Once a string is created in the string pool, it stays here until garbage collected. By this time, any malicious program

can access the memory location in the physical memory location and access the string as well. If we store the password as
a string, then it will also be stored in spring pool and will be available in memory for the longer duration than required,
because garbage collection cycles are unpredictable. This makes sensitive password strings vulnerable to hacking and data theft.
We cannot make String blank after using it. After creation of String, we cannot manipulate it e.g. you cannot change its
content. But char arrays are mutable, their content can be overwritten after use it. So your application shall use char\[]
to store password text, and after using the password, replace array content with a blank.

</details>

### Collection Framework

<details>
<summary>58. What are collections in Java? List collections interfaces used in Java.</summary>

> **Answer:**
> Collections in Java is a framework providing a way to store and manipulate a group of objects. Main interfaces in

Java Collection Framework are Collection, List, Set, and Queue. Map interface is not inherited from
Collection interface, but is also considered a part of Java Collection Framework.

</details>

<details>
<summary>59. What is meant by Ordered and Sorted in collections?</summary>

> **Answer:**
> An ordered collection means that the elements of the collection have a specific order. The order is independent of the value. A List is an example.
>
> A sorted collection means that not only does the collection have order, but the order depends on the value of the element. A SortedSet is an example.
>
> In contrast, a collection without any order can maintain the elements in any order. A Set is an example.

</details>

<details>
<summary>60. What is the difference between List and Set? </summary>

> **Answer:**
> The List and Set both extend the collection interface. However, there are some differences between the both which are listed below.
>
> * The List can contain duplicate elements whereas Set includes unique items.
> * The List is an ordered collection which maintains the insertion order whereas Set is an unordered collection which does not preserve the insertion order.
> * The List interface contains a single legacy class which is Vector class whereas Set interface does not have any legacy class.
> * The List interface can allow n number of null values whereas Set interface only allows a single null value.

</details>

<details>
<summary>61. Why immutable objects are considered to be good keys for HashMap? </summary>

> **Answer:**\
> Immutable object’s hashcode won’t change, so it makes key retrieval faster as you can cache different hashcode for different

keys. In case of mutable object, hashcode may be dependent on mutable fields, if any value for these field changes, it might
change hashcode, so you might not able to find your key in HashMap as hashcode is different now.

</details>

<details>
<summary>62. What is the difference between ArrayList and LinkedList? What are they used for?</summary>

> **Answer:**
>
> * ArrayList internally uses a dynamic array to store the elements.
>
> * LinkedList internally uses a doubly linked list to store the elements.
>
> * Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the bits are shifted in memory.
>
> * Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
>
> * An ArrayList class can act as a list only because it implements List only.
>
> * LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
>
> * ArrayList is better for storing and accessing data.
>
> * LinkedList is better for adding and deleting data.

</details>

<details>
<summary>63. What is the difference between HashMap and HashTable?</summary>

> **Answer:**
>
> * HashMap methods are not synchronized.
>
> * HashTable key methods are synchronized.
>
> * HashMap is not thread-safe.
>
> * HashTable is thread-safe.
>
> * In HashMap iterator is used to iterate the values.
>
> * In HashTable Enumerator is used to iterate the values.
>
> * HashMap allows one null key and multiple null values.
>
> * HashTable doesn’t allow anything that is null.
>
> * HashMap performance is higher than HashTable performance.

</details>

<details>
<summary>64. What is the difference between HashSet and TreeSet?</summary>

> **Answer:**
>
> * In HashSet elements are inserted in random order.
>
> * TreeSet maintains the elements in the sorted order.
>
> * HashSet is able to store null objects.
>
> * TreeSet can't store null objects.
>
> * HashSet performance is fast while TreeSet performance is slow.

</details>

### Math Classes

<details>
<summary>65. What do you know about Java Math Class? </summary>

> **Answer:**
> The Math class contains methods for finding the maximum or minimum of two values, rounding values, logarithmic functions,

square root, and trigonometric functions (sin, cos, tan etc.). The Math is located in the java.lang package, and not in the java.math
package.

</details>

<details>
<summary>66. How can you generate random numbers in Java? </summary>

> **Answer:**
>
> * Using Math.random() you can generate random numbers in the range greater than or equal to 0.1 and less than 1.0
> * Using Random class in package java.util

</details>

<details>
<summary>67. What do the expression 1.0 / 0.0 will return? </summary>

> **Answer:**
> It will not throw ArithmeticException and return Double.INFINITY. Also, comparison x == Double.NaN always evaluates to false,

even if x itself is a NaN. To test if x is a NaN, one should use the method call Double.isNaN(x) to check if given number is
NaN or not.

</details>

<details>
<summary>68. Which method is a rounding function of math class? </summary>

> **Answer:**
> max(), min() and abs() are all rounding functions.

</details>

<details>
<summary>69. What exponential and logarithmic Math functions do you know? </summary>

> **Answer:**
> exp(), log(), log10(), pow(). sqrt().

</details>

<details>
<summary>70. Which class contains all the methods present in math class? </summary>

> **Answer:**
> SystemMath class defines complete set of mathematical methods that are parallel those in Math class. The difference is that

the StrictMath version is guaranteed to generate precisely identical results across all Java implementations.

</details>

## Intermediate

### String Buffer and Builder

<details>
<summary>71. What do you know about StringBuffer? </summary>

> **Answer:**
> StringBuffer is a peer class of String that provides much of the functionality of strings. String represents fixed-length,

immutable character sequences while StringBuffer represents growable and writable character sequences. StringBuffer may have
characters and substrings inserted in the middle or appended to the end. It will automatically grow to make room for such
additions and often has more characters preallocated than are actually needed, to allow room for growth.

</details>

<details>
<summary>72. How StringBuffer object can be created? </summary>

> **Answer:**
>
> * **StringBuffer()**: It reserves room for 16 characters without reallocation.
> * **StringBuffer( int size)**: It accepts an integer argument that explicitly sets the size of the buffer.
> * **StringBuffer(String str)**: It accepts a String argument that sets the initial contents of the StringBuffer object

and reserves room for 16 more characters without reallocation.

</details>

<details>
<summary>73. When a lot of changes are required in data, which one should be a preference to be used? String or StringBuffer? </summary>

> **Answer:**
> Since StringBuffers are dynamic in nature and we can change the values of StringBuffer objects unlike String which is immutable,

it's always a good choice to use StringBuffer when data is being changed too much. If we use String in such a case, for every
data change a new String object will be created which will be an extra overhead.

</details>

<details>
<summary>74. What do you know about StringBuilder? </summary>

> **Answer:**
> The StringBuilder in Java represents a mutable sequence of characters. Since the String Class in Java creates an immutable

sequence of characters, the StringBuilder class provides an alternative to String Class, as it creates a mutable sequence of
characters. The function of StringBuilder is very much similar to the StringBuffer class, as both of them provide an alternative
to String Class by making a mutable sequence of characters. However the StringBuilder class differs from the StringBuffer
class on the basis of synchronization. The StringBuilder class provides no guarantee of synchronization whereas the StringBuffer
class does.

</details>

<details>
<summary>75. What is the difference between StringBuffer and StringBuilder? </summary>

> **Answer:**
> StringBuffer has one disadvantage that all of its public methods are synchronized. StringBuffer provides Thread safety

but on a performance cost. StringBuilder is similar to StringBuffer except thread safety and synchronization. So if you are
in a single threaded environment or don’t care about thread safety, you should use StringBuilder else use StringBuffer.

</details>

<details>
<summary>76. What is the difference between String and StringBuilder? </summary>

> **Answer:**
> Unlike string objects, StringBuilder objects are mutable. You can change the value of a string builder object without

creating a new object. So you can modify a StringBuilder object many times, but only a single instance of the StringBuilder
object is created.

</details>

<details>
<summary>77. Why StringBuffer and StringBuilder classes are introduced in java when there already exist String class to
represent the set of characters? </summary>

> **Answer:**
> The objects of String class are immutable in nature. i.e you can’t modify them once they are created. If you try to modify

them, a new object will be created with modified content. This may cause memory and performance issues if you are performing
lots of string modifications in your code. To overcome these issues, StingBuffer and StringBuilder classes are introduced in java.

</details>

<details>
<summary>78. What is the difference between StringBuffer and StringBuilder? </summary>

> **Answer:**
> StringBuilder is not thread safe, i.e it's methods are not synchronized; whereas StringBuffer is thread safe, i.e it's methods

are synchronized. Since the methods of StringBuilder are not synchronized, it is faster than StringBuffer. If thread safety
is not a requirement, you should use StringBuilder instead of StringBuffer.

</details>

<details>
<summary>79. What are some of the key methods in StringBuilder and StringBuffer class? </summary>

> **Answer:**
> Following are some of the key methods in StringBuilder and StringBuffer classes.
>
> * append() - Appends another string to this string.
> * insert() - Inserts another string into this string. You have to specify the index at which the string has to be included.
> * delete() - Deletes part of the string.
> * reverse() - Reverses the characters of a string.
> * toString() - Returns a string representation of the StringBuffer or StringBuilder.

</details>

### Annotations

<details>
<summary>80. What is the difference between overriding and overloading? What are they used for?</summary>

> **Answer:**
> Overloading happens when two or more methods have the same name but different parameters. Overriding is when two

methods have the same name and parameters (method signature). Method overloading is usually used to provide methods with
default parameter values, but can be used for different things. Overriding occurs when a child class re-implements a
method of a parent class. Method overriding is meant to be used in order to implement different functionality inside an
overridden method.

</details>

### Generics

<details>
<summary>81. What are generics in Java and how can you use them? What is type erasure?</summary>

> **Answer:**
> Generics are implementation of the idea of type parameter. Classes, methods and functions can have a generic type

parameter. Generics allow better code reuse and type safety. Generic type parameters are declared inside angled
brackets: <>.

> To ensure that generics wouldn't cause overhead at runtime, compiler applies process called type erasure on

generics at compile time. Type erasure removes all type parameters and replaces it with their bounds or with
Object if the type parameter is unbounded. If the type is bounded, then the type will be replaced by the bound
at compile time.

</details>

<details>
<summary>82. What are bounded type parameters?</summary>

> **Answer:**
> Bounded type parameters enable you to restrict the types that you can use as arguments for a parameterized type. For example

if a method acts only on numbers, then you can use bounded parameters to specify that the method accepts only instances of Number
or its sub-classes.

</details>

<details>
<summary>83. What do you understand by wildcards in generics?</summary>

> **Answer:**
> The question mark (?) is termed as wildcard in generics code. The wildcard represents an unknown type. For example List can

refer to a list of any Java object.

</details>

<details>
<summary>84. Can Java generics be applied to primitive types?</summary>

> **Answer:**
> No, Java generics cannot be applied to primitive types. But you can use wrapper classes of primitive type to use Java generics.

</details>

<details>
<summary>85. Why Generics are used in Java?</summary>

> **Answer:**
> Generics provide compile-time type safety that allows programmers to catch invalid types at compile time. Java Generic methods

and generic classes enable programmers to specify, with a single method declaration, a set of related methods or, with a single
class declaration, a set of related types.

</details>

<details>
<summary>86. If a Generic Type Is Omitted When Instantiating an Object, Will the Code Still Compile?</summary>

> **Answer:**
> As generics did not exist before Java 5, it is possible not to use them at all. For example, generics were retrofitted to

most of the standard Java classes such as collections. Despite being able to compile, it's still likely that there will be
a warning from the compiler. This is because we are losing the extra compile-time check that we get from using generics.
The point to remember is that while backward compatibility and type erasure make it possible to omit generic types, it is bad practice.

</details>

### Exception Handling

<details>
<summary>87. What are exceptions in Java? What can you do with exceptions in Java?</summary>

> **Answer:**
> An exception is an unwanted event, which occurs during the execution of an application (at run time) and disrupts the

normal flow. Exceptions can be thrown, caught and declared as being thrown in method signature. try-catch block is
used to handle exceptions. Try is used for code which may throw and exception. Catch is used to handle exceptions.
You can handle several exceptions at once with catch block. Finally block is called after try and catch blocks. Finally
block is usually used to close resources or clean up.

</details>

<details>
<summary>88. How can you handle Java exceptions?</summary>

> **Answer:**
> There are five keywords used to handle exceptions in Java:
>
> * try
> * catch
> * finally
> * throw
> * throws

</details>

<details>
<summary>89. All exceptions need to be handled?</summary>

> **Answer:**
> There are 2 kinds of exceptions: Checked and Unchecked. A Checked exception can be considered one that is found by the compiler,

and the compiler knows that it has a chance to occur, so you need to catch or throw it. For example, opening a file. It has a chance
to fail, and the compiler knows this, so you're forced to catch or throw the possible IOException.

> Because the Java programming language does not require methods to catch or to specify unchecked exceptions, programmers

may be tempted to write code that throws only unchecked exceptions or to make all their exception subclasses inherit from unchecked.

</details>

<details>
<summary>90. Examples of Unchecked exceptions? </summary>

> **Answer:**
> There are RuntimeException, Error, and their subclasses.
>
> Runtime exceptions represent problems that are the result of a programming problem, and as such,

the API client code cannot reasonably be expected to recover from them or to handle them in any way.
Such problems include arithmetic exceptions, such as dividing by zero; pointer exceptions, such as
trying to access an object through a null reference; and indexing exceptions, such as attempting to
access an array element through an index that is too large or too small.

> Runtime exceptions can occur anywhere in a program, and in a typical one they can be very numerous.

Having to add runtime exceptions in every method declaration would reduce a program's clarity. Thus,
the compiler does not require that you catch or specify runtime exceptions (although you can).

> An Error is a subclass of Throwable that indicates serious problems that a reasonable application should not try to catch.

Most such errors are abnormal conditions. The ThreadDeath error, though a "normal" condition, is also a subclass of Error
because most applications should not try to catch it.

</details>

<details>
<summary>91. What is the difference between Error and Exception?</summary>

> **Answer:**
> An error is an irrecoverable condition occurring at runtime. Such as OutOfMemory error. These JVM errors you cannot repair

them at runtime. Though error can be caught in the catch block but the execution of application will come to a halt and is
not recoverable. While exceptions are conditions that occur because of bad input or human error etc. e.g. FileNotFoundException
will be thrown if the specified file does not exist. Or a NullPointerException will take place if you try using a null reference.
In most of the cases it is possible to recover from an exception (probably by giving the user feedback for entering proper values etc.

</details>

<details>
<summary>92. What is exception hierarchy in java?</summary>

> **Answer:**
> Throwable is a parent class of all Exception classes. There are two types of Exceptions: Checked exceptions and

UncheckedExceptions or RunTimeExceptions. Both type of exceptions extends Exception class whereas errors are further
classified into Virtual Machine error and Assertion error.

</details>

<details>
<summary>93. What are the important methods of Java Exception Class?</summary>

> **Answer:**
> Exception and all of it’s subclasses doesn’t provide any specific methods and all of the methods are defined in the base

class Throwable.

> * String getMessage() – This method returns the message String of Throwable and the message can be provided while creating

the exception through it’s constructor.

> * String getLocalizedMessage() – This method is provided so that subclasses can override it to provide locale specific

message to the calling program. Throwable class implementation of this method simply use getMessage() method to return the
exception message.

> * Synchronized Throwable getCause() – This method returns the cause of the exception or null id the cause is unknown.
> * String toString() – This method returns the information about Throwable in String format, the returned String contains

the name of Throwable class and localized message.

> * void printStackTrace() – This method prints the stack trace information to the standard error stream, this method is

overloaded and we can pass PrintStream or PrintWriter as an argument to write the stack trace information to the file or stream.

</details>

### Streams and Threading

<details>
<summary>94. What are volatile variables in Java programming language? </summary>

> **Answer:**
> Volatile variables are relevant in multi-threaded Java programming, in which multiple threads access the variables of

an object. A volatile variable is declared with the keyword 'volatile'. For regular (non-volatile) variables the thread
caches the variable's value in its memory and refers to this cached value when required. Any updates that are make to this
variable by other threads will not be reflected in this thread. Volatile variables tells the JVM that this variable will
be updated by multiple threads, and to always take its value from the main memory. So all thread access and get the value
of a volatile variable from the main memory and do not cache the value in the thread's memory cache.

</details>

<details>
<summary>95. How immutable objects are thread safe? </summary>

> **Answer:**
> Immutable objects are always thread-safe, but their references may not be. To make their references thread-safe, we may

need to access them from synchronized blocks/methods.

</details>

<details>
<summary>96. What are the I/O streams Java programming language?</summary>

> **Answer:**
> I/O streams in Java programming language represent input sources from which data is read, and output destinations to which

data is written. Streams support different kinds of data including bytes, characters, primitive types and objects.

> * Byte Streams - java.io package has two abstract classes InputStream and OutputStream that represents input stream and output

stream of byte data type.

> * Character Streams - java.io package has two abstract classes Reader and Writer that represents input stream and output

stream of character data type.

> * Primitive data streams- java.io package has two interfaces classes DataInput and DataOutput that represents input stream

and output stream of primitive data type.

> * Object streams- java.io package has two interfaces ObjectInput and ObjectOutput that represents input stream and output

stream of object data type.

</details>

<details>
<summary>97. What is difference between Scanner and BufferedReader?</summary>

> **Answer:**
> Scanner is used for parsing tokens from the contents of the stream while BufferedReader just reads the stream and does not

do any special parsing. Usually we pass a BufferedReader to a scanner as the source of characters to parse.

</details>

<details>
<summary>98. What is difference between IO and NIO?</summary>

> **Answer:**
> Main difference between NIO and IO is that NIO provides asynchronous, non blocking IO, which is critical to write faster

and scalable networking systems. While most of utility from IO classes are blocking and slow, NIO take advantage of asynchronous
system calls in UNIX systems such as select() system call for network sockets. Using select(), an application can monitor
several resources at the same time and can also poll for network activity without blocking. The select() system call identifies
if data is pending or not, then read() or write() may be used knowing that they will complete immediately.

</details>

<details>
<summary>99. What is the purpose of File class?</summary>

> **Answer:**
> It is used to create objects that provide access to the files and directories of a local file system.

</details>

<details>
<summary>100. What are the uses of FileInputStream and FileOutputStream in java?</summary>

> **Answer:**
> java.io.FileInputStream and java.io.FileOutputStream were introduced in JDK 1.0. These APIs are used to read and write stream

input and output. They can also be used to read and write images.

</details>

<details>
<summary>101. What do you know about RandomAccessFile?</summary>

> **Answer:**
> The RandomAccessFile class inherits directly from Object and is not inherited from the above basic input/output classes. Designed

to work with files, supporting random access to their contents. Working with the RandomAccessFile class resembles the use
of DataInputStream and DataOutputStream combined in one class (they implement the same DataInput and DataOutput interfaces).
In addition, the seek() method allows you to move to a specific position and change the value stored there. When using RandomAccessFile
you need to know the file structure. The RandomAccessFile class contains methods for reading and writing primitives and UTF-8 strings.

</details>

<details>
<summary>102. What is Serialization and Deserialization? </summary>

> **Answer:**
> We can convert a Java object to an Stream that is called Serialization. Once an object is converted to Stream, it can be

saved to file or send over the network or used in socket connections. The object should implement Serializable interface and
we can use java.io.ObjectOutputStream to write object to file or to any OutputStream object. The process of converting stream
data created through serialization to Object is called deserialization.

</details>

<details>
<summary>103. When we should use serialization? </summary>

> **Answer:**
> Serialization is used when data needs to be transmitted over the network. Using serialization, object's state is saved and

converted into byte stream .The byte stream is transferred over the network and the object is re-created at destination.

</details>

<details>
<summary>104. How an object is serialized in java? </summary>

> **Answer:**
> In java, to convert an object into byte stream by serialization, an interface with the name Serializable is implemented by the

class. All objects of a class implementing serializable interface get serialized and their state is saved in byte stream.

</details>

<details>
<summary>105. What is multiprocessing and multithreading? Which does Java support? Provide examples.</summary>

> **Answer:**
> Multiprocessing is a system that has more than one or two processors. In Multiprocessing, CPUs are added for increasing

computing speed of the system. Because of Multiprocessing, There are many processes are executed simultaneously.

> Multithreading is a system in which multiple threads are created of a process for increasing the computing speed of the

system. In multithreading, many threads of a process are executed simultaneously and process creation in multithreading is
done according to economical. Both are supported in java.

> Both threads and processes are methods of parallelizing an application. However, processes are independent execution

units that contain their own state information, use their own address spaces, and only interact with each other via
interprocess communication mechanisms (generally managed by the operating system).

> In java there are classes like Process and Thread.

</details>

<details>
<summary>106. How can you create and run a thread in Java?</summary>

> **Answer:**
> There are two ways to create a thread:
>
> * implementing the Runnable interface
> * extending Thread class
>
> In order to run a thread you need to call .run() method on Thread class, before which you either need to pass your
> Runnable implementation to Thread class or extend Thread class and implement your own .run() method.

</details>

<details>
<summary>107. Describe the life-cycle of threads. What are the different states of threads? How does the thread transition
from one state to the other?</summary>

> **Answer:**
> A thread can be in one of five states
>
> * New - A thread is in 'New' state when it has been instantiated, but the start() method is not yet called on the thread instance.

In this state the thread is a Thread object, but it is not yet a thread of execution.

> * Runnable - A thread is in Runnable state when the start() method has been called on the thread instance but it is not yet

picked up by the thread scheduler for execution.

> * Running - A thread is in Running state when it is currently executing . The thread scheduler picks up the thread from the

thread pool and executes it.

> * Waiting, Blocked, Sleeping - In this state the thread is not eligible for execution and is not in the running pool. A thread

may be ineligible for execution for a variety of reasons. The thread may be blocked waiting for an IO resource or on a lock. The
thread may be sleeping since the code tells it to sleep for a specific period of time. Or the thread may be waiting on another
thread to send it a notification.

> * Dead - A thread is in dead state when the execution of its run() method is complete. Once a thread is dead it cannot be run

again, hence a thread cannot transition from dead state to any other state.

</details>

<details>
<summary>108. What is synchronization?</summary>

> **Answer:**
> Synchronization refers to multi-threading. A synchronized block of code can be executed by only one thread at a time. As

Java supports execution of multiple threads, two or more threads may access the same fields or objects. Synchronization is
a process which keeps all concurrent threads in execution to be in sync. Synchronization avoids memory consistency errors
caused due to inconsistent view of shared memory. When a method is declared as synchronized the thread holds the monitor
for that method’s object. If another thread is executing the synchronized method the thread is blocked until that thread
releases the monitor.

</details>

<details>
<summary>109. What is Synchronized keyword? What is the purpose?</summary>

> **Answer:**
> The synchronization is mainly used to prevent thread interference and consistency problem.
>
> A simple way to avoid the race condition is to make the operation thread-safe by using the synchronized keyword.
>
> The synchronized keyword can be used on different levels: Instance methods / Static methods / Code blocks.
>
> * Synchronized Instance Methods: Instance methods are synchronized over the instance of the class owning the method.

Which means only one thread per instance of the class can execute this method.

> * Synchronized Static Methods: These methods are synchronized on the Class object associated with the class and since

only one Class object exists per JVM per class, only one thread can execute inside a static synchronized method per class,
irrespective of the number of instances it has.

> * Synchronized Blocks Within Methods: Sometimes we do not want to synchronize the entire method but only some instructions within it.

This can be achieved by applying synchronized to a block.

</details>

<details>
<summary>110. Can a static method be synchronized?</summary>

> **Answer:**
> Yes. Static methods and block are synchronized on the class. Instance methods and blocks are synchronized on the instance

of the class i.e. an object of the class. Static synchronized methods and instance synchronized methods don’t affect each other.
This is because they are synchronized on two different things.

</details>

<details>
<summary>111. How does NIO work in Java? </summary>

> **Answer:**
> Java NIO enables you to do non-blocking IO. For instance, a thread can ask a channel to read data into a buffer. While the

channel reads data into the buffer, the thread can do something else. Once data is read into the buffer, the thread can then
continue processing it.

</details>

<details>
<summary>112. What is the difference between Java IO and NIO? </summary>

> **Answer:**
>
> * The first big difference between Java NIO and IO is that IO is stream oriented, where NIO is buffer oriented. Java IO being

stream oriented means that you read one or more bytes at a time, from a stream. What you do with the read bytes is up to you.
They are not cached anywhere. Furthermore, you cannot move forth and back in the data in a stream. If you need to move forth
and back in the data read from a stream, you will need to cache it in a buffer first. Java NIO's buffer oriented approach is
slightly different. Data is read into a buffer from which it is later processed. You can move forth and back in the buffer
as you need to. This gives you a bit more flexibility during processing. However, you also need to check if the buffer contains
all the data you need in order to fully process it. And you need to make sure, that when reading more data into the buffer,
you do not overwrite data in the buffer you have not yet processed.

> * Java IO's various streams are blocking. That means, that when a thread invokes a read() or write(), that thread is blocked

until there is some data to read, or the data is fully written. The thread can do nothing else in the meantime. Java NIO's
non-blocking mode enables a thread to request reading data from a channel, and only get what is currently available, or nothing
at all, if no data is currently available. Rather than remain blocked until data becomes available for reading, the thread
can go on with something else. The same is true for non-blocking writing. A thread can request that some data be written to
a channel, but not wait for it to be fully written. The thread can then go on and do something else in the meantime. What threads
spend their idle time on when not blocked in IO calls, is usually performing IO on other channels in the meantime. That is,
a single thread can now manage multiple channels of input and output.

</details>

<details>
<summary>113. How do you write multi-threaded server in Java? </summary>

> **Answer:**
> A multi-threaded server is the one which can server multiple clients without blocking. Prior to Java 1.4, you can write

multi-threaded server using traditional socket IO and threads. This had severe limitation on scalability, because it creates
a new thread for each connection, and you can only create a fixed number of threads, depending upon machine's and platform's
capability. Though this design can be improved by using thread pools and worker threads, it still a resource intensive design.
After JDK 1.4 and NIO's introduction, writing scalable and multi-threaded server become bit easier. You can easily create it
in single thread by using Selector, which takes advantage of asynchronous and non-blocking IO model of Java NIO.

</details>

<details>
<summary>114. What are the main ancestors of I/O streams?</summary>

> **Answer:**
>
> * Byte: java.io.InputStream, java.io.OutputStream;
> * Symbolic: java.io.Reader, java.io.Writer;

</details>

<details>
<summary>115. Does it matter in what order catch statements for FileNotFoundException and IOException are written?</summary>

> **Answer:**
> Yes, it does. The FileNoFoundException is inherited from the IOException. Exception's subclasses have to be caught first.

</details>

<details>
<summary>116. What is the necessity of two types of streams – Byte Streams and Character Streams?</summary>

> **Answer:**
> Byte streams were introduced with JDK 1.0 and operate on the files containing ASCII characters. We know Java supports other

language characters also known as Unicode characters. To read the files containing Unicode characters, the designers introduced
character streams with JDK 1.1. As ASCII is a subset of Unicode, for the files of English characters, we can go with either
byte streams or character streams.

</details>

<details>
<summary>117. What are the conditions for “successful” serialization of an object?</summary>

> **Answer:**
> To be serializable, the class must implement the Serializable interface. Also, all attributes and subtypes of the class

being serialized must be serializable. If the ancestor class was non-realizable, then this superclass must contain an accessible
(public, protected) constructor without parameters to initialize the fields.

</details>

<details>
<summary>118. Do we need to implement any method of Serializable interface to make an object serializable?</summary>

> **Answer:**
> No. Serializable is a Marker Interface. It does not have any methods.

</details>

<details>
<summary>119. Are the static variables saved as the part of serialization?</summary>

> **Answer:**
> No. The static variables belong to the class are not the part of the state of the object, so they are not saved as the part

of serialized object.

</details>

<details>
<summary>120. What is the difference between start() and run() method of thread class?</summary>

> **Answer:**
> Main difference is that when program calls start() method a new Thread is created and code inside run() method is

executed in new Thread while if you call run() method directly no new Thread is created and code inside run() will execute on current Thread.

</details>

<details>
<summary>121. Explain next methods: join() / wait() / notify() </summary>

> **Answer:**
> The wait() is used for inter-thread communication while the join() is used for adding sequencing between

multiple threads, one thread starts execution after first thread execution finished.

> We can start a waiting thread (went into this state by calling wait()) by using notify() and notifyAll()

method, but we cannot break the waiting imposed by join without unless or interruption the thread on which join is called has execution finished.

> One most important difference between wait() and join() that is wait() must be called from synchronized

context i.e. synchronized block or method otherwise it will throw IllegalMonitorStateException but On the other hand,
we can call join() method with and without synchronized context in Java.

</details>

<details>
<summary>122. What is a Daemon Thread?</summary>

> **Answer:**
> A daemon thread is a thread that does not prevent the JVM from exiting when the program finishes, but the thread is still running.
>
> An example for a daemon thread is the garbage collection.

</details>

<details>
<summary>123. What are the different kinds of liveness problems in Java programming language?</summary>

> **Answer:**
>
> * Deadlock - Deadlock is a condition in multi-threaded programming in which two or more threads are blocked indefinitely,

waiting on each other to acquire locks.

> * Starvation - Starvation is a condition in multi-threaded programming in which a thread is unable to get access to a

shared resource. This occurs when a shared resource provides a synchronized method that takes a long time to complete. If
one thread accesses this method frequently, then other threads does not get access to the shared resource.

> * Livelock - Livelock is a condition in multi-threaded programming in which a thread acts in response to another thread,

and the other thread in turn acts in response to the action of another thread. The constant thread to thread communication
prevents any work to happen on the threads.

</details>

<details>
<summary>124. What are locks or monitors in Java programming language?</summary>

> **Answer:**
> Synchronization is based on internal entities called intrinsic locks or monitor locks. Every object has an intrinsic lock

associated with it.

> * Synchronized methods - When a thread invokes a synchronized method, it acquires the intrinsic lock of the method's object

and releases it after the method is completed.

> * Synchronized Static Methods - When a thread invokes a static synchronized method, it acquires the intrinsic lock of the

Class object associated with the class.

> * Synchronized blocks - Synchronized statements specifies the object that provides the intrinsic lock.

</details>

<details>
<summary>125. What do you understand by Reentrant Synchronization in Java programming language?</summary>

> **Answer:**
> A thread cannot acquire a lock that is held by another thread. But a thread can acquire a lock that it already owns. This

happens when a synchronized code calls a method that itself has synchronized code, and both sets of code use the same code.

</details>

### Additional Classes

<details>
<summary>126. Is Date class be Immutable in Java?</summary>

> **Answer:**
> No, Date is not immutable. You can change it's internal to represent a different date. This is the reason that when you

have a member represent Date, you must be careful not to leak its reference outside using getDate() method, because then
the client can modify the state of the Immutable object, instead a copy should be returned to the client.

</details>

<details>
<summary>127. How do you you copy a Date in Java?</summary>

> **Answer:**
> The Date class implements the clone() method, so just call date.clone() to create a copy of the Date object in Java.

</details>

<details>
<summary>128. How do you format a date in Java?</summary>

> **Answer:**
> You can either use SimpleDateFormat class or joda-time library to format the date in Java. DateFormat class allows you to

format date on many popular formats.

</details>

<details>
<summary>129. What is Java Regular Expressions? </summary>

> **Answer:**
> Java provides the java.util.regex package for sample matching with regular expressions. Java regular expressions are very

similar to the Perl programming language. A regular expression is a unique collection of characters that helps you fit or
find different strings or sets of strings, the use of a specialized syntax held in a pattern. They may be used to look, edit,
or manipulate text and statistics. The java.util.regex package primarily consists of the following 3 classes −

> * **Pattern class** − A pattern object is a compiled representation of a normal expression. The sample class gives no public

constructors. To create a sample, you must first invoke certainly one of its public static compile () methods, for you to then
return a pattern item. These strategies receive a regular expression because of the first argument.

> * **Matcher class** − A Matcher item is the engine that translates the sample and performs match operations against an input

string. Like the pattern class, Matcher defines no public constructors. To procure a Matcher object by invoking the matcher()
method on a pattern object.

> * **PatternSyntaxException** − A PatternSyntaxException object is an unchecked exception that indicates a syntax error in a

regular expression sample.

</details>

<details>
<summary>130. What is use of Dot(.) symbol in Java Regex? </summary>

> **Answer:**
> The dot is used for matching any character.

</details>

<details>
<summary>131. Why Pattern.compile() is important? </summary>

> **Answer:**
> A regular expression, specified as a string, must first be compiled into an instance of Pattern class. Pattern.compile()

method is the only way to create a instance of object. Essentially, it is used to transform a regular expression into an
Finite state machine. But all of the states involved in performing a match resides in the matcher. By this way, the Pattern
can be reused. And many matchers can share the same pattern. Pattern.matches() method is defined as a convenience for when a
regular expression is used just once. This method still uses compile() to get the instance of a Pattern implicitly, and matches
a string. It is less efficient since it does not allow the compiled pattern to be reused.

</details>

<details>
<summary>132. What is a metacharacter? How is it different from an ordinary character? </summary>

> **Answer:**
> A metacharacter is a character that has a special meaning to a regular expression engine. This will not be counted as a

regular character by the regex engine. Examples of metacharacters are ^, $, ., \*, +, etc.

</details>

<details>
<summary>133. How can we make sure that a metacharacter is treated as an ordinary character? </summary>

> **Answer:**
> Sometimes the string or set of strings for which you are creating regular expression may have special characters like the

dot(.) symbol as an ordinary character. In such cases, you need to escape them with a backslash to be treated as a regular
character and not a metacharacter. Another way to ensure that would be to include that in square brackets. Eg: \[.].

</details>

<details>
<summary>134. How to extract numbers from a string? </summary>

> **Answer:**
> In Java, \d means a range of digits (0-9). Please note the first backslash \ in \d. If you are using an escaped construct

within a string literal, you must precede the backslash with another backslash for the string to compile. That's why we need
to use \d.

</details>

<details>
<summary>135. What is the equivalent of Date class in Java 8?</summary>

> **Answer:**
> The Instance class is the equivalent to java.util.Date in Java 8 because it also represents a millisecond value or an instance

in the timescale. Java 8 has also added conversion method e.g. toInstant() and fromDate() to convert instance to java.util.Date
and vice-versa.

</details>

<details>
<summary>136. Can you tell some difference between old and new Date Time API of Java 8?</summary>

> **Answer:**
>
> * In old API, Date was mutable but in Java 8 all date and time classes e.g. LocalDate, LocalTime or LocalDateTime are Immutable.
> * In old API, SimpleDateFormat was not thread-safe, but in Java 8 Formatter are thread-safe.
> * In old Date and Calendar API, Year starts with 1900, Months starts with 0, which is corrected in Java 8, here numbers make more sense.
> * Old Date and Calendar API has just one class Date to represent date and time, but Java 8 has separated classes for Date

and Time e.g. LocalDate and LocalTime

</details>

<details>
<summary>137. What is the relationship between java.sql.Date and java.util.Date?</summary>

> **Answer:**
> The java.sql.Date extends java.util.Date and suppress all time-related methods to act as just a date class. This is in direct

violation of the Liskov substitution principle.

</details>

## Advanced

### Reflection

<details>
<summary>138. What do you understand by Reflection in Java programming language?</summary>

> **Answer:**
> Java Reflection is an API provided in Java programming language that makes it possible to inspect classes, methods, fields etc.

at runtime; without knowing their names at compile time. In addition to inspecting classes and its members, it is also possible
to instantiate objects, call methods and set field values using reflection.

</details>

<details>
<summary>139. Where is Java Reflection commonly used?</summary>

> **Answer:**
> Java Reflection API is commonly used in the development of developer tools.
>
> * Visual Development Environments: Visual development environments use Java reflection to make the development process easier

and more efficient by prompting the correct types and values to the developer

> * Class Browsers: Class browsers inspect class and its members
> * Debuggers and Testing Tools

</details>

<details>
<summary>140. What are the disadvantages of Reflection?</summary>

> **Answer:**
>
> * Performance overhead: Reflection works by dynamically resolving and inspecting classes and its members. with this flexibility

comes its disadvantage - certain java virtual machine optimizations cannot be performed when types are resolved dynamically
leading to slower performance as compared to normal class and method operations. When an operation can be performed non-reflective
as well as reflective operation, always prefer the non-reflective operation. In performance sensitive applications, reflective
operations must be avoided in loops and frequently called sections of code.

> * Security Restrictions: There are certain security impacts to using Reflection. Reflection needs a runtime permission which

may not be available when running under a security manager, such as in an Applet.

> * Exposure of Internals: Java reflection enables us to perform certain operations which are illegal in non-reflective operations.

For example - We can access the private members of a class which is illegal with non-reflective operations. This leads to
dysfunctional and unportable code, and breaks the object oriented principle of abstraction and containment.

</details>

<details>
<summary>141. Why is Reflection slower?</summary>

> **Answer:**
> Because it has to inspect the metadata in the bytecode instead of just using pre compiled addresses and constants.

</details>

<details>
<summary>142. How do you get a Class object via reflection?</summary>

> **Answer:**
> Following are the different ways to get a Class object, depending on what the code has access to - object, type, class or name of class.
>
> * Class.forName(): If the code has access to a fully-qualified class name you can use 'Class.forName()' to get the class object

of the fully-qualified class name.

> * Object.getClass(): If the code has access to an instance object you can use 'Object.getClass()' syntax to get the class object

for the object instance.

> * Type.class:If the code has access to the type of class, you can use 'Type.class' syntax to get the class object for the type.

</details>

<details>
<summary>143. How to access private field using Reflection in Java?</summary>

> **Answer:**
> To access a private field call the Class.getDeclaredField(String name) or Class.getDeclaredFields() method. The methods

Class.getField(String name) and Class.getFields() methods only return public fields, so they won't work.

</details>

### JDBC

<details>
<summary>144. What is JDBC Driver?</summary>

> **Answer:**
> JDBC Driver is a software component that enables java application to interact with the database. There are 4 types of JDBC drivers:
>
> * JDBC-ODBC bridge driver
> * Native-API driver (partially java driver)
> * Network Protocol driver (fully java driver)
> * Thin driver (fully java driver)

</details>

<details>
<summary>145. What are the steps to connect to a database in java?</summary>

> **Answer:**
>
> * Registering the driver class
> * Creating connection
> * Creating statement
> * Executing queries
> * Closing connection

</details>

<details>
<summary>146. What is JDBC Connection interface?</summary>

> **Answer:**
> The Connection interface maintains a session with the database. It can be used for transaction management. It provides

factory methods that returns the instance of Statement, PreparedStatement, CallableStatement and DatabaseMetaData.

</details>

<details>
<summary>147. What do you understand by JDBC Statements?</summary>

> **Answer:**
> JDBC statements are basically the statements which are used to send SQL commands to the database and retrieve data back

from the database. Various methods like execute(), executeUpdate(), executeQuery, etc. are provided by JDBC to interact
with the database. JDBC supports 3 types of statements:

> * Statement: Used for general purpose access to the database and executes a static SQL query at runtime.
> * PreparedStatement: Used to provide input parameters to the query during execution.
> * CallableStatement: Used to access the database stored procedures and helps in accepting runtime parameters.

</details>

<details>
<summary>148. What is the difference between execute, executeQuery, executeUpdate?</summary>

> **Answer:**
>
> * execute(String query) is used to execute any SQL query, and it returns TRUE if the result is an ResultSet such as running

Select queries. The output is FALSE when there is no ResultSet object such as running Insert or Update queries. We can use
getResultSet() to get the ResultSet and getUpdateCount() method to retrieve the update count.

> * executeQuery(String query) is used to execute Select queries and returns the ResultSet. ResultSet returned is never null

even if there are no records matching the query. When executing select queries we should use executeQuery method so that if
someone tries to execute insert/update statement it will throw java.sql.SQLException with a message “executeQuery method cannot be used for an update”.

> * executeUpdate(String query) is used to execute Insert/Update/Delete (DML) statements or DDL statements that returns nothing.

The output is int and equals to the row count for SQL Data Manipulation Language (DML) statements. For DDL statements, the output is 0.

> You should use execute() method only when you are not sure about the type of statement else use executeQuery or executeUpdate method.

</details>

<details>
<summary>149. What do you mean by batch processing in JDBC?</summary>

> **Answer:**
> Batch processing helps you to group related SQL statements into a batch and execute them instead of executing a single query.

By using batch processing technique in JDBC, you can execute multiple queries which makes the performance faster.

</details>
