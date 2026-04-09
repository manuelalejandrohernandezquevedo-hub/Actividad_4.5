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
public class Almacen extends Paquete {
    // Creamos la estructura de 3 filas y 3 columnas
    Paquete[][] Almacen = new Paquete[3][3];
    HashSet<String> codgPaquetes = new HashSet<>();
    ArrayList<String> Paquete = new ArrayList<>();
    HashMap<String, Integer> ciudad = new HashMap<>();

    public Almacen(String codigo, double peso, String destino) {
        super(codigo, peso, destino);
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