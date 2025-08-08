public class Daschboard {
    int contador = 0;
    public void mostrarElemento(String elemento) {
        if(contador == 0){
            System.out.println("====================================");
        }
        System.out.println(elemento);
        System.out.println("====================================");
        contador++;
    }
}
