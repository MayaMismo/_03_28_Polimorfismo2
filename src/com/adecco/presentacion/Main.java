package com.adecco.presentacion;

import com.adecco.modelo.Bateria;
import com.adecco.modelo.Flauta;
import com.adecco.modelo.Guitarra;
import com.adecco.modelo.InstrumentoMusical;

public class Main {
    public static void main(String[] args) {
        //instanciamos una Array de InstrumentoMusical 3
        InstrumentoMusical[] instrumentos = new InstrumentoMusical[3];

        instrumentos[0] = new Flauta("Yamaha", 100);
        instrumentos[1] = new Guitarra("Fender", 200);
        instrumentos[2] = new Bateria("Yamaha", 300);

        for (int i=0; i<instrumentos.length; i++) {
            //quiero que me salga el nombre del instrumento
            System.out.println("El sonido que hace "+instrumentos[i].toString() +instrumentos[i].sonidoEmite());
        }
        for (InstrumentoMusical elemento:instrumentos
             ) {
            System.out.println("Sonido que emite " +elemento.sonidoEmite());
            System.out.println("¿Es una guitarra ?" +(elemento instanceof Guitarra));
            System.out.println("¿Es una guitarra ?" +(elemento instanceof InstrumentoMusical));
            //utilizamos un if para saber si es instrumento de aire
            if(elemento instanceof Flauta){
                System.out.println("----------" +((Flauta) elemento).instrumentoAire()); //conversión. Le estamos diciendo que la haga
                //unicamente en el caso de que sea Flauta, entonces sí mandame llamar que es instrumento de aire
            }

        }
    }

}