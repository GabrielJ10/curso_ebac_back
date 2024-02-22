public class Wrapper {
    public static void main(String[] args) {
        // Variável primitiva do tipo int
        int numeroPrimitivo = 10;

        // Conversão para o tipo Wrapper Integer
        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);

        // Imprimindo os valores
        System.out.println("Valor primitivo: " + numeroPrimitivo);
        System.out.println("Valor Wrapper: " + numeroWrapper);
    }
}
