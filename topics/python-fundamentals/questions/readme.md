# Questions

## Beginner

### Language fundamentals

<details>
<summary>1. What is Python?</summary>

> **Answer:**
> Python is an interpreted, object-oriented, high-level programming language with dynamic semantics. Its high-level built in data structures, combined with dynamic typing and dynamic binding, make it very attractive for Rapid Application Development, as well as for use as a scripting or glue language to connect existing components together. Python's simple, easy to learn syntax emphasizes readability and therefore reduces the cost of program maintenance. Python supports modules and packages, which encourages program modularity and code reuse. The Python interpreter and the extensive standard library are available in source or binary form without charge for all major platforms, and can be freely distributed.

</details>

<details>
<summary>2. Which typing does Python have?</summary>

> **Answer:**
> Python uses duck typing and has typed objects but untyped variable names. Type constraints are not checked at compile time; rather, operations on an object may fail, signifying that the given object is not of a suitable type. Despite being dynamically typed, Python is strongly typed, forbidding operations that are not well-defined (for example, adding a number to a string) rather than silently attempting to make sense of them.

</details>

<details>
<summary>3. What packing and unpacking operations are used for?</summary>

> **Answer:**
> `*` and the `**` operators both perform two different, but complementary operations depending on where they're used. When used in a method definition, like so:
>
> ```python
> def __init__(self, *args, **kwargs):
>     pass
> ```
>
> They perform an operation called 'packing'. True to it's name, what this does is pack all the arguments that this method call receives into one single variable, a tuple called `args`. You can use any variable name you want, of course, but `args` seems to be the most common and Pythonic way of doing things.
>
> Once you have this 'packed' variable, you can do things with it that you would with a normal tuple. `args[0]` and `args[1]` would give you the first and second argument, respectively. If you convert the `args` tuple to a list you can also modify, delete and re-arrange items in it.
>
> So how do you pass these packed arguments to another method? Here's where unpacking comes in to play:
>
> ```python
> def __init__(self, *args, **kwargs):
>     # do some stuff
>     super(AwesomeClass, self).__init__(self, *args, **kwargs)
>     #                                            ^
>     #                                        LOOK HERE!
> ```
>
> So there's the same `*` operator again, but this time it's in the context of a method call. What it does now is explode the `args` array and call the method as if you'd typed in each variable separately.
>
> The same principle applies to `**kwargs` too, except that in this case it applies to keyword arguments, and `kwargs` turns out to be a dict.

</details>

<details>
<summary>4. What is an iterator in python? What is the difference between iterators and iterable objects?</summary>

> **Answer:**
> An iterator is an object that contains a countable number of values.
>
> An iterator is an object that can be iterated upon, meaning that you can traverse through all the values.
>
> Technically, in Python, an iterator is an object which implements the iterator protocol, which consist of the methods `__iter__()` and `__next__()`.
>
> Lists, tuples, dictionaries, and sets are all iterable objects. They are iterable containers which you can get an iterator from.
>
> All these objects have a `__iter()__` method. To call it, you can use
> built-in `iter` function.
> This means every iterator is iterable, but not every iterable is an iterator.
> You can loop through the iterator using `for` loop or `next` function:
>
> ```python
> mytuple = ("apple", "banana", "cherry")
> myit = iter(mytuple)
>
> print(next(myit))
> print(next(myit))
> print(next(myit))
>
> for x in mytuple:
>     print(x)
> ```

</details>

<details>
<summary>5. What primitive and common used datatypes do you know?</summary>

> **Answer:**
> Primitive datatypes in Python are integers, floats, strings, booleans. Python also provides set of useful datatypes such as dicts, lists, sets, frozensets, tuples, datetimes, enums.

</details>

<details>
<summary>6. What is virtual environment? Why to use it?</summary>

> **Answer:**
> Virtual environment can be considered as a carbon copy of a base version of Python. If you’ve installed Python 3.7.3, for example, then you can create many virtual environments based off of it. When you install a package in a virtual environment, you do it in isolation from other Python environments you may have. Each virtual environment has its own copy of the python executable.

</details>

