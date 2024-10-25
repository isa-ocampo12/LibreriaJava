//Libreria para contar palaras, letras, numeros y vocales
package Cadena;

public class Operaciones 
{
    private int contador;
    public int ContarPalaras (String texto)
    {
        contador = 1;
        for (int i = 0; i < texto.length(); i++) 
        {
            if (Character.isSpaceChar(texto.charAt(i)))
                contador++;
        }//fin para
        return contador;
    }
    
    public int ContarLetras(String texto)
    {
        contador = 0;
        for (int i = 0; i < texto.length(); i++) 
        {
            if(Character.isLetter(texto.charAt(i)))
                contador++;
        }//fin para
        return contador;
    }
    
    public int ContarDigitos(String texto)
    {
       contador = 0;
       for (int i = 0; i < texto.length(); i++) 
        {
            if(Character.isDigit(texto.charAt(i)))
                contador++;
        }//fin para
        return contador;
       
    }
    
    public int ContarVocales(String texto){
        int ascii;
        contador = 0;
        for (int i = 0; i < texto.length(); i++) 
        {
            ascii = (int)Character.toUpperCase(texto.charAt(i));
            if(ascii == 65 || ascii == 69 || ascii == 79 || ascii == 73 || ascii == 85)
                contador++;
        }//fin para
        return contador;
    }//fin metodo contar digitos
    
}
