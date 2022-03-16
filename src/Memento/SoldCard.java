package Memento;

public interface SoldCard {
    Memento save();

    void restore(Memento memento);
    void setSold(float sold);
}