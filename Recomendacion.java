public class Recomendacion {
    String titulo;

    public Recomendacion(String titulo) {
        this.titulo = titulo;
    }

    public String mostrar() {
       return  "Recomendación general: " + titulo;
    }
}
