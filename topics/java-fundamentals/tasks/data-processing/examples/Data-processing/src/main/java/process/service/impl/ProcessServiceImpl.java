package process.service.impl;

import process.service.ProcessService;

import java.util.*;
import java.util.stream.Collectors;

public class ProcessServiceImpl<T extends Number> implements ProcessService<T> {

    @Override
    public Integer countPrime(final List<T> values) {
        var primeCounter  = 0;
        for (T value : values) {
            var val = value.doubleValue() % 1;
            if (val == 0 && value.doubleValue() > 1) {
                if (isPrime(value.longValue())) {
                    primeCounter++;
                }
            }
        }
        return primeCounter;
    }

    @Override
    public List<T> exchangePosition(final List<T> values) {
        var firstPosition = (int) ((Math.random() * (((values.size() - 1)) + 1)) + 0);
        var secondPosition = (int) ((Math.random() * (((values.size() - 1)) + 1)) + 0);
        var valueBuffer = values.get(firstPosition);
        values.set(firstPosition, values.get(secondPosition));
        values.set(secondPosition, valueBuffer);
        return values;
    }

    @Override
    public T getMaxValue(final List<T> values) {
        var arr = values.stream().map(Number::doubleValue).collect(Collectors.toList());
        var max = Collections.max(arr);
        return (T) max;
    }

    @Override
    public List<? extends Number> generateList(final String type, final int length) {
        List<? extends Number> values;

        switch (type) {
            case "Integer":
                values = generateNumbers(length).stream().map(Number::intValue).collect(Collectors.toList());
                break;
            case "Long":
                values = generateNumbers(length).stream().map(Number::longValue).collect(Collectors.toList());
                break;
            case "Short":
                values = generateNumbers(length).stream().map(Number::shortValue).collect(Collectors.toList());
                break;
            case "Byte":
                values = generateNumbers(length).stream().map(Number::byteValue).collect(Collectors.toList());
                break;
            case "Double":
                values = generateNumbers(length).stream().map(Number::doubleValue).collect(Collectors.toList());
                break;
            case "Float":
                values = generateNumbers(length).stream().map(Number::floatValue).collect(Collectors.toList());
                break;
            default:
                values = List.of();
                System.out.println(" TO DO EXCEPTION");
        }

        return values;
    }

    private List<Number> generateNumbers(final int length) {
        final List<Number> values = new ArrayList<>();

        for (var i = 0; i < length; i++) {
            var value = (Number) ((Math.random() * ((1000 - 1) + 1)) + 1);
            values.add(value);
        }
        return values;
    }

    private boolean isPrime(final Long value) {
        for (var i = 1; i <= value; i++) {
            if ((value % i) == 0) {
                if (i != 1 && i != value) {
                    return false;
                }
            }
        }
        return true;
    }


}
