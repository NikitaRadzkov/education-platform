# Questions

## Beginner

### Designing types

<details>
<summary>1. What are differences between interface and abstract class?</summary>

>**Answer:**
>#### Abstract class
>An abstract class is a special kind of class that cannot be instantiated. An abstract class is needed only to be sub-classed (inherited from). In other words, it only allows other classes to inherit from it but cannot be instantiated. The advantage is that it enforces certain hierarchies for subclasses, so it can be considered as a contract for its children.
>#### Interface
>An interface contains only signature or in other words, just the definition of the methods/properties/events without body. As one of the similarities to Abstract class, it is a contract used to define hierarchies for all classes implementing it.
>
>The main difference between them is that a class can implement more than one interface but can only inherit from one abstract class. Since C# doesn’t support multiple inheritance, interfaces are used to emulate multiple inheritance.
</details>

<details>
<summary>2. What are differences between reference type and value type?</summary>

>**Answer:**
>#### Reference type
>Variables of reference type store a reference (address) to data but not the data itself. Because of that, assigning a reference variable to another doesn't copy the data. Instead it creates a second copy of the reference, which refers to the same location of memory as the original value. Reference type variables are stored in a different area of memory called heap. When a reference type variable is no longer used, it can be marked for garbage collection. Examples of reference types are classes, objects, arrays, indexers, interfaces, etc.
>#### Value type
>Variables of value type store its content in a memory allocated on the stack. When you create a Value Type variable, a single space in memory is allocated to store the value and that variable directly holds a value. If you assign it to another variable, the value is copied directly and both variables work independently. Predefined data types, structures, enums are also value types, and work in the same way. Value types can be created at compile time and stored in stack memory. Because of that, garbage collector doesn't have access to it.
</details>

<details>
<summary>3. What can be part of class?</summary>

>**Answer:**
> * Fields
> * Constants
> * Properties
> * Methods
> * Events
> * Operators
> * Indexers
> * Constructors
> * Finalizers
> * Nested types
</details>

<details>
<summary>4. Can private method be overriden?</summary>

>**Answer:**
>No, moreover, you cannot access private methods in inherited classes.
</details>

<details>
<summary>5. What is the difference between method hiding, overriding and overloading?</summary>

>**Answer:**
>#### Method hiding
>Method hiding is also known as shadowing. The method of parent class is available to child class without using the override keyword in shadowing. The child class has its own version of the same function. Use the new keyword to perform shadowing.
>#### Method overriding
>Method overriding is a technique that allows invoking of functions from another class (base class) in derived class. Creating a method in the derived class with the same signature as a method in the base class is called as method overriding. In simple words, overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its base classes or parent classes. When a method in a subclass has the same signature (name and parameters) and the same return type (or sub-type) as a method in its base class, then the method is said to override the method in the base class. Method overriding is one of the ways C# achieve run time polymorphism (dynamic polymorphism).
>#### Method overloading
>Method overloading is a common way of implementing polymorphism. It is an ability to redefine a function in more than one form. A user can implement function overloading by defining two or more functions in a class sharing the same name. C# can distinguish the methods with different method signatures. i.e. the methods can have the same name but with different parameters list (i.e. the number, order and data types of parameters) within the same class.
</details>

<details>
<summary>6. What are static methods/constructor/classes in C#?</summary>

>**Answer:**
> Static modifier is used to declare a static member which belongs to the type itself rather than to a specific object. The static modifier can be used with classes, fields, methods, properties, operators, events, and constructors, but it cannot be used with indexers, finalizers, or types other than classes.
>
> The following class is declared as static and contains only static methods:
```cs
  static class CompanyEmployee
  {
    public static void DoSomething() { /*...*/ }
    public static void DoSomethingElse() { /*...*/  }
  }
```
> A constant or type declaration is implicitly a static member.
>
> A static member cannot be referenced through an instance. Instead, it is referenced through the type name. For example, consider the following class:
```cs
  public class MyBaseC
  {
    public struct MyStruct
    {
      public static int x = 100;
    }
  }
```
> To refer to the static member x, use the fully qualified name, MyBaseC.MyStruct.x, unless the member is accessible from the same scope:
```cs
  Console.WriteLine(MyBaseC.MyStruct.x);
```
> While an instance of a class contains a separate copy of all instance fields of the class, there is only one copy of each static field.
>
> It is not possible to use this to reference static methods or property accessors.
>
> If the static keyword is applied to a class, all the members of the class must be static.
>
> Classes and static classes may have static constructor. Static constructor is called at some point between when the program starts and the class is instantiated.
```cs
  class SimpleClass
  {
    // Static variable that must be initialized at run time.
    static readonly long baseline;

    // Static constructor is called at most one time, before any
    // instance constructor is invoked or member is accessed.
    static SimpleClass()
    {
      baseline = DateTime.Now.Ticks;
    }
  }
```
> Static constructors have the following major properties:
> * A static constructor does not take access modifiers or have parameters
> * A class or struct can only have one static constructor
> * Static constructors cannot be inherited or overloaded
> * A static constructor cannot be called directly and is only meant to be called by the common language runtime (CLR). It is invoked automatically
> * The user has no control on when the static constructor is executed in the program
</details>

<details>
<summary>7. What is partial keyword?</summary>

