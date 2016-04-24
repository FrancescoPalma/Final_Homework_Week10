package com.codeclan.md;

public class Cow extends Animal{

	@Override
	public void eat(Food food) {
		double energyGained = food.getEnergy() / 4;
		this.weight += energyGained;
	}

	@Override
	public void setPrice() {
		if(weight<=300.00 && weight>=200.00){
			price = 100.00;
		} 
		else if(weight<=150.00 && weight>=100.00){
			price = 50.00;
		}
		else if(weight<= 95.00 && weight>=55.00){
			price = 25.00;
		}
		else {
			price = 0;
		}
		
	}

}
