
package Controlador;

import Modelo.Conexion;
import javax.swing.JOptionPane;

public class CLanzadora extends CNaves {
    private int tonelCargar;
    
    public CLanzadora(){
        
    }
    
    public CLanzadora(int tonelPeso,int altura,String nombre, int tonelCargar ){
        super(tonelPeso,altura,nombre);
        this.tonelCargar = tonelCargar;
       
    }

    public int getTonelCargar() {
        return tonelCargar;
    }

    public void setTonelCargar(int tonelCargar) {
        this.tonelCargar = tonelCargar;
    }
    
    
    public boolean insertar(){
        
        boolean respuesta;
        
        Conexion co = new Conexion();
        
        co.abrirConexion();
        respuesta = co.InsertarLanza(nombre,tonelPeso,altura,tonelCargar);
        co.cerrarConexion();
        
        return respuesta;  
    }
    
    public void consultar(){
   
        Conexion co = new Conexion();
        String Resultados[];
    
        co.abrirConexion();
        
       Resultados = co.ConsulLanza(nombre);

       nombre = Resultados[0];
       tonelPeso = Integer.parseInt(Resultados[1]);
       altura = Integer.parseInt(Resultados[2]);
       tonelCargar = Integer.parseInt(Resultados[3]);
       

        co.cerrarConexion();      
    }
    
    public void Buscar(){
   
        Conexion co = new Conexion();
        String Resultados[];
    
        co.abrirConexion();
        
       Resultados = co.BuscarNave(nombre);

       nombre = Resultados[0];
       //tonelPeso = Integer.parseInt(Resultados[1]);
       //altura = Integer.parseInt(Resultados[2]);
       //tonelCargar = Integer.parseInt(Resultados[3]);
        co.cerrarConexion();      
    }
    
    
    
    
    
    
    
//    public void consultar(){
//   
//        Conexion co = new Conexion();
//        String Resultados[];
//        
//        co.abrirConexion();
//        
//       Resultados = co.ConsulLanza(nombre);
//       
//       nombre = Resultados[0];
//       tonelPeso = Integer.parseInt(Resultados[1]);
//       altura = Integer.parseInt(Resultados[2]);
//      // tonelCargar = Integer.parseInt(Resultados[0]);
//       
//        co.cerrarConexion();          
//    }
    
    

    
    
    
//    public boolean BuscarNave(){
//   
//        Conexion co = new Conexion();
//        String Resultados[];
//        
//        co.abrirConexion();
//        
//       Resultados = co.ConsulNave(nombre);
//       
//       nombre = Resultados[0];
//       //tonelPeso = Integer.parseInt(Resultados[1]);
//      // altura = Integer.parseInt(Resultados[2]);
//      // tonelCargar = Integer.parseInt(Resultados[0]);  
//        co.cerrarConexion();  
//        
//        if(Resultados[0].equals(nombre)){
//            return true;
//        }
//        return false; 
//    }
    
    
    
    
    
    
//    public boolean insertar(){
//        
//        boolean respuesta;
//        
//        Conexion co = new Conexion();
//        
//        co.abrirConexion();
//        respuesta = co.InsertarBD(nombre,tonelPeso,altura);
//        co.cerrarConexion();
//        
//        return respuesta;
//        
//    }
    
}
