package com.jenson.data.patternsduty.gof.iterator.animal;

public class GoatIterator implements Iterator {
    private Goatherd goatherd;
    private int position = 0;

    public GoatIterator(Goatherd goatherd) {
        this.goatherd = goatherd;
    }

    @Override
    public boolean hasNext() {
        if (position > goatherd.getGoatNum()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
//        System.out.println("next position result " + position);
        Goat goat = this.goatherd.findGoat(position);
        position++;
        return goat;
    }
}
