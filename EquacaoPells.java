package POO;

public class EquacaoPells {

    /**
     * A equação de Pells é uma forma de encontrar A PARTE INTEIRA da raíz quadrada de qualquer número:
     * Se substrai números ímpares em ordem crescente do valor total, e o número total de operações feitas nos dá o resultado da parte inteira da raiz
     * daquele número!
     * @param numero
     * @return a raíz quadrada de um número convertida em inteiro (pois não queremos os decimais, apenas a parte inteira)
     */

    //Cria método que calcula a parte inteira da raíz de qlqr número (método do tipo String, pois ele retornará um tipo String!)    
    int raiz(int  numero){
        double resultadoDouble = Math.sqrt(numero);     //chama método que calcula a raiz² de um número e armazena em "resultadoDouble"
        int resultadoInt = (int) resultadoDouble;       //faz uma conversão explícita de double para int. 
        return resultadoInt;   //retorno do tipo String.

    }

}


































//     static ArrayList<Integer> listagemImpares(Integer numero) {
//         ArrayList<Integer> arrayImpares = new ArrayList<Integer>();

//         //Loop que gera valores ímpares no ArrayList
//         Integer totalNumeros = 0;                   //inicia o contador "totalNumeros" com zero
//         while (totalNumeros <= 1000) {

//             if (numero % 2 != 0) {                  //verifica se o número é ímpar
//                 arrayImpares.add(numero);
//             }

//             numero = (numero + 1);              //atualiza a variável "numero" com incremento
//             totalNumeros = (totalNumeros +1);   //atualiza o contador "totalNumeros" com incremento
//         }        
//         return arrayImpares;

//     }
    
// }



// void listaImpares(int numero) {
    //     int arraySimplesImpares[] = {3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,
    //         41,43,45,47,49,51,53,55,57,59,61,63,65,67,69,71,73,75,77,79,81,83,85,87,89,91,93,95,97,99};
    // }