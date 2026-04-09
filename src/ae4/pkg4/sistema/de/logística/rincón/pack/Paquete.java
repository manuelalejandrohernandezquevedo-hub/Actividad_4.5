/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ae4.pkg4.sistema.de.logística.rincón.pack;

import java.util.Objects;

/**
 *
 * @author manuel alejandro
 */
public class Paquete {
    String codigo;
    double peso;
    String destino;

    public Paquete(String codigo, double peso, String destino) {
        this.codigo = codigo;
        this.peso = peso;
        this.destino = destino;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paquete other = (Paquete) obj;
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return Objects.equals(this.destino, other.destino);
    }

    @Override
    public String toString() {
        return "Paquete{" + "codigo=" + codigo + ", peso=" + peso + ", destino=" + destino + '}';
    }
    
}
