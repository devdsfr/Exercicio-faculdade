
package exe123;

import java.util.Scanner;
public class Exe123 {

    
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        float f,c;
        int i=50;
        System.out.println("Informe a temperatura em Fahrenheit");
        f = ent.nextFloat();
        c=(f-2)*5/9;
        System.out.println("A temperatura é: "+c+" Graus Celsius");
        while (i<=150){
            
            System.out.println(f+ "ºF <-> "+c+ " ºC");
            i++;
        }
    }
    
}