>**Answer:**
> Each class in C# resides in a separate physical file with a .cs extension. C# provides the ability to have a single class implementation in multiple .cs files using the **partial** modifier keyword. The partial modifier can be applied to a class, method, interface or structure.
>
> For example, the following MyPartialClass splits into two files, Part1.cs and Part2.cs:
```cs
  // Part1.cs
  public partial class MyPartialClass
  {
    public MyPartialClass()
    {
    }

    public void Method1(int val)
    {
      Console.WriteLine(val);
    }
  }

  // Part2.cs
  public partial class MyPartialClass
  {
    public void Method2(int val)
    {
      Console.WriteLine(val);
    }
  }
```
> The compiler combines these two partial classes into one class as below:
```cs
  public class MyPartialClass
  {
    public MyPartialClass()
    {
    }

    public void Method1(int val)
    {
      Console.WriteLine(val);
    }

    public void Method2(int val)
    {
      Console.WriteLine(val);
    }
  }
```
>#### Partial Class Requirements:
> * All the partial class definitions must be in the same assembly and namespace.
> * All the parts must have the same accessibility like public or private, etc.
> * If any part is declared abstract, sealed or base type then the whole class is declared of the same type.
> * Different parts can have different base types and so the final class will inherit all the base types.
> * The **partial** modifier can only appear immediately before the keywords class, struct, or interface.
> * Nested partial types are allowed.
>
>#### Advantages of Partial Class:
> * Multiple developers can work simultaneously with a single class in separate files.
> * When working with automatically generated source, code can be added to the class without having to recreate the source file. For example, Visual Studio separates HTML code for the UI and server side code into two separate files: .aspx and .cs files.
>
> A partial class or struct may contain partial methods. A partial method must be declared in one of the partial classes. A partial method may or may not have an implementation. If the partial method doesn't have an implementation in any part then the compiler will not generate that method in the final class. For example, consider the following partial method with a partial keyword:
```cs
  // Part1.cs
  public partial class MyPartialClass
  {
    partial void PartialMethod(int val);

    public MyPartialClass()
    {

    }

    public void Method2(int val)
    {
      Console.WriteLine(val);
    }
  }

  // Part2.cs
  public partial class MyPartialClass
  {
    public void Method1(int val)
    {
      Console.WriteLine(val);
    }

    partial void PartialMethod(int val)
    {
      Console.WriteLine(val);
    }
  }
```
>#### Requirements for Partial Method:
> * The partial method declaration must began with the partial modifier.
> * The partial method can have a ref but not an out parameter.
> * Partial methods are implicitly private methods.
> * Partial methods can be static methods.
> * Partial methods can be generic.
</details>

<details>
<summary>8. What are generics?</summary>

>**Answer:**
> Generics allow you to define a class with placeholders for the type of its fields, methods, parameters, etc. Generics replace these placeholders with some specific type at compile time.
> A generic class can be defined using angle brackets **<>**. For example, the following is a simple generic class with a generic member variable, generic method and property.
```cs
  class MyGenericClass<T>
  {
    private T genericMemberVariable;

    public MyGenericClass(T value)
    {
      genericMemberVariable = value;
    }

    public T genericMethod(T genericParameter)
    {
      Console.WriteLine("Parameter type: {0}, value: {1}", typeof(T).ToString(),genericParameter);
      Console.WriteLine("Return type: {0}, value: {1}", typeof(T).ToString(), genericMemberVariable);

      return genericMemberVariable;
    }

    public T genericProperty { get; set; }
  }
```
> Now, the compiler assigns the type based on the type passed by the caller when instantiating a class. For example, the following code uses the int data type:
```cs
  MyGenericClass<int> intGenericClass = new MyGenericClass<int>(10);

  int val = intGenericClass.genericMethod(200);
```
> Generics can be applied to the following:
> * Interface
> * Abstract class
> * Class
> * Method
> * Static method
> * Property
> * Event
> * Delegates
> * Operator
>
> Advantages of Generics:
> * Increases the reusability of the code.
> * Generic are type safe. You get compile time errors if you try to use a different type of data than the one specified in the definition.
> * Generic has a performance advantage because it removes the possibilities of boxing and unboxing.
>
> C# includes Constraints to specify which type of placeholder type with the generic class is allowed. It will give a compile time error if you try to instantiate a generic class using a placeholder type that is not allowed by a constraints. For example, if the generic constraints specifies that only reference type can be used with the generic class then you cannot use value type to create an object of generic type.
> Constraints can be applied using the where keyword. In the following example, MyGenericClass specifies the constraints that only a reference type can be used with MyGenericClass. This means that only a class can be a placeholder type not the primitive types, struct etc.
```cs
  class MyGenericClass<T> where T: class
  {
    private T genericMemberVariable;

    public MyGenericClass(T value)
    {
      genericMemberVariable = value;
    }

    public T genericMethod(T genericParameter)
    {
      Console.WriteLine("Parameter type: {0}, value: {1}", typeof(T).ToString(),genericParameter);
      Console.WriteLine("Return type: {0}, value: {1}", typeof(T).ToString(), genericMemberVariable);

      return genericMemberVariable;
    }

    public T genericProperty { get; set; }
  }
```
> A generic class can have multiple constraints:
```cs
  class MyGenericClass<T, U> where T: class where U: struct
  {
    ...
  }
```
> The following table lists the types of generic constraints
>
|Constraint                |Description                                                                                                                                                      |
|--------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|
|where T : class           |The type argument must be a reference type. This constraint applies also to any class, interface, delegate, or array type.                                       |
|where T: struct           |The type argument must be a value type. Any value type except Nullable<T> can be specified.                                                                      |
|where T: unmanaged        |The type argument must not be a reference type and must not contain any reference type members at any level of nesting.                                          |
|where T: new()            |The type argument must have a public parameterless constructor. When used together with other constraints, the new() constraint must be specified last.          |
|where T: *class name*     |The type argument must be or derive from the specified base class.                                                                                               |
|where T: *interface name* |The type argument must be or implement the specified interface. Multiple interface constraints can be specified. The constraining interface can also be generic. |
|where T: U                |The type argument supplied for T must be or derive from the argument supplied for U.                                                                             |
</details>

