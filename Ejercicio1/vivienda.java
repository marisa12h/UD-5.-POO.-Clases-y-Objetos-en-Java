package clasevivienda;

public class vivienda {
    //Declarar las variables
    String materiales;
    int edadcasa;
    String muebles;
    String historica;
    double preciocasa;



//Vamos a construir el constructor para inicializar nuestras variables.

    public vivienda(String _materiales, int _edadcasa, String _muebles, String _historica, double _preciocasa){
        this.materiales = _materiales;
        this.edadcasa = _edadcasa;
        this.muebles = _muebles;
        this.historica = _historica;
        this.preciocasa = _preciocasa;
    }
    //Ahora vamos a crear el metodo.

    public void imprimirDatos(){
        System.out.println("Los materiales son: " + materiales);
        System.out.println("Los materiales son: " + edadcasa);
        System.out.println("Los materiales son: " + muebles);
        System.out.println("Los materiales son: " + historica);
        System.out.println("Los materiales son: " + preciocasa);
    }

}