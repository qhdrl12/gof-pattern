package com.jenson.data.patternsduty.gof.iterator.animal;

public class SheepIterator implements Iterator {
    private Shepherd shepherd;
    private int position = 0;

    public SheepIterator(Shepherd shepherd) {
        this.shepherd = shepherd;
    }

    @Override
    public boolean hasNext() {
        if (position <= shepherd.getSheepNum()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Sheep sheep =  this.shepherd.sheeps[position];
        position++;
        return sheep;
}
}