import java.util.*;

public class Tarefa1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Digite os nomes separados por vírgula:");
        String input = s.nextLine();


        String[] nomes = input.split(",\\s*");


        ArrayList<String> listaNomes = new ArrayList<>(Arrays.asList(nomes));

        Collections.sort(listaNomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }
}
