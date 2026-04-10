package ae4.pkg4.sistema.de.logística.rincón.pack;

import java.util.Objects;


public class Paquete {
   private String codigo;
   private double peso;
   private String destino;


   public Paquete(String codigo, double peso, String destino) {
       this.codigo = codigo;
       this.peso = (peso < 0) ? -peso : peso;
       this.destino = destino;
   }


   public String getDestino() {
       return destino;
   }


   public String getCodigo() {
       return codigo;
   }


   @Override
   public boolean equals(Object o) {
       if (o == null || getClass() != o.getClass()) return false;
       Paquete paquete = (Paquete) o;
       return Double.compare(peso, paquete.peso) == 0 &&
               Objects.equals(codigo, paquete.codigo) &&
               Objects.equals(destino, paquete.destino);
   }

    double getPeso() {
        return peso;
    }
}