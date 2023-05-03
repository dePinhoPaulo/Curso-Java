
package estruturasrepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturasRepetitivas {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int s = 0;
        
        while(x != 0){
            s += x;
            x = sc.nextInt();
        }
        System.out.println("total: "+s);
        
        sc.close();
    }
    
}
