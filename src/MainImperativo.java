// src/MainImperativo.java
public class MainImperativo {
    public static void main(String[] args) {
        double[] numeros = {8.5, 7.0, 9.2, 6.5, 8.0};
        double suma = 0.0;
        double promedio = 0.0;
        int aprobados = 0;
        
        // Bucle para sumar y contar aprobados
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];  // Acumulación
            if (numeros[i] >= 7.0) {
                aprobados++;  // Cambio de estado
            }
        }
        
        promedio = suma / numeros.length;
        
        System.out.println("Lista de notas:");
        for (double nota : numeros) {
            System.out.print(nota + " ");
        }
        System.out.println("\nSuma total: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + (numeros.length - aprobados));
    }
}

