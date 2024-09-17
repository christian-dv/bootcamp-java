public class ProyectoCaja {
    public static void main(String[] args) {
        Caja c = new Caja(3,2,6);
        System.out.println("El resultado es: "+c.resultadoVol);
    }
}

    class Caja{
        int ancho,alto,profundo;
        int resultadoVol=0;

        Caja(){
        }

        Caja(int ancho,int alto,int profundo){
            this.ancho = ancho;
            this.alto = alto;
            this.profundo = profundo;

            resultadoVol = ancho * alto * profundo;
        }
    }

