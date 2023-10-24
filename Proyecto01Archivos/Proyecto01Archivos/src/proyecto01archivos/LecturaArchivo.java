/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01archivos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author pedro
 */
public class LecturaArchivo {
  public  LecturaArchivo()
    {
    
    }
  public String busquedaArchivo(String busqueda)
  {
      String resultado="";
 
try {
RandomAccessFile archivo = new RandomAccessFile("Datos.txt", "r");
archivo.seek(0);
String cadena="";

while((cadena = archivo.readLine()) != null)
{
    
int a = cadena.split("\\|").length;
  int b=0;
String[] partir =cadena.split("\\|");
    if (partir[0].equals(busqueda)||partir[0].equals(busqueda+".pdf")) {
        
        resultado=cadena;
    }
    else if (partir[1].equals(busqueda)) {
        resultado+=cadena;
    }
    
}


archivo.close();
} catch (FileNotFoundException ex) {
Logger.getLogger(LecturaArchivo.class.getName()).log(Level.SEVERE, null, ex);
} catch (IOException ex) {
Logger.getLogger(LecturaArchivo.class.getName()).log(Level.SEVERE, null, ex);
}
return resultado;
  }
    public String lecturaAleatoria()
{
    String resultado="";
try {
RandomAccessFile archivo = new RandomAccessFile("Datos.txt", "r");
archivo.seek(0);
String cadena="";

while((cadena = archivo.readLine()) != null)
{
    resultado+=cadena;
//System.out.println(cadena);
}
//leer string
//byte letras[] = new byte[8];
//archivo.read(letras);
//System.out.println(new String(letras));

archivo.close();
} catch (FileNotFoundException ex) {
Logger.getLogger(LecturaArchivo.class.getName()).log(Level.SEVERE, null, ex);
} catch (IOException ex) {
Logger.getLogger(LecturaArchivo.class.getName()).log(Level.SEVERE, null, ex);
}
return resultado;
}
}
