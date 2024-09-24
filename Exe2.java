import java.util.Scanner;

public class Exe2{
    public static void main(String[] args){
        
        //2. Leia dois números e informa se os mesmos são iguais ou diferentes.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número:");
        int num2 = scan.nextInt();
        if(num1 == num2){
            System.out.println("Os números são iguais!");
        }
        else{
            System.out.println("Os números são diferentes!");


            
        }
    }

}