<details>
<summary>9. What are advantages of composition and aggregation over inheritance?</summary>

>**Answer:**
>#### Advantages of object composition and aggregation over inheritance
> * In most cases "HAS-A" relationship is more semantically correct than "IS-A" relationship between classes.
> * Composition is more flexible than inheritance. You can change implementation of class at run-time by changing included object, thus changing behavior of it, but you can't do this with inheritance, you can't change behavior of base class at run-time.
> * Inheritance breaks encapsulation. By inheriting from a class you're coupling child class with number of potential implementation details of the parent.
> * A design based on object composition usually will have less classes.
> * It is possible to implement "multiple inheritance" in languages which do not support it by composing multiple objects into one.
> * There is no conflict between methods/properties names, which might occur with inheritance.
>
>#### Downsides of composition and aggregation are:
> * The behavior of the system may be harder to understand just by looking at the source code, since it's more dynamic and more interaction between classes happens in run-time, rather than compile time.
> * Composition approach might require more code and time effort.
> * A design based on object composition usually will have more objects.
</details>

<details>
<summary>10. What are extension methods?</summary>

>**Answer:**
> Extension methods enable you to "add" methods to existing types without creating a new derived type, recompiling, or otherwise modifying the original type. Extension methods are a special kind of static method, but they are called as if they were instance methods on the extended type. For client code written in C#, F# and Visual Basic, there is no apparent difference between calling an extension method and the methods that are actually defined in a type.
>
> Extension methods are defined as static methods but are called by using instance method syntax. Their first parameter specifies which type the method operates on, and the parameter is preceded by the this modifier. Extension methods are only in scope when you explicitly import the namespace into your source code with a using directive.
>
> The following example shows an extension method defined for the System.String class. Note that it is defined inside a non-nested, non-generic static class:
```cs
  namespace ExtensionMethods
  {
    public static class MyExtensions
    {
      public static int WordCount(this String str)
      {
        return str.Split(new char[] { ' ', '.', '?' },
        				StringSplitOptions.RemoveEmptyEntries).Length;
      }
    }
  }
```
> The WordCount extension method can be brought into scope with this using directive:
```cs
  using ExtensionMethods;
```
> And it can be called from an application by using this syntax:
```cs
  string s = "Hello Extension Methods";
  int i = s.WordCount();
```
> In your code you invoke the extension method with instance method syntax. However, the intermediate language (IL) generated by the compiler translates your code into a call on the static method. Therefore, the principle of encapsulation is not really being violated. In fact, extension methods cannot access private variables in the type they are extending.
>
> You can use extension methods to extend a class or interface, but not to override them. An extension method with the same name and signature as an interface or class method will never be called. At compile time, extension methods always have lower priority than instance methods defined in the type itself. In other words, if a type has a method named Process(int i), and you have an extension method with the same signature, the compiler will always bind to the instance method. When the compiler encounters a method invocation, it first looks for a match in the type's instance methods.
</details>

<details>
<summary>11. What is boxing and unboxing?</summary>

>**Answer:**
> Boxing is the process of converting a *value type* to the type object or to any interface type implemented by this value type. When the CLR boxes a value type, it wraps the value inside a *System.Object* instance and stores it on the managed heap. Unboxing extracts the value type from the object. Boxing is implicit; unboxing is explicit. The concept of boxing and unboxing underlies the C# unified view of the type system in which a value of any type can be treated as an object.
>
> In the following example, the integer variable i is boxed and assigned to object o:
```cs
  int i = 123;
  // The following line boxes i.
  object o = i;
```
> The result of this statement is creating an object reference o, on the stack, that references a value of the type int, on the heap. This value is a copy of the value-type value assigned to the variable i.
>
> The object o can then be unboxed and assigned to integer variable i:
```cs
  o = 123;
  i = (int)o;  // unboxing
```
> An unboxing operation consists of:
> * Checking the object instance to make sure that it is a boxed value of the given value type.
> * Copying the value from the instance into the value-type variable.
>
> In relation to simple assignments, boxing and unboxing are computationally expensive processes. When a value type is boxed, a new object must be allocated and constructed. To a lesser degree, the cast required for unboxing is also expensive computationally.
</details>

<details>
<summary>12. What do access modifiers mean?</summary>

