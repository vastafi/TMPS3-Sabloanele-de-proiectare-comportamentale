package State;

public class ATM {

    ATMState hasCard;
    ATMState noHasCard;
    ATMState correctPin;
    ATMState noMoneyATM;
    ATMState noButton;

    ATMState atmState;

    int cashIn = 2000;
    boolean correctPinEntered = false;

    public ATM(){

        hasCard = new HasCard(this);
        noHasCard = new NoHasCard(this);
        correctPin = new HasPin(this);
        noMoneyATM = new NoHasCash(this);

        atmState = noHasCard;

        if(cashIn < 0){
            atmState = noMoneyATM;
        }
    }

    void setATMState(ATMState newATMState){
        atmState = newATMState;
    }

    public void setCashIn(int newCashInMachine){
        cashIn = newCashInMachine;
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void requestCash(int cashToWithdraw) {
        atmState.requestCash(cashToWithdraw);
    }
    public void insertPin(int pinEntered){
        atmState.insertPin(pinEntered);
    }

    public ATMState getYesCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noHasCard;
    }

    public ATMState getHasPin() {
        return correctPin;
    }

    public ATMState getNoCashState() {
        return noMoneyATM;
    }


}