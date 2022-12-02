function test() {
    const result = ArrayLib
        .chain([1,2,3,4,5,6])
        .skip(1)
        .filter(a => a > 2)
        .take(2)
        .map(a => a * 2)
        .foreach(a => alert(a))
        .reduce((a, b) => a + b)
        .value();
    alert(result);
}
