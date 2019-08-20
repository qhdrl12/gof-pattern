package com.jenson.data.patternsduty.gof.iterator.animal;

public class AnimalMain {

    public static void main(String[] args) {
        Goatherd goatherd = new Goatherd();
        Shepherd shepherd = new Shepherd();

        Iterator goatIter = goatherd.createIterator();
        Iterator sheepIter = shepherd.createIterator();

        while (goatIter.hasNext()) {
            Goat goat = (Goat) goatIter.next();
            goat.sound();
        }

        while (sheepIter.hasNext()) {
            Sheep sheep = (Sheep) sheepIter.next();
            sheep.sound();
        }
    }
}
