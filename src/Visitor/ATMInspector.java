package Visitor;

public interface ATMInspector {
    int visit(ATM atm);
    int visit(CashInATM cashInATM);
  }
