package process.service;

import java.util.List;

public interface ProcessService<T extends Number> {

    Integer countPrime(final List<T> values);

    List<T> exchangePosition(final List<T> values);

    T getMaxValue(final List<T> values);

    List<? extends Number> generateList(final String type, final int length);

}
