package Mediator;

import java.util.ArrayList;

public class ActionMediator implements Mediator {
    private ArrayList<Operations> operation;

    public ActionMediator(){
        operation = new ArrayList<>();
    }

    @Override
    public void addOperations(Operations operations){
        operation.add(operations);
        System.out.println(operations.nameOperation + " was completed");
    }

    public void find(){
        int a = 0;
        Operations oper = null;
           for(Operations b: operation) {
                if (b.amount > a) {
                    a = b.amount;
                    oper = b;
                }
            }
            System.out.println(oper.nameOperation + oper.amount + "$");
    }
}
