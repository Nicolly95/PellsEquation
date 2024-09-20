package POO;
import java.util.Scanner;

public class EquacaoPellsTeste {
    public static void main(String[] args) {

        EquacaoPells equacao = new EquacaoPells();      //Instancia a classe EquacaoPells como o objeto "equacao"

        Scanner entrada = new Scanner(System.in);       //Instancia a classe importada Scanner como o objeto "entrada"
        System.out.println("Qual número você deseja achar a parte inteira da raíz quadrada? ");
        int num = entrada.nextInt();                    //Armazena a entrada do usuário em "num"
        
        System.out.println();

        int resultadoRaiz = equacao.raiz(num);            //Invoca o método "raiz" com o número que o usuário digitou e armazena em "resultadoRaiz"
        System.out.println("Resultado da parte inteira da raiz de "+ num + " é: " + resultadoRaiz + ".");     //retorna o resultado da raíz.

        System.out.println();

        System.out.println("A equação de Pell's fará " + resultadoRaiz + " números de passos: ");
        int valor = num;
        int subtrair = 0;
        
        
        while (valor > 0) {
            subtrair = (subtrair + 1);              // Incrementa subtrair
        
            if (subtrair % 2 != 0) {                //Verifica se o valor de "subtrair" é ímpar
                int novoValor = valor - subtrair;   //Armazena o calculo em "novoValor"
        
                if (novoValor < 0) {                //Verifica se o resultado da soma em "novoValor" é negativa, se sim, sai do loop
                    break;                          
                }
        
                System.out.print(valor + " - " + subtrair + ": ");
                valor = novoValor;                  //Retorna o valor de "novoValor" para "valor"
                System.out.println(valor);          
            }
        }
                
    }    

}