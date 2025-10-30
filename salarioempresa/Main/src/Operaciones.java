public class Operaciones {

    public void sumaEnteros(int op1, int op2) {
        int resultado = op1 + op2;
        System.out.println("Suma: " + resultado);
    }
    public void restaEnteros(int op1, int op2) {
        int resultado = op1 - op2;
        System.out.println("Resta: " + resultado);

    }
    public void multiplicacionEnteros(int op1, int op2) {
        int resultado = op1 * op2;
        System.out.println("Multiplicación: " + resultado);

    }
    public void divisionEnteros(int op1, int op2) {
        int resultado = op1 / op2;
        System.out.println("División: " + resultado);

    }


    public static String Nombre(String nombre) {
        System.out.println("Hola" + nombre);
        return nombre;
    }
    public void Apellido(String apellido) {
        System.out.println(apellido);
    }
    public void Edad(int edad) {
        System.out.println();}
    public void Ciudad(String ciudad) {
        System.out.println("Hola" + ciudad);
    }
}
