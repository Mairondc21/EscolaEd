import java.sql.SQLOutput;

public class VetorTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista);
        System.out.println(lista.contem(a1));

        Aluno a3 = new Aluno("Mairon");
        System.out.println(lista.contem(a3));

        Aluno x = lista.pega(1);
        System.out.println(x);

    }
}
