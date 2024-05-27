/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodaadivinhacao;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class JogoDaAdivinhacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
        Random random = new Random();

        int numero = 0;
        int tentativas = 0;
        int aleatorio = random.nextInt(10);

        while (numero != aleatorio) {
            tentativas ++;
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

        
    }
    
}
