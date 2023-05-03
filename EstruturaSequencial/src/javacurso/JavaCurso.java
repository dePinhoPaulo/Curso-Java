
package javacurso;

import java.util.Locale;
import java.util.Scanner;

public class JavaCurso {

    public static void main(String[] args) {
        
//        double x = 10.35784;
//        String nome = "Maria";
//        int idade = 31;
//        double renda = 4000.0;
//        
//        System.out.println(x);
//        System.out.printf("%.2f%n", x);
//        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
//        System.out.printf("%.4f%n", x);
//        System.out.println("RESULTADO = " + x + " METROS");
//        System.out.printf("RESULTADO = %.2f METROS%n", x);
//        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
  
        Scanner sc = new Scanner(System.in);
        
//        String x;
//        int a;
//        double b;
//        x = sc.next();
//        a = sc.nextInt();
//        b = sc.nextDouble();

        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        
        System.out.println("Voce digitou: ");
//        System.out.println(x);
//        System.out.println(a);
//        System.out.println(b);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        sc.close();
    }
}

    
