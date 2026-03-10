import java.util.Scanner;//Lucas Belisario - 1261929907

public class exercicio01{
    public static void main (String[] args) {
        int numA;
        int numB;
        int resultado;
       
        
        double resultado2;
        
        double resultado3;
        
        double resultado4;
        

        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n Informe o primeiro numero: \n");
        numA = entrada.nextInt();
        
        System.out.println("\nInforme o segundo numero:\n");
        numB = entrada.nextInt();
        resultado = numA + numB;
        resultado2 = numA - numB;
        resultado3 = numA * numB;
        resultado4 = numA / numB;

        
        System.out.println("\n7O Resultado da soma é: \n" + resultado);
        System.out.println("\nO Resultado da subtração é: \n" + resultado2);
        System.out.println("\nO Resultado da multiplicação é: \n" + resultado3);
        System.out.println("\nO Resultado da divisão é: \n" + resultado4);
    }
}
