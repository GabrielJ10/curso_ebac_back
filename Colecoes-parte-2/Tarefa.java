import java.util.*;

public class Tarefa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Criação dos grupos para os sexos masculino e feminino
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();

        // Ler a entrada do console
        System.out.println("Digite os nomes seguidos por '-' e pelo sexo (m/f) separados por vírgula:");
        String input = s.nextLine();

        // Dividir os nomes usando o método split
        String[] entradas = input.split(",\\s*");

        // Percorrer as entradas e separar por sexo
        for (String entrada : entradas) {
            String[] partes = entrada.split("\\s*-\\s*");
            String nome = partes[0];
            String sexo = partes[1];

            // Adicionar ao grupo correspondente
            if (sexo.equalsIgnoreCase("m")) {
                masculino.add(nome);
            } else if (sexo.equalsIgnoreCase("f")) {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido para: " + entrada);
            }
        }

        // Printar os grupos separadamente
        System.out.println("Nomes do sexo masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("\nNomes do sexo feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }
    }
}
