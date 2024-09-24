import java.util.Scanner;

public class Exe3{
    public static void main(String[] args){
        
        //3. Leia dois números diferentes e informe qual deles é o maior.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scan.nextInt();
        if(num1 > num2){
            System.out.println("O número "+num1+" é maior que segundo número digitado: "+num2);
        }
        else{
            System.out.println("O número" +num2+"é maior que o primeiro número digitado: "+num1);
        }
    }
}