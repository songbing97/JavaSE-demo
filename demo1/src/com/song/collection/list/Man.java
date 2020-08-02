package com.song.collection.list;

public class Man extends Human{
	public Man(String name, int age, int ID) {
		super(name, age, ID);
	}

	@Override
	public void greet() {
		System.out.println("Welcome to my playground!");
	}

	@Override
	public void eat() {
		System.out.println("I'd like eat milk!");
	}

	@Override
	public void buy() {
		System.out.println("I'd like buy basketball!");
	}

	@Override
	public void play() {
		System.out.println("I'd like play football!");
	}
}
