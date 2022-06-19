
package Controlador;

import Modelo.Conexion;


public class CTripuladas extends CNaves {
   
    private int capasidad;
    
    public CTripuladas(){
    
}
    
    public CTripuladas(int tonelPeso,String nombre,int capasidad){
        super(tonelPeso,capasidad,nombre);
        this.capasidad = capasidad;   
    }

    public int getCapasidad() {
        return capasidad;
    }

    public void setCapasidad(int capasidad) {
        this.capasidad = capasidad;
    }
    
    public boolean insertar(){
        
        boolean respuesta;
        
        Conexion co = new Conexion();
        
        co.abrirConexion();
        respuesta = co.InserTripula(nombre,tonelPeso,altura,capasidad);
        co.cerrarConexion();
        
        return respuesta;  
    }
    
    public void consultar(){
   
        Conexion co = new Conexion();
        String Resultados[];
        
        co.abrirConexion();
        
       Resultados = co.ConsulTripulada(nombre);

       nombre = Resultados[0];
       tonelPeso = Integer.parseInt(Resultados[1]);
       altura = Integer.parseInt(Resultados[2]);
       capasidad = Integer.parseInt(Resultados[3]);
      
        co.cerrarConexion();
             
    }
    
}
