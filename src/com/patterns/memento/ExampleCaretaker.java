package com.patterns.memento;


import java.util.ArrayDeque;
import java.util.Deque;

public class ExampleCaretaker {
    final Deque<ExampleMemento> mementos = new ArrayDeque<>();
    public ExampleMemento getMemento()
    {
        ExampleMemento exampleMemento= mementos.pop();
        return exampleMemento;
    }
    public void addMemento(ExampleMemento memento)
    {
        mementos.push(memento);
    }
}