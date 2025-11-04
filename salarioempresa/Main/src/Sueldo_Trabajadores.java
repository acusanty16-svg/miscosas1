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

    public int multiplicar(int op1, int op2) {
        int resultado = op1 * op2;
        System.out.println("El metodo esta listo para ser retornado"+resultado);
        return resultado;
    }


    public boolean validarNumero (int numeroValidar) {
        return numeroValidar > 0;
    }
}
