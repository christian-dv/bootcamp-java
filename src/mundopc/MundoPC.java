package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
       Monitor monitorDell = new Monitor("DELL", 13);
       Teclado tecladoDell = new Teclado("bluethoot","DELL");
       Raton ratonDell = new Raton("bluethoot","DELL");
       Computadora computadoraDell = new Computadora("Computadora Dell",monitorDell,tecladoDell,ratonDell);

        Monitor monitorHP = new Monitor("HP", 32);
        Teclado tecladoHP = new Teclado("bluethoot","HP");
        Raton ratonHP = new Raton("bluethoot","HP");
        Computadora computadoraHP = new Computadora("Computadora HP",monitorHP,tecladoHP,ratonHP);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraHP);

        orden1.mostrarOrden();

    }
}
