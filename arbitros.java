package Ejercicio2;

public class arbitros {
    String nombre;
    String apellido;
    String paisdenacimiento;
    int tarjetas;
    int faltas;
    int Penaltis;
    int var;



    public arbitros(String _nombre, String _apellido, String _paisdenacimiento, int _tarjetas, int _faltas, int _Penaltis, int _var){
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.paisdenacimiento = _paisdenacimiento;
        this.tarjetas = _tarjetas;
        this.faltas = _faltas;
        this.Penaltis = _Penaltis;
        this.var = _var;
    
    }

    //crear metodo.

    public void imprimirDatos(){
        System.out.println("El nombre de arbitro es: " + nombre);
        System.out.println("El apellido de arbitro es: " + apellido);
        System.out.println("El pais de nacimiento del arbitro es: " + paisdenacimiento);
        System.out.println("El numero de tarjetas que el arbitro ha puesto son: " + tarjetas);
        System.out.println("El numero de faltas que el pitado ha puesto son: " + faltas);
        System.out.println("El numero de penaltiles que el arbitro ha pitado son: " + Penaltis);
        System.out.println("El numero de veces que el arbitro reviso el var son: " + var);
    }
}


