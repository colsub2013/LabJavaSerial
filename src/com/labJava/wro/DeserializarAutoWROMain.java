package com.labJava.wro;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializarAutoWROMain {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("testeoWRO.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			AutoWRO auto = (AutoWRO) ois.readObject();			
			ois.close();			
			System.out.println("Tamaño del motor: " + auto.getMotor().getTamanioMotor());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
