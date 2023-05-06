package projetocalculate;

public class ProjetoCalculate {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        
        if(args[0].equals("soma")){
            sum(x, y);
        } else if(args[0].equals("menos")){
            minus(x, y);
        } else if(args[0].equals("divide")){
            divide(x, y);
        } else if(args[0].equals("multi")){
            multi(x, y);
        } 
    }
    
    static void sum(int x, int y){
        System.out.println("Resultado: "+(x+y));
    }
    
    static void minus(int x, int y){
        System.out.println("Resultado: "+(x-y));
    }
    
    static void divide(int x, int y){
        System.out.println("Resultado: "+(x/y));
    }
    
    static void multi(int x, int y){
        System.out.println("Resultado: "+(x*y));
    }
}
