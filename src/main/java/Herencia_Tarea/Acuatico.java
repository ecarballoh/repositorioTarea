
package Herencia_Tarea;


public class Acuatico extends Vehiculo{
    
    private int helice;
    private int cubiertas;

    public Acuatico(String matricula, String marca, int pasajeros, String color, String modelo,int helice, int cubiertas) {
        super(matricula, marca, pasajeros, color, modelo);
        this.helice = helice;
        this.cubiertas = cubiertas;
    }

    public int getHelice() {
        return helice;
    }

    public void setHelice(int helice) {
        this.helice = helice;
    }

    public int getCubiertas() {
        return cubiertas;
    }

    public void setCubiertas(int cubiertas) {
        this.cubiertas = cubiertas;
    }
    
    
}
