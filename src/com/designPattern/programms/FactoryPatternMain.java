package com.designPattern.programms;

public class FactoryPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="car";
		Vehicle v=DecisionVehicle.getDecision(input);
		v.start();

	}

}
