
package Tarea_Abstraccion;


public abstract class Vehiculo {
    
    private String matricula;
    private String marca;
    private int pasajeros;
    private String color;
    private String modelo;

    public Vehiculo(String matricula, String marca, int pasajeros, String color, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.pasajeros = pasajeros;
        this.color = color;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void mostrarDatos(){
        
            
        }
    public abstract void funcion();
}
    

