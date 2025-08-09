public class RecomendacionPopular extends Recomendacion {

    int ranking;
    static String[] topPeliculas = {
        "Oppenheimer", "Barbie", "Dune", "Avatar", "Titanic",
        "Inception", "The Matrix", "Interstellar", "Gladiator", "Forrest Gump"
    };

    public RecomendacionPopular(String titulo, int ranking) {
        super(titulo);
        this.ranking = ranking;
    }

    @Override
    public String mostrar() {
        return titulo + " está en el top " + ranking + " de esta semana. ¡No te lo pierdas!";
    }

    public static void mostrarLista() {
        System.out.println("Top 10 películas de esta semana:");
        for (int i = 0; i < topPeliculas.length; i++) {
            System.out.println((i + 1) + ". " + topPeliculas[i]);
        }
    }
}
