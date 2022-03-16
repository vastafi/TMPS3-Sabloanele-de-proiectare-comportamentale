package Observer;

public class AverageTime {
    private float time;
    private int score;

    public void update(int runs, int score, float operations)
    {
        this.time = (float)runs/operations;
        this.score = (int) (this.time * 50);
        display();
    }

    public void display()
    {
        System.out.println("\nAverage ATM response time:\n" +
                "Time: " + time +
                "\nScore: " + score);
    }
}
