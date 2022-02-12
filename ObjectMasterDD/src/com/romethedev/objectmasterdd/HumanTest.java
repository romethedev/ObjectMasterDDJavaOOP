package com.romethedev.objectmasterdd;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new Human();
		Human human2 = new Human();
		
		human1.attack(human2);
		System.out.println(human2.health);
	}

}
