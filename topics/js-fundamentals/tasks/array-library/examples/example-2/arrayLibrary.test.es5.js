var testArray = ["Item1", "Item2", "Item3"];

function foreachFunction(_, index, sourceArray) {
    sourceArray[index] += "!"
}

function filterFunction(item) {
    return item == "Item2";
}

function reduceFunction(result, item) {
    return result + item + ", ";
}

function mapFunction(item) {
    return "modified " + item;
}

const arrayLibrary = new ArrayLibrary();

console.log(arrayLibrary
    .chain([1, 2, 3])
    .take(2)
    .map(mapFunction)
    .value());

console.log(arrayLibrary
    .chain([1, 2, 3])
    .take(2)
    .map(mapFunction)
    .foreach(foreachFunction)
    .skip(1)
    .value());

console.log("Take command result " + arrayLibrary.take(testArray, 1));
console.log("Skip command result " + arrayLibrary.skip(testArray, -1));
console.log("Map command result " + arrayLibrary.map(testArray, mapFunction));
console.log("Reduce command result " + arrayLibrary.reduce(testArray, reduceFunction, "Sequence of elements: "));
console.log("Filter command result " + arrayLibrary.filter(testArray, filterFunction));
console.log("ForEach command result " + arrayLibrary.foreach(testArray, foreachFunction));