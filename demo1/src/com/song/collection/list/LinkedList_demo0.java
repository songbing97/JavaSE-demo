package com.song.collection.list;

import java.util.LinkedList;

public class LinkedList_demo0 {
    public static void main(String[] args) {
        LinkedList<Human> linkedList = new LinkedList();
        String name = "zenglin";
        int age = 23;
        int id = 300001;
        linkedList.add(new Woman(name,age,id));



    }
}
