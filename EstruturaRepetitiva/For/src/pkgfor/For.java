
package pkgfor;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
//        System.out.printf("QUANT NUMEROS PARA SOMAR: ");
//        int N = sc.nextInt();
//        int soma = 0;
//        
//        for(int i=0; i<N ; i++){
//            int x = sc.nextInt();
//            soma += x;
//        }
//        
//        System.out.println("SOMA: "+soma);
//        
//        Exercico For:Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
        System.out.printf("DIGITE UM VALOR: ");
        int N = sc.nextInt();
        
        for(int i=0; i<=N ; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }     
    }
    
}
