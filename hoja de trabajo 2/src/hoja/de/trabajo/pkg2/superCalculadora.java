/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja.de.trabajo.pkg2;

/**
 *
 * @author michel
 */
import java.io.*;
public class superCalculadora implements Calculadora {

	public String texto;
	public int contSignos;
	public int contNums;
	public int largoCad;
	public StackVector<Integer> obj;
	public StackVector<String> objStr;
	public String cadena;
	public int a;
	public int b;
	int numCambiar;
	
	public superCalculadora (){
		
		contSignos =0;
		contNums = 0;
		obj= new StackVector();
		objStr= new StackVector();
		largoCad=0;
		cadena= "";
		numCambiar = 0;
		
	}

	
	public void setString(String linea){
		 cadena = linea;
		largoCad=cadena.length();
	}
	public void meterVector (){
		largoCad=cadena.length();
	}
	
	public boolean calcularVector(){
		
		//for (int i=0;i<largoCad;i++){
		//	cadena=cadena + obj.pop();	
		//}
		//for (int i=0;i<7;i++){
			//try {
					//numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					//contNums++;
					//System.out.println("num");
				//}
			//catch (Exception e){
									//contSignos++;	
									//System.out.println("sig");
							   //}
		//}
		//if (contSignos > contNums){
			//System.out.println("Putos");
			//return false;
		//}
		for (int i=0;i<largoCad;i++){ //Aqui cambias largo de la cadena
			switch (cadena.charAt(i)){
				case '0':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '1':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '2':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '3':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '4':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '5':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '6':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '7':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '8':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '9':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '+':{
					try {
						a=obj.pop();
						b=obj.pop();
						a=a+b;
						obj.push(a);
					}
					catch (Exception e){
						return false;	
					}
					break;
				}
				case '-':{
					try {
						a=obj.pop();
						b=obj.pop();
						a=b-a;
						obj.push(a);
					}
					catch (Exception e){
						return false;	
					}
					break;
				}
				case '*':{
					try {
						a=obj.pop();
						b=obj.pop();
						a=a*b;
						obj.push(a);
					}
					catch (Exception e){
						return false;	
					}
					break;
				}
				case '/':{
					try {
						a=obj.pop();
						b=obj.pop();
						a=b/a;
						obj.push(a);
					}
					catch (Exception e){
						return false;	
					}
					break;
				}
				case ' ':{
					break;
				}
			}
		}
		return true;
	}
	
	public int getResultado (){
		a = obj.pop();
		return a;
	}
	
}