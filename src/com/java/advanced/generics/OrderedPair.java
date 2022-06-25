package com.java.advanced.generics;

public class OrderedPair <K,V> implements Pair{
    private K keyName;
    private V value;

    public OrderedPair(K keyName, V value) {
        this.keyName = keyName;
        this.value = value;
    }

    @Override
    public Object getKey() {
        return keyName;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "OrderedPair{" +
                "keyName=" + keyName +
                ", value=" + value +
                '}';
    }
}
