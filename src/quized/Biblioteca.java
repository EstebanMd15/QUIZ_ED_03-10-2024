
package quized;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    int contador = 0;
    
    public Biblioteca(){
        libros = new ArrayList<Libro>();
    }

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public void registrarLibro(String codigo, String titulo, String area){
        libros.add(new Libro(codigo,titulo,area));
        System.out.println("Libro registrado con exito!!");
        
        
    }
       
    public void buscarLibroPorArea(String area){
        ArrayList<Libro> encontrado = new ArrayList<>();
        for (Libro libro : libros) {
            if(libro.getArea().equals(area)){
                encontrado.add(libro);
            }
            
        }
       if(encontrado.isEmpty()){
           System.out.println("No se encontraron libros en el area: "+ area);
           
       }else{
           System.out.println("Libro encontrado en el area: " + area + ":");
           System.out.println("Codigo/tTitulo/tArea");
           for (Libro libro : encontrado) {
               System.out.println(libro.getCodigo() + "\t" + libro.getTitulo()
               + "\t" + libro.getArea());
               
           }
           System.out.println("Total de libros encontrados: "+ contador+1 + encontrado.size());
       }
            
        
        
    }
    public void buscarLibroPorCodigo(String codigo){
        for (Libro libro : libros) {
           if(libro.getCodigo() == libro.getCodigo()) {
               System.out.println("Informacion del libro");
               System.out.println(libro);
               return;
            } 
            
        }
        System.out.println("No se encontro un libro con el codigo: " + codigo);
    }
}
