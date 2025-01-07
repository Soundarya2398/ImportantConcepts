package com.designPattern.programms;

public class DecisionVehicle {
	
	public static Vehicle getDecision(String vechicleType){
		
		if(vechicleType.equalsIgnoreCase("Car")) {
			return new Car();
		}else if(vechicleType.equalsIgnoreCase("Bike")){
			return new Bike();
		}
		return null;
		
	}

}