<details>
<summary>7. What is pip? What is common used pip commands</summary>

> **Answer:**
> pip is a de facto standard package-management system used to install and manage software packages written in Python. Many packages can be found in the default source for packages and their dependencies — Python Package Index (PyPI).
> Most common used commmands for pip is `pip install`, `pip uninstall`, `pip freeze`

</details>

<details>
<summary>8. What is PEP 8?</summary>

> **Answer:**
> PEP 8 is a coding convention, a set of recommendation, about how to write your Python code more readable.

</details>

<details>
<summary>9. How Python is interpreted?</summary>

> **Answer:**
> Python language is an interpreted language. Python program runs directly from the source code. It converts the source code that is written by the programmer into an intermediate language, which is again translated into machine language that has to be executed.

</details>

<details>
<summary>10. Mention the use of // operator in Python?</summary>

> **Answer:**
> It is a Floor Divisionoperator, which is used for dividing two operands with the result as quotient showing only digits before the decimal point. For instance, 10//5 = 2 and 10.0//5.0 = 2.0.

</details>

<details>
<summary>11. Mention five benefits of using Python?</summary>

> **Answer:**
>
> * Python comprises of a huge standard library for most Internet platforms like Email, HTML, etc.
> * Python does not require explicit memory management as the interpreter itself allocates the memory to new variables and free them automatically
> * Provide easy readability due to use of square brackets
> * Easy-to-learn for beginners
> * Having the built-in data types saves programming time and effort from declaring variables

</details>

<details>
<summary>12. Mention the use of the split function in Python?</summary>

> **Answer:**
> The use of the split function in Python is that it breaks a string into shorter strings using the defined separator. It gives a list of all words present in the string.

</details>

<details>
<summary>13. What is the difference between list and tuple?</summary>

> **Answer:**
> The difference between list and tuple is that list is mutable while tuple is not. Tuple can be hashed for e.g as a key for dictionaries.

</details>

<details>
<summary>14. What are the tools that help to find bugs or perform static analysis?</summary>

> **Answer:**
> PyChecker is a static analysis tool that detects the bugs in Python source code and warns about the style and complexity of the bug. Pylint is another tool that verifies whether the module meets the coding standard.

</details>

<details>
<summary>15. What are the built-in type does python provides?</summary>

> **Answer:**
> There are mutable and Immutable types of Pythons built in types Mutable built-in types
>
> * List
> * Sets
> * Dictionaries
>
> Immutable built-in types
>
> * Strings
> * Tuples
> * Numbers

</details>

<details>
<summary>16. What is module and package in Python?</summary>

> **Answer:**
> In Python, module is the way to structure program. Each Python program file is a module, which imports other modules like objects and attributes.
> The folder of Python program is a package of modules. A package can have modules or subfolders.

</details>

<details>
<summary>17. Mention what are the rules for local and global variables in Python?</summary>

> **Answer:**
> Local variables: If a variable is assigned a new value anywhere within the function's body, it's assumed to be local.
> Global variables: Those variables that are only referenced inside a function are implicitly global.

</details>

<details>
<summary>18. How can you share global variables across modules?</summary>

> **Answer:**
> To share global variables across modules within a single program, create a special module. Import the config module in all modules of your application. The module will be available as a global variable across modules.

</details>

<details>
<summary>19. What is namespace in Python?</summary>

> **Answer:**
> In Python, every name introduced has a place where it lives and can be hooked for. This is known as namespace. It is like a box where a variable name is mapped to the object placed. Whenever the variable is searched out, this box will be searched, to get corresponding object.

</details>

<details>
<summary>20. What is `pass` in Python?</summary>

> **Answer:**
> Pass means, no-operation Python statement, or in other words it is a place holder in compound statement, where there should be a blank left and nothing has to be written there.

</details>

<details>
<summary>21. What is unittest in Python?</summary>

> **Answer:**
> A unit testing framework in Python is known as unittest. It supports sharing of setups, automation testing, shutdown code for tests, aggregation of tests into collections etc.

</details>

<details>
<summary>22. In Python what is slicing?</summary>

