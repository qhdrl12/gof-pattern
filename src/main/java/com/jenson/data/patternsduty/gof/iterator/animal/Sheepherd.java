package com.jenson.data.patternsduty.gof.iterator.animal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Sheepherd implements Aggregate {

    public static final int MAX_SHEEP = 10;
    private int sheepNum;
    public static final Sheep[] SHEEPS = new Sheep[MAX_SHEEP];

    public Sheepherd() {
        OptionalInt max = IntStream.range(0, 3).peek(idx -> SHEEPS[idx] = new Sheep()).max();
        sheepNum = max.getAsInt();
    }

    public void addSheep() {
        SHEEPS[++sheepNum] = new Sheep();
    }

    public void removeSheep() {
        SHEEPS[sheepNum--] = null;
    }

    public Iterator createIterator() {
        return new SheepIterator(SHEEPS);
    }

    public int getSheepNum() {
        return sheepNum;
    }
}
