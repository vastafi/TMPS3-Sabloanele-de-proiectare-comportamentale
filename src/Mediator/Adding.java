package Mediator;

public class Adding extends Operations{

         public Adding (Mediator mediator,String nameOperation){
            super(mediator, nameOperation);
        }

        @Override
        public void adding(int amount){
            this.amount = amount;
        }

        @Override
        public void cancel(){
            this.amount = -1;
        }
    }

