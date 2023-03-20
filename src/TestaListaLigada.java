public class TestaListaLigada {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("Mairon");
        System.out.println(lista);
        lista.adicionaNoComeco("jose");
        System.out.println(lista);
        lista.adicionaNoComeco("Carlos");
        System.out.println(lista);

        lista.adiciona(2,"Joaquin");
    }
}
