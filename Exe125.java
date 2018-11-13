
package exe125;


public class Exe125 {

    
    public static void main(String[] args) {
        double b=200000000,a=90000000,age=0;
        while(b>a){
            a=a*1.03;
            b=b*1.015;
            age = age +1;
            
        }
        System.out.println("A população de A é: "+a+" ultrapassará a de B é: "+b+" em "+age+ " anos");
        
    }
    
}
