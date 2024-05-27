package jogodaadivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {

    public static void main(String[] args) {

        do {
            Scanner obj = new Scanner(System.in);
            Random random = new Random();

            String nome;
            int numero = 0;
            int tentativas = 0;
            int aleatorio = random.nextInt(10);
            int afirmacao;

            System.out.println("Olá, qual seu nome?");
            nome = obj.nextLine();

            System.out.println("Você realmente quer jogar? Digite 1 para: SIM e 2 para: NÃO");
            afirmacao = obj.nextInt();

            if (afirmacao == 1) {
                System.out.println("Vamos começar!");

            } else if (afirmacao == 2) {
                System.out.println("Obrigada, tchau!");
                break;
            }
            while (numero != aleatorio) {

                tentativas++;
                System.out.println("Qual seu palpite?");
                numero = obj.nextInt();

                if (numero == aleatorio) {
                    System.out.println("Você acertou! Parabéns");

                } else if (numero < aleatorio) {
                    System.out.println("Tente um número maior");

                } else if (numero > aleatorio) {
                    System.out.println("Tente um número menor");
                }
                System.out.println("Você tentou " + tentativas + " vezes");
            }
               
        }while (true);
       
    
    }

}
