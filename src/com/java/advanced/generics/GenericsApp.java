package com.java.advanced.generics;

import java.util.ArrayList;

public class GenericsApp {
    public static void main(String[] args) {
        Box<Integer> myFavNumber = new Box<>();
        myFavNumber.setType(89);
        Util.displayToString(myFavNumber);

        Box<String> myFavActor = new Box<>();
        myFavActor.setType("Mammooty");
        Util.displayToString(myFavActor);

        ArrayList<Box<String>> fileOfBooks = new ArrayList<>();
        fileOfBooks.add(myFavActor);
        fileOfBooks.add(myFavActor);
        Util.displayToString(fileOfBooks);

        OrderedPair<Integer, String> brayant = new OrderedPair<>(24, "K Brayant");
        Util.displayToString(brayant);
        ArrayList<OrderedPair<String, String>> listOfCountries = new ArrayList<>();
        OrderedPair<String, String> malta = new OrderedPair<>("MLT", "Malta");
        OrderedPair<String, String> germany = new OrderedPair<>("GRY", "Germany");
        OrderedPair<String, String> india = new OrderedPair<>("IND", "India");

        listOfCountries.add(malta);
        listOfCountries.add(germany);
        listOfCountries.add(india);
        Util.displayToString(listOfCountries);


    }
}
