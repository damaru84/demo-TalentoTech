package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Variables a nivel de clase
    private static List<Producto> catalogo = new ArrayList<>();
    private static List<Pedido> pedidos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    listarProductos();
                    break;
                case 3:
                    buscarActualizarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    crearPedido();
                    break;
                case 6:
                    listarPedidos();
                    break;
                case 7:
                    salir = true;
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    // Métodos vacíos por ahora, para evitar errores de compilación
    private static void mostrarMenu() {
        System.out.println("1. Agregar producto");
        System.out.println("2. Listar productos");
        System.out.println("3. Buscar/Actualizar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Crear pedido");
        System.out.println("6. Listar pedidos");
        System.out.println("7. Salir");
    }

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    private static void agregarProducto() {}
    private static void listarProductos() {}
    private static void buscarActualizarProducto() {}
    private static void eliminarProducto() {}
    private static void crearPedido() {}
    private static void listarPedidos() {}
}