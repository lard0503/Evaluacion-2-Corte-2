/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelos.Numero;

/**
 *
 * @author ale05
 */
public class DNumeroImpar {
    private ArrayList<Numero> listanumImpar = new ArrayList<>();
    

    public DNumeroImpar() {
    }
    
    

    public DNumeroImpar(ArrayList<Numero> listanumImpar) {
        this.listanumImpar = listanumImpar;
    }

    public ArrayList<Numero> getListanumImpar() {
        return listanumImpar;
    }

    public void setListanum(ArrayList<Numero> listanumImpar) {
        this.listanumImpar = listanumImpar;
    }
    
    public int agregarNumeroImpar(int num){
        
        int a=0;
        Numero nume = new Numero(num);
        listanumImpar.add(nume);
        a=1;
        return a;
    }
}
