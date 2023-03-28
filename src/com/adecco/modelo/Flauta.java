package com.adecco.modelo;

public class Flauta extends InstrumentoMusical{

//nos da el error y tenemos que implementar método
    @Override
    public String sonidoEmite() {
        return "flu flu flu";

    }

    @Override
    public String toString() {
        return "Flauta ";
    }

      public String instrumentoAire() {
        return "Es un instrumento de aire";
    }

    public Flauta() {
    }

    public Flauta(String marca, double precio) {
        super(marca, precio);
    }
    //no hacemos setters ni getters pq no tenemos ningun atributo
}
