package Observer;

public class CurrentTime {
        private float time;
        private int score;
        private float operations;

        public void update(int time,int score,float operations){
            this.time = time;
            this.score = score;
            this.operations = operations;
            display();
        }

        public void display(){
            System.out.println("\nCurrent ATM response time: \n" +
                    "Time: " + time +"\nScore:"
                    + score + "\nOperations: " + operations);
        }
    }
