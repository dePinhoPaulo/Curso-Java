
package main;

import entities.Cliente;
import entities.Menu;
import java.util.Scanner;

public class CadastroDeClientes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Menu menu = new Menu();
        
        int selecao;
         
        do{
        System.out.println(menu);
        
        selecao = sc.nextInt();
        
        if(selecao == 1){
            System.out.println("Digite os dados do Cliente: ");
            System.out.printf("Nome: ");
            cliente.nome = sc.next();
            System.out.printf("Idade: ");
            cliente.idade = sc.nextInt();
            System.out.printf("CPF: ");
            cliente.cpf = sc.next();
            
            
            System.out.printf("%n%n--- Cliente Cadastrado ---");
            System.out.printf("--- Cliente Cadastrado ---");
            System.out.printf("--- Cliente Cadastrado ---%n%n");
            
        } else if(selecao == 2){
            
            System.out.println(cliente);
            
        }
        
        }while(selecao != 3);
        
        System.out.printf("%n%n--- Programa finalizado, Ate mais!!! ---%n%n");
        
        sc.close();
    }
    
}
