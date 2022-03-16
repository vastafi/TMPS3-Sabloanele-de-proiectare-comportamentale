package Memento;

public class UserState implements State {
    @Override
    public void addMemento(Memento memento) {
        stack.push(memento);
    }
    @Override
    public Memento getMemento() {
        return stack.pop();
    }
}