> **Answer:**
> A mechanism to select a range of items from sequence types like list, tuple, strings etc. is known as slicing.

</details>

<details>
<summary>23. What is docstring in Python?</summary>

> **Answer:**
> A Python documentation string is known as docstring, it is a way of documenting Python functions, modules and classes.

</details>

<details>
<summary>24. How can you copy an object in Python?</summary>

> **Answer:**
> To copy an object in Python, you can try copy.copy () or copy.deepcopy() for the general case. You cannot copy all objects but most of them.

</details>

<details>
<summary>25. What is negative index in Python?</summary>

> **Answer:**
> Python sequences can be index in positive and negative numbers. For positive index, 0 is the first index, 1 is the second index and so forth. For negative index, (-1) is the last index and (-2) is the second last index and so forth.

</details>

<details>
<summary>26. What is iterable comprehensions? What comprehensions do you know?</summary>

> **Answer:**
> Comprehensions are constructs that allow sequences to be built from other sequences. Python has list, generator, dict and set comprehensions.

</details>

### Functions

<details>
<summary>1. What is args and kwargs?</summary>

> **Answer:**
> \*args and \*\*kwargs allow you to pass multiple arguments or keyword arguments to a function.
> The special syntax \*args in function definitions in python is used to pass a variable number of arguments to a function. It is used to pass a non-keyworded, variable-length argument list.
> The special syntax \*\*kwargs in function definitions in python is used to pass a keyworded, variable-length argument list. We use the name kwargs with the double star. The reason is because the double star allows us to pass through keyword arguments (and any number of them).

</details>

<details>
<summary>2. What is a lambda function?</summary>

> **Answer:**
> A lambda function is a small anonymous function.
>
> `lambda` operator can have any number of arguments, but it can have only one expression. It cannot contain any statements and it returns a function object which can be assigned to any variable.
>
> ```python
> add = lambda x, y : x + y 
>
> print add(2, 3) # 5
> ```

</details>

<details>
<summary>3. Why lambda forms in python does not have statements?</summary>

> **Answer:**
> A lambda form in python does not have statements as it is used to make new function object and then return them at runtime.

</details>

## Intermediate

### Functions

<details>
<summary>1. What is closure?</summary>

> **Answer:**
> A Closure is a function object that remembers values in enclosing scopes even if they are not present in memory.
> It is a record that stores a function together with an environment: a mapping associating each free variable of the function (variables that are used locally, but defined in an enclosing scope) with the value or reference to which the name was bound when the closure was created.
> A closure—unlike a plain function—allows the function to access those captured variables through the closure’s copies of their values or references, even when the function is invoked outside their scope.

</details>

<details>
<summary>2. What is mutual default arguments problem?</summary>

> **Answer:**
> Python’s default arguments are evaluated once when the function is defined, not each time the function is called. This means that if you use a mutable default argument and mutate it, you will and have mutated that object for all future calls to the function as well.
>
> What you wrote:
>
> ```python
> def append_to(element, to=[]):
>     to.append(element)
>     return to
> ```
>
> What you do:
>
> ```python
> my_list = append_to(12)
> print(my_list)
> my_other_list = append_to(42)
> print(my_other_list)
> ```
>
> What you expect:
>
> ```python
> [12]
> [42]
> ```
>
> What you get:
>
> ```python
> [12]
> [12, 42]
> ```

</details>

<details>
<summary>3. What is a generator in python? What `yield` keyword is used for?</summary>

> **Answer:**
> Python generators are a simple way of creating iterators.
>
> Simply speaking, a generator is a function that returns an object (iterator) which we can iterate over (one value at a time).
> If a function contains at least one yield statement (it may contain other yield or return statements), it becomes a generator function. Both yield and return will return some value from a function.
>
> The difference is that, while a return statement terminates a function entirely, yield statement pauses the function saving all its states and later continues from there on successive calls.
> Here is how a generator function differs from a normal function.
>
> * Generator function contains one or more yield statement.
> * When called, it returns an object (iterator) but does not start execution immediately.
> * Methods like **iter**() and **next**() are implemented automatically. So we can iterate through the items using next().
> * Once the function yields, the function is paused and the control is transferred to the caller.
> * Local variables and their states are remembered between successive calls.
> * Finally, when the function terminates, StopIteration is raised automatically on further calls.
>
> ```python
> # A simple generator function
> def my_gen():
>     n = 1
>     print('This is printed first')
>     # Generator function contains yield statements
>     yield n
>
>     n += 1
>     print('This is printed second')
>     yield n
>
>     n += 1
>     print('This is printed at last')
>     yield n
> ```

