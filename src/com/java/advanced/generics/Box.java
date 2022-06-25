package com.java.advanced.generics;

public class Box <T>{
    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Box{" +
                "type=" + type +
                '}';
    }
}
