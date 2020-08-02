package com.song.collection.list;

public class Woman extends Human{
	public Woman(String name, int age, int ID) {
		super(name, age, ID);
	}

	@Override
	public void greet() {
		System.out.println("Welcome to my house!");
	}

	@Override
	public void eat() {
		System.out.println("I'd like eat fruit!");
	}

	@Override
	public void buy() {
		System.out.println("I'd like buy lipstick!");
	}

	@Override
	public void play() {
		System.out.println("I'd like play with friends!");
	}
}
