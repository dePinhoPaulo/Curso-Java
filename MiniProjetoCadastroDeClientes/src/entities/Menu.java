
package entities;

public class Menu {
    public String opcao1 = "1 - Cadastrar Cliente ";
    public String opcao2 = "2 - Mostrar Cliente ";
    public String opcao3 = "3 - Sair ";
    public String opcao4 = "Selecione Uma Opcao: ";
    
    public String toString(){
        return "--- MENU ---"
                + String.format("%n%s", opcao1)
                + String.format("%n%s", opcao2)
                + String.format("%n%s", opcao3)
                + String.format("%n%s", opcao4);
    }
}
