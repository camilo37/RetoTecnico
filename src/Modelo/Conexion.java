
package Modelo;


import java.sql.*;

public class Conexion {
    
    private String bd;
    private String dsn;
    private Connection cn;
    private Statement s;
    private ResultSet rs;
    //private CallableStatement cstmt;
    
    
    public Conexion(){
        
        bd="NavesEspaciales";
        dsn="jdbc:sqlserver://localhost;databaseName=" + bd + ";user=sa;password=Je123456";
        
    }
    
    public void abrirConexion(){
        
        try{           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn= DriverManager.getConnection(dsn);
                   
        }catch(Exception ex){
            
            System.out.println("Error: " + ex.getMessage());            
        } 
    }

        
    public boolean InsertarLanza(String nom, int peso,int altura,int carga){  
        try{
           
            int filaguardada;
            
           s = cn.createStatement();          
           filaguardada = s.executeUpdate("Insert into NAVES values('" + nom + "', '" + peso + "', '" + altura+"')" + "Insert into NLANZADORA values('" + nom + "', '" + carga +"')");

           if (filaguardada == 1){   
               return true;    
           }else{  
               return false;
           }
        }catch(Exception ex){   
            return false;   
        }  
    }
    
    public boolean InserNoTripula(String nom, int peso,int altura,int empuje){  
        try{
           
            int filaguardada;
            
           s = cn.createStatement();          
           filaguardada = s.executeUpdate("Insert into NAVES values('" + nom + "', '" + peso + "', '" + altura+"')" + "Insert into NOTRIPULADAS values('" + nom + "', '" + empuje +"')");

           if (filaguardada == 1){   
               return true;    
           }else{  
               return false;
           }
        }catch(Exception ex){   
            return false;   
        }  
    }
    
    public boolean InserTripula(String nom, int peso,int altura,int capasidad){  
        try{
           
            int filaguardada;
            
           s = cn.createStatement();          
           filaguardada = s.executeUpdate("Insert into NAVES values('" + nom + "', '" + peso + "', '" + altura+"')" + "Insert into TRIPULADAS values('" + nom + "', '" + capasidad +"')");

           if (filaguardada == 1){   
               return true;    
           }else{  
               return false;
           }
        }catch(Exception ex){   
            return false;   
        }  
    }
    
    public String[] ConsulLanza(String nom){
        
        String Resultado[] = new String[4];
        
        try{
        
        s = cn.createStatement();
        rs = s.executeQuery ("SELECT na.nombre , na.peso, na.altura, lanza.tonelCargar FROM NAVES na INNER JOIN NLANZADORA lanza ON na.nombre = lanza.nombre where na.nombre = " + "'"+ nom + "'");        
        rs.next();
        
        Resultado[0] = rs.getString(1);
        Resultado[1] = rs.getString(2);
        Resultado[2] = rs.getString(3);
        Resultado[3] = rs.getString(4);
        
        return Resultado;

        }catch(Exception ex){
            
            return null;
            
        }
    }
    
    public String[] ConsulNoTripulada(String nom){
        
        String Resultado[] = new String[4];
        
        try{     
        s = cn.createStatement();
        rs = s.executeQuery ("SELECT na.nombre , na.peso, na.altura, noTripulad.empuje FROM NAVES na INNER JOIN NOTRIPULADAS noTripulad ON na.nombre = noTripulad.nombre where na.nombre = " + "'"+ nom + "'");          
        rs.next();
        
        Resultado[0] = rs.getString(1);
        Resultado[1] = rs.getString(2);
        Resultado[2] = rs.getString(3);
        Resultado[3] = rs.getString(4);
        
        return Resultado;

        }catch(Exception ex){
            
            return null;
            
        }
    }
    
    public String[] ConsulTripulada(String nom){
        
        String Resultado[] = new String[4];
        
        try{     
        s = cn.createStatement();
        rs = s.executeQuery ("SELECT na.nombre , na.peso, na.altura, tripulad.capasidad FROM NAVES na INNER JOIN TRIPULADAS tripulad ON na.nombre = tripulad.nombre where na.nombre =  " + "'"+ nom + "'");           
        rs.next();
        
        Resultado[0] = rs.getString(1);
        Resultado[1] = rs.getString(2);
        Resultado[2] = rs.getString(3);
        Resultado[3] = rs.getString(4);
        
        return Resultado;

        }catch(Exception ex){
            
            return null;
            
        }
    }
    
    public String[] BuscarNave(String nom){
        
        String Resultado[] = new String[1];
        
        try{     
        s = cn.createStatement();
        rs = s.executeQuery ("select nombre from NAVES where nombre =  " + "'"+ nom + "'");
           
        rs.next();
        Resultado[0] = rs.getString(1);
       // Resultado[1] = rs.getString(2);
        //Resultado[2] = rs.getString(3);
       // Resultado[3] = rs.getString(4);
        
        return Resultado;

        }catch(Exception ex){
            
            return null;
            
        }
    }
       
   
    public void cerrarConexion(){
        
        try{
            
           cn.close();
            
        }catch(Exception e){
            
            System.out.println("Error: "+ e.getMessage());
        }    
    }  
}
