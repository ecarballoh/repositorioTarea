
package Tarea_Abstraccion;


public abstract class Terrestre extends Vehiculo {
    
    private int ruedas;
    private int puertas;

    public Terrestre(String matricula, String marca, int pasajeros, String color, String modelo,int ruedas, int puertas) {
        super(matricula, marca, pasajeros, color, modelo);
        this.ruedas = ruedas;
        this.puertas = puertas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(byte ruedas) {
        this.ruedas = ruedas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(byte puertas) {
        this.puertas = puertas;
          
        }
            
        }
        
    
    