
package javacurso;

public class JavaCurso {

    public static void main(String[] args) {
//        System.out.println("2 + 2 = "+(2+2));
//        var login = "Ola";
//        login = "Mundo";
//        var pass = "sksadksksada";
//        System.out.println(login);
//        System.out.println(pass);
//        var num = 9;
//        var num2 = 8.6;
//        System.out.println(num + num2);
//        var tot = num2 + num;
//        System.out.println(tot);
        //java atual lê o tipo de dados atomaticamente
        System.out.println("Funcao calc():");
        calc(6, 6);
        
        
        }
    
    static void calc(int num1, int num2){
        System.out.println("soma = "+(num1 + num2));
        System.out.println("Subtracao = "+(num1 - num2));
        System.out.println("divisao = "+(num1 / num2));
        System.out.println("multplicacao = "+(num1 * num2));
    }
}
