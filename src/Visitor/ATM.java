package Visitor;

public class ATM implements Machine{
    private String bank;
    private String street;
    private int date;

    public ATM( String bank, String street, int date)
    {
        this.bank = bank;
        this.street = street;
        this.date = date;
    }

    public String getBank(){
        return bank;
    }

    public String getStreet() {
        return street;
    }

    public int getDate(){
        return date;
    }
        @Override
        public int accept(ATMInspector atmInspector) {
            return atmInspector.visit(this);
        }
    }

