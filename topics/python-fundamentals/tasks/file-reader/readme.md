# File Reader

## Short Description

Implement a file reader which reads files line by line.

## Estimation (h)

4

## Topics

* Generators
* Files

## Requirements

You need to implement a file reader which reads files line by line. File list is defined on using command line
arguments(in sys.argv). After displaying each line, the program waits for user's input. The user is available to:

* press Enter to read the next line
* press n and Enter to skip the rest of the current file and start reading the next file
* press anything else and Enter to display the next line

Function to display files:

```python
class SkipThisFile(Exception):
   r"Tells the generator to jump to the next file in list."
   pass

def display_files(*files):
    source = read_lines(*files)
    for line in source:
        print(line, end='')
        inp = input()
        if inp == 'n':
            print('NEXT')
            source.throw(SkipThisFile) # return value is ignored
```

* Function which displays lines and queries the user for input is already implemented.
* Implement generator `read_lines` which is passed a list of files to read during construction
* Generator should yield line after line from the first file, then from the second, and so on.
* When the last file is read, it stops.
* User of the generator can also throw an exception into the generator (SkipThisFile) which signals the generator to
  skip the rest of the current file, and just yield a dummy value to be skipped.
