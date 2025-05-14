/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.Carrera;
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
public class CarreraDAO {

    private static final String SQL_SELECT = "SELECT codigo_carrera, nombre_carrera, codigo_facultad, estatus_carrera FROM carreras";
    private static final String SQL_INSERT = "INSERT INTO carreras(nombre_carrera, codigo_facultad, estatus_carrera) VALUES(?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE carreras SET nombre_carrera=?, codigo_facultad=?, estatus_carrera=? WHERE codigo_carrera = ?";
    private static final String SQL_DELETE = "DELETE FROM carreras WHERE codigo_carrera=?";
    private static final String SQL_QUERY = "SELECT codigo_carrera, nombre_carrera, codigo_facultad, estatus_carrera FROM carreras WHERE codigo_carrera = ?";

    public List<Carrera> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Carrera carrera = null;
        List<Carrera> carreras = new ArrayList<Carrera>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int codigoCarrera = rs.getInt("codigo_carrera");
                String nombreCarrera = rs.getString("nombre_carrera");
                int codigoFacultad = rs.getInt("codigo_facultad");
                String estatusCarrera = rs.getString("estatus_carrera");
                
                carrera = new Carrera();
                carrera.setCodigoCarrera(codigoCarrera);
                carrera.setNombreCarrera(nombreCarrera);
                carrera.setCodigoFacultad(codigoFacultad);
                carrera.setEstatusCarrera(estatusCarrera);
                
                carreras.add(carrera);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return carreras;
    }

    public int insert(Carrera carreras) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, carreras.getNombreCarrera());
            stmt.setInt(2, carreras.getCodigoFacultad());
            stmt.setString(3, carreras.getEstatusCarrera());

            
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

    public int update(Carrera carrera) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, carrera.getNombreCarrera());
            stmt.setInt(2, carrera.getCodigoFacultad());
            stmt.setString(3, carrera.getEstatusCarrera());
            stmt.setInt(4, carrera.getCodigoCarrera());
            
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

    public int delete(Carrera carrera) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, carrera.getCodigoCarrera());
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
    public Carrera query(Carrera carrera) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Carrera> carreras = new ArrayList<Carrera>();
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setInt(1, carrera.getCodigoCarrera());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int codigoCarrera = rs.getInt("codigo_carrera");
                String nombreCarrera = rs.getString("nombre_carrera");
                int codigoFacultad = rs.getInt("codigo_facultad");
                String estatusCarrera = rs.getString("estatus_carrera");
                
                carrera = new Carrera();
                carrera.setCodigoCarrera(codigoCarrera);
                carrera.setNombreCarrera(nombreCarrera);
                carrera.setCodigoFacultad(codigoFacultad);
                carrera.setEstatusCarrera(estatusCarrera);
                
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
        return carrera;
    }
        
}