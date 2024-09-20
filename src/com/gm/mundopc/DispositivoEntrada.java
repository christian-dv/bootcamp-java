package com.gm.mundopc;

public class DispositivoEntrada {
       private String tipoEntrada;
       private String marca;

       public DispositivoEntrada(String tp, String marca){
           this.tipoEntrada = tp;
           this.marca = marca;
       }

        public void setTipoEntrada(String tipoEntrada) {
            this.tipoEntrada = tipoEntrada;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getTipoEntrada() {
            return tipoEntrada;
        }

        public String getMarca() {
            return marca;
        }

        public String toString() {
            return "DispositivoEntrada{" +
                    "tipoEntrada='" + tipoEntrada + '\'' +
                    ", marca='" + marca + '\'' +
                    '}';
        }
}
