package Mediator;

public class TestMediator {
    public static void main(String[] args)
    {
        ActionMediator mediator = new ActionMediator();
        System.out.println("-----------------------------------------------");
        Operations op1 = new Adding(mediator, "Cash withdrawal ");
        Operations op2 = new Adding(mediator, "Transfer to another account ");
        Operations op3 = new Adding(mediator, "Add to card ");

        mediator.addOperations(op1);
        mediator.addOperations(op2);
        mediator.addOperations(op3);

        System.out.println("You have successfully completed the required operations.");
        System.out.println("-----------------------------------------------");
        System.out.println("Please wait for the next request...");
        op3.adding(100);
        System.out.println("-----------------------------------------------");
        mediator.find();

        op2.cancel();
        System.out.print(op2.nameOperation + "\nThe work with the ATM has been completed");

    }
}