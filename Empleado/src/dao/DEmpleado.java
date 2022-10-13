/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import empleado.Empleado;
import java.util.ArrayList;
import modelos.Cargo;

/**
 *
 * @author megan
 */
public class DEmpleado {
 
    private ArrayList<Empleado> listEmpleado = new ArrayList();

    public DEmpleado() {
    }
    
    public DEmpleado (ArrayList<Empleado> listEmpleado){
        this.listEmpleado = listEmpleado;
    }

    public ArrayList<Empleado> getListEmpleado() {
        return listEmpleado;
    }

    public void setListEmpleado(ArrayList<Empleado> listEmpleado) {
        this.listEmpleado = listEmpleado;
    }
    
    
    public int agregarEmpleado (String nombre, Cargo cargo, double salario){
        int b=0;
        Empleado empe = new Empleado(nombre,cargo,salario);
        listEmpleado.add(empe);
        b=1;
        return b;
    }
}
