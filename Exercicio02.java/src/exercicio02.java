import java.util.Scanner;//Lucas Belisario - 1261929907

public class exercicio02 {
    public static void main (String[] args) {
        int numX;
        int numY;
        int resultado;
        int resultado2;

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Escolha um numero de sua preferencia:   ");
        numX = entrada.nextInt();

        System.out.println(" Escolha outro número agora:  ");
        numY = entrada.nextInt();

        resultado = numX / numY;
        resultado2 = numX % numY;

        System.out.println("O resultado da divisão é: " + resultado);
        System.out.println("O resto da divisão é: " + resultado2);
        


    }
    
}
