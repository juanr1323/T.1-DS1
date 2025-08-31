import java.util.Scanner;
public class diaYmes {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int diaMax = 0, mes, dia;
        boolean fechaValida = false;
        do {
            System.out.println("\n------------------------------------------------Ingresa el mes------------------------------------------------ ");
            System.out.println("|1-Enero|2-Febrero|3-Marzo|4-Abril|5-Mayo|6-Junio|7-Julio|8-Agosto|9-Septiembre|10-Octubre|11-Noviembre|12-Diciembre|");
            if (!leer.hasNextInt()) {
                System.out.println("ERROR: el mes debe ser un número entero");
                leer.next();
                continue;
            }
            mes = leer.nextInt();
            if (mes <= 12 && mes >= 1) {
                switch (mes) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        diaMax = 31;
                        break;
                    case 4, 6, 9, 11:
                        diaMax = 30;
                        break;
                    case 2:
                        diaMax = 29;
                        break;
                }
                System.out.println("------------------------------------------------Ingresa el dia------------------------------------------------ ");
                if (!leer.hasNextInt()) {
                    System.out.println("ERROR: el día debe ser un numero entero");
                    leer.next();
                    continue;
                }
                dia = leer.nextInt();
                if (dia < 1 || dia > diaMax) {
                    System.out.println("Dia introducido no valido");
                    System.out.println("Este mes solo contiene " + diaMax + " días");
                } else {
                    System.out.println("La fecha introducida es: " + dia + "/" + mes);
                    fechaValida = true;
                }
                }else {
                System.out.println("Mes introducido no valido");
            }
        } while (!fechaValida);
    }
}



