package TemplateMethod;

public class BasicATM extends ATMTemplateParameters {
    @Override
    public boolean addParamCTD(){
        return false;
    }
      @Override
    public boolean addParamPCR(){
        return false;
    }
    @Override
    public boolean addBT(){
        return false;
    }
    @Override
    public boolean addCLR(){
        return false;
    }
}