>**Answer:**
>All types and type members have an accessibility level, which controls whether they can be used from other code in your assembly or other assemblies. You can use the following access modifiers to specify the accessibility of a type or member when you declare it:
> * public - the type or member can be accessed by any other code in the same assembly or another assembly that references it.
> * private - the type or member can be accessed only by code in the same class or struct.
> * protected - the type or member can be accessed only by code in the same class, or in a class that is derived from that class.
> * internal - the type or member can be accessed by any code in the same assembly, but not from another assembly.
> * protected internal - the type or member can be accessed by any code in the assembly in which it is declared, or from within a derived class in another assembly.
> * private protected - the type or member can be accessed only within its declaring assembly, by code in the same class or in a type that is derived from that class.
</details>

<details>
<summary>13. What is internal?</summary>

>**Answer:**
> The internal keyword is an access modifier for types and type members.
> Internal types or members are accessible only within files in the same assembly, as in this example:
```cs
  public class BaseClass
  {
    // Only accessible within the same assembly.
    internal static int x = 0;
  }
```
> A common use of internal access is in component-based development because it enables a group of components to cooperate in a private manner without being exposed to the rest of the application code. For example, a framework for building graphical user interfaces could provide Control and Form classes that cooperate by using members with internal access. Since these members are internal, they are not exposed to code that is using the framework.
> It is an error to reference a type or a member with internal access outside the assembly within which it was defined.
</details>

<details>
<summary>14. What is the difference between ref and out method parameters?</summary>

>**Answer:**
>#### Ref parameter
>The ref keyword passes arguments by reference. It means any changes made to this argument in the method will be reflected in that variable when control returns to the calling method.
>#### Out parameter
>The out keyword causes arguments to be passed by reference. It makes the formal parameter an alias for the argument, which must be a variable. In other words, any operation on the parameter is made on the argument. It is like the ref keyword, except that ref requires that the variable be initialized before it is passed. It is also like the in keyword, except that in does not allow the called method to modify the argument value. To use an out parameter, both the method definition and the calling method must explicitly use the out keyword.
</details>

<details>
<summary>15. Why interface cannot declare regular field?</summary>

>**Answer:**
>Field relates to instance internal state while interface just describes the contract.
</details>

### CLR structure and mechanisms

<details>
<summary>1. Write down C# syntax to catch an exception</summary>

>**Answer:**
>```csharp
> public void Foo()
> {
>	try
>	{
>		//some code that might throw exception
>	}
>	catch (ArgumentException ex)
>	{
>		//do something
>	}
>	catch (Exception ex)
>	{
>		//do something
>	}
> }
>```
</details>

<details>
<summary>2. What is a purpose of "using" statement (using(...) {...})?</summary>

>**Answer:**
>A *using* statement in C# is a statement containing the "using" keyword and providing the syntax to specify the scope of the use of a resource object. It is useful for objects whose lifetime is within the method or block in which they are created. This statement reduces the code in which resource-intensive operations are performed by providing simpler syntax and eliminating the need for multiple calls to release the resources at the end of their scope. Since it simplifies the code necessary for creating, cleaning up and handling errors while using the resource object, the *using* statement saves development time and effort.
</details>

<details>
<summary>3. What is a garbage collection in .NET?</summary>

>**Answer:**
>In the common language runtime (CLR), the garbage collector (GC) serves as an automatic memory manager. It provides the following benefits:
> * Enables you to develop your application without having to manually free memory.
> * Allocates objects on the managed heap efficiently.
> * Reclaims objects that are no longer being used, clears their memory, and keeps the memory available for future allocations. Managed objects automatically get clean content to start with, so their constructors do not have to initialize every data field.
> * Provides memory safety by making sure that an object cannot use the content of another object.
</details>

<details>
<summary>4. What is an assembly?</summary>

>**Answer:**
> Assemblies form the fundamental units of deployment, version control, reuse, activation scoping, and security permissions for .NET-based applications. An assembly is a collection of types and resources that are built to work together and form a logical unit of functionality. Assemblies take the form of executable (.exe) or dynamic link library (.dll) files, and are the building blocks of .NET applications. They provide the common language runtime with the information it needs to be aware of type implementations.
>
> In .NET Core and .NET Framework, you can build an assembly from one or more source code files. In .NET Framework, assemblies can contain one or more modules. This allows larger projects to be planned so that several developers can work on separate source code files or modules, which are combined to create a single assembly
>
> Assemblies have the following properties:
> * Assemblies are implemented as .exe or .dll files.
> * For libraries that target the .NET Framework, you can share assemblies between applications by putting them in the global assembly cache (GAC). You must strong-name assemblies before you can include them in the GAC.
> * Assemblies are only loaded into memory if they are required. If they aren't used, they aren't loaded. This means that assemblies can be an efficient way to manage resources in larger projects.
> * You can programmatically obtain information about an assembly by using reflection.
> * You can load an assembly just to inspect it by using the *MetadataLoadContext* class in .NET Core and the *Assembly.ReflectionOnlyLoad* or *Assembly.ReflectionOnlyLoadFrom* methods in .NET Core and .NET Framework.
</details>

<details>
<summary>5. What is managed and unmanaged code?</summary>

