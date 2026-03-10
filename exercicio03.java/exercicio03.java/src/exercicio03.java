import java.util.Scanner;  //Lucas Belisario - 1261929907

public class exercicio03{

public static void main(String[] args) {
    double Sal01;
    double con01 = 4.95;
    double resultado;
    
    Scanner entrada = new Scanner(System.in);


    System.out.printf("Digite o valor do seu salário");
    Sal01 = entrada.nextDouble();
    resultado = Sal01 * con01;

    System.out.printf("A conversão do seu salário fica em :   " + resultado);


}
}

