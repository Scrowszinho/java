/* Luis Gustavo Godoy Camargo */
import java.io.IOException;
import java.util.Scanner;

public class Exer38 {
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);
        int res, a = 0,b = 1;
        do {
            System.out.print("Escreva o valor: ");
            res = leia.nextInt();
            if(res<0){
                System.out.println("Digite um valor positivo");
            }
        } while (res <= 0);
        System.out.print(" "+a);

    do{
        System.out.print(" , "+a+"/"+b+" , "); 
        a++;
        b++;
    }while(a<=res);


      leia.close();
    }
}
