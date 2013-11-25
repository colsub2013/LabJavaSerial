package com.labJava.go;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializarAutoGOMain {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("testeoGO.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Auto auto = (Auto) ois.readObject();			
			ois.close();			
			System.out.println("Tamaño del motor: " + auto.getMotor().getTamanioMotor());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
