
package Tarea_Abstraccion;


public class Principal {
    
    public static void main(String [] args){

    Bus bus= new Bus ("JFK220","Marco Polo",55,"naranja","Paradiso new G7",4,2,200);
    Carga camion=new Carga("VLV200","Volvo",2,"negro","FH16 700",6,2,9);
    Bote bote=new Bote("9-BA-2-9991-21"," N/A",6,"blanco","madera",0,0,2);
    Acorazado acorazado=new Acorazado("BB 63","sin identificar",2700,"gris","Iowa",4,1,3,"Mark 7");
    Avion_Caza caza=new Avion_Caza("N/A","Lockheed Martin",1,"gris","F-35","Delta",1,4);   
    
     
    bus.mostrarDatos();
    camion.mostrarDatos();
    bote.mostrarDatos();
    acorazado.mostrarDatos();
    caza.mostrarDatos();
    bus.funcion();
    camion.funcion();
    bote.funcion();
    acorazado.funcion();
    caza.funcion();
        
    }
    
     
    }
