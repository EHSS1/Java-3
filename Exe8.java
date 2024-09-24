import java.util.Scanner;

public class Exe8{
    public static void main(String[] args){
    /*8. Ler um número e determinar se o mesmo é par ou ímpar. Um número é par se for divisível exato por
    2, ou seja, se o referido número for dividido por 2 e for par o resto será zero */
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        if(num % 2 == 0){
            System.out.println("Esse número é par!");
        } else
          {
            System.out.println("Esse número é impar!");

          }  

        


    }
}


