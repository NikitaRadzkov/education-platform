# Questions <a id="questions"></a>

## Beginner

### Language Fundamentals

<details>
<summary>1. What is JS?</summary>

> **Answer:**
>
> JavaScript often abbreviated as JS, is a high-level, interpreted programming language that conforms to the
> ECMAScript specification. JavaScript has curly-bracket syntax, dynamic typing, prototype-based object-orientation, and
> first-class functions. Alongside HTML and CSS, JavaScript is one of the core technologies of the World Wide Web.
> JavaScript enables interactive web pages and is an essential part of web applications. The vast majority of websites
> use it, and major web browsers have a dedicated JavaScript engine to execute it. As a multi-paradigm language,
> JavaScript supports event-driven, functional, and imperative (including object-oriented and prototype-based)
> programming styles. It has APIs for working with text, arrays, dates, regular expressions, and the DOM, but the
> language itself does not include any I/O, such as networking, storage, or graphics facilities. It relies upon the host
> environment in which it is embedded to provide these features.

</details>

<details>
<summary>2. What is ECMAScript?</summary>

> **Answer:**
>
> ECMAScript is the scripting language that forms the basis of JavaScript. ECMAScript standardized by the
> ECMA International standards organization in the ECMA-262 and ECMA-402 specifications. The first edition of ECMAScript
> was released in 1997. JavaScript is an interpreted programming language that conforms to the ECMAScript specification.

</details>

<details>
<summary>3. How to add JS on the page? (deferred, async)</summary>

> **Answer:**
>
> JS is referenced using <code>\<script></code> tag.
> When the browser processes an HTML document, it does so from top to bottom.
> Upon encountering a <code>\<script></code> tag, it halts (“blocks”) further processing in order to download the referenced script file.
> Only after that download has completed and the respective JavaScript code has been processed, HTML processing continues.
>
> ```html
> <html>
>     <head>
>         <meta charset="utf-8">
>         <meta name="viewport" content="width=device-width, initial-scale=1">
>         <title>Hello World</title>
>         <link rel="stylesheet" href="main.css">
>         <script src="foo.js"></script>
>     </head>
>     <body>
>         <h1>Hello World</h1>
>         <script src="bar.js"></script>
>         <p>lorem ipsum dolor sit amet</p>
>         <script src="baz.js"></script>
>     </body>
> </html>
> ```
>
> Once we arrive at <code>\<script src="foo.js"></code>, processing halts as described.
> Afterwards, we continue to <code>\<script src="bar.js"></code>, repeat the same procedure, and then move on to <code>\<script src="baz.js"></code> for the final piece.
> That leaves us with the following sequence:
>
>```tree
>     |
>     | |-foo.js-|
>     |          |-bar.js-|
>     |                   |-baz.js-|
>     |
>     +------------------------------> t
>```
>
> To change this sequence to be parallel <code>async</code> and <code>defer</code> keywords can be used.
>
> * The <code>async</code> attribute is used to indicate to the browser that the script file can be executed asynchronously. The HTML parser does not need to pause at the point it reaches the script tag to fetch and execute, the execution can happen whenever the script becomes ready after being fetched in parallel with the document parsing.
> * The <code>defer</code> attribute tells the browser to only execute the script file once the HTML document has been fully parsed.

</details>

<details>
<summary>4. What tools and techniques can you use for debugging JavaScript code?</summary>

> **Answer:**
> **JavaScript**
>
> * Chrome Devtools
> * Firefox devtools
> * debugger statement
> * console.log and etc.
>
> **React and Redux**
>
> * React Devtools
> * Redux Devtools
>
> **Vue**
>
> * Vue Devtools

</details>

<details>
<summary>5. Can you describe the main difference between .forEach and .map methods?</summary>

> **Answer:**
> **forEach**
>
> * Iterates through the elements in an array.
> * Executes a callback for each element.
> * Does not return a value.
>
> ```javascript
> const a = [1, 2, 3];
> const doubled = a.forEach((num, index) => {
>  // Do something with num and/or index.
> });
>
> // doubled = undefined
> ```
>
> **map**
>
> * Iterates through the elements in an array.
> * "Maps" each element to a new element by calling the function on each element, creating a new array as a result.
>
> ```javascript
> const a = [1, 2, 3];
> const doubled = a.map(num => {
>   return num * 2;
> });
>
> // doubled = [2, 4, 6]
> ```
>
> The main difference between `.forEach` and `.map` is that `.map` returns a new array. If you need the result, but do not wish to mutate the original array, `.map` is the clear choice. If you simply need to iterate over an array, forEach is a fine choice.

</details>

<details>
<summary>6. What is the difference between slice and splice?</summary>

> **Answer:**
>
> | Slice                                        | Splice                                          |
> | -------------------------------------------- | ----------------------------------------------- |
> | Doesn't modify the original array(immutable) | Modifies the original array(mutable)            |
> | Returns the subset of original array         | Returns the deleted elements as array           |
> | Used to pick the elements from array         | Used to insert or delete elements to/from array |
>
> ```javascript
> const animals = ['ant', 'bison', 'camel', 'duck', 'elephant'];
> console.log(animals.slice(2)); // ["camel", "duck", "elephant"]
>
> const fishes = ['angel', 'clown', 'drum', 'mandarin', 'sturgeon'];
> const removed = fishes.splice(3, 1);
>
> console.log(fishes); // ["angel", "clown", "drum", "sturgeon"]
> console.log(removed); // ["mandarin"]
> ```

</details>

### Type System

<details>
<summary>1. What data types are available in JS?</summary>

> **Answer:**
> There are 7 basic data types in JavaScript:
>
> * `number` for numbers of any kind: integer or floating-point
> * `string` for strings. A string may have one or more characters, there’s no separate single-character type
> * `boolean` for true/false
> * `null` for unknown values – a standalone type that has a single value null
> * `undefined` for unassigned values – a standalone type that has a single value undefined
> * `object` for more complex data structures
> * `symbol` for unique identifiers (es6)

</details>

<details>
<summary>2. The difference between "==" and "==="</summary>

> **Answer:**
> The identity (===) operator behaves identically to the equality (==) operator except no type conversion is done, and the types must be the same to be considered equal.
>
> The == operator will compare for equality after doing any necessary type conversions. The === operator will not do the conversion, so if two values are not the same type === will simply return false. Both are equally quick.
>
> JavaScript has two sets of equality operators: === and !==, and their evil twins == and !=. The good ones work the way you would expect. If the two operands are of the same type and have the same value, then === produces true and !== produces false. The evil twins do the right thing when the operands are of the same type, but if they are of different types, they attempt to coerce the values. the rules by which they do that are complicated and unmemorable. These are some of the interesting cases:
>
> ```javascript
> '' == '0'           // false
> 0 == ''             // true
> 0 == '0'            // true
>
> false == 'false'    // false
> false == '0'        // true
>
> false == undefined  // false
> false == null       // false
> null == undefined   // true
>
> ' \t\r\n ' == 0     // true
> ```
>
> The lack of transitivity is alarming. My advice is to never use the evil twins. Instead, always use === and !==. All of the comparisons just shown produce false with the === operator.

</details>

<details>
<summary>3. Undefined & undeclared & null.</summary>

> **Answer:**
>
> #### Undefined
>
> It means a variable has been declared but has not yet been assigned a value.
>
> ```javascript
> var a;
> console.log(a); // undefined
> console.log(typeof a); // undefined
> // You can see type is also undefined.
> ```
>
> #### Null
>
> It can be assigned to a variable to represent no value. It is an assignment value.
>
> ```javascript
> var b = null;
> console.log(b); // null
> console.log(typeof b); // object
> // Here the type is object.
> ```
>
> #### Undeclared
>
> If a variable is not declared then the browser throws error.
>
> ```javascript
> console.log(nonDeclaredVariable);
>
> // Uncaught ReferenceError: nonDeclaredVariable is not defined
> //    at <anonymous>:1:13
>
> console.log(typeof nonDeclaredVariable); // undefined
> ```
>
> Here the type is undefined. So you can check undeclared variable by checking its type:
>
> ```javascript
> if(typeof nonDeclaredVariable !== 'undefined') {
>     // Do something here
> }
> ```
>
> Note: If you use var when you’re declaring a variable inside a function, then that variable becomes a local variable. However, if you don’t use var, then the variable becomes a global variable no matter where you declare it.
>
> If any property is not declared then NO error is thrown, it returns undefined.
>
> ```javascript
> var myVar = {};
> console.log(myVar.myProp); // undefined
> ```

</details>

### Scopes, Closures and Functions

<details>
<summary>1. Scope, functional, global. What is the difference betwee var, let, const?</summary>

