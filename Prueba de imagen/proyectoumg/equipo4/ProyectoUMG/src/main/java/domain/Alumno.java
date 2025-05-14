/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author c2307
 */
public class Alumno {
    private int carnetAlumno;
    private String nombreAlumno;
    private String direccionAlumno;
    private String telefonoAlumno;
    private String emailAlumno;
    private String estatusAlumno;

    @Override
    public String toString() {
        return "Alumno{" + "carnetAlumno=" + carnetAlumno + ", nombreAlumno=" + nombreAlumno + ", direccionAlumno=" + direccionAlumno + ", telefonoAlumno=" + telefonoAlumno + ", emailAlumno=" + emailAlumno + ", estatusAlumno=" + estatusAlumno + '}';
    }

    public int getCarnetAlumno() {
        return carnetAlumno;
    }

    public void setCarnetAlumno(int carnetAlumno) {
        this.carnetAlumno = carnetAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getDireccionAlumno() {
        return direccionAlumno;
    }

    public void setDireccionAlumno(String direccionAlumno) {
        this.direccionAlumno = direccionAlumno;
    }

    public String getTelefonoAlumno() {
        return telefonoAlumno;
    }

    public void setTelefonoAlumno(String telefonoAlumno) {
        this.telefonoAlumno = telefonoAlumno;
    }

    public String getEmailAlumno() {
        return emailAlumno;
    }

    public void setEmailAlumno(String emailAlumno) {
        this.emailAlumno = emailAlumno;
    }

    public String getEstatusAlumno() {
        return estatusAlumno;
    }

    public void setEstatusAlumno(String estatusAlumno) {
        this.estatusAlumno = estatusAlumno;
    }

    public Alumno(int carnetAlumno, String nombreAlumno, String direccionAlumno, String telefonoAlumno, String emailAlumno, String estatusAlumno) {
        this.carnetAlumno = carnetAlumno;
        this.nombreAlumno = nombreAlumno;
        this.direccionAlumno = direccionAlumno;
        this.telefonoAlumno = telefonoAlumno;
        this.emailAlumno = emailAlumno;
        this.estatusAlumno = estatusAlumno;
    }
    
    public Alumno() {
        
    }
}