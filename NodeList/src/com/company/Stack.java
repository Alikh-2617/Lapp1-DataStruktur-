package com.company;

public class Stack extends LinkedList{

    public Object pop(){
        Object poop = get(size() - 1 );
        remove(size()-1);
        return poop;

    }

    public void push(Object item){
        add(0, item);
    }

    public Object peek () {
        return get(size()-1);
    }
}
