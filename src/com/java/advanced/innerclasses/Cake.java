package com.java.advanced.innerclasses;

import com.java.advanced.enumcoding.Size;

public class Cake {
    private String name;
    private Size size;

    public Cake(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public CakeSlice cutCakeSlice() {
        return new CakeSlice();
    }

    class CakeSlice {
        public String cakeSlice() {
            switch (size) {
                case SMALL:
                    return "Small sliced cake";
                case MEDIUM:
                    return "Medium sliced cake";
                case LARGE:
                    return "Large sliced cake";
                default:
                    return "unknown slice!";
            }
        }

    }
}
