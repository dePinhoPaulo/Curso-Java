
package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        int hora;
//                
//        System.out.println("Que Horas sao?");
//        hora = sc.nextInt();
//                      
//        if(hora < 12){
//            System.out.println("Bom Dia!!");
//        } 
//        else if(hora >= 12 && hora <= 18){
//            System.out.println("Bom Tarde!!");
//        } 
//        else if(hora > 18){
//            System.out.println("Bom Noite!!");
//        }
        
//        int minutos = sc.nextInt();
//        
//        double conta = 50.0;
//        if (minutos > 100) {
//            conta += (minutos - 100) * 2.0;
//        }
//        
//        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        
        int z = sc.nextInt();
        String dia;
        
        switch (z){
            case 1:
                dia="Domingo";
                break;
            case 2:
                dia="Segunda";
                break;
            case 3:
                dia="Terca";
                break;
            case 4:
                dia="Quarta";
                break;
            case 5:
                dia="Quinta";
                break;
            case 6:
                dia="Sexta";
                break;
            case 7:
                dia="Sabado";
                break;
            default:
                dia="Valor invalido";
                break;
        }
        System.out.println("DIA DA SEMANA: "+dia);
        
        sc.close();
    }
    
}
