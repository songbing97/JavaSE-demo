package com.song.collection.list;


public interface HumanActions extends Cloneable{
    /**
     * Human greet with each other.
     */
    void greet();

    /**
     * Human eat three times a day.
     */
    void eat();

    /**
     * Human play with each other.
     */
    void play();

    /**
     * Human buy lots of things they need.
     * Human also buy lots of things they don't need.
     */
    void buy();
}
