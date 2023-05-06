
package entities;

public class Cliente {
    public String nome;
    public int idade;
    public String cpf;
    
    public String toString(){
        return String.format("%n%n%%n")
                + "Nome: "
                + nome
                + ", Idade: "
                + idade
                + ", CPF: "
                + cpf;
    }
}
