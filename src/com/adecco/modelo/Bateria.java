package com.adecco.modelo;

public class Bateria extends InstrumentoMusical{


    @Override
    public String sonidoEmite() {
        return "pim, pam, pum";
    }

    @Override
    public String toString() {
        return "Bateria ";
    }

    public String instrumentoPercusion(){
        return "Es un instrumento de percusión ";
    }

    public Bateria() {
    }

    public Bateria(String marca, double precio) {
        super(marca, precio);
    }
}
