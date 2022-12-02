package process.controller;

import process.service.ProcessService;
import process.service.impl.ProcessServiceImpl;
import process.view.ProcessInputView;
import process.view.ProcessOutputView;

public class ProcessController {

    private final ProcessService processService = new ProcessServiceImpl();

    private final ProcessInputView processInputView = new ProcessInputView();
    private final ProcessOutputView processOutputView = new ProcessOutputView();

    public void countPrime(final String type) {
        var length = processInputView.getArrayLength();
        var values = processService.generateList(type, length);
        processOutputView.printSourceArray(values);
        var countPrime = processService.countPrime(values);
        processOutputView.printCountOfPrime(countPrime);
    }

    public void exchangePosition(final String type) {
        var length = processInputView.getArrayLength();
        var values = processService.generateList(type, length);
        processOutputView.printSourceArray(values); //TO DO
        var modifiedArray = processService.exchangePosition(values);
        processOutputView.printArrayWithExchangePosition(modifiedArray);
    }

    public void getMaxValue(final String type) {
        var length = processInputView.getArrayLength();
        var values = processService.generateList(type, length);
        processOutputView.printSourceArray(values);
        var maxValue = processService.getMaxValue(values);
        processOutputView.printMaxValue(maxValue);
    }

}
