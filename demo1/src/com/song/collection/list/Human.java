package com.song.collection.list;

public abstract class Human implements HumanActions {
	private String name;
	private int age;
	private int ID;

	public Human(String name, int age, int ID) {
		this.name = name;
		this.age = age;
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	@Override
	public void greet() {
		System.out.println("Welcome!");
	}

	@Override
	public void eat() {
		System.out.println("I'd like eat!");
	}

	@Override
	public void buy() {
		System.out.println("I'd like buy someting!");
	}

	@Override
	public void play() {
		System.out.println("I'd like play!");
	}
}
