/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator6;

import java.util.ArrayList;

public class Masina {
    private String marca;
    private String culoare;
    private int anProductie;
    private int numarUsi;
    private int garantie;
    private ArrayList<Componenta> componente = new ArrayList<Componenta>();

    public Masina() {
    }

    public Masina(String marca, String culoare, int anProductie, int numarUsi, int garantie){
        this.marca = marca;
        this.culoare = culoare;
        this.anProductie = anProductie;
        this.numarUsi = numarUsi;
        this.garantie = garantie;
        this.componente.clear();
    }

    public void addComponent(Componenta componenta){
        this.getComponente().add(componenta);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getAnProductie() {
        return anProductie;
    }

    public void setAnProductie(int anProductie) {
        this.anProductie = anProductie;
    }

    public int getNumarUsi() {
        return numarUsi;
    }

    public void setNumarUsi(int numarUsi) {
        this.numarUsi = numarUsi;
    }

    public int getGarantie() {
        return garantie;
    }

    public void setGarantie(int garantie) {
        this.garantie = garantie;
    }

    public ArrayList<Componenta> getComponente() {
        return componente;
    }

    public void setComponente(ArrayList<Componenta> componente) {
        this.componente = componente;
    }
}

