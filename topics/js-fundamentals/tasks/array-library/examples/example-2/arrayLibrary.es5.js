function ArrayLibrary() {

    function take(array, n) {
        return (n > 0) ? array.slice(0, n) : [];
    }

    function skip(array, n) {
        return (n > 0) ? array.slice(n) : array;
    }

    function map(array, callback) {
        return array.map(callback);
    }

    function reduce(array, callback, initialValue) {
        return array.reduce(callback, initialValue);
    }

    function filter(array, callback) {
        return array.filter(callback);
    }

    function foreach(array, callback) {
        array.forEach(callback);
        return array;
    }

    function chain(array) {
        return new ArrayChainLibrary(array);
    }

    function ArrayChainLibrary(array) {
        var _queue = [];

        return {
            take: function (number) {
                _queue.push(function () {
                    return take(array, number)
                });

                return this;
            },
            skip: function (number) {
                _queue.push(function () {
                    return skip(array, number)
                });

                return this;
            },
            map: function (callback) {
                _queue.push(function () {
                    return map(array, callback)
                });

                return this;
            },
            reduce: function (callback, initialValue) {
                _queue.push(function () {
                    return reduce(array, callback, initialValue)
                });

                return this;
            },
            filter: function (callback) {
                _queue.push(function () {
                    return filter(array, callback)
                });

                return this;
            },
            foreach: function (callback) {
                _queue.push(function () {
                    return foreach(array, callback)
                });

                return this;
            },
            value: function () {
                _queue.forEach(function (fn) {
                    array = fn();
                });

                return array;
            }
        }
    }

    return {
        take: take,
        skip: skip,
        map: map,
        reduce: reduce,
        filter: filter,
        foreach: foreach,
        chain: chain
    }
}