public class Store {
    public static void main(String[] args) {
        // Precios de los productos
        int precio_1 = 15;
        int precio_2 = 10;
        int precio_3 = 5;

        // Cantidades de cada producto
        int PRODUCT_1_QUANTITY = 2;
        int PRODUCT_2_QUANTITY = 3;
        int PRODUCT_3_QUANTITY = 4;

        // Constante para el promedio de buena venta
        int PROMEDIO_BUENA_VENTA = 50;

        // Arreglos para los precios y las cantidades de productos
        int[] precios = {precio_1, precio_2, precio_3}; 
        int[] cantidades = {PRODUCT_1_QUANTITY, PRODUCT_2_QUANTITY, PRODUCT_3_QUANTITY}; 

        // Variable para el total de ventas
        int totalSales = 0;

        // Usamos un bucle para calcular las ventas totales
        for (int i = 0; i < precios.length; i++) {
            totalSales += precios[i] * cantidades[i]; // Multiplicamos cada precio por su cantidad
        }

        // Evaluación del rendimiento de ventas
        if (totalSales > PROMEDIO_BUENA_VENTA) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}

