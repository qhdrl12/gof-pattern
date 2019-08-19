package com.jenson.data.patternsduty.gof.iterator.animal;

public class SheepIterator implements Iterator {
    private Sheep[] sheeps;
    private int position = 0;

    public SheepIterator(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    @Override
    public boolean hasNext() {
        if (position >= sheeps.length || sheeps[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
//        System.out.println("next position result " + position);
        Sheep tempSheep = sheeps[position];
        position++;
        return tempSheep;
    }
}