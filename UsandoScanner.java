import java.util.Scanner;

class UsandoScanner {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Qual o seu nome?: ");
    String nome = scanner.next();
    System.out.println("Bem-vindo, " + nome + "!");
    System.out.print("Qual seu maior desejo?: ");
    String desejo = scanner.next();
    System.out.println("Você quer " + desejo + " porque?");



    scanner.close();
  }
}