> **Answer:**
> JavaScript does not have concept level scope. The variable declared inside the function has scope inside the function.
> Global variables are those that are available throughout the length of the code, that is, these have no scope. The var keyword is used to declare a local variable or object. If the var keyword is omitted, a global variable is declared.
>
> The problems that are faced by using global variables are the clash of variable names of local and global scope. Also, it is difficult to debug and test the code that relies on global variables.
>
> Differences between <code>var</code>, <code>let</code>, <code>const</code>:
>
> * variables declared using <code>var</code> are always hoisted to the top of their scope.
> * <code>var</code>'s are function-scoped
> * <code>const</code> restricts over-writing variables.
> * <code>const</code> doesn’t even let you declare a variable without assigning its (constant) value
> * <code>const</code> and <code>let</code> are block scoped
> * <code>let</code> and <code>const</code> declarations are not hoisted

</details>

<details>
<summary>2. How to define a function in JS?</summary>

> **Answer:**
> There are a few different ways to define a function in JavaScript:
>
> A Function Declaration defines a named function. To create a function declaration you use the function keyword followed by the name of the function. When using function declarations, the function definition is hoisted, thus allowing the function to be used before it is defined.
>
> ```javascript
> function name(parameters) {
>   // statements
> }
> ```
>
> A Function Expressions defines a named or anonymous function. An anonymous function is a function that has no name. Function Expressions are not hoisted, and therefore cannot be used before they are defined. In the example below, we are setting the anonymous function object equal to a variable.
>
> ```javascript
> let name = function(parameters) {
>   // statements
> }
> ```
>
> An Arrow Function Expression is a shorter syntax for writing function expressions. Arrow functions do not create their own this value.
>
> ```javascript
> let name = (parameters) => {
>   // statements
> }
> ```

</details>

<details>
<summary>3. What is the difference between function declaration and function expression?</summary>

> **Answer:**
> A Function Declaration defines a named function variable without requiring variable assignment.
> Function Declarations occur as standalone constructs and cannot be nested within non-function blocks.
> It’s helpful to think of them as siblings of Variable Declarations.
> Just as Variable Declarations must start with <code>var</code>, Function Declarations must begin with <code>function</code>.
>
> ```javascript
> function bar() {
>     return 3;
> }
> ```
>
> A Function Expression defines a function as a part of a larger expression syntax (typically a variable assignment ).
> Functions defined via Functions Expressions can be named or anonymous.
> Function Expressions must not start with <code>function</code> (hence the parentheses around the self invoking example below)
>
> ```javascript
> // anonymous function expression
> var a = function() {
>     return 3;
> }
>
> // named function expression
> var a = function bar() {
>     return 3;
> }
>
> // self invoking function expression
> (function sayHello() {
>     alert("hello!");
> })();
> ```
>
> Function declarations get hoisted whereas when function expression is used,
> only variable declarations get hoisted but their assignment expressions don’t

</details>

<details>
<summary>4. What are lambda or arrow functions?</summary>

> **Answer:**
> An arrow function is a shorter syntax for a function expression and does not have its own **this, arguments, super, or new\.target**. These function are best suited for non-method functions, and they cannot be used as constructors.
>
> In other words, every javascript function while executing has a reference to its current execution context, called <code>this</code>. Execution context means here is how the function is called.
>
> To understand <code>this</code> keyword, only we need to know how, when and from where the function is called, does not matter how and where function is declared or defined.
>
> ```javascript
> let hello = (val) => "Hello " + val;
>
> let squares = [1, 2, 3].map(x => x * x);
> ```

</details>

<details>
<summary>5. What is the difference between arrow functions and regular functions?</summary>

> **Answer:**
> An arrow function expression is a syntactically compact alternative to a regular function expression, although without its own bindings to the <code>this</code>, <code>arguments</code>, <code>super</code> or <code>new\.target</code> keywords. Arrow function expressions are ill suited as methods, and they cannot be used as constructors.
> **Answer:**
>
> ```javascript
> var materials = [
>   'Hydrogen',
>   'Helium',
>   'Lithium',
>   'Beryllium'
> ];
>
> console.log(materials.map(material => material.length));
> ```

</details>

<details>
<summary>6. What is a pure function?</summary>

> **Answer:**
> A **Pure function** is a function where the return value is only determined by its arguments without any side effects. i.e, If you call a function with the same arguments 'n' number of times and 'n' number of places in the application then it will always return the same value. Let's take an example to see the difference between pure and impure functions,
>
> ```javascript
> // Impure
> let numberArray = [];
> const impureAddNumber = number => numberArray.push(number);
> // Pure
> const pureAddNumber = number => argNumberArray => argNumberArray.concat([number]);
>
> // Display the results
> console.log (impureAddNumber(6)); // returns 6
> console.log (numberArray); // returns [6]
> console.log (pureAddNumber(7) (numberArray)); // returns [6, 7]
> console.log (numberArray); // returns [6]
> ```
>
> As per above code snippets, Push function is impure itself by altering the array and returning an push number index which is independent of parameter value. Whereas Concat on the other hand takes the array and concatenates it with the other array producing a whole new array without side effects. Also, the return value is a concatenation of previous array.
> Remember that Pure functions are important as they simplify unit testing without any side effects and no need for dependency injection. They also avoid tight coupling and makes harder to break your application by not having any side effects. These principles are coming together with **Immutability** concept of ES6 by giving preference to **const** over **let** usage.

</details>

<details>
<summary>7. Params, arguments, rest and default params</summary>

> **Answer:**
> Function parameters are the names listed in the function definition.
>
> Function arguments are the real values passed to (and received by) the function.
>
> JavaScript function definitions do not specify data types for parameters.
>
> JavaScript functions do not perform type checking on the passed arguments.
>
> JavaScript functions do not check the number of arguments received.
>
> Rest parameters are used for variable count of parameters:
>
> ```javascript
> function containsAll(haystack, ...needles) {
>   for (var needle of needles) {
>     if (haystack.indexOf(needle) === -1) {
>       return false;
>     }
>   }
>   return true;
> }
>
> console.log(containsAll([1,2], 1,2)); // true
> ```
>
> Default parameters used to set default value if argument is not provided:
>
> ```javascript
> function test(a, b = 2) {
>   return a + b;
> }
>
> console.log(test(2)); // 4
> ```

</details>

<details>
<summary>8. What is a higher order function?</summary>

> **Answer:**
> Higher-order function is a function that accepts other function as an argument or returns a function as a return value.
>
> ```javascript
> const firstOrderFunc = () => console.log ('Hello I\'am a First order function');
> const higherOrder = ReturnFirstOrderFunc => ReturnFirstOrderFunc ();
> higherOrder (firstOrderFunc);
> ```

</details>

<details>
<summary>9. What is closure?</summary>

> **Answer:**
> A closure is a feature in JavaScript where an inner function has access to the outer (enclosing) function’s variables — a scope chain.
>
> The closure has three scope chains:
>
> * it has access to its own scope — variables defined between its curly brackets
> * it has access to the outer function’s variables
> * it has access to the global variables
> * To the uninitiated, this definition might seem like just a whole lot of jargon!
>
> This allows the function to save it's state.
>
> Example:
>
> ```javascript
> function outer() {
>   var b = 10;
>   var c = 100;
>
>   function inner() {
>       var a = 20;
>       console.log("a=" + a + " b=" + b);
>       a++;
>       b++;
>   }
>
>   return inner;
> }
>
> var X = outer();  // outer() invoked the first time
> X() // a=20 b=10
> X() // a=20 b=11
> X() // a=20 b=12
> ```

</details>

<details>
<summary>10. What is hoisting?</summary>

> **Answer:**
> When Javascript compiles all of your code, all variable declarations using var are hoisted/lifted to the top of their functional/local scope (if declared inside a function) or to the top of their global scope (if declared outside of a function) regardless of where the actual declaration has been made. This is what we mean by “hoisting”.
>
> ```javascript
> console.log(message); // output : undefined
> var message = 'The variable Has been hoisted';
> ```
>
> The above code looks like as below to the interpreter,
>
> ```javascript
> var message;
> console.log(message);
> message = 'The variable Has been hoisted';
> ```
>
> Functions declarations are also hoisted, but these go to the very top, so will sit above all of the variable declarations.

</details>

<details>
<summary>11. What's in the console?</summary>

> **Source Code:**
>
> ```javascript
> function fun() {
>     console.log(a);
>     console.log(inner());
>
>     var a = 5;
>     function inner() {
>         return a + 5;
>     }
>     console.log(inner());
> }
>
> fun()
> ```
>
> **Answer:**
>
> ```javascript
> undefined
> NaN
> 10
> ```

</details>

<details>
<summary>12. What's in the console?</summary>

> **Source Code:**
>
> ```javascript
> var a = -1;
>
> function someFunc() {
>     if (false) {
>         var a = 1;
>     } else {
>         var b = 2;
>     }
>
>     console.log(b);
>     console.log(a);
> }
>
> someFunc();
> ```
>
> **Answer:**
>
> ```javascript
> 2
> undefined
> ```

