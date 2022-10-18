/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;


/**
 *
 * @author paula
 */
public class Portero extends Futbolista{

    public short golesRecibidos;
    public byte dorsal;

    public Portero(short golesRecibidos, byte dorsal, String nombre, int edad, String posicion) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "El futbolista " + super.getNombre() +
                " tiene " + super.getEdad() +
                ", y juega de " + super.getPosicion() +
                " con el dorsal " + dorsal +
                ". Le han marcado " + golesRecibidos;
    
    }
        
    @Override
    boolean jugarConLasManos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Portero)) return 0;
        return Math.abs(((Portero) o).golesRecibidos-this.golesRecibidos);
    }  
}