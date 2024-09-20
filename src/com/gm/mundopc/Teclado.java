package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{

    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tp, String marca) {
        super(tp, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" +"idTeclado=" + super.toString() +'}';
    }
}
