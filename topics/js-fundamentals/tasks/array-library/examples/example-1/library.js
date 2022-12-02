'use strict';

class ArrayLib {    
    static take(array, n) {
        if(n <= 0) {
            return [];
        }
    
        const max = n > array.length ? array.length : n;
        const result = [];
    
        for(let i = 0; i < max; i++) {
            result.push(array[i]);
        }

        return result;
    }

    static skip(array, n) {    
        if(n < 0 || n > array.length) {
            return [];
        }
    
        const result = [];
        for(let i = n; i < array.length; i++) {
            result.push(array[i]);
        }

        return result;
    }

    static map(array, callback) {    
        const result = [];

        for(let i = 0; i < array.length; i++) {
            result.push(callback(array[i]));
        }

        return result;
    }

    static reduce(array, callback, initialValue) {
        let i = 0;
        const result = initialValue !== undefined ? initialValue : array[i++];

        for(; i < array.length; i++) {
            result = callback(result, array[i], i, array);
        }

        return result;
    }

    static filter(array, callback) {
        
        const result = [];

        for(let i = 0; i < array.length; i++) {
            if(callback(array[i])) {
                result.push(array[i]);
            }
        }

        return result;
    }

    static foreach(array, callback) {
        for(let i = 0; i < array.length; i++) {
            callback(array[i]);
        }
    }

    static chain(array) {
        return new ArrayLib.LazyArrayLib(array);
    }

    static LazyArrayLib = class {

        constructor(array) {
            this._array = array;
            this._executionQueue = [];
        }
    
        value() {
            for(let queue of this._executionQueue) {
                let result = queue();
                this._array = result === undefined ? this._array : result;
            }
            return this._array;
        }

        take(n) {
            this._executionQueue.push(() => ArrayLib.take(this._array, n));
            return this;
        }

        skip(n) {
            this._executionQueue.push(() => ArrayLib.skip(this._array, n));
            return this;
        }

        map(callback) {
            this._executionQueue.push(() => ArrayLib.map(this._array, callback));
            return this;
        }

        reduce(callback, initialValue) {
            this._executionQueue.push(() => ArrayLib.reduce(this._array, callback, initialValue));
            return this;
        }

        filter(callback) {
            this._executionQueue.push(() => ArrayLib.filter(this._array, callback));
            return this;
        }

        foreach(callback) {
            this._executionQueue.push(() => ArrayLib.foreach(this._array, callback));
            return this;
        }
    }
}
