public class Entrada {

    public static void main( String[]args){
        System.out.println("Proyecto metodos");
        System.out.println("Vamos a reaalizar llamadas a metodos\n");
     saludar("juanito");
     despedir();
     saludar("David");
     despedir();
     saludar("Maria");
     despedir();
    //Operaciones.sumar(4,4); //estoy exportando el resultado desde otra clase, pero es peligroso dejar la clase static, porque me pueden tomar los datos

        Sueldo_Trabajadores sueldodeloschicos = new Sueldo_Trabajadores();
       sueldodeloschicos.nosaludo("Luis");
       sueldodeloschicos.Sueldo(120f, 8.65f);
       sueldodeloschicos.Despedida("");
    }

    public static void saludar(String nombreodataoloquesea){
        System.out.println("Hola "+nombreodataoloquesea);
        System.out.println("encantado de saludarte, vamos a practicar");
        System.out.println("vamos a practicar el llamado de metodos");
        System.out.println("vamos a por el dia\n");

    }
    public static void despedir (){
        System.out.println("Bonico a pasar la tarde en casa\n");
    }
}