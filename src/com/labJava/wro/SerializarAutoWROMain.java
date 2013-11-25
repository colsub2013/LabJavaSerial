package com.labJava.wro;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
	Ejercicio 2: Actualmente, al correr com.labJava.wro.SerializarAutoWROMain.main(String[] args) se produce
	la siguiente excepción:
	
	java.io.NotSerializableException: com.labJava.wro.AutoWRO
	...
	
	Realizar las modificaciones necesarias en las clases del package com.labJava.wro para hacer funcionar 
	correctamente el proceso de serialización / deserialización
		
 */

public class SerializarAutoWROMain {
	
	public static void main(String[] args) {
		
		MotorWRO motor = new MotorWRO(1000);
		AutoWRO auto = new AutoWRO(motor, 10);
		
		try {	
			FileOutputStream fs = new FileOutputStream("testeoWRO.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(auto);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
