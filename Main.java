import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Digite o nome do aluno:");
      String nome = sc.nextLine();
      System.out.println("informe a idade do aluno:");
      int idade = sc.nextInt();
      sc. close();
      
      System.out.println("aluno " + nome + ", sua idade e " + idade +" anos.");
	}

}