</details>

<details>
<summary>13. What's in the console?</summary>

> **Source Code:**
>
> ```javascript
> function shooterBuilder() {
>     let shooters = [];
>
>     for (let i = 0; i < 10; i++) {
>         shooters.push(function () {
>            console.log(i);
>         });
>     }
>
>     return shooters;
> }
>
> var x = shooterBuilder();
> x[0]();
> x[5]();
> ```
>
> **Answer:**
>
> ```javascript
> 0
> 5
> ```

</details>

### Objects and Classes

<details>
<summary>1. What is "this" keyword?</summary>

> **Answer:** <code>this</code> keyword refers to an object, that object which is executing the current bit of javascript code.
>
> In other words, every javascript function while executing has a reference to its current execution context, called <code>this</code>. Execution context means here is how the function is called.
>
> To understand <code>this</code> keyword, only we need to know how, when and from where the function is called, does not matter how and where function is declared or defined.
>
> ```javascript
> function bike() {
>   console.log(this.name);
> }
>
> var name = "Ninja";
> var obj1 = { name: "Pulsar", bike: bike };
> var obj2 = { name: "Gixxer", bike: bike };
>
> bike();      // "Ninja"
> obj1.bike(); // "Pulsar"
> obj2.bike(); // "Gixxer"
> ```

</details>

<details>
<summary>2. What are the possible ways to create objects in JavaScript?</summary>

> **Answer:**
> There are many ways to create objects in javascript as below,
>
> 1. **Object constructor:**
>
> The simplest way to create an empty object is using Object constructor. Currently this approach is not recommended.
>
> ```javascript
> var object = new Object();
> ```
>
> 2. **Object's create method:**
>
> The create method of Object creates a new object by passing the prototype object as a parameter
>
> ```javascript
> var object = Object.create(null);
> ```
>
> 3. **Object literal syntax:**
>
> The object literal syntax is equivalent to create method when it passes null as parameter
>
> ```javascript
> var object = {};
> ```
>
> 4. **Function constructor:**
>
> Create any function and apply the new operator to create object instances,
>
> ```javascript
> function Person(name) {
>   var object = {};
>   object.name = name;
>   object.age = 21;
>
>   return object;
> }
>
> var object = new Person("Max");
> ```
>
> 5. **Function constructor with prototype:**
>
> This is similar to function constructor but it uses prototype for their properties and methods,
>
> ```javascript
> function Person() {}
> Person.prototype.name = "Max";
> var object = new Person();
> ```
>
> This is equivalent to an instance created with an object create method with a function prototype and then  call that function with an instance and parameters as arguments.
>
> ```javascript
> function func {};
>
> new func(x, y, z);
>
> // **(OR)**
> // Create a new instance using function prototype.
> var newInstance = Object.create(func.prototype)
> // Call the function
> var result = func.call(newInstance, x, y, z),
>
> // If the result is a non-null object then use it otherwise just use the new instance.
> console.log(result && typeof result === 'object' ? result : newInstance);
> ```
>
> 6. **ES6 Class syntax:**
>
> ES6 introduces class feature to create the objects
>
> ```javascript
> class Person {
>   constructor(name) {
>       this.name = name;
>   }
> }
>
> var object = new Person("Max");
> ```
>
> 7. **Singleton pattern:**
>
> A Singleton is an object which can only be instantiated one time. Repeated calls to its constructor return the same instance and this way one can ensure that they don't accidentally create multiple instances.
>
> ```javascript
> var object = new function() {
>   this.name = "Max";
> }
> ```

</details>

<details>
<summary>3. What is prototypal inheritance?</summary>

> **Answer:**
> In JavaScript, objects have a special hidden property <code>\[\[Prototype]]</code> (as named in the specification), that is either null or references another object.
> That object is called “a prototype”: That <code>\[\[Prototype]]</code> has a “magical” meaning.
> When we want to read a property from object, and it’s missing, JavaScript automatically takes it from the prototype.
> In programming, such thing is called “prototypal inheritance”. Many cool language features and programming techniques are based on it.
>
> The property <code>\[\[Prototype]]</code> is internal and hidden, but there are many ways to set it. One of them is to use <code>\_*proto*\_</code>.
>
> ```javascript
> let animal = {
>   eats: true
> };
> let rabbit = {
>   jumps: true
> };
>
> rabbit.__proto__ = animal;
> // If we look for a property in rabbit, and it’s missing, JavaScript
> // automatically takes it from animal.
> console.log(rabbit.eats); // true
> console.log(rabbit.jumps); // true
> ```
>
> <code>\_*proto*\_</code> is not the same as <code>\[\[Prototype]]</code>. That’s a getter/setter for it.
>
> It exists for historical reasons, in modern language it is replaced with functions <code>Object.getPrototypeOf</code>/<code>Object.setPrototypeOf</code> that also get/set the prototype.
>
> * If we want to read a property of obj or call a method, and it doesn’t exist, then JavaScript tries to find it in the prototype. Write/delete operations work directly on the object, they don’t use the prototype (unless the property is actually a setter).
> * If we call <code>obj.method()</code>, and the method is taken from the prototype, this still references obj. So methods always work with the current object even if they are inherited.

</details>

<details>
<summary>4. How can we get and array of number from array of their string representations? Describe the array.map method.</summary>

> **Answer:**
>
> ```javascript
> var test = ['144','24','33']
> test.map(x => parseInt(x))
> ```
>
> * The <code>map</code> method creates a new array with the results of calling a function for every array element.
> * The <code>map</code> method calls the provided function once for each element in an array, in order.
> * Note: <code>map</code> does not execute the function for array elements without values.
> * Note: <code>map</code> does not change the original array.

</details>

<details>
<summary>5. What's in the console? Change the function context to get the different thing in console.</summary>

> **Source Code:**
>
> ```javascript
> var secretNumber = 10;
> var obj = {
>     secretNumber: 100,
>     inner: {
>         secretNumber: 1000,
>         printNumber: function() {
>             console.log(this.secretNumber);
>         }
>     }
> }
>
> obj.inner.printNumber();
>
> var printNumber = obj.inner.printNumber;
> printNumber();
> ```
>
> **Answer:**
>
> ```javascript
> 1000
> 10
> ```
>
> Change the context:
>
> ```javascript
> var newPrintNumber = obj.inner.printNumber.bind(obj);
> newPrintNumber();
> 100
> ```

</details>

### Async

<details>
<summary>1. What is callback hell?</summary>

> **Answer:**
> Callback Hell, also known as Pyramid of Doom, is an anti-pattern seen in code of programmers who are not wise in the ways of asynchronous programming. It consists of multiple nested callbacks which makes code hard to read and debug. It is understandable how one might unknowingly get caught in Callback Hell while dealing with asynchronous logic.
>
> ```javascript
> async1(function(){
>    async2(function(){
>        async3(function(){
>            async4(function(){
>                ...
>            });
>        });
>    });
> });
> ```
>
> Callbacks do not return anything right away, they take a function as an argument, and then you tell the executing function what to do when the asynchronous task completes.\
> If you are not expecting your application logic to get too complex, a few callbacks seem harmless. But once your project requirements start to swell, you will quickly find yourself piling layers of nested callbacks. Congrats! Welcome to Callback Hell.
>
> There are several ways how to solve the callback-hell problem:
>
> 1. Write comments
> 2. Split functions into smaller functions
> 3. Using Promises
> 4. Using Async/await

</details>

<details>
<summary>2. Explain the difference between synchronous and asynchronous functions.</summary>

> **Answer:**
> Synchronous functions are blocking while asynchronous functions are not. In synchronous functions, statements complete before the next statement is run. In this case, the program is evaluated exactly in order of the statements and execution of the program is paused if one of the statements take a very long time.
>
> Asynchronous functions usually accept a callback as a parameter and execution continue on the next line immediately after the asynchronous function is invoked. The callback is only invoked when the asynchronous operation is complete and the call stack is empty. Heavy duty operations such as loading data from a web server or querying a database should be done asynchronously so that the main thread can continue executing other operations instead of blocking until that long operation to complete (in the case of browsers, the UI will freeze).

</details>

<details>
<summary>3. What do setTimeout and setInterval functions do? What do they
return?</summary>

