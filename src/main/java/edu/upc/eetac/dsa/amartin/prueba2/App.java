/*
 * Copyright 2014 Alejandro Martin Cruz
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.upc.eetac.dsa.amartin.prueba2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


//class BigNumberException extends Exception {
	
//	public BigNumberException () {
		
//	}
	
//	public BigNumberException (String message) {
//		super(message);
//	}
	
//	public String getMessage () {
//		return "Esto lo he puesto yo " + super.getMessage();
//	}
//}

public class App 
{
    public static void main( String[] args ) throws IOException
    {
		System.out.println( "Ejercicio 1: Exceptions");
		System.out.println( "=========================\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print ("Escribe la ruta del archivo: ");
		String dato = sc.nextLine(); // sc.nextLine();
	
		FileWriter F2 = new FileWriter ("c:\\fichero\\registro.txt",true);
		BufferedWriter bw = new BufferedWriter(F2);
		PrintWriter pw = new PrintWriter (bw);
		
		FileReader F = null;
		BufferedReader sc2 = null;
		int nBytes = 0;
		try {
			F = new FileReader(dato);
			sc2 = new BufferedReader(F);
			while (sc2.ready()) {
			    int xx = sc2.read();
			    nBytes++;
			    //if (xx>=1000) throw new BigNumberException("Error");
			    //System.out.println(xx);
			   
			}
		}
		catch (Exception ex) {
			System.out.println ("Excepcion no esperada: " + ex);
		}	
		finally {
			F.close();
			 System.out.println("Programa finalizado correctamente");
		}
		
		Date fecha = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String formattedDate = formatter.format(fecha);		
		
		pw.write (formattedDate + "\t" + dato + "\t" + nBytes + "\r\n");
		pw.close();
	}
   
}
