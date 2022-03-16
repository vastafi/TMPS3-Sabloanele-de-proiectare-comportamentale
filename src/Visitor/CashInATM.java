package Visitor;

public class CashInATM implements Machine{

    private String bank;
    private String street;
    private String type;
    private int date;
    private String internationalization;

    public CashInATM(String bank, String street, String type, int date,String internationalization)
    {
        this.bank = bank;
        this.street = street;
        this.type= type;
        this.date = date;
        this.internationalization = internationalization;
    }

    public String getBank(){
        return bank;
    }

    public String getStreet(){
        return street;
    }

    public int getDate(){
            return date;
    }

    public String getType(){
        return type;
    }

    public String getInternationalization(){
        return internationalization;
    }
    @Override
    public int accept(ATMInspector atmInspector){
        return atmInspector.visit(this);
    }
}
