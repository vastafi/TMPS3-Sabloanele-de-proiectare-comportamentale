package Visitor;

public class TestVisitor {
    private static int calculateTotal(Machine[] machines) {
        ATMInspector inspector = new ATMInspection();
        int total = 0;
        for(Machine machine : machines){
            total = total + machine.accept(inspector);
        }
        return total;
    }
    public static void main(String[] args) {
        Machine[] machine = new Machine[]{
                new ATM("Mobiasbank", "str. Tighina", 10),
                new CashInATM("Agroimbank","str.Mircea cel Batrin","cash in",10,"romanian")
        };
        int totalCost = calculateTotal(machine);
        System.out.println("---------------------------------");
        System.out.println("Total Sold Machines: " + totalCost);
    }
}