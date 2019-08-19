package com.jenson.data.patternsduty.gof.iterator.animal;

public interface Iterator {
    boolean hasNext();
    Object next();

    default void remove() {throw new UnsupportedOperationException("remove"); }
}
