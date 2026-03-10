import java.util.Scanner; //Lucas Belisario - 1261929907


public class Exercicio04 {

    public static void main(String[] args){

double salog;
final double nvsal;
    
Scanner entrada = new Scanner(System.in);

System.out.printf("digite seu salário atual: ");
salog = entrada.nextDouble();
nvsal = salog * 1.07;
System.out.printf("Seu novo salário é : %.2f", nvsal);
}
}