package com.jenson.data.patternsduty.gof.iterator.animal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * 실제 양객체를 포함하는
 */
public class Shepherd implements Aggregate {

    public static final int MAX_SHEEP = 10;
    private int sheepNum;
    protected Sheep[] sheeps = new Sheep[MAX_SHEEP];

    public Shepherd() {
        OptionalInt max = IntStream.range(0, 3).peek(idx -> sheeps[idx] = new Sheep()).max();
        sheepNum = max.getAsInt();
    }

    public Sheep getSheep(int index) {
        return sheeps[index];
    }

    public void addSheep() {
        sheeps[sheepNum] = new Sheep();
        sheepNum++;
    }

    public int getSheepNum() {
        return sheepNum;
    }

    public Iterator createIterator() {
        return new SheepIterator(this);
    }
}