</details>

<details>
<summary>4. What is a decorator?</summary>

> **Answer:**
> In Python, functions are the first class objects, which means that –
>
> * Functions are objects; they can be referenced to, passed to a variable and returned from other functions as well.
> * Functions can be defined inside another function and can also be passed as argument to another function.
>
> Decorators are very powerful and useful tool in Python since it allows programmers to modify the behavior of function or class. Decorators allow us to wrap another function in order to extend the behavior of wrapped function, without permanently modifying it.
>
> In Decorators, functions are taken as the argument into another function and then called inside the wrapper function.
>
> ```python
> # defining a decorator 
> def hello_decorator(func):
>     # inner1 is a Wrapper function in  
>     # which the argument is called 
>
>     # inner function can access the outer local 
>     # functions like in this case "func" 
>     def inner1():
>         print("Hello, this is before function execution")
>
>         # calling the actual function now 
>         # inside the wrapper function. 
>         func()
>
>         print("This is after function execution")
>
>     return inner1
>
> # defining a function, and decorating it
> @hello_decorator
> def function_to_be_used():
>     print("This is inside the function !!")
>
> # calling the function 
> function_to_be_used()
>
> # another way to decorate the function is simply call
> # the decorator and pass function as an argument
> # result is the same
> function_to_be_used = hello_decorator(function_to_be_used)
> ```

</details>

### Built-ins

<details>
<summary>1. What Python provides to provide capabilities to write code in functional way?</summary>

> **Answer:**
> Python provides comprehensions and functions like map, filter and reduce to facilitate function programming support.

</details>

<details>
<summary>2. What package provides you functions to interact with operation system, make syscalls, access enviroment variables and etc.?</summary>

> **Answer:**
> os - miscellaneous operating system interfaces. This module provides a portable way of using operating system dependent functionality. If you just want to read or write a file see open(), if you want to manipulate paths, see the os.path module, and if you want to read all the lines in all the files on the command line see the fileinput module. For creating temporary files and directories see the tempfile module, and for high-level file and directory handling see the shutil module.

</details>

<details>
<summary>3. What are setattr, getattr, hasattr builtins?</summary>

> **Answer:**
> These methods allow to achieve reflection in applications.Reflection is the ability of a computer program to examine and modify its own properties at runtime.
> hasattr helps us to check whether an attribute is present in an object. If the object has the given attribute, hasattr will return True. Otherwise, it will return False. Theoretically, this gives a program the ability to examine its own properties.
> getattr is used to retrieve a value from an object, if you have the attribute name as a string object. The usual way of accessing attribute values in python is obj.attribute_name.
> setattr takes 3 parameters and all 3 are required. First one is the object to which the value has to be set, the second one is the name of the attribute, and the third one is the value to set. The value need not be a string. It can be any python object.

</details>

<details>
<summary>4. What Python dir function does?</summary>

> **Answer:**
> dir() tries to return a valid list of attributes of the object it is called upon. Also, dir() function behaves rather differently with different type of objects, as it aims to produce the most relevant one, rather than the complete information.
> For Class Objects, it returns a list of names of all the valid attributes and base attributes as well.
> For Modules/Library objects, it tries to return a list of names of all the attributes, contained in that module.
> If no parameters are passed it returns a list of names in the current local scope.

</details>

<details>
<summary>5. What is collections module?</summary>

