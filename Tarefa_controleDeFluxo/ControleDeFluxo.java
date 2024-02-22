public class ControleDeFluxo {
    public static void main(String[] args) {
        int nota1 = 7;
        int nota2 = 9;
        int nota3 = 6;
        int nota4 = 8;

        int mediaNotas = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println(mediaNotas);
        if (mediaNotas >=7) {
            System.out.println("Aluno foi aprovado!");
        }
        else if (mediaNotas >=5) {
            System.out.println("Aluno esta em recuperação!");
        }
        else {
            System.out.println("Aluno foi reprovado!");
        }
    }
}



