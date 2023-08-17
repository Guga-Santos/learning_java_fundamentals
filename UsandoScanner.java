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
    System.out.println("Quanto você ganha por mês? ");
    String salario = scanner.next();
    System.out.println("Quanto você precisa pra realizar seu sonho?");
    String sonho = scanner.next();

    int sal = Integer.parseInt(salario);
    int son = Integer.parseInt(sonho);

    int resultado = son / sal;

    System.out.println("Não desanime! Você só precisa trabalhar mais " + resultado + " meses para conquistar tudo que mais quer!");






    scanner.close();
  }
}
