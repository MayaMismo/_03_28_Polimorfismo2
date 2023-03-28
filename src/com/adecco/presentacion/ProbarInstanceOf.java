package com.adecco.presentacion;

import com.adecco.modelo.Bateria;
import com.adecco.modelo.Flauta;
import com.adecco.modelo.Guitarra;
import com.adecco.modelo.InstrumentoMusical;

public class ProbarInstanceOf {
    public static void main(String[] args) {
        InstrumentoMusical i1 = new Flauta("Yamaha",15);
        System.out.println("********Es una flauta " +(i1 instanceof Flauta));
        System.out.println("----->Es un instrumento musical " +(i1 instanceof InstrumentoMusical));
        System.out.println("----->Es una guitarra " +(i1 instanceof Guitarra));
        Flauta f1 = (Flauta) i1; //Casting: expression para decirle que lo convierta para ver
        //// como una Flauta el i1, si no, commo lo estamso viendo desde InstrumentoMusical, ahí NO está
        //definido el método InstrumentoAire (que solo está en Flauta)
        System.out.println(f1.instrumentoAire());

        InstrumentoMusical b1 = new Bateria("Yamaha", 300);
        Bateria b2 = (Bateria) b1;
        System.out.println(b2.instrumentoPercusion());
    }
}