> **Answer:**
> Collections module implements specialized container datatypes providing alternatives to Python’s general purpose built-in containers, dict, list, set, and tuple.
>
> | Data structure | Description                                                          |
> | -------------- | -------------------------------------------------------------------- |
> | namedtuple()   | factory function for creating tuple subclasses with named fields     |
> | deque          | list-like container with fast appends and pops on either end         |
> | ChainMap       | dict-like class for creating a single view of multiple mappings      |
> | Counter        | dict subclass for counting hashable objects                          |
> | OrderedDict    | dict subclass that remembers the order entries were added            |
> | defaultdict    | dict subclass that calls a factory function to supply missing values |
> | UserDict       | wrapper around dictionary objects for easier dict subclassing        |
> | UserList       | wrapper around list objects for easier list subclassing              |
> | UserString     | wrapper around string objects for easier string subclassing          |

</details>

### File IO

<details>
<summary>1. What is pickling and unpickling?</summary>

> **Answer:**
> Pickle module accepts any Python object and converts it into a string representation and dumps it into a file by using dump function, this process is called pickling. While the process of retrieving original Python objects from the stored string representation is called unpickling.

</details>

<details>
<summary>2. How can files be deleted in Python?</summary>

> **Answer:**
> To delete a file in Python, you need to import the OS Module. After that, you need to use the os.remove() function.
>
> ```python
> import os
> os.remove("xyz.txt")
> ```

</details>

<details>
<summary>3. What modes for opening files do you know?</summary>

> **Answer:**
> **r** - Opens a file for reading only. The file pointer is placed at the beginning of the file. This is the default mode.
>
> **rb** - Opens a file for reading only in binary format. The file pointer is placed at the beginning of the file. This is the default mode.
>
> **r+** - Opens a file for both reading and writing. The file pointer will be at the beginning of the file.
>
> **rb+** - Opens a file for both reading and writing in binary format. The file pointer will be at the beginning of the file.
>
> **w** - Opens a file for writing only. Overwrites the file if the file exists. If the file does not exist, creates a new file for writing.
>
> **wb** - Opens a file for writing only in binary format. Overwrites the file if the file exists. If the file does not exist, creates a new file for writing.
>
> **w+** - Opens a file for writing only in binary format. Overwrites the file if the file exists. If the file does not exist, creates a new file for writing.
>
> **wb+** - Opens a file for both writing and reading in binary format. Overwrites the existing file if the file exists. If the file does not exist, creates a new file for reading and writing.
>
> **a** - Opens a file for appending. The file pointer is at the end of the file if the file exists. That is, the file is in the append mode. If the file does not exist, it creates a new file for writing.
>
> **ab** - Opens a file for appending in binary format. The file pointer is at the end of the file if the file exists. That is, the file is in the append mode. If the file does not exist, it creates a new file for writing.
>
> **a+** - Opens a file for both appending and reading. The file pointer is at the end of the file if the file exists. The file opens in the append mode. If the file does not exist, it creates a new file for reading and writing.
>
> **ab+** - Opens a file for both appending and reading in binary format. The file pointer is at the end of the file if the file exists. The file opens in the append mode. If the file does not exist, it creates a new file for reading and writing.

</details>

### OOP

<details>
<summary>1. Explain Inheritance in Python.</summary>

> **Answer:**
> Inheritance allows One class to gain all the members(say attributes and methods) of another class. Inheritance provides code reusability, makes it easier to create and maintain an application. The class from which we are inheriting is called super-class and the class that is inherited is called a derived / child class.
>
> They are different types of inheritance supported by Python:
>
> 1. Single Inheritance – where a derived class acquires the members of a single super class.
> 2. Multi-level inheritance – a derived class d1 in inherited from base class base1, and d2 are inherited from base2.
> 3. Hierarchical inheritance – from one base class you can inherit any number of child classes
> 4. Multiple inheritance – a derived class is inherited from more than one base class.

</details>

<details>
<summary>2. What is a magic method?</summary>

