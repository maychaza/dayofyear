package ada.prueba;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el dia");
        int dia = sc.nextInt(); // lee lo que el usuario escribe
        System.out.println("ingrese el mes:");
        int mes = sc.nextInt();

        LocalDate elCumple = LocalDate.of(2021, mes, dia);
        int diadelanio= elCumple.getDayOfYear(); // para saber el dia del año
        System.out.println("el dia del año es: "+diadelanio);
    }
}
