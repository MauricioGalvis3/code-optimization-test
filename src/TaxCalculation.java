public class TaxCalculation {

    // Constantes para las tasas de impuestos y el umbral de impuestos
    private static final double TAX_RATE_HIGH = 0.15;
    private static final double TAX_RATE_LOW = 0.10;
    private static final double PROMEDIO_IMPUESTOS = 50;

    public static void main(String[] args) {
        // Arreglos para los precios de los productos y las tasas de impuestos
        double[] productPrices = {100, 200}; // Aqui estan los Precios de los productos
        double[] taxRates = {TAX_RATE_HIGH, TAX_RATE_LOW}; // Tasas de impuestos

        // Variable para el total de impuestos
        double totalTax = 0;

        // Usamos un bucle para calcular el total de impuestos
        for (int i = 0; i < productPrices.length; i++) {
            totalTax += productPrices[i] * taxRates[i]; // Calculamos el impuesto de cada producto y lo sumamos al total
        }

        // Evaluación del total de impuestos
        if (totalTax > PROMEDIO_IMPUESTOS) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}

