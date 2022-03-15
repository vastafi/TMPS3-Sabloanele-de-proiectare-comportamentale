package State;

public class HasCard implements ATMState {

    ATM atm;

    public HasCard(ATM newATM){
        atm = newATM;
    }

    public void insertCard() {
        System.out.println("You can only insert the card once");
    }

    public void ejectCard() {
        System.out.println("Card is ejected");
        atm.setATMState(atm.getNoCardState());

    }

    public void requestCash(int cashToWithdraw) {
        System.out.println("You have not entered your PIN");
    }

    public void insertPin(int pinEntered) {

        if(pinEntered == 1111){

            System.out.println("Entered the correct PIN");
            atm.correctPinEntered = true;
            atm.setATMState(atm.getHasPin());

        } else {

            System.out.println("Wrong PIN");
            atm.correctPinEntered = false;
            System.out.println("Card is ejected");
            atm.setATMState(atm.getNoCardState());

        }
    }
}
