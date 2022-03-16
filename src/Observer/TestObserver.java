package Observer;

public class TestObserver {
    public static void main(String args[])
    {
        AverageTime  averageTime =
                new AverageTime();
        CurrentTime currentTime =
                new CurrentTime();

        ResponseTime responseTime = new  ResponseTime(currentTime,
                averageTime);

        responseTime.dataChanged();
    }
}
