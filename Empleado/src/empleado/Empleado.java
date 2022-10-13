/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

import modelos.Cargo;

/**
 *
 * @author megan
 */
public class Empleado {
    private String nombre;
    private Cargo cargo;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, Cargo cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", cargo=" + cargo + ", salario=" + salario + '}';
    }
    
    
    
    
}
