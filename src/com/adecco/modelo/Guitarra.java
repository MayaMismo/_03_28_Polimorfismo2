package com.adecco.modelo;

public class Guitarra extends InstrumentoMusical{


    @Override
    public String sonidoEmite() {
        return "trin tran trin";
    }

    @Override
    public String toString() {
        return "Guitarra ";
    }

    public Guitarra() {
    }

    public Guitarra(String marca, double precio) {
        super(marca, precio);
    }
}
