public class Sueldo_Trabajadores {

    public void nosaludo(String nombres) {
        System.out.println("Hola, " +nombres);
    }

    public void Sueldo(float horas, float dinero){
        float sueldo = horas * dinero;
        System.out.println("el dinero que te corresponde este mes es: "+sueldo);

    }
    public void Despedida(String adios){
        System.out.println("Gracias por tu arduo trabajo este mes, y a por mas");
    }

}
