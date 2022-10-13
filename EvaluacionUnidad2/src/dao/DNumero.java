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
public class DNumero {
    private ArrayList<Numero> listanumPar = new ArrayList<>();
    

    public DNumero() {
    }
    
    

    public DNumero(ArrayList<Numero> listanum) {
        this.listanumPar = listanumPar;
    }

    public ArrayList<Numero> getListanum() {
        return listanumPar;
    }

    public void setListanum(ArrayList<Numero> listanum) {
        this.listanumPar = listanumPar;
    }
    
    public int agregarNumeroPar(int num){
        
        int a=0;
        Numero nume = new Numero(num);
        listanumPar.add(nume);
        a=1;
        return a;
    }
    
}
