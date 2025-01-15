import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int contador=0;
        double cantidad;
        double resultado;
        ConversorMonedas conversor=new ConversorMonedas();
        String menu= """
                ***********************************************
                Bienvenido/a al conversor de monedas
                
                1) Dolar =>> Peso argentino
                2) Peso argentino ==> Dolar
                3) Dolar ==> Real brasileno
                4) Real brasileno ==> Dolar
                5) Dolar ==> Peso colombiano
                6) Peso Colombiano ==> Dolar
                7) Salir
                ***********************************************
                """;


        while(contador!= 7){
            System.out.println(menu);
            contador=lectura.nextInt();
            switch (contador){
                case 1:
                    System.out.println("Que cantidad deseas convertir :");
                    cantidad=lectura.nextDouble();
                    resultado= conversor.convertir("USD","ARS",cantidad);
                    System.out.println(" "+cantidad+" USD son : "+resultado+" ARS");

                    break;
                case 2:
                    System.out.println("Que cantidad deseas convertir :");
                    cantidad=lectura.nextDouble();
                    resultado= conversor.convertir("ARS","USD",cantidad);
                    System.out.println(" "+cantidad+" ARS son : "+resultado+" USD");

                    break;
                case 3:
                    System.out.println("Que cantidad deseas convertir :");
                    cantidad=lectura.nextDouble();
                    resultado= conversor.convertir("USD","BRL",cantidad);
                    System.out.println(" "+cantidad+" USD son : "+resultado+" BRL");

                    break;
                case 4:
                    System.out.println("Que cantidad deseas convertir :");
                    cantidad=lectura.nextDouble();
                    resultado= conversor.convertir("BRL","USD",cantidad);
                    System.out.println(" "+cantidad+" BRL son : "+resultado+" USD");

                    break;
                case 5:
                    System.out.println("Que cantidad deseas convertir :");
                    cantidad=lectura.nextDouble();
                    resultado= conversor.convertir("USD","COP",cantidad);
                    System.out.println(" "+cantidad+" USD son : "+resultado+" COP");

                    break;
                case 6:
                    System.out.println("Que cantidad deseas convertir :");
                    cantidad=lectura.nextDouble();
                    resultado= conversor.convertir("COP","USD",cantidad);
                    System.out.println(" "+cantidad+" COP son : "+resultado+" USD");

                    break;
                case 7:
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Error vuelva a escoger");
                    break;



            }
        }


    }
}
