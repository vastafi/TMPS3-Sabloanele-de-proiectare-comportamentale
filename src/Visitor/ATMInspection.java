package Visitor;

public class ATMInspection implements ATMInspector{
    public int visit(ATM atm) {
        int serviceCharge = 0;
        if(atm.getBank()=="Moldindconbank"){
            serviceCharge += 150;
        }else{
            serviceCharge += 100;
        }
        System.out.println("With the help of ATM, a transfer was made to another card: " + serviceCharge);
        return serviceCharge;
    }
    @Override
    public int visit(CashInATM cashInATM) {
        int serviceCharge = 0;
        if(cashInATM.getType()=="Cash In"){
            serviceCharge += 50;
        }else{
            serviceCharge += 10;
        }
        System.out.println("ATM is supplemented with: " + serviceCharge);
        return serviceCharge;
    }
}
