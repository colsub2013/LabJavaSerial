package com.labJava.formato;

/*

	Ejercicio 3: Agregar el c�digo necesario en com.labJava.formato.FormatearConPrintfMain.main(String[] args) vali�ndose de la 
	API de java.util.Formatter 'LabJavaSerial/doc/Formatter_JSE7.htm' � http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html 
	para crear un String de formato para 'System.out.printf(...)' con las siguientes caracter�sticas:
	
	- Tomar 2 argumentos:
	
	  . El 1ro debe permitir un String en el que el n�mero m�nimo de caracteres a ser escritos a la salida debe ser 10
	  . El 2do debe permitir un n�mero float el cual debe precederse por el signo "+" con precisi�n de 3 puntos decimales
	  
	- Indicaciones:
	  
	  . Argumentos de prueba: 
	  	
	  	System.out.printf("String de formato", "Lab Java", new Float(12.5));
	  	
	  	Salida: 
	  	
	  	'  Lab Java * +12,500'	
 */

public class FormatearConPrintfMain {

	public static void main(String[] args) {
		
		System.out.printf("%2$c * %1$d", 123, 'd');
		System.out.println("\n");
		System.out.printf("String de formato a codificar", "Lab Java", new Float(12.5));
		
	}

}
