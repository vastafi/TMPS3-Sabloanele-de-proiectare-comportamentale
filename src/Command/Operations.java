package Command;

import java.util.ArrayList;
import java.util.List;

public class Operations {
    private List<CashATM> operationsList = new ArrayList<CashATM>();

    public void takeOperations(CashATM operations){
        operationsList.add(operations);
    }

    public void placeOperations(){

        for (CashATM operations : operationsList) {
            operations.execute();
        }
        operationsList.clear();
    }
}