import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        PreguntarDivisa consulta = new PreguntarDivisa();

        int opciones = 0;

        while (opciones != 7){
            System.out.println("------------------------------\n"  +
                    "Bienvenido al conversor de divisas\n\n" +
                    "1. Peso Colombiano a Dolar\n" +
                    "2. Dolar a Peso Colombiano\n" +
                    "3. Real Brasilero a Dolar\n" +
                    "4. Dolar a Real Brasilero\n" +
                    "5. Peso Chileno a Dolar\n" +
                    "6. Dolar a Peso a Chileno\n" +
                    "7. Salir" );
            opciones = lectura.nextInt();
            lectura.nextLine();
            switch (opciones) {
                case 1:
                    ConvertirDivisa.convertir("COP", "USD", consulta, lectura);
                    break;
                case 2:
                    ConvertirDivisa.convertir("USD", "COP", consulta, lectura);
                    break;
                case 3:
                    ConvertirDivisa.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 4:
                    ConvertirDivisa.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 5:
                    ConvertirDivisa.convertir("CLP", "USD", consulta, lectura);
                    break;
                case 6:
                    ConvertirDivisa.convertir("USD", "CLP", consulta, lectura);
                    break;
                case 7:
                    System.out.println("Saliendo.....");
                    break;

            }

        }
    }
}












