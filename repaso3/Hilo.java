/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso3;

/**
 *
 * @author findag
 */
public class Hilo extends Thread
{
    // Definimos una variable de tipo int que sera nuestro contador, un string que recogera nuestra frase y un char que recogera la vocal a leer.
    int contador;
    String frase;
    char vocal;
    public Hilo(char nombre, String frase)
    {
        this.vocal = nombre;
        this.frase = frase;
    }
    
    @Override
    public void run()
    {
        
        // Mostramos por pantalla el total de letras para cada hilo.
        System.out.println("Tenemos " + contador + " vocales " + vocal);
    }
    
}
