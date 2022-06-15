
package Tarea_Abstraccion;


public abstract class Aereo extends Vehiculo{
    private String tipoAla;
    private int cantidadMotor;

    public Aereo(String matricula, String marca, int pasajeros, String color, String modelo,String tipoAla, int cantidadMotor) {
        super(matricula, marca, pasajeros, color, modelo);
        this.tipoAla = tipoAla;
        this.cantidadMotor = cantidadMotor;
    }

    public String getTipoAla() {
        return tipoAla;
    }

    public void setTipoAla(String tipoAla) {
        this.tipoAla = tipoAla;
    }

    public int getCantidadMotor() {
        return cantidadMotor;
    }

    public void setCantidadMotor(int cantidadMotor) {
        this.cantidadMotor = cantidadMotor;
    }

  
   
}
