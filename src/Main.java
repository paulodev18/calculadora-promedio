// src/Main.java - Versión estructurada
public class Main {
    public static void main(String[] args) {
        // Variables
        double num1 = 8.5;
        double num2 = 7.0;
        double num3 = 9.2;
        double promedio;
        
        // Secuencia - cálculo del promedio
        promedio = (num1 + num2 + num3) / 3;
        
        // Condicional - verificar aprobación
        System.out.println("Números: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Promedio: " + promedio);
        
        if (promedio >= 7.0) {
            System.out.println("APROBADO");
        } else {
            System.out.println("REPROBADO");
        }
    }
}
