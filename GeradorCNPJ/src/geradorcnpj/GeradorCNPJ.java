
package geradorcnpj;

import java.util.Random;

public class GeradorCNPJ {

    public static void main(String[] args) {
        Random random = new Random();
                       
        int[] cnpj = new int[14]; // array para armazenar os dígitos do CNPJ
        
        for (int i = 0; i < 13 ; i++) {
            int numeroAleatorio = random.nextInt(10); // Gera um número inteiro aleatório entre 0 e 9 
            cnpj[i] = numeroAleatorio;
        }
        
        int primeiro = 5 * cnpj[0];
        int segundo = 4 * cnpj [1];
        int terceiro = 3 * cnpj[2];
        int quarto = 2 * cnpj[3];
        int quinto = 9 * cnpj[4];
        int sexto = 8 * cnpj[5];
        int setimo = 7 * cnpj[6];
        int oitavo = 6 * cnpj[7];
        int nono = 5 * cnpj[8];
        int decimo = 4 * cnpj[9];
        int onze = 3 * cnpj[10];
        int doze = 2 * cnpj[11];
                
        int soma = primeiro + segundo + terceiro + quarto + quinto + sexto + setimo + oitavo + nono + decimo + onze + doze;
        int numeroVerificado1 = soma % 11; // Décimo terceiro numero do CNPJ
        
        cnpj[12] = (numeroVerificado1 < 2) ? 0 : (11 - numeroVerificado1);
        
        int primeiro2 = 6 * cnpj[0];
        int segundo2 = 5 * cnpj[1];
        int terceiro2 = 4 * cnpj[2];
        int quarto2 = 3 * cnpj[3];
        int quinto2 = 2 * cnpj[4];
        int sexto2 = 9 * cnpj[5];
        int setimo2 = 8 * cnpj[6];
        int oitavo2 = 7 * cnpj[7];
        int nono2 = 6 * cnpj[8];
        int decimo2 = 5 * cnpj[9];
        int onze2 = 4 * cnpj[10];
        int doze2 = 3 * cnpj[11];
        int treze2 = 2 * cnpj[12];
                
        int calc = primeiro2 + segundo2 + terceiro2 + quarto2 + quinto2 + sexto2 + setimo2 + oitavo2 + nono2 + decimo2 + onze2 + doze2 + treze2;
        int numeroVerificado2 = calc % 11; // Décimo quarto numero do CNPJ
        
        cnpj[13] = (numeroVerificado2 < 2) ? 0 : (11 - numeroVerificado2);
        
        imprimirCNPJ(cnpj); //Chamar metodo para imprimir o CNPJ
    }
    
    private static void imprimirCNPJ(int[] cnpj) {
        System.out.printf("CNPJ: %02d.%03d.%03d/%04d-%02d\n",
                cnpj[0] * 10 + cnpj[1],
                cnpj[2] * 100 + cnpj[3] * 10 + cnpj[4],
                cnpj[5] * 100 + cnpj[6] * 10 + cnpj[7],
                cnpj[8] * 1000 + cnpj[9] * 100 + cnpj[10] * 10 + cnpj[11],
                cnpj[12] * 10 + cnpj[13]);
    }
}
