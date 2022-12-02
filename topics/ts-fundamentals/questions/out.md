# Exam Questions

<details>
<summary>1. What is the purpose of a type assertion?</summary>

>**Answer:**
> In TypeScript, type assertion is a way to tell the compiler what is the type of a variable.
> Type assertion is used when the type of the target variable might not be known or the programmer knows better what is the actual type of it.
>
> It has no runtime impact, and is used purely by the compiler. 

</details>


<details>
<summary>2. What is the difference between Array and Tuple?</summary>

>**Answer:**
> In array you can define type of all elements. Using tuples allow us define what type of data can be stored in every position inside of an array.

</details>


<details>
<summary>3. What is Indexable Types in TypeScript?</summary>

>**Answer:**
> Indexable types have an index signature that describes the types we can use to index into the object, along with the corresponding return types when indexing.
>
> There are two types of supported index signatures: `string` and `number`.

</details>


<details>
<summary>4. What are all access modifiers that TypeScript supports?</summary>

>**Answer:**
> TypeScript supports access modifiers public, private and protected which determine the accessibility of a class member as given below:
> * `public` - All the members of the class, its child classes, and the instance of the class can access.
> * `protected` - All the members of the class and its child classes can access them. But the instance of the class can not access.
> * `private` - Only the members of the class can access them.
> 
> If an access modifier is not specified it is implicitly `public` as that matches the convenient nature of JavaScript.


</details>


<details>
<summary>5. Can an interface extends a class just like a class implements interface?</summary>

>**Answer:**
> Yes, an interface extends a class, when it does it inherits the members of the class but not their implementations.
> 
> Interfaces inherit even the private and protected members of a base class.
> This means that when you create an interface that extends a class with private or protected members,
that interface type can only be implemented by that class or a subclass of it.

</details>


<details>
<summary>6. What is generics?</summary>

>**Answer:**
> Generics refer to a feature that allows using type as a parameter.
> This enables the development of universal classes and methods that and allow us to encapsulate operations that are not specific to a particular data type.

</details>


<details>
<summary>7. What is Enum? </summary>

>**Answer:**
> Enums or enumerations are a data type supported in TypeScript.
> Enums allow us to declare a set of named constants i.e. a collection of related values that can be numeric or string values.
>
> Also you can use Enum as a union of its members.


</details>


<details>
<summary>8. What is the decorator? Why we might need decorators?</summary>

>**Answer:**
> A decorator is a function that applies to a class, method, property or parameter and adds some logic or metadata to it.
> 
> Whilst functional composition is already possible in JavaScript, it’s significantly more difficult to apply the same techniques to other pieces of code 
(e.g. classes and class properties).
> Decorators also allow for a cleaner syntax for applying these wrappers around your code.


</details>


<details>
<summary>9. What is the difference in using modules and namespaces?</summary>

>**Answer:**
> Namespaces are simply named JavaScript objects in the global namespace. This makes namespaces a very simple construct to use. 
> 
> Just like namespaces, modules can contain both code and declarations.The main difference is that modules declare their dependencies.
> Modules also have a dependency on a module loader.
> For a small JS application this might not be optimal, but for larger applications, the cost comes with long term modularity and maintainability benefits.
> Modules provide for better code reuse, stronger isolation and better tooling support for bundling.

</details>


<details>
<summary>10. How to use JavaScript packages/libraries in TypeScript?</summary>

>**Answer:**
> If you want to use JS package in TS you need to use **definition file** for it. 
> The majority of popular libraries have typings in npm so they can be easily used with TypeScript. 
> If there is no definition file you can write it yourself.

</details>

<details>
<summary>11. How Typescript checks whether the types compatible or not?</summary>

>**Answer:**
> Type compatibility in TypeScript is based on structural subtyping.
> Structural typing is a way of relating types based solely on their members.
> The basic rule for TypeScript’s structural type system is that X is compatible with Y if Y has at least the same members as X.

</details>

<details>
<summary>12. What is Intersection and Union types, what is the difference between them.</summary>

>**Answer:**
> An intersection type combines multiple types into one. That means an object of intersection type will have all members of all types in intersection.
> 
> A union type describes a value that can be one of several types.


</details>

<details>
<summary>13. What can be used as a type guard?</summary>

>**Answer:**
> A type guard is some expression that performs a runtime check that guarantees the type in some scope.
> You can use `in`, `typeof` or `instanceof` operators to check type explicitly. 
> Also typescript allows you to narrow type using literal type check.
> If type assertions appear several times you can create User-Defined Type Guard function that perform runtime type check.

</details>

<details>
<summary>14. Can we assign undefined or null to variable in TypeScript?</summary>

>**Answer:**
> By default, the type checker considers `null` and `undefined` assignable to any variable.
>
> With `--strictNullChecks` flag when you declare a variable, it doesn’t automatically include `null` or `undefined`,
but you can include them explicitly using a union type. Also an optional parameter or property automatically includes undefined.

</details>

<details>
<summary>15. What is the difference between Interface and type alias?</summary>

>**Answer:**
> Aliasing doesn’t actually create a new type, it creates a new name to refer to that type, so  error messages won’t use the alias name.
> Alias can name primitives, unions, tuples, and any other types.

</details>

