package Mediator;

public abstract class Operations {
    protected Mediator mediator;
    protected String nameOperation;
    protected int amount;

    public Operations(Mediator mediator, String nameOperation)
    {
        this.mediator =mediator;
        this.nameOperation = nameOperation;
    }

    public abstract void adding(int amount);

    public abstract void cancel();
}
