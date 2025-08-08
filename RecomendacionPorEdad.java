public class RecomendacionPorEdad extends Recomendacion {
    int edad;

    public RecomendacionPorEdad(String titulo, int edad) {
        super(titulo); // Llama al constructor de la clase padre
        this.edad = edad; // Guarda la edad
    }

    @Override
    public String mostrar() {
        return "Recomendado para mayores de " + edad + " años: " + titulo;
    }
}

//@Override: Esto indica que estamos sobrescribiendo el método de la clase padre.
// extends Recomendacion: Esto hace que RecomendacionPorEdad herede de Recomendacion, por lo que tiene acceso a la variable titulo y al método mostrar().