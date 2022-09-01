/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BMXDDT007873
 */
public class Pila{
    
     private String miPila[] = null;
     int index;
       
     public Pila(int tamanio) {
     
      miPila =  new String [tamanio];
        index = -1;
    }
  
    //Push, Inserta un valor a la pila, en la cima.
    public void Push(String valor) {

        if (IsFull()) {
            System.out.println("La pila esta llena, no se puede meter el valor [" + valor + "] !!!");
        } else {
            index++;
            miPila[index] = valor;
        }
    }

    //Pop, sacara el ultimo valor de la pila, es decir la cima de la pila
    public String Pop() {

        String result = "";

        if (IsEmpty()) {
            System.out.println("La pila esta vacia, no hay elemntos para sacar !!!");
        } else {
            result = miPila[index];
            miPila[index] = null;
            index--;
        }

        return result;
    }

    //Se valida si la pila esta vacia
    public boolean IsEmpty() {
        return index == - 1;
    }

    //Validamos si la pila esta llena
    public boolean IsFull() {
        return index == (miPila.length - 1);
    }

    //Obtiene el valor de la cima.
    public String Peek() {
        return miPila[index];
    }

    public void PrintPila() {
        System.out.print("Valores de la  pila [ ");

         for (String miPila1 : miPila) {
             if(miPila1 != null)
                System.out.print(miPila1 + "; ");
         }
        System.out.println(" ]");
    } 
}
