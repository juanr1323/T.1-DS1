
import java.util.Scanner;
public class tiposAngulos{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double angulo;

        System.out.printf("Ingresa el ángulo en grados: ");
        angulo = leer.nextDouble();

        if (angulo < 90){
            System.out.printf("El ángulo es agudo");
        }else if (angulo > 90){
            System.out.printf("El ángulo es obtuso");
         }else{
            System.out.printf("El ángulo es recto");
         }
        }
}
