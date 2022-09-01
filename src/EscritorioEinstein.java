/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BMXDDT007873
 */
public class EscritorioEinstein {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            Einstein puede trabajar de 20, 30 a 40.
            a que hora debe trabajar Einstein pra editor que va de 30.
        */

        
        //Se establecen las pilas de trabajo con un buffer de 100 como maximo;
        Pila pilaEinstein = new Pila(100);
        Pila pilaEditor = new Pila(100);

        //Se simula el tiempo donde 1 hora = 10 ciclos para fines practicos;
        int ciclo = 0;
        //Por lo tanto Einstein producira un articulo cada 20 ciclos;
        int cicloEinstein = 30; //30, 20.
        //mientras que el editor publicara cada 30 ciclos.
        int cicloEditor = 30;

        while (ciclo <= 240) // 24 Horas de trabajo
        {
            ciclo++;

            //Tiempo de trabajo de Einstein
            
            if (ciclo % cicloEinstein == 0) {
                // System.out.println("Ciclo de Einstein" +  ciclo);

                if (!pilaEinstein.IsFull()) //Si la pila no esta llena se agrega un nuevo articulo;
                {
                    pilaEinstein.Push("Artículo número [" + ciclo / cicloEinstein + "]");
                }

                if (!pilaEinstein.IsEmpty()) //Si Einstein tiene articulos se los pasa al editor;
                {

                    String tmpArtE = pilaEinstein.Pop();

                    System.out.println("Einstein produjo el artículo: " + tmpArtE);

                    pilaEditor.Push(tmpArtE);
                }
                
                // System.out.println("..."); 
            }

            //Tiempo de trabajo del editor
            if (ciclo % cicloEditor == 0) {

                if (!pilaEditor.IsEmpty()) //Se valida que el editor tenga articulos que publicar;
                {
                    String tmpArticulo = pilaEditor.Pop();

                    System.out.println("Publicación del artículo: " + tmpArticulo);
                }

                System.out.println("...");
            }
        }

        System.out.println("Al finalizar la perio"
                + "do .... ");
        pilaEinstein.PrintPila();
        pilaEditor.PrintPila();

    }
}
