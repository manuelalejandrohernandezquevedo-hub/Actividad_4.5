/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ae4.pkg4.sistema.de.logística.rincón.pack;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Manuel Alejandro
 */

public class Almacen {
   private Paquete[][] muelleFisico;
   private HashSet<String> registroSeguridad;
   private ArrayList<Paquete> colaSalida;
   private HashMap<String, Integer> estadisticas;


   public Almacen() {
       this.muelleFisico = new Paquete[3][3];
       this.registroSeguridad = new HashSet<>();
       this.colaSalida = new ArrayList<>();
       this.estadisticas = new HashMap<>();
   }


   public void recepcionarPaquete(Paquete p, int fila, int columna) {
       // Corrección: se debe verificar el código del paquete, no la clase
       if (registroSeguridad.contains(p.getCodigo())) {
           System.out.println("El codigo " + p.getCodigo() + " ya existe");
           return;
       }


       if (muelleFisico[fila][columna] == null) {
           muelleFisico[fila][columna] = p;
           registroSeguridad.add(p.getCodigo());
           System.out.println("El paquete se ha almacenado en la posición " + fila + "," + columna);
       } else {
           System.out.println("Error. La posición " + fila + "," + columna + " ya está ocupada");
       }
   }


   public void enviarACamion(int fila, int col) {
       Paquete p = muelleFisico[fila][col];
       if (p != null) {
           muelleFisico[fila][col] = null;
           colaSalida.add(p);


           // Actualizamos las estadísticas
           int contador = estadisticas.getOrDefault(p.getDestino(), 0);
           estadisticas.put(p.getDestino(), contador + 1);
       }
   }


   public void mantenimientoSeguridad(double pesoMaximo) {
       Iterator<Paquete> it = colaSalida.iterator();
       while (it.hasNext()) {
           Paquete elemento = it.next();
           if (elemento.getPeso() > pesoMaximo) {
               System.out.println("Eliminando el paquete " + elemento.getCodigo() + " por exceso de peso");
               it.remove();
           }
       }
   }


   public void mostrarEstadisticas() {
       System.out.println("--- Resumen de envíos por ciudad ---");
       for (Map.Entry<String, Integer> entry : estadisticas.entrySet()) {
           System.out.println("Ciudad: " + entry.getKey() + " | Paquetes: " + entry.getValue());
       }
   }
}

