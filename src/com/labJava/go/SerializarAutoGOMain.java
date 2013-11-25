package com.labJava.go;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

	/*
		Ejercicio 1: Actualmente, al correr com.labJava.go.SerializarAutoGOMain.main(String[] args) se produce la siguiente excepción:
		
		java.io.NotSerializableException: com.labJava.go.Motor
		...
		
		Realizar las modificaciones necesarias en las clases del package com.labJava.go para hacer funcionar correctamente el 
		proceso de serialización / deserialización
		
	 */


public class SerializarAutoGOMain {
		
	public static void main(String[] args) {	
		Motor motor = new Motor(1000);
		Auto auto = new Auto(motor, 10);
		
		try {	
			FileOutputStream fs = new FileOutputStream("testeoGO.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(auto);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
