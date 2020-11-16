package com.company;

public class Stack extends LinkedList{

    public void push(Object value){
        add( 0, value);
    }


    public Object pop(){
        Object poop = get(0);
        remove(0);
        return poop;
    }


    public Object peek () {
        return get(size()-1);
    }
}