> **Answer:** <code>setTimeout</code> allows to run a function once after the interval of time.
>
> <code>setInterval</code> allows to run a function regularly with the interval between the runs.
>
> These methods are not a part of JavaScript specification.
> But most environments have the internal scheduler and provide these methods.
> In particular, they are supported in all browsers and Node.JS.
>
> ```javascript
> function sayHi() {
>   alert('Hello');
> }
>
> setTimeout(sayHi, 1000); // executed after a second
> setInterval(sayHi, 1000); // executed every second
> ```
>
> * Methods <code>setInterval(func, delay, ...args)</code> and <code>setTimeout(func, delay, ...args)</code> allow to run the func regularly/once after delay milliseconds.
> * To cancel the execution, we should call <code>clearInterval</code>/<code>clearTimeout</code> with the value returned by <code>setInterval</code>/<code>setTimeout</code>.
> * Nested <code>setTimeout</code> calls is a more flexible alternative to <code>setInterval</code>. Also they can guarantee the minimal time between the executions.
> * Zero-timeout scheduling <code>setTimeout(..., 0)</code> is used to schedule the call “as soon as possible, but after the current code is complete”.

</details>

<details>
<summary>4. What is Promise? What for methods resolve, reject, all and race are used?</summary>

> **Answer:**
> The Promise object represents the eventual completion (or failure) of an asynchronous operation, and its resulting value.
>
> A Promise is in one of these states:
>
> * pending: initial state, neither fulfilled nor rejected.
> * fulfilled: meaning that the operation completed successfully.
> * rejected: meaning that the operation failed.
>
> Promise methods:
>
> * <code>Promise.resolve()</code> returns a Promise object that is resolved with the given value. If the value is a thenable (i.e. has a then method), the returned promise will "follow" that thenable, adopting its eventual state; otherwise the returned promise will be fulfilled with the value. Generally, if you don't know if a value is a promise or not, Promise.resolve(value) it instead and work with the return value as a promise.
> * <code>Promise.reject()</code> returns a Promise object that is rejected with the given reason.
> * <code>Promise.all(iterable)</code> returns a promise that either fulfills when all of the promises in the iterable argument have fulfilled or rejects as soon as one of the promises in the iterable argument rejects. If the returned promise fulfills, it is fulfilled with an array of the values from the fulfilled promises in the same order as defined in the iterable. If the returned promise rejects, it is rejected with the reason from the first promise in the iterable that rejected. This method can be useful for aggregating results of multiple promises.
> * <code>Promise.race(iterable)</code> returns a promise that fulfills or rejects as soon as one of the promises in the iterable fulfills or rejects, with the value or reason from that promise.

</details>

<details>
<summary>5. What for async/await keywords are used?</summary>

> **Answer:**
> The word <code>async</code> before a function means one simple thing: a function always returns a promise. Even If a function actually returns a non-promise value, prepending the function definition with the <code>async</code> keyword directs Javascript to automatically wrap that value in a resolved promise.
>
> ```javascript
> async function f() {
>   return 1;
> }
>
> f().then(alert); // 1
> ```
>
> The keyword <code>await</code>makes JavaScript wait until that promise settles and returns its result.
>
> ```javascript
> async function f() {
>   let promise = new Promise((resolve, reject) => {
>     setTimeout(() => resolve("done!"), 1000)
>   });
>   // works only inside async functions
>   let result = await promise; // wait till the promise resolves (*)
>   alert(result); // "done!"
> }
>
> f();
> ```
>
> The function execution “pauses” at the line (\*) and resumes when the promise settles, with result becoming its result.
> So the code above shows “done!” in one second.

</details>

<details>
<summary>6. What's in the console?</summary>

> **Source Code:**
>
> ```javascript
> function print1234() {
>     console.log(1);
>     setTimeout(() => console.log(2), 100);
>     setTimeout(() => console.log(3), 0);
>     console.log(4);
> }
>
> print1234();
> ```
>
> **Answer:**
>
> ```javascript
> 1
> 4
> 3
> 2
> ```

</details>

<details>
<summary>7. What's in the console? Change it to be the way we need.</summary>

> **Source Code:**
>
> ```javascript
> for (var i = 1; i <= 5; i++) {
>     setTimeout(() => {
>         console.log(i);
>     }, 0);
> }
> ```
>
> **Answer:**
>
> ```javascript
> 6
> 6
> 6
> 6
> 6
> ```
>
> Fix:
>
> ```javascript
> for (var i = 1; i <= 5; i++) {
> (function(i){
>   setTimeout(() => {
>     console.log(i);
>   }, 0)
>  })(i);
> }
> 1
> 2
> 3
> 4
> 5
> ```

</details>

### Execution

<details>
<summary>1. What is a debugger statement?</summary>

> **Answer:**
> The debugger statement invokes any available debugging functionality, such as setting a breakpoint. If no debugging functionality is available, this statement has no effect. For example, in the below function a debugger statement has been inserted. So execution is paused at the debugger statement just like a breakpoint in the script source.
>
> ```javascript
> function getProfile() {
>    // code goes here
>    debugger;
>    // code goes here
> }
> ```
>
> You can set breakpoints in the javascript code once the debugger statement is executed and debugger window pops up. At each breakpoint, javascript will stop executing, and let you examine the JavaScript values. After examining values, you can resume the execution of code using play button.

</details>

<details>
<summary>2. How is JS code processed in a browser?</summary>

> **Answer:**
> JavaScript has no compilation step.
> Instead, an interpreter in the browser reads over the JavaScript code, interprets each line, and runs it.
> Modern browsers use a technology known as Just-In-Time (JIT) compilation, which compiles JavaScript to executable bytecode just as it is about to run.

</details>

## Intermediate

### Type System

<details>
<summary>1. What is destructured assignment?</summary>

> **Answer:**
> The destructuring assignment syntax is a JavaScript expression that makes it possible to unpack values from arrays, or properties from objects, into distinct variables.
>
> ```javascript
> var a, b, rest;
> [a, b] = [10, 20];
>
> console.log(a); // 10
>
> console.log(b); // 20
>
> [a, b, ...rest] = [10, 20, 30, 40, 50];
>
> console.log(rest); [30,40,50]
> ```

</details>

<details>
<summary>2. Explain the differences between Primitive Types and Reference Types</summary>

> **Answer:**
> In JavaScript, a variable may store two types of data: primitive and reference.
>
> **Primitive types**
>
> * null
> * undefined
> * Boolean
> * Number
> * String
>
> **Reference Types**
>
> * Object (Array, Function)
>
> Primitive types are also known as: scalar types or simple types. The size of a primitive value is fixed, therefore, JavaScript stores primitive values on the stack. On the other hand, the size a reference value is dynamic therefore JavaScript stores the reference values on the heap.
>
> When you assign a value to a variable, the JavaScript engine must determine whether the value is a primitive or reference value.
>
> If the value is primitive, when you access the variable, you are manipulating the actual value stored in the variable. In other words, the variable that stores a primitive value is accessed by value.
>
> Unlike the primitive value, when you manipulate an object, you are working on the reference to that object, rather than the actual object. In short, a variable that stores an object is accessed by reference.
> To determine the type of a primitive value you use the `typeof` operator.
>
> ```javascript
> const x = 10;
> console.log(typeof(x)); // number
>
> const s = 'JS';
> console.log(typeof(s)); // string
> ```
>
> To find the type of a reference value, you use the `instanceof` operator.
>
> ```javascript
> const rgb = ['red','green','blue'];
> console.log(rgb instanceof Array); // true
> ```
>
> When you assign a variable that stores a primitive value to another, the value stored in the variable is created and copied into the new variable.
>
> ```javascript
> var a = 13         // assign `13` to `a`
> var b = a          // copy the value of `a` to `b`
> b = 37             // assign `37` to `b`
> console.log(a)     // => 13
> // The original was not changed, we can only change the copy.
>
> var a = { c: 13 }  // assign the reference of a new object to `a`
> var b = a          // copy the reference of the object inside `a` to new variable `b`
> b.c = 37           // modify the contents of the object `b` refers to
> console.log(a)     // => { c: 37 }
> // The original was also changed, since the reference got copied.
> ```

</details>

### Scopes, Closures and Functions

<details>
<summary>1. What is an IIFE (Immediately Invoked Function Expression)
pattern?</summary>

> **Answer:**
> An Immediately-invoked Function Expression is a way to execute functions immediately, as soon as they are created. IIFEs are very useful because they don't pollute the global object, and they are a simple way to isolate variables declarations
>
> This is the syntax that defines an IIFE:
>
> ```javascript
> (function() {
>   /* */
> })()
> ```
>
> IIFEs can be defined with arrow functions as well:
>
> ```javascript
> (() => {
>   /* */
> })()
> ```

</details>

<details>
<summary>2. How to change the context of the calling function?</summary>

