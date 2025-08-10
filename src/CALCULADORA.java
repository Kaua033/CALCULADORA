import java.util.Scanner;

public class CALCULADORA {
    public static void main(String[] args) {
//CALCULADORA

        //CAIXA DE TEXtos
        Scanner ini_Sacnner = new Scanner(System.in);
        System.out.println("-------CALCULADORA-----");
        System.out.println("fale seu numero:");
        double num1 = ini_Sacnner.nextDouble();

        System.out.println("fale seu operador:");
        System.out.println("(+ - * /) ");
//Oso CHAR se da para chamar operadores do calculo, que sao a mesma String
        char opr = ini_Sacnner.next().charAt(0);


        System.out.println("segundo numero:");
        double num2 = ini_Sacnner.nextDouble();

        // ICIALIZAÇAO
   double resultado;
           // switch
        switch (opr ){
            case '+':
                    resultado = num1 + num2;
                    System.out.println("O resultado da soma: " +resultado);
                            break;
                case '_':
                    resultado = num1 - num2;
                    System.out.println("O resultado da subtraçao: " +resultado);
                          break;

            case '*':
                   resultado = num1 * num2;
                   System.out.println("O resultado da multiplicaçâo: " +resultado);
                           break;

            case '/':
                if ( num2 != 0 ){
                resultado = num1 / num2;
                    System.out.println("O resultado da divisao: " +resultado);
                }else {
                    System.out.println("nao dividido");
                }
        break;
            default:
                System.out.println("nao ha nada");
        }
ini_Sacnner.close();
        }



}
