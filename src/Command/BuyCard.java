package Command;

public class BuyCard implements CashATM{
          private final Cash user;

        public BuyCard(Cash user){
            this.user = user;
        }

        public void execute() {
            user.buy();
        }
    }