>**Answer:**
> A code which is written to aimed to get the services of the managed runtime environment execution like CLR in .NET Framework is known as **Managed Code**. It always implemented by the managed runtime environment instead of directly executed by the operating system. The managed runtime environment provides different types of services like garbage collection, type checking, exception handling, bounds checking, etc. to code automatically without the interference of the programmer. It also provides memory allocation, type safety, etc to the code. The application is written in the languages like Java, C#, VB.Net, etc. are always aimed at runtime environment services to manage the execution and the code written in these types of languages are known as managed code.
>
> In the case of .NET Framework, the compiler always compiles the manages code in the intermediate language (MSIL) and then create an executable. When the programmer runs the executable, then the Just In Time Compiler of CLR compiles the intermediate language in the native code which is specific to the underlying architecture. Here this process is taking place under a managed runtime execution environment so this environment is responsible for the working of the code.
>
> The managed code also provides platform independence because when the managed code compiled into the intermediate language, then the JIT compiler compiles this intermediate language in the architecture specific instruction.
>
> What are the advantages of using Managed Code?
> * It improves the security of the application like when you use runtime environment, it automatically checks the memory buffers to guard against buffer overflow.
> * It implement the garbage collection automatically.
> * It also provides runtime type checking/dynamic type checking.
> * It also provides reference checking which means it checks whether the reference point to the valid object or not and also check they are not duplicate.
>
> What are the disadvantages of Managed Code?
> * The main disadvantage of managed language is that you are not allowed to allocate memory directly, or you cannot get the low-level access of the CPU architecture.
>
> A code which is directly executed by the operating system is known as Unmanaged code. It always aimed for the processor architecture and depends upon computer architecture. When this code is compiled it always tends to get a specific architecture and always run on that platform, in other words, whenever you want to execute the same code for the different architecture you have to recompile that code again according to that architecture. It always compiles to the native code that is specific to the architecture.
>
> In unmanaged code, the memory allocation, type safety, security, etc are managed by the developer. Due to this, there are several problems related to memory occur like buffer overflow, memory leak, pointer override, etc. The executable files of unmanaged code are generally in binary images, x86 code which is directly loaded into memory.
>
> What are the advantages of using Unmanaged Code?
> * It provides the low-level access to the programmer.
> * It also provides direct access to the hardware.
> * It allows the programmer to bypass some parameters and restriction that are used by the managed code framework.
>
> What are the disadvantages of Unmanaged Code?
> * It does not provide security to the application.
> * Due to the access to memory allocation the issues related to memory occur like memory buffer overflow, etc.
> * Error and exceptions are also handled by the programmer.
> * It does not focus on garbage collection.
</details>

<details>
<summary>6. Describe the mechanism which allows to use method written in F# within C# application?</summary>

>**Answer:**
>When you compile your F# or C# program, it is compiled into IL (Intermediate Language). That compiled program can then be used by any other .NET language. Visual Basic doesn't care (or know) that your Math class was written in C#, all it sees is a .NET class. That's language interoperability.
</details>

<details>
<summary>7. What is object finalizer? When it is invoked?</summary>

>**Answer:**
>Object.Finalize method allows an object to try to free resources and perform other cleanup operations before it is reclaimed by garbage collection.
>
>The Object class provides no implementation for the Finalize method, and the garbage collector does not mark types derived from Object for finalization unless they override the Finalize method.
>
>If a type does override the Finalize method, the garbage collector adds an entry for each instance of the type to an internal structure called the finalization queue. The finalization queue contains entries for all the objects in the managed heap whose finalization code must run before the garbage collector can reclaim their memory. The garbage collector then calls the Finalize method automatically under the following conditions:
> * After the garbage collector has discovered that an object is inaccessible, unless the object has been exempted from finalization by a call to the GC.SuppressFinalize method.
> * On .NET Framework only, during shutdown of an application domain, unless the object is exempt from finalization. During shutdown, even objects that are still accessible are finalized.
</details>

<details>
<summary>8. What is the difference between object lifetime in debug mode and release mode?</summary>

>**Answer:**
>The difference in lifetime of object and in release mode is caused by garbage collector behavior. In debug mode each local reference type variable has an anchor to avoid garbage collection during debugging method. So, in debug mode object lives longer than in release.
</details>

<details>
<summary>9. How does garbage collector work?</summary>

>**Answer:**
>GC works on managed heap, which is nothing but a block of memory to store objects. When garbage collection process is put in motion, it checks for dead objects and objects which are no longer used, then it compacts the space of lived objects and tries to free more memory.
>
>Basically, heap is managed by different *generations*, it stores and handles long-lived and short-lived objects, see the below generations:
> * 0 generation - this generation holds short-lived objects, e.g., temporary objects. GC initiates garbage collection process frequently in this generation.
> * 1 generation - this generation is the buffer between short-lived and long-lived objects.
> * 2 generation - this generation holds long-lived objects like a static and global variable, that needs to be persisted for a certain amount of time. Objects which are not collected in generation 0, are then moved to generation 1, such objects are known as survivors, similarly objects which are not collected in generation 1, are then moved to generation 2 and from there onwards objects remain in the same generation.
>
> GC checks the below information to check if the object is live:
> * It collects all handles of an object that are allocated by user code or by CLR
> * Keeps track of static objects, as they are referenced to some other objects
> * Use stack provided by stack walker and JIT
>
> There are no specific timings for GC to get triggered, GC automatically starts operation on the following conditions:
> * When virtual memory is running out of space.
> * When allocated memory is suppressed acceptable threshold (when GC found if the survival rate (live objects) is high, then it increases the threshold allocation).
> * When we call GC.Collect() method explicitly, as GC runs continuously, we actually do not need to call this method.
</details>

