'use strict';

function ArrayLib() {    
    function take(array, n) {
        if(n <= 0) {
            return [];
        }
    
        var max = n > array.length ? array.length : n;
        var result = [];
    
        for(var i = 0; i < max; i++) {
            result.push(array[i]);
        }

        return result;
    }

    function skip(array, n) {    
        if(n < 0 || n > array.length) {
            return [];
        }
    
        var result = [];
        for(var i = n; i < array.length; i++) {
            result.push(array[i]);
        }

        return result;
    }

    function map(array, callback) {    
        var result = [];

        for(var i = 0; i < array.length; i++) {
            result.push(callback(array[i]));
        }

        return result;
    }

    function reduce(array, callback, initialValue) {
        var i = 0;
        var result = initialValue !== undefined ? initialValue : array[i++];

        for(; i < array.length; i++) {
            result = callback(result, array[i], i, array);
        }

        return result;
    }

    function filter(array, callback) {
        
        var result = [];

        for(var i = 0; i < array.length; i++) {
            if(callback(array[i])) {
                result.push(array[i]);
            }
        }

        return result;
    }

    function foreach(array, callback) {
        for(var i = 0; i < array.length; i++) {
            callback(array[i]);
        }
    }

    function chain(array) {
        return new LazyArrayLib(array);
    }

    return {
        take: take,
        skip: skip,
        map: map,
        reduce: reduce,
        filter: filter,
        foreach: foreach,
        chain: chain,
    }

    function LazyArrayLib(array) {

        var array = array;
        var executionQueue = [];
    
        return {
            value: function() {
                for(var i = 0; i < executionQueue.length; i++) {
                    var result = executionQueue[i]();
                    array = result === undefined ? array : result;
                }

                return array;
            },
            take: function(n) {
                executionQueue.push(function() { return take(array, n); });
                return this;
            },
            skip: function(n) {
                executionQueue.push(function() { return skip(array, n); });
                return this;
            },
            map: function(callback) {
                executionQueue.push(function() { return map(array, callback); });
                return this;
            },
            reduce: function(callback, initialValue) {
                executionQueue.push(function() { return reduce(array, callback, initialValue); });
                return this;
            },
            filter: function(callback) {
                executionQueue.push(function() { return filter(array, callback); });
                return this;
            },
            foreach: function(callback) {
                executionQueue.push(function() { foreach(array, callback); });
                return this;
            }
        }
    }
}
