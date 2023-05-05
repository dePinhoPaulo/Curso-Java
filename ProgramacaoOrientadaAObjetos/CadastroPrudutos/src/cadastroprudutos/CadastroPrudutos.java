
package cadastroprudutos;

import entities.Produto;
import java.util.Locale;
import java.util.Scanner;

public class CadastroPrudutos {

    public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            
            Produto product = new Produto();
            System.out.println("Digite os dados do produto: ");
            System.out.println("Nome: ");
            product.name = sc.nextLine();
            System.out.println("Preco: ");
            product.price = sc.nextDouble();
            System.out.println("Quantidade: ");
            product.quantity = sc.nextInt();
            
            System.out.println(product);
            
            System.out.printf("Numero de unidades adicionadas: ");
            int quantity = sc.nextInt();
            product.addQuantity(quantity);
            System.out.println("Atualizacao: "+product);
            
            System.out.printf("Numero de unidades removidas: ");
            quantity = sc.nextInt();
            product.removeQuantity(quantity);
            System.out.println("Atualizacao: "+product);
            
            sc.close();
        }
    
}
