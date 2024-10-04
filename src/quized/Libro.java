package quized;


public class Libro {
    private String codigo;
    private String titulo;
    private String area;

    public Libro() {
    }

    public Libro(String codigo, String titulo, String area) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.area = area;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
  
    @Override
    public String toString(){
        return "Codigo: " + codigo + "Titulo: "+ titulo +"Area: "+ area;
    }
    
}
