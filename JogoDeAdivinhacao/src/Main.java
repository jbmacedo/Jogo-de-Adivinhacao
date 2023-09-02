import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numSorteado = new Random().nextInt(100);
        System.out.println(numSorteado);
        System.out.println("Olá Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Pronto Bem vindo ao jogo da adivinhação " +
                "Você terá 5 tentativas para adivinhar um número de 0 a 100 " +
                "VAMOS COMEÇAR?");
        System.out.println("Digite sua primeira tentativa: ");
        int numDigitado = ler.nextInt();
        int tentativa = 1;

        while (tentativa < 5){
                if (numDigitado < numSorteado) {
                    System.out.println("Número do chute é *MENOR* que o número sorteado, tente de novo ");
                    tentativa++;
                    numDigitado = ler.nextInt();

                }else if(numDigitado > numSorteado){
                    System.out.println("Número do chute é *MAIOR* que o número sorteado, tente de novo ");
                    tentativa++;
                    numDigitado = ler.nextInt();
                }else if (numDigitado == numSorteado){
                System.out.println("Parabéns " + nome +" Você conseguiu ganhar o jogo");
                break;
                }
        }
        System.out.println("Poxa que pena, " + nome + " você não conseguiu, mas pode tentar outra vez");
    }
}