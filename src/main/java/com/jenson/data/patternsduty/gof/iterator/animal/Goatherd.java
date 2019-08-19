package com.jenson.data.patternsduty.gof.iterator.animal;

import java.util.HashMap;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Goatherd implements Aggregate {

    public static final int MAX_GOATS = 100;
    private int goatNum;
    public static final HashMap<Integer, Goat> GOATS = new HashMap<>();

    public Goatherd() {
        OptionalInt max = IntStream.range(0, 30).peek(idx -> GOATS.put(idx, new Goat())).max();
        goatNum = max.getAsInt();
    }

    public Goat findGoat(int index) {
        return GOATS.get(index);
    }

    public int getGoatNum() {
        return goatNum;
    }
    public void addGoat() {
        if (GOATS.size() <= MAX_GOATS) {
            GOATS.put(goatNum++, new Goat());
        }
    }

    public void removeGoat() {
        GOATS.remove(goatNum--);
    }

    public Iterator createIterator() {
        return new GoatIterator(this);
//        return new GoatIterator(GOATS.keySet());
//        return (Iterator) GOATS.keySet().iterator();
    }
}
