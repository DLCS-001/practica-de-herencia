
public class Main {
    public static void main(String[] args) {
        Recomendacion rec1 = new Recomendacion("Interestelar");
        Recomendacion rec2 = new RecomendacionPorGenero("Spider-Man", "Animación");
        Recomendacion rec3 = new RecomendacionPopular("Oppenheimer", 1);
        Recomendacion rec4 = new RecomendacionPorEdad("Toy Story", 7); // Nueva instancia

        Daschboard menu = new Daschboard();

        menu.mostrarElemento(rec1.mostrar());
        menu.mostrarElemento(rec2.mostrar());
        menu.mostrarElemento(rec3.mostrar());
        menu.mostrarElemento(rec4.mostrar());

        System.out.println("\n=== Listas de películas ===");
        RecomendacionPorGenero.mostrarLista();
        System.out.println();
        RecomendacionPopular.mostrarLista();
        System.out.println();
        RecomendacionPorEdad.mostrarLista();
    }
}