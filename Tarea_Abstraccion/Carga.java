
package Tarea_Abstraccion;


public class Carga extends Terrestre{
    
    private int carga;

    public Carga(String matricula, String marca, int pasajeros, String color, String modelo, int ruedas, int puertas, int carga) {
        super(matricula, marca, pasajeros, color, modelo, ruedas, puertas);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public void mostrarDatos(){
       System.out.println("El camion de carga tiene matricula "+getMatricula()+"\n marca "+getMarca()+"tiene capacidad para "+getPasajeros()+"\nes de color "+getColor()+"\n modelo "+getModelo()+"\n tiene "+getRuedas()+" ruedas"+
               "\ntiene "+getPuertas()+" y una capacidad de carga de  "+carga+" toneladas");
       
           
       }
    
    @Override
    public void funcion(){
    System.out.println("su funcion es llevar difderentes tipos de material, sulene ser cargas de mucho peso");
    
}
        
    
}
