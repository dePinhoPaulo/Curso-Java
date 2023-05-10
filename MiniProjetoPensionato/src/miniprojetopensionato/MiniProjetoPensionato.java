
package miniprojetopensionato;

import entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

public class MiniProjetoPensionato {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Pessoa[] vect = new Pessoa[10];
        
        System.out.print("Quantos quartos vao ser alugados? ");
        int n = sc.nextInt();
        
        for (int i=1; i<=n; i++){
            System.out.printf("Rent #%d: %n",i);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int room = sc.nextInt();
            vect[room] = new Pessoa(name, email);
        }
        
        System.out.println("");
        System.out.println("Quarto Alugados: ");
        
        for(int i=0; i<10; i++){
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }
                
        sc.close();
        
    }
    
}