> **Answer:** <code>call</code>, <code>apply</code> and <code>bind()</code> functions can be used to change the function context.
>
> The <code>call</code> function requires the arguments to be listed explicitly while the <code>apply</code> function allows you to provide the arguments as an array:
>
> ```javascript
> function user(firstName, lastName, age) {
>     // do something
> }
>
> user.call(window, 'John', 'Doe', 30);
> user.apply(window, ['John', 'Doe', 30]);
> ```
>
> ECMAScript 5 (ES5) introduced the <code>Function.prototype.bind</code> method that is used for manipulating context. It returns a new function which is permanently bound to the first argument of <code>bind</code> regardless of how the function is being used. It works by using a closure that is responsible for redirecting the call in the appropriate context.
>
> ```javascript
> var module = {
>   x: 42,
>   getX: function() {
>     return this.x;
>   }
> }
>
> var unboundGetX = module.getX;
> // The function gets invoked at the global scope
> console.log(unboundGetX()); // undefined
>
> var boundGetX = unboundGetX.bind(module);
> console.log(boundGetX()); // 42
> ```

</details>

<details>
<summary>3. What is rest/spread operator?</summary>

> **Answer:**
> The rest parameters can be mentioned in a function definition with three dots <code>...</code>.
> They literally mean “gather the remaining parameters into an array”.
> For instance, to gather all arguments into array args:
>
> ```javascript
> function sumAll(...args) { // args is the name for the array
>   let sum = 0;
>   for (let arg of args) sum += arg;
>   return sum;
> }
>
> alert(sumAll(1)); // 1
> alert(sumAll(1, 2)); // 3
> alert(sumAll(1, 2, 3)); // 6
> ```
>
> Spread operator looks similar to rest parameters, also using <code>...</code>, but does quite the opposite. When <code>...arr</code> is used in the function call, it “expands” an iterable object arr into the list of arguments.
>
> ```javascript
> let arr = [3, 5, 1];
>
> console.log(Math.max(...arr) ); // 5 (spread turns array into a list of arguments)
> ```

</details>

<details>
<summary>4. What's in the console?</summary>

> **Source Code:**
>
> ```javascript
> var obj = {
>     a: 200
> };
>
> (function(obj) {
>     obj = {
>         a: 400
>     };
>
> })(obj);
>
> console.log(obj.a);
> ```
>
> **Answer:**
>
> ```javascript
> 200
> ```

</details>

<details>
<summary>5. What's in the console?</summary>

> **Source Code:**
>
> ```javascript
> var i = 10;
> var array = [];
>
> while (i--) {
>     (function (i) {
>         var i = i;
>         array.push(function() {
>             return i + i;
>         });
>     })(i);
> }
>
> console.log([
>     array[0](),
>     array[1](),
> ])
> ```
>
> **Answer:**
>
> ```javascript
> 18
> 16
> ```

</details>

<details>
<summary>6. What's in the console?</summary>

> **Source Code:**
>
> ```javascript
> (function () {
>     test();
>
>     test = function () {
>         console.log('a')
>     };
> })();
>
> function test() {
>     console.log('b')
> }
>
> test();
> ```
>
> **Answer:**
>
> ```javascript
> b
> a
> ```

</details>

<details>
<summary>7. What's in the console?</summary>

> **Source Code:**
>
> ```javascript
> var counter = 5;
>
> var add = (function () {
>     var counter = 0;
>     return function () {
>         return counter += 1;
>     }
> })();
>
> add();
> add();
>
> console.log(add());
> ```
>
> **Answer:**
>
> ```javascript
> 3
> ```

</details>

### Objects and Classes

<details>
<summary>1. What are Property flags?</summary>

> **Answer:**
> Object properties, besides a value, have three special attributes (so-called “flags”):
>
> * `writable` – if true, the value can be changed, otherwise it’s read-only.
> * `enumerable` – if true, then listed in loops, otherwise not listed.
> * `configurable` – if true, the property can be deleted and these attributes can be modified, otherwise not.
>
> We didn’t see them yet, because generally they do not show up. When we create a property “the usual way”, all of them are true. But we also can change them anytime.
>
> The method `Object.getOwnPropertyDescriptor` allows to query the full information about a property.
>
> ```javascript
> // let descriptor = Object.getOwnPropertyDescriptor(obj, propertyName);
>
> let user = {
>   name: "John"
> };
>
> let descriptor = Object.getOwnPropertyDescriptor(user, 'name');
>
> alert( JSON.stringify(descriptor, null, 2 ) );
> /* property descriptor:
> {
>   "value": "John",
>   "writable": true,
>   "enumerable": true,
>   "configurable": true
> }
> */
> ```
>
> The `Object.defineProperty` can be used for changing the flags.
>
> ```javascript
> // Object.defineProperty(obj, propertyName, descriptor)
>
> let user = {};
>
> Object.defineProperty(user, "name", {
>   value: "John"
> });
>
> let descriptor = Object.getOwnPropertyDescriptor(user, 'name');
>
> alert( JSON.stringify(descriptor, null, 2 ) );
> /*
> {
>   "value": "John",
>   "writable": false,
>   "enumerable": false,
>   "configurable": false
> }
> */
> ```

</details>

<details>
<summary>2. What are Property getters and setters?</summary>

> **Answer:**
> There are two kinds of object properties.
> The first kind is data properties. We already know how to work with them. All properties that we’ve been using until now were data properties.
> The second type of properties is something new. It’s accessor properties. They are essentially functions that execute on getting and setting a value, but look like regular properties to an external code.
>
> Accessor properties are represented by “getter” and “setter” methods. In an object literal they are denoted by get and set:
>
> ```javascript
> let obj = {
>   get propName() {
>     // getter, the code executed on getting obj.propName
>   },
>
>   set propName(value) {
>     // setter, the code executed on setting obj.propName = value
>   }
> };
> ```

</details>

<details>
<summary>3. What are Property Accessor descriptors?</summary>

> **Answer:**
> Descriptors for accessor properties are different from those for data properties.
> For accessor properties, there is no `value` or `writable`, but instead there are `get` and `set` functions.
>
> That is, an accessor descriptor may have:
>
> * `get` – a function without arguments, that works when a property is read,
> * `set` – a function with one argument, that is called when the property is set,
> * `enumerable` – same as for data properties,
> * `configurable` – same as for data properties.
>
> We can use the static method `Object.defineProperty()` to define a new property directly on an object, or modifies an existing property on an object, and returns the object.
>
> ```javascript
> let user = {
>   name: "John",
>   surname: "Smith"
> };
>
> Object.defineProperty(user, 'fullName', {
>   get() {
>     return `${this.name} ${this.surname}`;
>   },
>
>   set(value) {
>     [this.name, this.surname] = value.split(" ");
>   }
> });
>
> alert(user.fullName); // John Smith
>
> for(let key in user) alert(key); // name, surname
> ```

</details>

<details>
<summary>4. What are Native prototypes?</summary>

> **Answer:**
> A typical JS-object inherits properties (including methods) from `Object.prototype`, although these properties may be shadowed (a.k.a. overridden). However, an Object may be deliberately created for which this is not true (e.g. by Object.create(null)), or it may be altered so that this is no longer true (e.g. with Object.setPrototypeOf).
>
> All JavaScript objects inherit properties and methods from a prototype:
>
> * `Date` objects inherit from `Date.prototype`
> * `Array` objects inherit from `Array.prototype`
> * `Person` objects inherit from `Person.prototype`
>
> ```javascript
> let obj = {};
>
> alert(obj.__proto__ === Object.prototype); // true
>
> alert(obj.toString === obj.__proto__.toString); //true
> alert(obj.toString === Object.prototype.toString); //true
> ```
>
> ```javascript
> let arr = [1, 2, 3];
>
> // it inherits from Array.prototype?
> alert( arr.__proto__ === Array.prototype ); // true
>
> // then from Object.prototype?
> alert( arr.__proto__.__proto__ === Object.prototype ); // true
>
> // and null on the top.
> alert( arr.__proto__.__proto__.__proto__ ); // null
> ```
>
> Primitives also store methods in prototypes of wrapper objects: Number.prototype, String.prototype and Boolean.prototype. Only undefined and null do not have wrapper objects.
>
> ```javascript
> String.prototype.show = function() {
>   alert(this);
> };
>
> "BOOM!".show(); // BOOM!
> ```
>
> Built-in prototypes can be modified or populated with new methods. But it’s not recommended to change them. The only allowable case is probably when we add-in a new standard, but it’s not yet supported by the JavaScript engine.

</details>

<details>
<summary>5. What is Optional chaining?</summary>

> **Answer:**
> The optional chaining ?. is a safe way to access nested object properties, even if an intermediate property doesn’t exist.
> The optional chaining ?. syntax has three forms:
>
> * `obj?.prop` – returns obj.prop if obj exists, otherwise undefined.
> * `obj?.[prop]` – returns obj\[prop] if obj exists, otherwise undefined.
> * `obj.method?.()` – calls obj.method() if obj.method exists, otherwise returns undefined.
>
> As we can see, all of them are straightforward and simple to use. The ?. checks the left part for null/undefined and allows the evaluation to proceed if it’s not so.
> A chain of ?. allows to safely access nested properties.
>
> Still, we should apply ?. carefully, only where it’s acceptable that the left part doesn’t to exist. So that it won’t hide programming errors from us, if they occur.
>
> ```javascript
> let user1 = {
>   firstName: "John"
> };
>
> let user2 = null; // Imagine, we couldn't authorize the user
>
> let key = "firstName";
>
> alert( user1?.[key] ); // John
> alert( user2?.[key] ); // undefined
>
> alert( user1?.[key]?.something?.not?.existing); // undefined
> ```