> **Answer:**
> Magic methods in Python are the special methods which add "magic" to your class. Magic methods are not meant to be invoked directly by you, but the invocation happens internally from the class on a certain action. For example, when you add two numbers using the `+` operator, internally, the `__add__()` method will be called.
>
> ```python
> num=10
> num + 5 # 15
> num.__add__(5) # 15
> ```
>
> Magic methods are most frequently used to define overloaded behaviours of predefined operators in Python. For instance, arithmetic operators by default operate upon numeric operands. This means that numeric objects must be used along with operators like `+`, `-`, `*`, `/`, etc. The `+` operator is also defined as a concatenation operator in string, list and tuple classes. We can say that the `+` operator is overloaded.
>
> In order to make the overloaded behaviour available in your own custom class, the corresponding magic method should be overridden. For example, in order to use the `+` operator with objects of a user-defined class, it should include the `__add__()` method.
>
> Some of magic methods include:
>
> * `__init__` - to get called when creating an instance of the class for intitialization
> * `__int__` - to get called by built-int int() method to convert a type to an int
> * `__repr__` - to get called by built-int repr() method to return a machine readable representation of a type
> * `__getattr__` - is called when the accessing attribute of a class that does not exist.

</details>

<details>
<summary>How is encapsulation implemented in python? What is the difference
between `_a`, `__a` and `__a__` attribute names?</summary>

> **Answer:**
> Encapsulation is the packing of data and functions operating on that data into a single component and restricting the access to some of the object’s components.
>
> Encapsulation means that the internal representation of an object is generally hidden from view outside of the object’s definition.
>
> Python follows the philosophy of we’re all adults here with respect to hiding
> attributes and methods; i.e. you should trust the other programmers who will
> use your classes.
>
> Python doesn’t have real private methods, so one underline in the beginning of a method or attribute means you shouldn’t access this method.But this is just convention.I can still access the the variables with single underscore.
>
> Difference between underscore usage:
>
> * `_single_leading_underscore`: weak "internal use" indicator. E.g.
>
> ```python
> from M import *
> ```
>
> does not import objects which name starts with an underscore.
>
> * `single_trailing_underscore_`: used by convention to avoid conflicts with Python keyword, e.g.
>
> ```python
> Tkinter.Toplevel(master, class_='ClassName')
> ```
>
> * `__double_leading_underscore`: when naming a class attribute, invokes name mangling (inside class `FooBar`, `__boo` becomes `_FooBar__boo`).
>
> * `__double_leading_and_trailing_underscore__`: "magic" objects or attributes that live in user-controlled namespaces. E.g. `__init__`,  `__import__` or `__file__`. Never invent such names; only use them as documented.

</details>

<details>
<summary>3. What is a metaclass?</summary>

> **Answer:**
> A metaclass is the class of a class. A class defines how an instance of the class (i.e. an object) behaves while a metaclass defines how a class behaves. A class is an instance of a metaclass.
>
> While in Python you can use arbitrary callables for metaclasses, the better approach is to make it an actual class itself. `type` is the usual metaclass in Python. `type` is itself a class, and it is its own `type`. You won't be able to recreate something like `type` purely in Python, but Python cheats a little. To create your own metaclass in Python you really just want to subclass `type`.
>
> A metaclass is most commonly used as a class-factory. When you create an object by calling the class, Python creates a new class (when it executes the 'class' statement) by calling the metaclass. Combined with the normal `__init__` and `__new__` methods, metaclasses therefore allow you to do 'extra things' when creating a class, like registering the new class with some registry or replace the class with something else entirely.
>
> When the class statement is executed, Python first executes the body of the class statement as a normal block of code. The resulting namespace (a dict) holds the attributes of the class-to-be. The metaclass is determined by looking at the baseclasses of the class-to-be (metaclasses are inherited), at the `__metaclass__` attribute of the class-to-be (if any) or the `__metaclass__` global variable. The metaclass is then called with the name, bases and attributes of the class to instantiate it.
>
> However, metaclasses actually define the type of a class, not just a factory for it, so you can do much more with them. You can, for instance, define normal methods on the metaclass. These metaclass-methods are like classmethods in that they can be called on the class without an instance, but they are also not like classmethods in that they cannot be called on an instance of the class. `type.__subclasses__()` is an example of a method on the `type` metaclass. You can also define the normal 'magic' methods, like `__add__`, `__iter__` and `__getattr__`, to implement or change how the class behaves.

</details>

<details>

