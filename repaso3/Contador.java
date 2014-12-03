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
public class Contador
{
    // Definimos una variable de tipo String que tendra nuestra frase a analizar.
    String frase = "en un lugar de la mancha que todos conocemos aqui";
    
    public Contador()
    {
        
    }
    
    public synchronized int cuentaVocales(char vocal)
    {
        int contador = 0;
        for(int i = 0; i < frase.length(); i++)
        {
            
            if(frase.charAt(i) == vocal)
            {
                contador = contador + 1;
            }
            
        }
        
        return contador;
    }
    
}
