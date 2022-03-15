package Strategy;

class CreditCard implements Strategy {

        private String lastname;
        private String surname;
        private String cardNumber;
        private String cvv;
        private String expiryDate;

        public CreditCard(String lastname,String surname, String cardNumber, String cvv, String expiryDate){
            this.lastname = lastname;
            this.surname = surname;
            this.cardNumber = cardNumber;
            this.cvv = cvv;
            this.expiryDate = expiryDate;
        }
        @Override
        public void addingMoney(int amount) {
            System.out.println(amount +" $ add money to your account using the credit/debit card");
        }

    }