<summary>4. What Is Hashable object?</summary>

> **Answer:**
>
> An object is hashable if it has a hash value which never changes during its lifetime (it needs a `__hash__()` method), and can be compared to other objects (it needs an `__eq__()` method). Hashable objects which compare equal must have the same hash value.
> Hashability makes an object usable as a dictionary key and a set member, because these data structures use the hash value internally.
> Most of Python’s immutable built-in objects are hashable; mutable containers (such as lists or dictionaries) are not; immutable containers (such as tuples and frozensets) are only hashable if their elements are hashable. Objects which are instances of user-defined classes are hashable by default. They all compare unequal (except with themselves), and their hash value is derived from their id().

</details>

## Advanced

### Asynchronous programming

<details>

<summary>1. How is Multithreading achieved in Python?</summary>

> **Answer:**
>
> Python has a multi-threading package but if you want to multi-thread to speed your code up, then it’s usually not a good idea to use it.
> Python has a construct called the Global Interpreter Lock (GIL). The GIL makes sure that only one of your ‘threads’ can execute at any one time. A thread acquires the GIL, does a little work, then passes the GIL onto the next thread.
> This happens very quickly so to the human eye it may seem like your threads are executing in parallel, but they are really just taking turns using the same CPU core.
> All this GIL passing adds overhead to execution. This means that if you want to make your code run faster then using the threading package often isn’t a good idea.

</details>

<details>

<summary>2. What is asyncio?</summary>

> **Answer:**
>
> asyncio is a library to write concurrent code using the async/await syntax.
> asyncio is used as a foundation for multiple Python asynchronous frameworks that provide high-performance network and web-servers, database connection libraries, distributed task queues, etc.
> asyncio is often a perfect fit for IO-bound and high-level structured network code.

</details>

<details>
<summary>3. What is the Python GIL?</summary>

> **Answer:**
> The Python Global Interpreter Lock or GIL, in simple words, is a mutex (or a lock) that allows only one thread to hold the control of the Python interpreter.
> This means that only one thread can be in a state of execution at any point in time. The impact of the GIL isn’t visible to developers who execute single-threaded programs, but it can be a performance bottleneck in CPU-bound and multi-threaded code.
> Since the GIL allows only one thread to execute at a time even in a multi-threaded architecture with more than one CPU core, the GIL has gained a reputation as an “infamous” feature of Python.

</details>

<details>
<summary>4. How does await works in python?</summary>

> **Answer:**
> await , similar to yield from , suspends the execution of the coroutine until the awaitable it takes completes and returns the result. async function result (coroutines) is meant to be added to event-loop. Yes. await creates "bridge" between event-loop and awaited coroutine (enabling the next point).

</details>

### Garbage Collection

<details>
<summary>1. What is garbage collection in Python?</summary>

> **Answer:**
>
> Python deletes unwanted objects (built-in types or class instances) automatically to free the memory space. The process by which Python periodically frees and reclaims blocks of memory that no longer are in use is called Garbage Collection.

</details>

<details>
<summary>2. How does garbage collection works in Python?</summary>

> **Answer:**
> Python's garbage collector runs during program execution and is triggered when an object's reference count reaches zero. An object's reference count changes as the number of aliases that point to it changes.
>
> An object's reference count increases when it is assigned a new name or placed in a container (list, tuple, or dictionary). The object's reference count decreases when it's deleted with del, its reference is reassigned, or its reference goes out of scope. When an object's reference count reaches zero, Python collects it automatically.

</details>

<details>
<summary>3. How memory is managed in Python?</summary>

> **Answer:**
> Python memory is managed by Python private heap space. All Python objects and data structures are located in a private heap. The programmer does not have an access to this private heap and interpreter takes care of this Python private heap.
> The allocation of Python heap space for Python objects is done by Python memory manager. The core API gives access to some tools for the programmer to code.
> Python also have an inbuilt garbage collector, which recycle all the unused memory and frees the memory and makes it available to the heap space.

</details>

<details>
<summary>4. What module provides an interface to the optional garbage collector?</summary>

> **Answer:**
> gc

</details>
