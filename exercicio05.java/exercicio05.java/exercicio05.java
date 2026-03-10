import java.util.Scanner;   //Lucas Belisario - 1261929907

public class exercicio05{
    public static void main (String[] args){
    

        double Nota01;
        double Nota02;
        double Nota03;
        double resultado;

         
    Scanner entrada = new Scanner(System.in);   
    
    System.out.print("Informe sua primeira nota:    ");
    Nota01 = entrada.nextDouble();
    System.out.print("Digite sua segunda nota:   ");
    Nota02 = entrada.nextDouble();
    System.out.print("Infome sua última nota:   ");
    Nota03 = entrada.nextDouble();
    resultado = (Nota01 + Nota02 + Nota03) / 3;

    System.out.printf("O resultado da sua conta é " + resultado);

    }



    
}

