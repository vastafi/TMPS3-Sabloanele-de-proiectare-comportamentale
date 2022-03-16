package Memento;

import java.util.Stack;

public interface State {
    Stack<Memento> stack = new Stack<Memento>();
    void addMemento(Memento memento);
    Memento getMemento();
}