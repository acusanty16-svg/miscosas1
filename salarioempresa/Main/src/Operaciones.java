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


    public static void Nombre(String nombre) {
        System.out.print("¡Hola! me llamo: "+nombre);

    }
    public void Apellido(String apellido)
    {System.out.print(" "+apellido+ ".\n");
    }
    public void Edad(int edad) {
        System.out.print("Tengo "+ edad+" años y vivo en ");}
    public void Ciudad(String ciudad)

    {
        System.out.print(ciudad+ ".\n");
    }

    public static void base (float basrect){

        System.out.println("Base del rectangulo es: "+ basrect);
    }
    public void altura (float basalt){

        System.out.println("Altura del rectangulo: "+basalt);
    }

    public void area (float base, float altura){

    float area = base * altura;
        System.out.println("El área del rectangulo es: "+area);
    }

   public int multiplicar (int op1, int op2){
        int resultado = op1 * op2;
       System.out.println("el metodo esta listo para retornar"+resultado);
       return resultado;
   }



}
