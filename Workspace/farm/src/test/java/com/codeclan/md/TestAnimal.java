package com.codeclan.md;

import org.junit.*;
import static org.junit.Assert.*;

public class TestAnimal {

	@Test
	public void testAnimalType(){
		Animal chicken = new Chicken();
		chicken.setType("chicken");
		assertEquals("chicken", chicken.getType());
	}
	
	@Test
	public void testAnimalWeight(){
		Animal sheep = new Sheep();
		sheep.setWeight(120.00);
		assertTrue(120.00 == sheep.getWeight());
	}
	
	@Test
	public void testAnimalIsPricedCorrectlyUnder100Weight(){
		Animal chicken = new Chicken();
		chicken.setWeight(80.00);
		chicken.setPrice();
		assertTrue(25.00 == chicken.getPrice());
	}

}