<details>
<summary>10. Describe the lifetime of large (> 85000 bytes) objects</summary>

>**Answer:**
>If an object is greater than or equal to 85,000 bytes, it’s considered a large object. This number was determined by performance tuning. When an object allocation request is for 85,000 or more bytes, the runtime allocates it on the large object heap (LOH). Large objects belong to generation 2 because they are collected only during a generation 2 collection. When a garbage collection is triggered, the GC traces through the live objects and compacts them. But because compaction is expensive, the GC sweeps the LOH; it makes a free list out of dead objects that can be reused later to satisfy large object allocation requests. Adjacent dead objects are made into one free object.
</details>

<details>
<summary>11. What will be written to console after calling Method1 and Method2? Why?

```csharp
  static void Method1()
  {
    try {
      throw new NotImplementedException();
    }
    catch (NotImplementedException ex) {
      Console.WriteLine("NotImplementedException");
    }
    catch (Exception ex) {
      Console.WriteLine("Exception");
    }
  }

  static void Method2()
  {
    try {
      throw new NotImplementedException();
    }
    catch (Exception ex) {
      Console.WriteLine("Exception");
    }
    catch (NotImplementedException ex) {
      Console.WriteLine("NotImplementedException");
    }
  }
```
</summary>

>**Answer:**
>Method1 will write "NotImplementedException", Method2 - "Exception", because CLR picks the first applicable catch block. Since class Exception is a parent of class NotImplementedException, CLR will process block catch (Exception ex) in Method2.
</details>

<details>
<summary>12. What is the difference between 2 ways of rethrowing exceptions?

```csharp
  catch (Exception ex) {
    throw ex;
  }

  catch (Exception ex) {
    throw;
  }
```
</summary>

>**Answer:**
>*throw* maintains the full hierarchy in the stack trace and gives complete information about the exception occurred in the code. Whereas *throw ex* pretends that exceptions occurred on the line where *throw ex* was written and removes all the hierarchy above the method containing the *throw ex* expression.
</details>

<details>
<summary>13. What is serialization?</summary>

>**Answer:**
> Serialization is the process of converting an object into a stream of bytes to store the object or transmit it to memory, a database, or a file. Its main purpose is to save the state of an object in order to be able to recreate it when needed. The reverse process is called deserialization.
>
> To serialize an object, you need the object to be serialized, a stream to contain the serialized object, and a Formatter. *System.Runtime.Serialization* contains the classes necessary for serializing and deserializing objects.
>
> Apply the *SerializableAttribute* attribute to a type to indicate that instances of this type can be serialized. An exception is thrown if you attempt to serialize but the type doesn't have the *SerializableAttribute* attribute.
>
> If you don't want a field within your class to be serializable, apply the *NonSerializedAttribute* attribute. If a field of a serializable type contains a pointer, a handle, or some other data structure that is specific to a particular environment, and the field cannot be meaningfully reconstituted in a different environment, then you may want to make it nonserializable.
>
> If a serialized class contains references to objects of other classes that are marked *SerializableAttribute*, those objects will also be serialized.
>
>#### Binary and XML serialization
> You can use binary or XML serialization. In binary serialization, all members, even members that are read-only, are serialized, and performance is enhanced. XML serialization provides more readable code, and greater flexibility of object sharing and usage for interoperability purposes.
>
>##### Binary serialization
> Binary serialization uses binary encoding to produce compact serialization for uses such as storage or socket-based network streams.
>
>##### XML serialization
> XML serialization serializes the public fields and properties of an object, or the parameters and return values of methods, into an XML stream that conforms to a specific XML Schema definition language (XSD) document. XML serialization results in strongly typed classes with public properties and fields that are converted to XML. *System.Xml.Serialization* contains the classes necessary for serializing and deserializing XML.
>
> You apply attributes to classes and class members to control the way the *XmlSerializer* serializes or deserializes an instance of the class.
>
>#### Basic and custom serialization
> Serialization can be performed in two ways, basic and custom. Basic serialization uses the .NET Framework to automatically serialize the object.
>
>##### Basic serialization
> The only requirement in basic serialization is that the object has the *SerializableAttribute* attribute applied. The *NonSerializedAttribute* can be used to keep specific fields from being serialized.
>
> When you use basic serialization, the versioning of objects may create problems. You would use custom serialization when versioning issues are important. Basic serialization is the easiest way to perform serialization, but it does not provide much control over the process.
>
>##### Custom serialization
> In custom serialization, you can specify exactly which objects will be serialized and how it will be done. The class must be marked *SerializableAttribute* and implement the *ISerializable* interface.
>
> If you want your object to be deserialized in a custom manner as well, you must use a custom constructor.
</details>

<details>
<summary>14. What are some of the differencies between DataContractSerializer and XmlSerializer?</summary>

>**Answer:**
>DataContractSerializer class only serializes data contract members marked with the DataMemberAttribute attribute which can be applied to private/protected/internal members.
>
>The XmlSerializer class serializes any public member. It also does not require any declarative attributes on the serializable types and gives move grained control over serialization (for example, serializing field not to XML element, but to XML attribute).
</details>

<details>
<summary>15. What will be exact content of address section in XML file after serializing object below(using DataContractSerializer)? What if we remove DataContractAttribute from Address class?

