package com.qa.abstractionExercise;

public class Chameleon extends Reptile implements Camouflage {
	
	public String favInsect;

	public Chameleon(String habitat, String type, int length, String favInsect) {
		super(habitat, type, length);
		this.favInsect = favInsect;
	}

	@Override
	public String useCamouflage() {
		return "Hiding in " + this.getHabitat();
	}

	@Override
	public String noise() {
		// TODO Auto-generated method stub
		return "blep";
	}
}
