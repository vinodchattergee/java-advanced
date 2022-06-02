package com.java.advanced.innerclasses.staticnested;

import com.java.advanced.enumcoding.Size;

public class Pizza {
    private String name;
    private Size size;
    private boolean isExtraCheeseNeeded;
    private boolean isSaladNeeded;

    private Pizza(Builder builder) {
        this.name=builder.name;
        this.size=builder.size;
        this.isExtraCheeseNeeded=builder.isExtraCheeseNeeded;
        this.isSaladNeeded=builder.isSaladNeeded;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public boolean isExtraCheeseNeeded() {
        return isExtraCheeseNeeded;
    }

    public boolean isSaladNeeded() {
        return isSaladNeeded;
    }

    public static class Builder {
        private String name;
        private Size size;
        private boolean isExtraCheeseNeeded;
        private boolean isSaladNeeded;

        public Builder(String name, Size size) {
            this.name = name;
            this.size = size;
        }

        public Builder withExtraCheeseNeeded(boolean isExtraCheeseNeeded){
            this.isExtraCheeseNeeded=isExtraCheeseNeeded;
            return this;
        }

        public Builder withSaladNeeded(boolean isSaladNeeded){
            this.isSaladNeeded=isSaladNeeded;
            return this;
        }

        public Pizza Build(){
           return new Pizza(this);
        }

    }
}
