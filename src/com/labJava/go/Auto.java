package com.labJava.go;

import java.io.Serializable;

public class Auto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Motor motor;
	private int tamanioMotor;
	
	public Auto(Motor motor, int tamanioMotor) {
		this.motor = motor;
		this.tamanioMotor = tamanioMotor;
		
	}
	
	public Motor getMotor() {return motor;}
	public int getTamanioMotor() {return tamanioMotor;} 
	
}