```csharp
var p = new Person()
{
  FirstName = "Bill",
  LastName= "Gates",
  Address = new Address()
  {
    Street = "Shabany Avenue",
    Block = 12
  }
};
```

```csharp
  [DataContract]
    public class Person
    {
        [DataMember]
        public string FirstName { get; set; }
        [DataMember]
        public string LastName { get; set; }
        [DataMember]
        public Address Address { get; set; }
    }

    [DataContract]
    public class Address
    {
        [DataMember(Name="Str")]
        public string Street { get; set; }
        public int Block { get; set; }
    }
```
</summary>

>**Answer:**
>With attribute XML file will contain:
```
<Address>
  <Str>Shabany Avenue</Str> 
</Address>
```
>because, since the class is marked as data contract, serializer will process only members marked with DataMemberAttribute. Also on that reason Street element name will be changed.
>
>If Address class doesn't have DataMemberAttribute, the output will be:
```
<Address>
  <Block>12</Block> 
  <Street>Shabany Avenue</Street> 
</Address>
```
>because public properties in used types will be processed by default and DataMemberAttribute is ignored since the class is not a data contract.
</details>

### Essential types

<details>
<summary>1. What are the differences between System.String and System.Text.StringBuilder?</summary>

>**Answer:**
> *StringBuilder* is used to represent a mutable string of characters. Mutable means the string which can be changed. So *String* objects are immutable but *StringBuilder* is the mutable string type. It will not create a new modified instance of the current string object but do the modifications in the existing string object. The complete functionality of *StringBuilder* is provided by *StringBuilder* class which is present in *System.Text* namespace.
>
> As stated above that the String class objects are immutable which means that if the user will modify any string object it will result into the creation of a new string object. It makes the use of string costly. So when the user needs the repetitive operations on the string then the need of *StringBuilder* come into existence. It provides the optimized way to deal with the repetitive and multiple string manipulation operations.
>
```cs
  class GFG {
    // Concatenates to String
    public static void concat1(String s1)
    {

      // taking a string which
      // is to be Concatenate
      String st = "forGeeks";

      // using String.Concat method
      // you can also replace it with
      // s1 = s1 + "forgeeks";
      s1 = String.Concat(s1, st);
    }

    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2)
    {

      // using Append method
      // of StringBuilder class
      s2.Append("forGeeks");
    }

    // Main Method
    public static void Main(String[] args)
    {

      String s1 = "Geeks";
      concat1(s1); // s1 is not changed
      Console.WriteLine("Using String Class: " + s1);

      StringBuilder s2 = new StringBuilder("Geeks");
      concat2(s2); // s2 is changed
      Console.WriteLine("Using StringBuilder Class: " + s2);
    }
  }
```
> When to use which one:
> * If a string is going to remain constant throughout the program, then use String class object because a String object is immutable.
> * If a string can change (example: lots of logic and operations in the construction of the string) then using a *StringBuilder* is the best option.
</details>

<details>
<summary>2. What is algorithmic complexity of access to the element by index of class List<T>?</summary>

>**Answer:**
>o(1)
>
>The List<T> class is the generic equivalent of the ArrayList class. It implements the IList<T> generic interface by using an array whose size is dynamically increased as required.
</details>

<details>
<summary>3. Why should we override GetHashCode method when we are going to override method Equal?</summary>

>**Answer:**
>It is important if your item will be used as a key in a dictionary, or HashSet<T>, etc. - since this is used (in the absence of a custom IEqualityComparer<T>) to group items into buckets. If the hash-codes for two items do not match, they may never be considered equal (Equals will simply never be called).
</details>

<details>
<summary>4. What the difference between IEnumerable<T> and IQueryable<T>?</summary>

>**Answer:**
>IQueryable<T> extends the IEnumerable<T> interface, so anything you can do with a "plain" IEnumerable<T>, you can also do with an IQueryable<T>. IEnumerable<T> just has a GetEnumerator() method that returns an Enumerator<T> for which you can call its MoveNext() method to iterate through a sequence of T.
>
>What IQueryable<T> has that IEnumerable<T> doesn't are two properties in particular—one that points to a query provider (e.g., a LINQ to SQL provider) and another one pointing to a query expression representing the IQueryable<T> object as a runtime-traversable abstract syntax tree that can be understood by the given query provider (for the most part, you can't give a LINQ to SQL expression to a LINQ to Entities provider without an exception being thrown).
>
>The expression can simply be a constant expression of the object itself or a more complex tree of a composed set of query operators and operands. The query provider's IQueryProvider.Execute() or IQueryProvider.CreateQuery() methods are called with an Expression passed to it, and then either a query result or another IQueryable is returned, respectively.
</details>

<details>
<summary>5. What is the result of the next code?

```csharp
  class Program
  {
    public class CustomEnumerable : IEnumerable<int>
    {
      public IEnumerator<int> GetEnumerator()
      {
        yield return 1;
        throw new Exception();
      }

      IEnumerator IEnumerable.GetEnumerator() => GetEnumerator();
    }

    static void Main(string[] args)
    {
      var customEnumerable = new CustomEnumerable();
      Console.WriteLine(customEnumerable.First());
    }
  }
```
</summary>

>**Answer:**
>1
>
>Exception is thrown on second invocation of method MoveNext()
</details>

## Intermediate

### Asynchronous computing

