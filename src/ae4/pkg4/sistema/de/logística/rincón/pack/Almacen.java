/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ae4.pkg4.sistema.de.logística.rincón.pack;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author manuel alejandro
 */
public class Almacen {
    // Creamos solo las estructuras de datos
    private Paquete[][] muelleFisico;
    private HashSet<String> registroSeguridad;
    private ArrayList<String> colaSalida;
    private HashMap<String, Integer> estadisticas;

    public Almacen() {
        this.muelleFisico = new Paquete [3][3];
        this.registroSeguridad = new HashSet<>();
        this.colaSalida = new ArrayList <>();
        this.estadisticas = new HashMap <>() ;
    }
    
    public void recepcionarPaquete(Paquete p, int fila, int col) {
    // 1. Obtenemos el código del paquete (asumiendo que existe este
    String codigoDelPaquete = p.getCodigo();
    
    // 2. Comprobamos si el String ya existe en el HashSet
    if (!codigo.contains(codigoDelPaquete)) {

    // 3. Comprobamos si el hueco está libre
    if (Paquete[fila][col] == null) {
        codigo.add(codigoDelPaquete);
        Paquete[fila][col] = p;
        System.out.println("Paquete recepcionado con éxito.");
        } else {
        System.out.println("Error: Esa posición del almacén ya es");
        }
    } 
        else { 
        System.out.println("El codigo ya existe en el hash");
        }   
    }
}