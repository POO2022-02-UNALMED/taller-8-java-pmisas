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

    public Jugador() {
        super();
        this.golesMarcados =289;
        this.dorsal= 7;
    }

    
    
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    
    
    
        public int compareTo(Object o) {
        if (!(o instanceof Futbolista)) return 0;
        return Math.abs(((Futbolista) o).getEdad()-this.getEdad());
    }
    
    
    public boolean jugarConLasManos() {
        return false;
    }



    public String toString() {
        return super.toString()+
                " con el dorsal " + dorsal +
                ". Ha marcado " + golesMarcados;
    }
}
