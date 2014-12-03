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
    Contador contador;
    String frase;
    char vocal;
    public Hilo(char nombre, Contador contador)
    {
        this.vocal = nombre;
        this.contador = contador;
    }
    
    @Override
    public void run()
    {
        System.out.println("El numero de vocales " + vocal + " es de " + contador.cuentaVocales(vocal));
    }
    
}
