
package exe122;
import java.util.Scanner;

public class Exe122 {

   
    public static void main(String[] args) {
        Scanner ent= new Scanner(System.in);
        int i=0,qt_homens=0,qt_mulheres=0;
        double media,altura,s_altura=0,maior=0,menor=0;
        String sexo;
        
        while(i<=50){
            System.out.println("Informe o seu sexo ");
            sexo=ent.next();
            System.out.println(" Informe a sua altura");
            altura = ent.nextDouble();
            if ("M".equals(sexo))
                qt_homens+=1;
            if ("F".equals(sexo)){
                qt_mulheres+=1;
                s_altura+= altura;
            }
            if (i==1){
                maior=altura;
                menor=altura;
            }
            if(menor>altura){
                menor=altura;
            }
            if(maior<altura){
                maior=altura;
            }
        i++;    
        }
        media=s_altura/qt_mulheres;
        
        System.out.println("A maior altura do grupo é: "+maior);
        System.out.println("A menor altura do grupo è: "+menor);
        System.out.println("Altura média das mulheres:"+media);
        System.out.println("Quantidade de homens: "+qt_homens);
        System.out.println("Quantidade de mulheres: "+qt_mulheres);
       
    }
    
}
