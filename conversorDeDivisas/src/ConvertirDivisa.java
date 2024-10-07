import java.util.Scanner;

public class ConvertirDivisa {
    public static void convertir(String divisaBase, String divisaUsuario, PreguntarDivisa consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Divisas divisa = consulta.buscarDivisa(divisaBase, divisaUsuario);
        System.out.println("La tasa de conversion actual"
 + divisaBase+ " = "+divisa.conversion_rate()+ " "+divisaUsuario);
        System.out.println("Ingrese la cantidad de " + divisaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * divisa.conversion_rate();
        System.out.println(cantidad+ " "+divisaBase+" = " + cantidadConvertida + " " + divisa.target_code());


    }
}

