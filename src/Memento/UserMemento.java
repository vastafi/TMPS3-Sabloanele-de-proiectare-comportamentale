package Memento;

public class UserMemento implements Memento {
    private float sold;
    public UserMemento(float sold) {
        super();
        this.sold = sold;
    }
    public float getSold() {
        return sold;
    }
    public void setSold(float sold) {
        this.sold = sold;
    }
}