<details>
<summary>1. What is a task?</summary>

>**Answer:**
>The Task class represents a single operation that does not return a value and that usually executes asynchronously. Task objects are one of the central components of the task-based asynchronous pattern first introduced in the .NET Framework 4. Because the work performed by a Task object typically executes asynchronously on a thread pool thread rather than synchronously on the main application thread, you can use the Status property, as well as the IsCanceled, IsCompleted, and IsFaulted properties, to determine the state of a task.
</details>

<details>
<summary>2. What is the difference between process and threads?</summary>

>**Answer:**
>#### Process
>Each process provides the resources needed to execute a program. A process has a virtual address space, executable code, open handles to system objects, a security context, a unique process identifier, environment variables, a priority class, minimum and maximum working set sizes, and at least one thread of execution. Each process is started with a single thread, often called the primary thread, but can create additional threads from any of its threads.
>#### Thread
>A thread is an entity within a process that can be scheduled for execution. All threads of a process share its virtual address space and system resources. In addition, each thread maintains exception handlers, a scheduling priority, thread local storage, a unique thread identifier, and a set of structures the system will use to save the thread context until it is scheduled. The thread context includes the thread's set of machine registers, the kernel stack, a thread environment block, and a user stack in the address space of the thread's process. Threads can also have their own security context, which can be used for impersonating clients.
</details>

<details>
<summary>3. What is context switching? What is thread pool?</summary>

>**Answer:**
>#### Context switching
>Context switching involves storing the context or state of a process so that it can be reloaded when required and execution can be resumed from the same point as earlier. This is a feature of a multitasking operating system and allows a single CPU to be shared by multiple processes. Context switching is resource consuming operation. If there are lot of threads running it might badly hit application performance.
>
>#### Thread pool
>Thread pool is used to decrease the number of running threads.
>
>The System.Threading.ThreadPool class provides your application with a pool of worker threads that are managed by the system, allowing you to concentrate on application tasks rather than thread management. If you have short tasks that require background processing, the managed thread pool is an easy way to take advantage of multiple threads. Use of the thread pool is significantly easier in Framework 4 and later, since you can create Task and Task<TResult> objects that perform asynchronous tasks on thread pool threads.
</details>

<details>
<summary>4. What is the difference between ‘async void’ and ‘async Task’?</summary>

>**Answer:**
>Async void methods have different error-handling semantics. When an exception is thrown out of an async Task or async Task<T> method, that exception is captured and placed on the Task object. With async void methods, there is no Task object, so any exceptions thrown out of an async void method will be raised directly on the SynchronizationContext that was active when the async void method started.
</details>

<details>
<summary>5. What is wrong with the next piece of code?

```csharp
  public class MyClass
  {
    public async Task AsyncAction()
    {
      lock (this)
      {
        Console.WriteLine($"Current thread Id: {System.Threading.Thread.CurrentThread.ManagedThreadId}");
      }
    }
  }
```
</summary>

>**Answer:**
>It is a bad practice to use 'this' inside of *lock* statement. When you design type you can't be sure that object of this type will not be used in *lock* operator outside of the class. So, if you use 'this' inside of *lock* within your class and the user of the class is using the object passed to *lock* operator somewhere else, it might cause a deadlock.
</details>

<details>
<summary>6. What are purposes of Task.ConfigureAwait() method?</summary>

>**Answer:**
> This method configures an awaiter of the Task. It has parameter continueOnCapturedContext. Set it to true to attempt to marshal the continuation back to the original context captured; otherwise, false.
>
>You should consider using this method when you are designing a library with asynchronous methods. You can't be sure how user is supposed to use your code. Your library might be used in single-threaded context like Windows UI, so it might lead to deadlocks. To avoid deadlock you should configure task awaiter not to marshal continuation back to the original context. In order to do that you can invoke task.ConfigureAwait(false)
</details>

### Input/Output

<details>
<summary>1. What is a stream?</summary>

>**Answer:**
>A stream is an abstraction of a sequence of bytes, such as a file, an input/output device, an inter-process communication pipe, or a TCP/IP socket. The Stream class and its derived classes provide a generic view of these different types of input and output, and isolate the programmer from the specific details of the operating system and the underlying devices.
>
>Streams involve three fundamental operations:
> * You can read from streams. Reading is the transfer of data from a stream into a data structure, such as an array of bytes.
> * You can write to streams. Writing is the transfer of data from a data structure into a stream.
> * Streams can support seeking. Seeking refers to querying and modifying the current position within a stream. Seek capability depends on the kind of backing store a stream has. For example, network streams have no unified concept of a current position, and therefore typically do not support seeking.
>
>Some of the more commonly used streams that inherit from Stream are FileStream and MemoryStream.
</details>

<details>
<summary>2. What will be written to console? Why?

```csharp
public static void Main() {
  var bytesToWrite = new Byte[] { 1, 2, 3, 4, 5 };
  
  var fs = new FileStream("Temp.dat", FileMode.Create);

  fs.Write(bytesToWrite, 0, bytesToWrite.Length);

  File.Delete("Temp.dat");

  Console.WriteLine("file deleted");
}
```
</summary>

>**Answer:**
>Since the file is still opened, delete operation will throw an exception saying that the file cannot be accessed since it's being used by another process. To overcome the problem, stream needs to be disposed before deleting.
</details>