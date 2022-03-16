package TemplateMethod;

public class TestTemplateMethod {
    public static void main(String[] args)
    {
        BasicATM  basicATM = new BasicATM ();
        System.out.println("---------------------------------");
        System.out.println("Basic ATM");
        System.out.println("---------------------------------");
        basicATM.build();

        System.out.println("---------------------------------");
        System.out.println("Modern ATM");
        System.out.println("---------------------------------");
        ModernATM modernATM = new  ModernATM();
        modernATM.build();
      }
}