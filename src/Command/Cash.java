package Command;

public class Cash {
        private String name = "User";
        private int amount = 100;

        public void buy(){
            System.out.println("Cash [ Name: "+name+", Amount:" + amount +" ] by account");
        }
        public void extract(){
            System.out.println("Cash [ Name: "+name+", Amount:" + amount +" ] by card");
        }
}
