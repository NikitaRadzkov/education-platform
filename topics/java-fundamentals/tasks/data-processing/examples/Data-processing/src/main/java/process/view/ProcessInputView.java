package process.view;

import static common.util.Constant.DIVIDING_STRIP;
import static common.util.Constant.SCANNER;

public class ProcessInputView {

    public int getArrayLength() {
        System.out.println();
        System.out.println("E N T E R   A R R A Y   S I Z E");
        System.out.println(DIVIDING_STRIP);
        var length = SCANNER.nextInt();
        SCANNER.nextLine();
        return length;
    }

}
