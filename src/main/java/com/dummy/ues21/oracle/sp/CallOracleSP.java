package com.dummy.ues21.oracle.sp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Types;
//import oracle.jdbc.OracleTypes;


public class CallOracleSP {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");


            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@192.168.0.114:1521:UES21D1", 
                    "ue21",
                    "desarrollo");
            
            /*
            CallableStatement stmt = connection.prepareCall("{call ue21.pkg_pa_datos_alumnos.p_get_datos_completos(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            
            stmt.setInt(1, 23698800);

            stmt.registerOutParameter(2, Types.VARCHAR);
            stmt.registerOutParameter(3, Types.VARCHAR);
            stmt.registerOutParameter(4, Types.VARCHAR);
            stmt.registerOutParameter(5, Types.VARCHAR);
            stmt.registerOutParameter(6, Types.VARCHAR);
            stmt.registerOutParameter(7, Types.VARCHAR);
            stmt.registerOutParameter(8, Types.VARCHAR);
            stmt.registerOutParameter(9, Types.VARCHAR);
            stmt.registerOutParameter(10, Types.VARCHAR);
            stmt.registerOutParameter(11, Types.VARCHAR);
            stmt.registerOutParameter(12, Types.VARCHAR);
            stmt.registerOutParameter(13, Types.VARCHAR);
            stmt.registerOutParameter(14, Types.VARCHAR);
            stmt.registerOutParameter(15, Types.VARCHAR);
            stmt.registerOutParameter(16, Types.VARCHAR);
            stmt.registerOutParameter(17, Types.INTEGER);
            */    

            
            CallableStatement stmt = connection.prepareCall("{call ue21.PKG_PA_ACCESO.p_login(?,?,?,?,?)}");
            
            stmt.setString(1, "MSELLIEZREYNOSO");
            stmt.setString(2, "fEqNCco3Yq9h5ZUglD3CZJT4lBs=");
            //stmt.setString(2, "wrongpass");
            
            stmt.registerOutParameter(3, Types.VARCHAR);
            stmt.registerOutParameter(4, Types.INTEGER);
            stmt.registerOutParameter(5, Types.INTEGER);
            

            stmt.execute();
            
            System.out.println(stmt.getString(3));
            System.out.println(stmt.getInt(4));
            System.out.println(stmt.getInt(5));
            
            Integer dni = stmt.getInt(4);
            
            
            /*
            
            CallableStatement stmt = connection.prepareCall("{call ? = ue21.pkg_pa_acceso.f_enviar_datos_mail(?,?,?,?)}");
            
            stmt.registerOutParameter(1, OracleTypes.OTHER);

            stmt.setString(2, "PDCRISTOFARO");
            stmt.setInt(3, 64219);
            stmt.setString(4, "http://www.google.com");
            stmt.setString(5, "enviar.mail.user.blocked");
            
            */
            
            /*
            int i = 0;
            
            CallableStatement stmt = connection.prepareCall("{? = call ue21.PKG_PA_ACCESO.f_get_propiedad()}");
            
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
            
            stmt.execute();
            
            
            ResultSet rs = (ResultSet) stmt.getObject(1);
            while (rs.next()) {
                    System.out.print(rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3));
                    System.out.println(";");
            }

            rs.close();
            */
            
            /*
            stmt = connection.prepareCall("{call pkg_pa_datos_alumnos.p_get_legajos(?,?,?,?)}");

            stmt.setInt(1, dni);
            stmt.registerOutParameter(2, OracleTypes.CURSOR);
            stmt.registerOutParameter(3, Types.INTEGER);
            stmt.registerOutParameter(4, Types.VARCHAR);
            
            stmt.execute();

            
            System.out.println(stmt.getInt(3));
            System.out.println(stmt.getString(4));
            
            
            ResultSet rs = (ResultSet) stmt.getObject(2);
            while (rs.next()) {
                    
                    //System.out.print(rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3));
                    
                    System.out.println(rs.getString(1));
                    System.out.println(rs.getString(2));
                    System.out.println(rs.getString(3));

                    
            }

            rs.close();
            */
            
/*            
            //CallableStatement stmt = connection.prepareCall("{call pkg_pa_datos_alumnos.P_Get_redes_sociales(?,?,?,?)}");
            stmt = connection.prepareCall("{call pkg_pa_datos_alumnos.P_Get_redes_sociales(?,?,?,?)}");
             
            stmt.setInt(1, dni);
            stmt.registerOutParameter(2, OracleTypes.CURSOR);
            stmt.registerOutParameter(3, Types.INTEGER);
            stmt.registerOutParameter(4, Types.VARCHAR);
            
            stmt.execute();

            
            System.out.println(stmt.getInt(3));
            System.out.println(stmt.getString(4));
            
            
            ResultSet rs = (ResultSet) stmt.getObject(2);
            while (rs.next()) {
                    
                    //System.out.print(rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3));
                    
                    System.out.println(";");
            }

            rs.close();
*/            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }

}
