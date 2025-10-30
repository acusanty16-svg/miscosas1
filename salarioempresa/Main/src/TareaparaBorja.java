public class TareaparaBorja {

    public static void main(String[]args){

        int numero1 = 10;
        int numero2 = 5;
        System.out.println("Número 1: "+numero1);
        System.out.println("Número 2: "+numero2);
        Operaciones operacionesMath = new Operaciones();
        operacionesMath.sumaEnteros(numero1, numero2);
        operacionesMath.restaEnteros(numero1, numero2);
        operacionesMath.multiplicacionEnteros(numero1, numero2);
        operacionesMath.divisionEnteros(numero1, numero2);

    }

}
