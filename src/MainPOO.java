// src/MainPOO.java
public class MainPOO {
    public static void main(String[] args) {
        // Crear objeto Estudiante
        double[] notas = {8.5, 7.0, 9.2, 6.5};
        Estudiante alumno = new Estudiante("Juan Pérez", notas);

        // Usar métodos del objeto
        alumno.mostrarInfo();

        // Crear otro estudiante
        double[] notas2 = {5.5, 6.0, 4.5};
        Estudiante alumno2 = new Estudiante("María García", notas2);
        alumno2.mostrarInfo();
    }
}
