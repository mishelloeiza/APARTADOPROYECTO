/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.Sede;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visitante
 */
public class SedeDAO {

    private static final String SQL_SELECT = "SELECT codigo_sede, nombre_sede, estatus_sede FROM sedes";
    private static final String SQL_INSERT = "INSERT INTO sedes(nombre_sede, estatus_sede) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE sedes SET nombre_sede=?, estatus_sede=? WHERE codigo_sede = ?";
    private static final String SQL_DELETE = "DELETE FROM sedes WHERE codigo_sede=?";
    private static final String SQL_QUERY = "SELECT codigo_sede, nombre_sede, estatus_sede FROM sedes WHERE codigo_sede = ?";

    public List<Sede> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Sede sede = null;
        List<Sede> sedes = new ArrayList<Sede>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int codigoSede = rs.getInt("codigo_sede");
                String nombreSede = rs.getString("nombre_sede");
                String estatusSede = rs.getString("estatus_sede");
               
                sede = new Sede();
                sede.setCodigoSede(codigoSede);
                sede.setNombreSede(nombreSede);
                sede.setEstatusSede(estatusSede);
                
                sedes.add(sede);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return sedes;
    }

    public int insert(Sede sedes) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, sedes.getNombreSede());
            stmt.setString(2, sedes.getEstatusSede());
            
            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int update(Sede sede) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, sede.getNombreSede());
            stmt.setString(2, sede.getEstatusSede());
            stmt.setInt(3, sede.getCodigoSede());
            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int delete(Sede sede) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, sede.getCodigoSede());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

//    public List<Persona> query(Persona vendedor) { // Si se utiliza un ArrayList
    public Sede query(Sede sede) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Sede> sedes = new ArrayList<Sede>();
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setInt(1, sede.getCodigoSede());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int codigoSede = rs.getInt("codigo_Sede");
                String nombreSede = rs.getString("nombre_sede");
                String estatusSede = rs.getString("estatus_sede");
                
                sede = new Sede();
                sede.setCodigoSede(codigoSede);
                sede.setNombreSede(nombreSede);
                sede.setEstatusSede(estatusSede);
                //vendedores.add(vendedor); // Si se utiliza un ArrayList
            }
            //System.out.println("Registros buscado:" + vendedor);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return vendedores;  // Si se utiliza un ArrayList
        return sede;
    }
        
}
