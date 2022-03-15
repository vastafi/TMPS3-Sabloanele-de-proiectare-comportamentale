package State;

public class NoHasCash implements ATMState {

    ATM atm;

    public NoHasCash(ATM newATM){
        atm = newATM;
    }

    public void insertCard() {
        System.out.println("We don't have any money");
        System.out.println("Your card is ejected");
    }

    public void ejectCard() {
        System.out.println("We don't have any money");
        System.out.println("There is no card to eject");
    }

    public void requestCash(int cashToWithdraw) {
        System.out.println("We don't have any money");
    }

    public void insertPin(int pinEntered) {
        System.out.println("We don't have any money");
    }
}