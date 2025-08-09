public class RecomendacionPorEdad extends Recomendacion {
    int edad;
    static String[] peliculasPorEdad = {"El Rey León", "Buscando a Nemo", "Zootopia"}; // Lista para niños

    public RecomendacionPorEdad(String titulo, int edad) {
        super(titulo); // Llama al constructor de la clase padre
        this.edad = edad; // Guarda la edad
    }

    @Override
    public String mostrar() {
        return "Recomendado para mayores de " + edad + " años: " + titulo;
    }

    public static void mostrarLista() {
        System.out.println("Películas recomendadas para niños:");
        for (String pelicula : peliculasPorEdad) {
            System.out.println("- " + pelicula);
        }
    }
}
