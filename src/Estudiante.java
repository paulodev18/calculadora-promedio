// src/Estudiante.java
public class Estudiante {
    // Atributos
    private String nombre;
    private double[] calificaciones;
    
    // Constructor
    public Estudiante(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }
    
    // Método para calcular promedio
    public double calcularPromedio() {
        double suma = 0;
        for (double calif : calificaciones) {
            suma += calif;
        }
        return suma / calificaciones.length;
    }
    
    // Método para verificar si aprueba
    public boolean estaAprobado() {
        return calcularPromedio() >= 7.0;
    }
    
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre);
        System.out.print("Calificaciones: ");
        for (double calif : calificaciones) {
            System.out.print(calif + " ");
        }
        System.out.println("\nPromedio: " + calcularPromedio());
        System.out.println("Estado: " + (estaAprobado() ? "APROBADO" : "REPROBADO"));
    }
}

