# Interview Questions

<details>
<summary>1. What is Typescript?</summary>

>**Answer:**
> Typescript is a strongly typed, object oriented, compiled language. It supports OOP concepts like classes, interfaces, inheritance.
> TypeScript is a typed superset of JavaScript compiled to JavaScript. A JS program is also a valid TS program. It is possible to use JS code and JS libraries.
>
> TypeScript supports new ECMAScript standards and compiles them to (older) ECMAScript targets.
>
> TypeScript is open source (Apache 2 licensed, see github) and backed by Microsoft. Anders Hejlsberg, the lead architect of C# is spearheading the project.

</details>


<details>
<summary>2. List the built-in primitive data types in Typescript.</summary>

>**Answer:**
> These are also called the primitive types in Typescript. These are of 5 types:
> * `number`: it is used to represent number type values and represents double precision floating point values.
> * `string`: it represents a sequence of characters stored as Unicode UTF-16 code. It is the same as JavaScript primitive type.
> * `boolean`: in Typescript, it is used to represent a logical value. When we use the Boolean, we get output only in true or false.
It is also the same as JavaScript primitive type.
> * `null`: it represents a null literal and it is not possible to directly reference the null type value itself.
> * `undefined`: it is the type of undefined literal. This type of built-in type is the subtype of all types.
>
> `Number`, `String`, `Boolean`, `Symbol`, and `Object` refer to non-primitive boxed objects that are almost never used appropriately in JavaScript code.
**You should use `number`, `string`, `boolean`, and `symbol` instead.**

</details>


<details>
<summary>3. What does type any represent? What is the unknown type? What is the difference between any and unknown?</summary>

>**Answer:**
> Type `any` represents the type of variables that we do not know when we are writing an application.
> These values may come from dynamic content, e.g. from the user or a 3rd party library. 
> TypeScript 3.0 introduces a new type called `unknown`. Much like `any`, any value is assignable to `unknown`;
> however, unlike `any`, `unknown` is assignable to almost nothing else without a type assertion.
> You also can’t access any properties off of an `unknown`, nor can you call/construct them.


</details>


<details>
<summary>4. Why TypeScript is referred as Optionally Statically Typed Language?</summary>

>**Answer:**
> TypeScript is referred as optionally statically typed, which means we can make the compiler to ignore the type of a variable optionally. 
Using `any` data type, we can assign any type of value to the variable. TypeScript will not give any error checking during compilation.

</details>


<details>
<summary>5. What do types void and never represent? What is the difference between them?</summary>

>**Answer:**
> `void` represents the absence of having any type at all. You may commonly see this as the return type of functions that do not return a value. 
The `never` type represents the type of values that never occur. For instance, `never` is the return type for a function expression or an arrow function expression that always throws an exception or one that never returns; Variables also acquire the type `never` when narrowed by any type guards that can never be true. 

</details>


<details>
<summary>6. What is an Interface in TypeScript?</summary>

>**Answer:**
> An interface is a virtual structure that only exists within the context of TypeScript. The TypeScript compiler uses interfaces solely for type-checking purposes. Once your code is transpiled to its target language, it will be stripped from its interfaces - JavaScript isn't typed, there's no use for them there.
Also, an interface is simply a structural contract that defines what the properties of an object should have as a name and as a type. How you implement or initialise the properties declared within the interface is not relevant to it.

</details>


<details>
<summary>7. What is the difference between const and readonly?</summary>

>**Answer:**
> `const` is for declaring variables, `readonly` is class property modifier.

</details>
