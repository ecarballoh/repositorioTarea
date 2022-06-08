
package Herencia_Tarea;


public class Bus extends Terrestre{
    
    private int tarifa;

    public Bus(String matricula, String marca, int pasajeros, String color, String modelo, int ruedas, int puertas,int tarifa) {
        super(matricula, marca, pasajeros, color, modelo, ruedas, puertas);
        this.tarifa = tarifa;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    @Override
   public void mostrarDatos(){
       System.out.println("El bus tiene matricula "+getMatricula()+"\n marca "+getMarca()+"tiene capacidad para "+getPasajeros()+"\nes de color "+getColor()+"\n modelo "+getModelo()+"\n tiene "+getRuedas()+" ruedas"+
               "\ntiene "+getPuertas()+" puertas y su tarifa es de "+tarifa);
   }
    
}
