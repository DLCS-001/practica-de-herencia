public class RecomendacionPorGenero extends Recomendacion {
    String genero;

    public RecomendacionPorGenero(String titulo, String genero) {
        super(titulo);
        this.genero = genero;
    }

    @Override
    public String mostrar() {
        return "¡Si te gusta el género " + genero + ", prueba ver: " + titulo + "!";
    }
}
