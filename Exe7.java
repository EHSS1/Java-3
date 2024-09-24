import java.util.Scanner;
public class Exe7 {
    public static void main(String[] args) throws Exception {
        /* 7. Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino 2:masculino) de uma
        pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes
        Fórmulas:
        o para homens: (72.7 * Altura) – 58
        o para mulheres: (62.1 * Altura) – 44.7 */
        
        String masculino, feminino;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Favor digite seu nome, sexo masculino ou feminino e sua altura.");
        String nome = scan.nextLine();
        String sexo = scan.nextLine();
        double altura = scan.nextDouble();

        if(sexo.equals("masculino")){ double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O peso ideal para " +nome+" é: "+pesoIdeal);
            
        } 
        else if(sexo.equals("feminino")){ double pesoIdeal = (62.1 * altura) - 44.7; 
            System.out.println("O peso ideal para " +nome+" é: "+pesoIdeal);

        } else {
            
        }
        



    }
}
