import java.util.Scanner;

public class AnalizadorConsumo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double lunes;
        double martes;
        double miercoles;
        double jueves;
        double viernes;

        double promedio;
        double promedioAnterior;
        double porcentaje;

        String nivel;
        String resultado;

        System.out.println("====================================");
        System.out.println("     ANALIZADOR DE CONSUMO");
        System.out.println("====================================");

        System.out.print("Ingrese el consumo del lunes: ");
        lunes = teclado.nextDouble();

        System.out.print("Ingrese el consumo del martes: ");
        martes = teclado.nextDouble();

        System.out.print("Ingrese el consumo del miercoles: ");
        miercoles = teclado.nextDouble();

        System.out.print("Ingrese el consumo del jueves: ");
        jueves = teclado.nextDouble();

        System.out.print("Ingrese el consumo del viernes: ");
        viernes = teclado.nextDouble();


        promedio = (lunes + martes + miercoles + jueves + viernes) / 5;


        if (promedio < 8) {

            nivel = "CONSUMO BAJO";

        } else if (promedio >= 8 && promedio <= 12) {

            nivel = "CONSUMO NORMAL";

        } else if (promedio > 12 && promedio <= 16) {

            nivel = "CONSUMO ALTO";

        } else {

            nivel = "CONSUMO CRITICO";
        }


        System.out.print("Ingrese el promedio anterior: ");
        promedioAnterior = teclado.nextDouble();


        porcentaje = ((promedio - promedioAnterior) / promedioAnterior) * 100;


        if (porcentaje < 0) {

            resultado = "El consumo disminuyo";

        } else if (porcentaje >= 0 && porcentaje <= 10) {

            resultado = "El consumo aumento ligeramente";

        } else if (porcentaje > 10 && porcentaje <= 25) {

            resultado = "El consumo aumento considerablemente";

        } else {

            resultado = "ALERTA: aumento elevado del consumo";
        }


        System.out.println();
        System.out.println("====================================");
        System.out.println("        RESULTADO DEL ANALISIS");
        System.out.println("====================================");

        System.out.println("Promedio de consumo: " + promedio);
        System.out.println("Nivel: " + nivel);
        System.out.println("Promedio anterior: " + promedioAnterior);
        System.out.println("Promedio actual: " + promedio);
        System.out.println("Variacion: " + porcentaje + "%");
        System.out.println("Resultado: " + resultado);

        teclado.close();
    }
}