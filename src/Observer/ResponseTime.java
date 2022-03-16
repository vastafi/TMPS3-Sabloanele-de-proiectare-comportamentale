package Observer;

public class ResponseTime {
    int runs, score;
    float operations;
    CurrentTime currentScore;
    AverageTime averageTime;

     public ResponseTime(CurrentTime currentScore,
                        AverageTime averageScore)
    {
        this.currentScore = currentScore;
        this.averageTime = averageScore;
    }


    private int getLatestRuns() {
       return 54;
    }

    private int getLatestScore(){
               return 8;
    }

    private float getLatestOperations(){
            return (float)15;
    }

    public void dataChanged(){
        runs = getLatestRuns();
        score = getLatestScore();
        operations = getLatestOperations();

        currentScore.update(runs, score, operations);
        averageTime.update(runs, score, operations);
    }
}