</details>

### Async

<details>
<summary>1. What is promise API?</summary>

> **Answer:**
> There are 5 static methods of Promise class:
>
> * `Promise.all(promises)` – waits for all promises to resolve and returns an array of their results. If any of the given promises rejects, it becomes the error of Promise.all, and all other results are ignored.
> * `Promise.allSettled(promises)`  – waits for all promises to settle and returns their results as an array of objects with: status ("fulfilled" or "rejected") and value (if fulfilled or reason if rejected).
>
> `Promise.race(promises)` – waits for the first promise to settle, and its result/error becomes the outcome.
> `Promise.resolve(value)` – makes a resolved promise with the given value.
> `Promise.reject(error)` – makes a rejected promise with the given error.

</details>

<details>
<summary>2. What is promise chaining?</summary>

> **Answer:**
> The process of executing a sequence of asynchronous tasks one after another using promises is known as Promise chaining.
>
> ```javascript
>  new Promise(function(resolve, reject) {
>
>      setTimeout(() => resolve(1), 1000);
>
>    }).then(function(result) {
>
>      console.log(result); // 1
>      return result * 2;
>
>    }).then(function(result) {
>
>      console.log(result); // 2
>      return result * 3;
>
>    }).then(function(result) {
>
>      console.log(result); // 6
>      return result * 4;
>
>   });
> ```
>
> In the above handlers, the result is passed to the chain of `.then()` handlers with the below work flow,
>
> 1. The initial promise resolves in 1 second,
> 2. After that `.then` handler is called by logging the result(1) and then return a promise with the value of result \* 2.
> 3. After that the value passed to the next `.then` handler by logging the result(2) and return a promise with result \* 3.
> 4. Finally the value passed to the last `.then` handler by logging the result(6) and return a promise with result \* 4.

</details>

<details>
<summary>3. What is Generator?</summary>

> **Answer:**
> The Generator object is returned by a generator function and it conforms to both the iterable protocol and the iterator protocol.
>
> ```javascript
> function* infinite() {
>    let index = 0;
>
>    while (true) {
>        yield index++;
>    }
> }
>
> const generator = infinite(); // "Generator { }"
>
> console.log(generator.next().value); // 0
> console.log(generator.next().value); // 1
> console.log(generator.next().value); // 2
> ```
>
> Generators can return (“yield”) multiple values, one after another, on-demand. They work great with iterables, allowing to create data streams with ease.
> The main method of a generator is next(). When called, it runs the execution until the nearest yield <value> statement (value can be omitted, then it’s undefined). Then the function execution pauses, and the yielded value is returned to the outer code.
>
> The result of `next()` is always an object with two properties:
>
> * value: the yielded value.
> * done: true if the function code has finished, otherwise false.
>
> In modern JavaScript, generators are rarely used. But sometimes they come in handy, because the ability of a function to exchange data with the calling code during the execution is quite unique. And, surely, they are great for making iterable objects.
>
> Generators are iterable. We can loop over their values using for..of:
>
> ```javascript
> function* generateSequence() {
>   yield 1;
>   yield 2;
>   return 3;
> }
>
> let generator = generateSequence();
>
> for(let value of generator) {
>   alert(value); // 1, then 2
> }
> ```

</details>

### Execution

<details>
<summary>1. What is 'use strict'?</summary>

> **Answer:**
> The statement <code>'use strict';</code> instructs the browser to use the Strict mode, which is a reduced and safer feature set of JavaScript.
>
> Strict Mode is a new feature in ECMAScript 5 that allows you to place a program, or a function, in a “strict” operating context. This strict context prevents certain actions from being taken and throws more exceptions.
>
> Benifits of using <code>‘use strict’</code>
> Strict mode makes several changes to normal JavaScript semantics.
>
> * Strict mode eliminates some JavaScript silent errors by changing them to throw errors.
> * Strict mode fixes mistakes that make it difficult for JavaScript engines to perform optimizations: strict mode code can sometimes be made to run faster than identical code that’s not strict mode.
> * Strict mode prohibits some syntax likely to be defined in future versions of ECMAScript.
> * It prevents, or throws errors, when relatively “unsafe” actions are taken (such as gaining access to the global object).
> * It disables features that are confusing or poorly thought out.
> * Strict mode makes it easier to write “secure” JavaScript.
>
> Strict mode can be used in two ways – used in global scope for the entire script and can be applied to individual functions. Strict mode doesn’t work with block statements enclosed in <code>{}</code> braces.
>
> If declare at the beginning of a script, it has global scope.
>
> ```javascript
> "use strict";
> x = 3.14; // This will cause an error because x is not declared
> ```
>
> and if you declare inside a function, it has local scope
>
> ```javascript
> x = 3.14;       // This will not cause an error.
> myFunction();
>
> function myFunction() {
>   "use strict";
>    y = 3.14;   // This will cause an error
> }
> ```

</details>

<details>
<summary>2. What is Temporal Dead Zone?</summary>

> **Answer:**
> The Temporal Dead Zone is a behavior in JavaScript that occurs when declaring a variable with the let and const keywords, but not with var. In ECMAScript 6, accessing a let or const variable before its declaration (within its scope) causes a ReferenceError. The time span when that happens, between the creation of a variable’s binding and its declaration, is called the temporal dead zone. Let's see this behavior with an example,
>
> ```javascript
> function somemethod() {
>   console.log(counter1); // undefined
>   console.log(counter2); // ReferenceError
>   var counter1 = 1;
>   let counter2 = 2;
> }
> ```

</details>

<details>
<summary>3. What is Eval function?</summary>

> **Answer:**
> The built-in eval function allows to execute a string of code. A string of code may be long, contain line breaks, function declarations, variables and so on. The result of eval is the result of the last statement.
>
> ```javascript
> let code = 'alert("Hello")';
> eval(code); // Hello
> ```
>
> The eval’ed code is executed in the current lexical environment, so it can see outer variables:
>
> ```javascript
> let a = 1;
>
> function f() {
>   let a = 2;
>
>   eval('alert(a)'); // 2
> }
>
> f();
> ```
>
> In modern programming eval is used very sparingly. It’s often said that “eval is evil”.
>
> The reason is simple: long, long time ago JavaScript was a much weaker language, many things could only be done with eval. But that time passed a decade ago.
>
> Right now, there’s almost no reason to use eval. If someone is using it, there’s a good chance they can replace it with a modern language construct or a JavaScript Module.
>
> If eval’ed code needs local variables, change eval to new Function and pass them as arguments.

</details>

<details>
<summary>4. What's in the console? What if it's strict mode?</summary>

> **Source Code:**
>
> ```javascript
> (function() {
>     var x = y = 10;
> })();
>
> console.log(y);
> console.log(x);
> ```
>
> **Answer:**
>
> ```javascript
> 10
> Uncaught ReferenceError: x is not defined
>
> ```
>
> Using strict mode:
>
> ```javascript
> Uncaught ReferenceError: y is not defined
> ```

</details>

### Error handling

<details>
<summary>1. What is the Throw operator?</summary>

> **Answer:**
> The `throw` operator generates an error.interchange functionality, call functions of one module from another one.
>
> ```javascript
> throw <error object>
> ```
>
> Technically, we can use anything as an error object. That may be even a primitive, like a number or a string, but it’s better to use objects, preferably with name and message properties (to stay somewhat compatible with built-in errors).
> JavaScript has many built-in constructors for standard errors: `Error`, `SyntaxError`, `ReferenceError`, `TypeError` and others. We can use them to create error objects as well.
> Exported modules are in strict mode whether you declare them as such or not. The export statement cannot be used in embedded scripts.
>
> ```javascript
> let error = 'Hello world!';
> // or
> let error = new Error(message);
> // or
> let error = new SyntaxError(message);
> let error = new ReferenceError(message);
> // ...
> throw error;
> ```

</details>

<details>
<summary>2. What is the Error object?</summary>

