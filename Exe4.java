import java.util.Scanner;

public class Exe4{
    public static void main(String[] args){
        //4. Leia o nome e quatro notas de um aluno durante o semestre, calcula a média aritmética
        //dessas notas, e informa se o aluno foi aprovado ou reprovado. A média para aprovação é 6.0
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do Aluno: ");
        String nome = scan.nextLine();
        
        System.out.println("Digite a  do primeira nota : ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a  do segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a  do terceira nota: ");
        double nota3 = scan.nextDouble();

        System.out.println("Digite a  do quarta nota: ");
        double nota4 = scan.nextDouble();

        double media;
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A media do aluno: "+nome+ " é " +media);



         if(media > 6.00){
            System.out.println("O aluno "+nome+ "de media"+media+ "foi aprovado com louvor" );
         }


    }

}

