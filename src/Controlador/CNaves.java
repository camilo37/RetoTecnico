
package Controlador;


public class CNaves {
    
    public int tonelPeso,altura;
    private String nombre;
    
    
    public CNaves(){
}
    public CNaves(int tonelPeso,int altura,String nombre){
        this.tonelPeso = tonelPeso;
        this.altura = altura;
        this.nombre = nombre;
    }

    public int getTonelPeso() {
        return tonelPeso;
    }

    public void setTonelPeso(int tonelPeso) {
        this.tonelPeso = tonelPeso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
}
