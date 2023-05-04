
package estruturasrepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturasRepetitivas {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
//        int x = sc.nextInt();
//        int s = 0;
//        
//        while(x != 0){
//            s += x;
//            x = sc.nextInt();
//        }
//        System.out.println("total: "+s);

//          Exercico While:Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
        System.out.printf("Digite a Senha: ");        
        int acesso = sc.nextInt();
        
        while(acesso != 2002){
            System.out.println("Senha Invalida");
            System.out.printf("Digite a Senha: ");
            acesso = sc.nextInt();
        }
        System.out.println("Acesso Permitido!!!");
        
        sc.close();
    }
    
}
