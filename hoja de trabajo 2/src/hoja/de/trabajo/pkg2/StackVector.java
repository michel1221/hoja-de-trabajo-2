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
import java.util.*;
public class StackVector <E> implements Stack <E>{

	public Vector <E>dato;

	public StackVector (){
	
	dato= new Vector<E>();
	
	}

	public void push(E item){
	 
		dato.add(item);
	}
	public E pop(){
	   
	   return dato.remove(size()-1);
	}

	public E peek(){
	
		return dato.get(size() - 1);
	}

   
   public boolean empty(){
	     
		return size()==0;
   }
   
	public int size(){
	
	   return dato.size();
	}

}
