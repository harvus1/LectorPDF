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
 * @author criss
 */
public class EscritorArchivo {
    private String nombre;
    private String autor;
    private String creador; 
    private String fechaCreacion;
    private String fechaModificacion;
    private String productor;
    private String version;
    private String tamanio;
    private String paginas;
    private String tamanioPaginas;
    private String imagenes;
    private String fuentes;    
    
     EscritorArchivo()
    {
        nombre = "";
        autor = "";
        creador = "";
        fechaCreacion = "";
        fechaModificacion = "";
        productor = "";
        version = "";
        tamanio = "";
        paginas = "";
        tamanioPaginas  = "";
        imagenes  = "";
        fuentes = "";
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public void setTamanioPaginas(String tamanioPaginas) {
        this.tamanioPaginas = tamanioPaginas;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public void setFuentes(String fuentes) {
        this.fuentes = fuentes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getCreador() {
        return creador;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public String getProductor() {
        return productor;
    }

    public String getVersion() {
        return version;
    }

    public String getTamanio() {
        return tamanio;
    }

    public String getPaginas() {
        return paginas;
    }

    public String getTamanioPaginas() {
        return tamanioPaginas;
    }

    public String getImagenes() {
        return imagenes;
    }

    public String getFuentes() {
        return fuentes;
    }
    
  
    public void escrituraAleatoria()
    {
        try {
            RandomAccessFile archivo = new RandomAccessFile("Datos.txt", "rw");
            archivo.seek(archivo.length());
            archivo.writeBytes(nombre);
            archivo.writeBytes("|");
            archivo.writeBytes(autor);
            archivo.writeBytes("|");
            archivo.writeBytes(creador);
            archivo.writeBytes("|");
            archivo.writeBytes(fechaCreacion);
            archivo.writeBytes("|");
            archivo.writeBytes(fechaModificacion);
            archivo.writeBytes("|");
            archivo.writeBytes(productor);
            archivo.writeBytes("|");
            archivo.writeBytes(version);
            archivo.writeBytes("|");
            archivo.writeBytes(tamanio);
            archivo.writeBytes("|");
            archivo.writeBytes(paginas);
            archivo.writeBytes("|");
            archivo.writeBytes(tamanioPaginas);
            archivo.writeBytes("|");
            archivo.writeBytes(imagenes);
            archivo.writeBytes("|");
            archivo.writeBytes(fuentes);
            archivo.writeBytes("!");
            
            archivo.write('\n');
            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscritorArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EscritorArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
} 
