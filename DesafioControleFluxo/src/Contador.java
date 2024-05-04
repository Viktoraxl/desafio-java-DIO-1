import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = scan.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = scan.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (Exception e) {
            System.out.println("O primeiro parâmetro deve ser menor que o segundo.");
        }
    }

    static void contar(int primeiroPArametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroPArametro > segundoParametro){
            throw new ParametrosInvalidosException();
        }

        int contagem = segundoParametro - primeiroPArametro;
        for(int i = 1; i <= contagem; i++){
            System.out.println(i);
        }
    }
}
