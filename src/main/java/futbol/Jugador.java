/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;


/**
 *
 * @author paula
 */
public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    public Jugador(short golesMarcados, byte dorsal, String nombre, int edad, String posicion) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }
    
    public String toString() {
        return super.toString()+
                " con el dorsal " + dorsal +
                ". Ha marcado " + golesMarcados;
    }
    

    
    
    
    
    @Override
    boolean jugarConLasManos() {
        return false;
    }
       public int compareTo(Object o) {
        if (!(o instanceof Futbolista)) return 0;
        return Math.abs(((Futbolista) o).getEdad()-this.getEdad());
    }

}
