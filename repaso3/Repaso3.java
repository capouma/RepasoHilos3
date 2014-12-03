/*
 * Crea una clase Java que utilice 5 hilos pcomún que representa el número de vocales totales.
 * Para contar el número de vocales que hay en un determinado texto
 * (que puede ser introducido por teclado o estar en un fichero).
 * Cada hilo se encargará de contar una vocal diferente, actualizando todos los hilos una misma variable
 */
package repaso3;

/**
 *
 * @author findag
 */
public class Repaso3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Definimos un objeto de tipo Contador.
        Contador contador = new Contador();
        
        // Creamos los 5 hilos que usaremos para contar las vocales de nuestra texto/archivo.
        Hilo hilo1 = new Hilo('a', contador);
        Hilo hilo2 = new Hilo('e', contador);
        Hilo hilo3 = new Hilo('i', contador);
        Hilo hilo4 = new Hilo('o', contador);
        Hilo hilo5 = new Hilo('u', contador);
        
        // Lanzamos nuestros hilos.
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        
    }
    
}
