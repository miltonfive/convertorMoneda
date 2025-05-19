import java.text.DecimalFormat;
import java.util.Scanner;

public class convertorMoneda {
    public static void main(String[] args) {
        double dollarArgentino = 1141.69;
        double dollarBrasileno = 5.66;
        double dollarColombiano = 4206.93;
        double dollarChileno = 943.40;
        double dollarUruguayo = 41.71;
        int opcion = 0;

        DecimalFormat df = new DecimalFormat("#.00"); //Formato para dos decimales


        System.out.println("***************************************");
        System.out.println("Sea bienvenido/a al Conversor de Moneda =");
        System.out.println("               ");
        System.out.println("Dollar =>> Peso Argentino");
        System.out.println("Peso Argentino =>> Dollar");
        System.out.println("Dollar =>> Real Brasileño");
        System.out.println("Real Brasileño =>> Dollar");
        System.out.println("Dollar =>> Peso Colombiano");
        System.out.println("Peso Colombiano =>> Dollar");
        System.out.println("Dollar =>> Peso Chileno ");
        System.out.println("Peso Chileno =>> Dollar ");
        System.out.println("Dollar =>> Peso Uruguayo ");
        System.out.println("Peso Uruguayo =>> Dollar");
        System.out.println("Salir");
        System.out.println("Elija una solucion valida");
        System.out.println("***************************************");

        String menu = """
                *** Sea bienvenido/a al Conversor de Moneda ***
                
                1.- Dolar =>> Peso Argentino
                2.- Peso Argentino =>> Dolar
                3.- Dolar =>> Real Brasileño
                4.- Real Brasileño =>> Dolar
                5.- Dolar =>> Peso Colombiano
                6.- Peso Colombiano =>> Dolar
                7.- Dolar =>> Peso Chileno
                8.- Peso Chileno =>> Dolar
                9.- Dolar =>> Peso Uruguayo
                10,.Peso Uruguayo =>> Dolar
                11.- Salir
                Elija una solucion valida:""";

        Scanner teclado = new Scanner(System.in);
        while (opcion != 11) {
            System.out.println(menu);
            opcion = teclado.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("Cuanto desea transformar de Dolares a Pesos Argentinos");
                    double dollarP = teclado.nextDouble();
                    double resultado1 = dollarArgentino * dollarP;
                    System.out.println("Usted tiene un valor de = " + df.format(resultado1) + " Pesos Argentino");
                    break;
                case 2:
                    System.out.println("Cuanto desea transformar de Pesos Argentinos a Dolares ");
                    double argentD = teclado.nextDouble();
                    double resultado2 = argentD / dollarArgentino ;
                    System.out.println("Usted tiene un valor de = " + df.format(resultado2) + " Dolares");
                    break;
                case 3:
                    System.out.println("Cuanto desea transformar de Dolares a Reales Brasileños");
                    double dollarBra = teclado.nextDouble();
                    double resultado3 = dollarBrasileno * dollarBra;
                    System.out.println("Usted tiene un valor de = " + df.format(resultado3)+ " Reales Brasileños");
                    break;
                case 4:
                    System.out.println("Cuanto desea transformar de Real Brasileños a Dolares");
                    double brasilD = teclado.nextDouble();
                    double resultado4 =  brasilD / dollarBrasileno ;
                    System.out.println("Usted tiene un valor de = " + df.format(resultado4) + " Dolares");
                    break;
                case 5:
                    System.out.println("Cuanto desea transformar de Dolares a Pesos Colombianos");
                    double dollarC = teclado.nextDouble();
                    double resultado5 = dollarColombiano * dollarC;
                    System.out.println("Usted tiene un valor de = " + df.format(resultado5) + " Pesos Colombianos");
                    break;
                case 6:
                    System.out.println("Cuanto desea transformar de Pesos Colombianos a Dolares");
                    double colomD = teclado.nextDouble();
                    double resultado6 =  colomD / dollarColombiano;
                    System.out.println("Usted tiene un valor de = " + df.format(resultado6) + " Dolares");
                    break;
                case 7:
                    System.out.println("Cuanto desea transformar de Dolares a Pesos Chilenos");
                    double dollarCh = teclado.nextDouble();
                    double resultado7 = dollarChileno * dollarCh;
                    System.out.println("Usted tiene un valor de = " + df.format(resultado7) + " Pesos Chileno");
                    break;
                case 8:
                    System.out.println("Cuanto desea transformar de Pesos Chilenos a Dolares ");
                    double chileD = teclado.nextDouble();
                    double resultado8 = chileD / dollarChileno ;
                    System.out.println("Usted tiene un valor de = " + df.format(resultado8) + " Dolares");
                    break;
                case 9:
                    System.out.println("Cuanto desea transformar de Dollar a Peso Uruguayo");
                    double dollarU = teclado.nextDouble();
                    double resultado9 = dollarUruguayo * dollarU;
                    System.out.println("Usted tiene un valor de = " + df.format(resultado9) + " Pesos Uruguayo");
                    break;
                case 10:
                    System.out.println("Cuanto desea transformar de Peso Uruguayo a Dolares");
                    double urugD = teclado.nextDouble();
                    double resultado10 =  urugD / dollarUruguayo;
                    System.out.println("Usted tiene un valor de = " + df.format(resultado10) + " Dolares");
                    break;
                case 11:
                    System.out.println("Saliendo del programa, gracias por utilizar el Convertor de Moneda Marca MACH ");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}