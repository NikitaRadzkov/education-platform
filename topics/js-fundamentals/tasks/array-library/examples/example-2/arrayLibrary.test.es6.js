const testArray = ["Item1", "Item2", "Item3"];

console.log(ArrayLibrary
    .chain([1, 2, 3])
    .take(2)
    .map(item => item + "modified")
    .foreach((_, index, sourceArray) => sourceArray[index] += "!")
    .skip(1)
    .value());

console.log(`Take command result ${ArrayLibrary.take(testArray, 1)}`);
console.log(`Skip command result  ${ArrayLibrary.skip(testArray, -1)}`);
console.log(`Map command result ${ArrayLibrary.map(testArray, (item) => item + "modified")}`);
console.log(`Reduce command result ${ArrayLibrary
    .reduce(testArray,(result, item) => (result + item + ", "),"Sequence of elements: ")}`);
console.log(`Filter command result ${ArrayLibrary
    .filter(testArray, (item) => item == "Item2")}`);
console.log(`ForEach command result ${ArrayLibrary
    .foreach(testArray, (_, index, sourceArray) => sourceArray[index] += "!")}`);