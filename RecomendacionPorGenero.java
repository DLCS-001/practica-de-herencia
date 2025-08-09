public class RecomendacionPorGenero extends Recomendacion {
    String genero;
    static String[] peliculasPorGenero = {"Toy Story", "Coco", "Spider-Man: Into the Spider-Verse"}; // Lista de ejemplo

    public RecomendacionPorGenero(String titulo, String genero) {
        super(titulo);
        this.genero = genero;
    }

    @Override
    public String mostrar() {
        return "¡Si te gusta el género " + genero + ", prueba ver: " + titulo + "!";
    }

    public static void mostrarLista() {
        System.out.println("Películas recomendadas del género Animación:");
        for (String pelicula : peliculasPorGenero) {
            System.out.println("- " + pelicula);
        }
    }
}
