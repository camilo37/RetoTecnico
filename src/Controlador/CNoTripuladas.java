
package Controlador;

import Modelo.Conexion;


public class CNoTripuladas extends CNaves {
    
    private int empuje;
    
    public CNoTripuladas(){
    
}
    public CNoTripuladas(int tonelPeso,int altura,String nombre, int empuje){
        super(tonelPeso,altura,nombre);
        this.empuje = empuje;   
    }

    public int getEmpuje() {
        return empuje;
    }

    public void setEmpuje(int empuje) {
        this.empuje = empuje;
    }
    
    
    public boolean insertar(){
        
        boolean respuesta;
        
        Conexion co = new Conexion();
        
        co.abrirConexion();
        respuesta = co.InserNoTripula(nombre,tonelPeso,altura,empuje);
        co.cerrarConexion();
        
        return respuesta;  
    }
    
    public void consultar(){
   
        Conexion co = new Conexion();
        String Resultados[];
        
        co.abrirConexion();
        
       Resultados = co.ConsulNoTripulada(nombre);

       nombre = Resultados[0];
       tonelPeso = Integer.parseInt(Resultados[1]);
       altura = Integer.parseInt(Resultados[2]);
       empuje = Integer.parseInt(Resultados[3]);
      
        co.cerrarConexion();
             
    }
    
}
