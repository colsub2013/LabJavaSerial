package com.labJava.wro;

public class AutoWRO {
	
	private MotorWRO motor;
	private int tamanioMotor;
	
	public AutoWRO(MotorWRO motor, int tamanioMotor) {
		this.motor = motor;
		this.tamanioMotor = tamanioMotor;
		
	}
	
	public MotorWRO getMotor() {return motor;}
	public int getTamanioMotor() {return tamanioMotor;} 
		
}
