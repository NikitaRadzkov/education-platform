class ArrayLibrary {

    static take(array, n) {
        return (n > 0) ? array.slice(0, n) : [];
    }

    static skip(array, n) {
        return (n > 0) ? array.slice(n) : array;
    }

    static map(array, callback) {
        return array.map(callback);
    }

    static reduce(array, callback, initialValue) {
        return array.reduce(callback, initialValue);
    }

    static filter(array, callback) {
        return array.filter(callback);
    }

    static foreach(array, callback) {
        array.forEach(callback);
        return array;
    }

    static chain(array) {
        return new ArrayChainLibrary(array);
    }
}

class ArrayChainLibrary {

    constructor(_array) {
        this._array = _array;
        this._queue = [];
    }

    take(n) {
        this._queue.push(() => ArrayLibrary.take(this._array, n));

        return this;
    }

    skip(n) {
        this._queue.push(() => ArrayLibrary.skip(this._array, n));

        return this;
    }

    map(callback) {
        this._queue.push(() => ArrayLibrary.map(this._array, callback));

        return this;
    }

    reduce(callback, initialValue) {
        this._queue.push(() => ArrayLibrary.reduce(this._array, callback, initialValue));

        return this;
    }

    filter(callback) {
        this._queue.push(() => ArrayLibrary.filter(this._array, callback));

        return this;
    }

    foreach(callback) {
        this._queue.push(() => ArrayLibrary.foreach(this._array, callback));

        return this;
    }

    value() {
        ArrayLibrary.foreach(this._queue,(currentValue) =>
            this._array = currentValue()
        );

        return this._array;
    }
}