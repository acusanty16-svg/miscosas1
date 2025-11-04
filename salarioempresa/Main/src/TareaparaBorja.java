public class TareaparaBorja {

    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 5;
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        Operaciones operacionesMath = new Operaciones();
        operacionesMath.sumaEnteros(numero1, numero2);
        operacionesMath.restaEnteros(numero1, numero2);
        operacionesMath.multiplicacionEnteros(numero1, numero2);
        operacionesMath.divisionEnteros(numero1, numero2);


        informacion("Maria");
        ape("García");
        eda(24);
        ciud("Barcelona");

        float Base = 15;
        float Altura = 24;

        base(Base);
        altura(Altura);
        area(Base, Altura);


        int temperatura = 25;
        int temperatur = 13;

        Celcius(temperatura);
        Fahrenheit(temperatur);
        area(temperatura, temperatur);
    }

    public static void informacion(String nombres) {

        Operaciones aleatorio = new Operaciones();
        aleatorio.Nombre(nombres);

    }

    public static void ape(String apellido) {

        Operaciones aleatorio = new Operaciones();
        aleatorio.Apellido(apellido);
    }

    public static void eda(int edad) {

        Operaciones aleatorio = new Operaciones();
        aleatorio.Edad(edad);
    }

    public static void ciud(String ciudad) {
        Operaciones aleatorio = new Operaciones();
        aleatorio.Ciudad(ciudad);
    }


    public static void base(float rectangulo) {

        Operaciones area = new Operaciones();
        area.base(rectangulo);
    }

    public static void altura(float rectangulo) {
        Operaciones area = new Operaciones();
        area.altura(rectangulo);
    }

    public static void area (float base, float altura ){

        Operaciones rectangul = new Operaciones();
        rectangul.area(base, altura);

    }

    public static void Celcius (int temperatura){

        System.out.println("la temperatura en Celcius es: "+temperatura);
    }
    public static void Fahrenheit (int temperatura){
        System.out.println("la temperatura en Fahrenheit es: "+ temperatura);
    }
    public static void area (int op1, int op2){
        int formula = ((op1 * 9/5) +32)/op2;
        System.out.println("La formula es igual a: "+formula);
    }

}
