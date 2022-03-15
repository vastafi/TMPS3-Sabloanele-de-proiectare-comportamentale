package State;

public class TestState {

    public static void main(String[] args){

        ATM atm = new ATM();
        System.out.println("------------------------------------");
        System.out.println("The card was inserted into the ATM");
        System.out.println("------------------------------------");
        atm.insertCard();
        atm.insertPin(1111);
        System.out.println("------------------------------------");
        System.out.println("We want to get money out of the card");
        System.out.println("------------------------------------");
        atm.requestCash(200);
        System.out.println("------------------------------------");
        System.out.println("The case when we enter the wrong PIN");
        System.out.println("------------------------------------");
        atm.insertCard();
        atm.insertPin(1112);
        System.out.println("------------------------------------");
         }


}