public class RecomendacionPopular extends Recomendacion {

    int ranking;

    public RecomendacionPopular(String titulo, int ranking) {
        super(titulo);
        this.ranking = ranking;
    }

    @Override
    public String mostrar() {
        return titulo + " está en el top " + ranking + " de esta semana. ¡No te lo pierdas!";
    }
}