> **Answer:**
> When an error occurs, JavaScript generates an object containing the details about it. The object is then passed as an argument to catch:
>
> ```javascript
> try {
>   // ...
> } catch(err) { // <-- the "error object", could use another word instead of err
>   // ...
> }
> ```
>
> For all built-in errors, the error object has two main properties:
>
> * **name** - Error name. For instance, for an undefined variable that’s "ReferenceError".
> * **message** - Textual message about error details.
> * **stack** - Current call stack: a string with information about the sequence of nested calls that led to the error. Used for debugging purposes.
>
> ```javascript
> try {
>   lalala; // error, variable is not defined!
> } catch(err) {
>  alert(err.name); // ReferenceError
>  alert(err.message); // lalala is not defined
>  alert(err.stack); // ReferenceError: lalala is not defined at (...call stack)
>
>  // Can also show an error as a whole
>  // The error is converted to string as "name: message"
>  alert(err); // ReferenceError: lalala is not defined
> ```

</details>

## Advanced

### Type System

<details>
<summary>1. What is BigInt type?</summary>

> **Answer:**
> BigInt is a special numeric type that provides support for integers of arbitrary length.
>
> A bigint is created by appending n to the end of an integer literal or by calling the function BigInt that creates bigints from strings, numbers etc.
>
> ```javascript
> const bigint = 1234567890123456789012345678901234567890n;
> const sameBigint = BigInt("1234567890123456789012345678901234567890");
> const bigintFromNumber = BigInt(10); // same as 10n
> ```

</details>

<details>
<summary>2. What is Symbol type?</summary>

> **Answer:**
> Symbol is a primitive type for unique identifiers.
> Symbols are created with Symbol() call with an optional description (name).
>
> Symbols are always different values, even if they have the same name. If we want same-named symbols to be equal, then we should use the global registry: Symbol.for(key) returns (creates if needed) a global symbol with key as the name. Multiple calls of Symbol.for with the same key return exactly the same symbol.
>
> Symbols have two main use cases:
>
> * “Hidden” object properties. If we want to add a property into an object that “belongs” to another script or a library, we can create a symbol and use it as a property key. A symbolic property does not appear in for..in, so it won’t be accidentally processed together with other properties. Also it won’t be accessed directly, because another script does not have our symbol. So the property will be protected from accidental use or overwrite.
> * There are many system symbols used by JavaScript which are accessible as Symbol.\*. We can use them to alter some built-in behaviors. For instance, later in the tutorial we’ll use Symbol.iterator for iterables, Symbol.toPrimitive to setup object-to-primitive conversion and so on.

</details>

<details>
<summary>3. What is Iterable object?</summary>

> **Answer:**
> Objects that can be used in `for..of` are called **iterable**.
>
> Technically, iterables must implement the method named `Symbol.iterator`.
> The result of `obj[Symbol.iterator]()` is called an **iterator**. It handles the further iteration process.
> An iterator must have the method named `next()` that returns an object `{done: Boolean, value: any}`, here `done:true` denotes the end of the iteration process, otherwise the value is the next value.
>
> The `Symbol.iterator` method is called automatically by `for..of`, but we also can do it directly.
>
> Built-in iterables like strings or arrays, also implement Symbol.iterator.
> String iterator knows about surrogate pairs.
>
> ```javascript
> let range = {
>   from: 1,
>   to: 5,
>
>   [Symbol.iterator]() {
>     this.current = this.from;
>     return this;
>   },
>
>   next() {
>     if (this.current <= this.to) {
>       return { done: false, value: this.current++ };
>     } else {
>       return { done: true };
>     }
>   }
> };
>
> for (let num of range) {
>   alert(num); // 1, then 2, 3, 4, 5
> }
> ```

</details>

<details>
<summary>4. What is WeakMap type?</summary>

> **Answer:**
> WeakMap is Map-like collection that allows only objects as keys and removes them together with associated value once they become inaccessible by other means.
>
> WeakMap does not support iteration and methods `keys()`, `values()`, `entries()`, so there’s no way to get all keys or values from it.
> WeakMap has only the following methods:
>
> * `weakMap.get(key)`
> * `weakMap.set(key, value)`
> * `weakMap.delete(key)`
> * `weakMap.has(key)`
>
> ```javascript
> const wm1 = new WeakMap(),
>    wm2 = new WeakMap(),
>    wm3 = new WeakMap();
> const o1 = {},
>    o2 = function(){},
>    o3 = window,
>    o4 = [1, 2, 3];
>
> wm1.set(o1, 37);
> wm1.set(o2, 'azerty');
> wm2.set(o1, o2);
> wm2.set(o3, undefined);
> wm2.set(wm1, wm2);
>
> wm1.get(o2); // 'azerty'
> wm2.get(o2); // undefined
> wm2.get(o3); // undefined
>
> wm1.has(o2); // true
> wm2.has(o2); // false
> wm2.has(o3); // true ('undefined')
>
> wm3.set(o1, 37);
> wm3.get(o1); // 37
>
> wm1.has(o1); // true
> wm1.delete(o1);
> wm1.has(o1); // false
> ```

</details>

<details>
<summary>5. What is JSON object?</summary>

> **Answer:**
> The JSON object contains methods for parsing **JavaScript Object Notation (JSON)** and converting values to JSON. It can't be called or constructed, and aside from its two method properties, it has no interesting functionality of its own.
>
> JSON is a syntax for serializing objects, arrays, numbers, strings, booleans, and null. It is based upon JavaScript syntax but is distinct from it: some JavaScript is not JSON.
>
> Static methods
>
> * `JSON.parse(text[, reviver])` - Parse the string text as JSON, optionally transform the produced value and its properties, and return the value. Any violations of the JSON syntax, including those pertaining to the differences between JavaScript and JSON, cause a SyntaxError to be thrown. The reviver option allows for interpreting what the replacer has used to stand in for other datatypes.
> * `JSON.stringify(value[, replacer[, space]])` - Return a JSON string corresponding to the specified value, optionally including only certain properties or replacing property values in a user-defined manner. By default, all instances of undefined are replaced with null, and other unsupported native data types are censored. The replacer option allows for specifying other behavior.
>
> ```javascript
> // stringified array
> let numbers = "[0, 1, 2, 3]";
>
> numbers = JSON.parse(numbers);
>
> alert( numbers[1] ); // 1
> ```
>
> ```javascript
> let room = {
>   number: 23
> };
>
> let meetup = {
>  title: "Conference",
>   participants: [{name: "John"}, {name: "Alice"}],
>  place: room // meetup references room
> };
>
> room.occupiedBy = meetup; // room references meetup
>
> alert( JSON.stringify(meetup, ['title', 'participants']) );
> // {"title":"Conference","participants":[{},{}]}
> ```

</details>

### Scopes, Closures and Functions

<details>
<summary>1. What is the "new Function" syntax?</summary>

> **Answer:**
> Every JavaScript function is actually a Function object. This can be seen with the code (function(){}).constructor === Function, which returns true.
>
> ```javascript
> let func = new Function ([arg1, arg2, ...argN], functionBody);
> ```
>
> Calling the constructor directly can create functions dynamically but suffers from security and similar (but far less significant) performance issues to eval. However, unlike eval, the Function constructor creates functions that execute in the global scope only.
>
> Functions created with the Function constructor do not create closures to their creation contexts; they always are created in the global scope. When running them, they will only be able to access their own local variables and global ones, not the ones from the scope in which the Function constructor was created. This is different from using eval with code for a function expression.
>
> ```javascript
> let sum = new Function('a', 'b', 'return a + b');
>
> alert( sum(1, 2) ); // 3
> ```

</details>

<details>
<summary>2. What's in the console?</summary>

> **Source Code:**
>
> ```javascript
> var a = 1;
>
> function getFunc() {
>     var a = 2;
>     var func = new Function('', 'alert(a)');
>     return func;
> }
>
> getFunc()();
> ```
>
> **Answer:**
>
> ```javascript
> 1
> ```

</details>

<details>
<summary>3. What is the difference Between Regular and Arrow functions?</summary>

> **Answer:**
>
> 1. Syntax - The arrow function example above allows a developer to accomplish the same result with fewer lines of code and approximately half the typing.
> 2. Arguments binding - Arrow functions do not have an arguments binding. However, they have access to the arguments object of the closest non-arrow parent function. Named and rest parameters are heavily relied upon to capture the arguments passed to arrow functions.
> 3. Use of `this` keyword - Unlike regular functions, arrow functions do not have their own this. The value of this inside an arrow function remains the same throughout the lifecycle of the function and is always bound to the value of this in the closest non-arrow parent function.
> 4. Using new keyword - Regular functions created using function declarations or expressions are constructible and callable. Since regular functions are constructible, they can be called using the new keyword. However, the arrow functions are only callable and not constructible, i.e arrow functions can never be used as constructor functions. Hence, they can never be invoked with the new keyword.
> 5. No duplicate named parameters - Arrow functions can never have duplicate named parameters, whether in strict or **non-strict** mode.

</details>

### Objects and Classes

<details>
<summary>1. What is Mixin object?</summary>

