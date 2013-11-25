package com.labJava.wro;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AutoWRO {
	
	private MotorWRO motor;
	private int tamanioMotor;
	
	public AutoWRO(MotorWRO motor, int tamanioMotor) {
		this.motor = motor;
		this.tamanioMotor = tamanioMotor;
		
	}
	
	public MotorWRO getMotor() {return motor;}
	public int getTamanioMotor() {return tamanioMotor;} 
	
	private void writeObject(ObjectOutputStream os) {
		try {
			os.defaultWriteObject();
			os.writeInt(motor.getTamanioMotor());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void readObject(ObjectInputStream is) {
		try {
			is.defaultReadObject();
			motor = new MotorWRO(is.readInt());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
