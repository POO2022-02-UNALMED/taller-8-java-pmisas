/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author paula
 */
public abstract class Futbolista implements Comparable {
    
    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
    
    public Futbolista(){
        this("Maradona", 30, "delantero");
    }

  
    
    public boolean equals(Futbolista f){
        return this == f;
    }
    
    abstract boolean jugarConLasManos();
    
    //getters setters

    public String getPosicion(){
        return posicion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

      /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "El futbolista " + nombre +
                " tiene " + edad +
                ", y juega de " + posicion;
    }  
    
    
}