> **Answer:**
> Mixin – is a generic object-oriented programming term: a class that contains methods for other classes.
>
> Some other languages allow multiple inheritance. JavaScript does not support multiple inheritance, but mixins can be implemented by copying methods into prototype.
> We can use mixins as a way to augment a class by adding multiple behaviors, like event-handling as we have seen above.
>
> Mixins may become a point of conflict if they accidentally overwrite existing class methods. So generally one should think well about the naming methods of a mixin, to minimize the probability of that happening.
>
> ```javascript
> // mixin
> let sayHiMixin = {
>   sayHi() {
>     alert(`Hello ${this.name}`);
>   },
>   sayBye() {
>     alert(`Bye ${this.name}`);
>   }
> };
>
> // usage:
> class User {
>   constructor(name) {
>     this.name = name;
>   }
> }
>
> // copy the methods
> Object.assign(User.prototype, sayHiMixin);
>
> // now User can say hi
> new User("Dude").sayHi(); // Hello Dude!
> ```

</details>

<details>
<summary>2. What is Proxy object?</summary>

> **Answer:**
> A Proxy object wraps another object and intercepts operations, like reading/writing properties and others, optionally handling them on its own, or transparently allowing the object to handle them.
>
> ```javascript
> let proxy = new Proxy(target, handler);
> // target – is an object to wrap, can be anything, including functions
> // handler – proxy configuration: an object with “traps”, methods that intercept operations
> ```
>
> > For operations on proxy, if there’s a corresponding trap in handler, then it runs, and the proxy has a chance to handle it, otherwise the operation is performed on target.
>
> Some other languages allow multiple inheritance. JavaScript does not support multiple inheritance, but mixins can be implemented by copying methods into prototype.
> We can use mixins as a way to augment a class by adding multiple behaviors, like event-handling as we have seen above.
>
> | Internal Method       | Handler Method           | Triggers when…                                                                                |   |
> | --------------------- | ------------------------ | --------------------------------------------------------------------------------------------- | - |
> | [[Get]]               | get                      | reading a property                                                                            |   |
> | [[Set]]               | set                      | writing to a property                                                                         |   |
> | [[HasProperty]]       | has                      | in operator                                                                                   |   |
> | [[Delete]]            | deleteProperty           | delete operator                                                                               |   |
> | [[Call]]              | apply                    | function call                                                                                 |   |
> | [[Construct]]         | construct                | new operator                                                                                  |   |
> | [[GetPrototypeOf]]    | getPrototypeOf           | Object.getPrototypeOf                                                                         |   |
> | [[SetPrototypeOf]]    | setPrototypeOf           | Object.setPrototypeOf                                                                         |   |
> | [[IsExtensible]]      | isExtensible             | Object.isExtensible                                                                           |   |
> | [[PreventExtensions]] | preventExtensions        | Object.preventExtensions                                                                      |   |
> | [[DefineOwnProperty]] | defineProperty           | Object.defineProperty, Object.defineProperties                                                |   |
> | [[GetOwnProperty]]    | getOwnPropertyDescriptor | Object.getOwnPropertyDescriptor, for..in, Object.keys/values/entries                          |   |
> | [[OwnPropertyKeys]]   | ownKeys                  | Object.getOwnPropertyNames, Object.getOwnPropertySymbols, for..in, Object/keys/values/entries |   |
>
> ```javascript
> let numbers = [0, 1, 2];
>
> numbers = new Proxy(numbers, {
>   get(target, prop) {
>     if (prop in target) {
>       return target[prop];
>     } else {
>       return 0; // default value
>     }
>   }
> });
>
> alert( numbers[1] ); // 1
> alert( numbers[123] ); // 0 (no such item)
> ```

</details>

### Async

<details>
<summary>1. What is Promisification?</summary>

> **Answer:**
> Promisification means converting an existing promise-unaware API to a promise-returning API.
> Such transformations are often required in real-life, as many functions and libraries are callback-based. But promises are more convenient, so it makes sense to promisify them.
>
> Why do we need to convert callback to promise?
>
> * In Callbacks, if you want to do something sequentially you will have to specify err argument in each callback which is redundant while in promises or async-await you can just add .catch method or block which will catch the errors occurred in the promise chain
> * In Callbacks, You have no control over how many times it’s being called which can lead to memory leaks, when its called and under what context.
> * Using promises, we control these factors especially error handling so the code is more readable and maintainable.
>
> How to Make Callback-based function return Promise?
>
> * Wrap function into another function which returns a promise and resolves or reject based on callback arguments.
> * Promisification  —  create util/helper function promisify which will transform all error first callback-based APIs.
>
> ```javascript
> // promisify(f, true) to get array of results
> function promisify(f, manyArgs = false) {
>   return function (...args) {
>     return new Promise((resolve, reject) => {
>       function callback(err, ...results) { // our custom callback for f
>         if (err) {
>           reject(err);
>         } else {
>           // resolve with all callback results if manyArgs is specified
>           resolve(manyArgs ? results : results[0]);
>         }
>       }
>
>       args.push(callback);
>
>       f.call(this, ...args);
>     });
>   };
> }
>
> // usage:
> f = promisify(f, true);
> f(...).then(arrayOfResults => ..., err => ...);
> ```

</details>

<details>
<summary>2. What are Microtasks?</summary>

> **Answer:**
> Promise handling is always asynchronous, as all promise actions pass through the internal “promise jobs” queue, also called “microtask queue” .
> Even when a Promise is immediately resolved, the code on the lines below `.then/.catch/.finally` will still execute before these handlers.
>
> ```javascript
> let promise = Promise.resolve();
>
> promise.then(() => alert("promise done!"));
>
> alert("code finished"); // this alert shows first
> ```
>
> Asynchronous tasks need proper management. For that, the ECMA standard specifies an internal queue PromiseJobs, more often referred to as the “microtask queue” (ES8 term).
>
> * The queue is first-in-first-out: tasks enqueued first are run first.
> * Execution of a task is initiated only when nothing else is running.
>
> So, if we need to guarantee that a piece of code is executed after `.then/catch/finally`, we can add it into a chained `.then` call.
>
> ```javascript
> Promise.resolve()
>  .then(() => alert("promise done!"))
>  .then(() => alert("code finished"));
> ```
>
> In most Javascript engines, including browsers and Node.js, the concept of microtasks is closely tied with the “event loop” and “macrotasks”.

</details>

### Modules

<details>
<summary>1. What is a module?</summary>

> **Answer:**
> A module is just a file. One script is one module. Modules can load each other and use special directives export and import to interchange functionality, call functions of one module from another one.\
> The static `import` statement is used to import read only live bindings which are exported by another module. Imported modules are in strict mode whether you declare them as such or not. The import statement cannot be used in embedded scripts unless such script has a type="module". Bindings imported are called live bindings because they are updated by the module that exported the binding.\
> There is also a function-like dynamic import(), which does not require scripts of type="module".
>
> ```javascript
> import defaultExport from "module-name";
> import * as name from "module-name";
> import { export1 } from "module-name";
> import { export1 as alias1 } from "module-name";
> import { export1 , export2 } from "module-name";
> import { foo , bar } from "module-name/path/to/specific/un-exported/file";
> import { export1 , export2 as alias2 , [...] } from "module-name";
> import defaultExport, { export1 [ , [...] ] } from "module-name";
> import defaultExport, * as name from "module-name";
> import "module-name";
> var promise = import("module-name");
> ```
>
> The `export` statement is used when creating JavaScript modules to export live bindings to functions, objects, or primitive values from the module so they can be used by other programs with the import statement. Bindings that are exported can still be modified locally; when imported, although they can only be read by the importing module the value updates whenever it is updated by the exporting module.\
> Exported modules are in strict mode whether you declare them as such or not. The export statement cannot be used in embedded scripts.\
> There are two types of exports: `Named Exports` (Zero or more exports per module) and `Default Exports` (One per module).
>
> ```javascript
> // Exporting individual features
> export let name1, name2, …, nameN; // also var, const
> export let name1 = …, name2 = …, …, nameN; // also var, const
> export function functionName(){...}
> export class ClassName {...}
>
> // Export list
> export { name1, name2, …, nameN };
>
> // Renaming exports
> export { variable1 as name1, variable2 as name2, …, nameN };
>
> // Exporting destructured assignments with renaming
> export const { name1, name2: bar } = o;
>
> // Default exports
> export default expression;
> export default function (…) { … } // also class, function*
> export default function name1(…) { … } // also class, function*
> export { name1 as default, … };
>
> // Aggregating modules
> export * from …; // does not set the default export
> export * as name1 from …; // Draft ECMAScript® 2O21
> export { name1, name2, …, nameN } from …;
> export { import1 as name1, import2 as name2, …, nameN } from …;
> export { default } from …;
> ```

</details>

**[⬆ Back to top](#questions)**
