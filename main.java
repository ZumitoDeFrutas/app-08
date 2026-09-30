import java.util.*;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nombre;
        double salario = 600;
        int option;

        System.out.println("******************************");
        System.out.println("1. Programador");
        System.out.println("2. Medico");
        System.out.println("3. administrativo \n");

        System.out.println("Ingresa una opcion: ");
        option = sc.nextInt();

        switch(option) {
            case 1:
                salario = salario + (salario*0.25);
                break;

            case 2:

            case 3:

            default:

                System.out.println("Opcion Invalida");

        }

        JOptionPane.showMessageDialog(null, "El salario es: " + salario);

        System.out.println(
                "──────▄▀▄─────▄▀▄\n" +
                "─────▄█░░▀▀▀▀▀░░█▄\n" +
                "─▄▄──█░░░░░░░░░░░█──▄▄\n" +
                "█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█");

    }

}
