package process.view;

import java.util.List;

import static common.util.Constant.DIVIDING_STRIP;

public class ProcessOutputView {

    public void printSourceArray(final List<? extends Number> values) {
        System.out.println();
        System.out.println("S O U R C E   A R R A Y");
        System.out.println(DIVIDING_STRIP);
        for (var i = 0; i < values.size(); i++) {
            System.out.println("[" + (i+1) + "] - " + values.get(i));
        }
    }

    public void printMaxValue(final Number value) {
        System.out.println();
        System.out.println("M A X I M U M   V A L U E");
        System.out.println(DIVIDING_STRIP);
        System.out.println(value);
    }

    public void printCountOfPrime(final Number value) {
        System.out.println();
        System.out.println("C O U N T   P R I M E");
        System.out.println(DIVIDING_STRIP);
        System.out.println(value);
    }

    public void printArrayWithExchangePosition(final List<? extends Number> values) {
        System.out.println();
        System.out.println("E X C H A N G E   P O S I T I O N   A R R A Y");
        System.out.println(DIVIDING_STRIP);
        for (var i = 0; i < values.size(); i++) {
            System.out.println("[" + (i+1) + "] - " + values.get(i));
        }
    }

}
