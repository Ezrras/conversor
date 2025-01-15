import java.util.Map;
public class ConversorMonedas {
    public double convertir(String monedaOrigen, String monedaDestino, double cantidad) {

        ConsultaMoneda consulta =new ConsultaMoneda();
        Monedas moneda= consulta.buscaMoneda(monedaOrigen);
        Map<String, Double> conversionRates = moneda.conversion_rates();
        if (!conversionRates.containsKey(monedaOrigen) || !conversionRates.containsKey(monedaDestino)) {
            throw new IllegalArgumentException("Moneda no soportada.");
        }

        // Tasa de conversión
        double tasaOrigen = conversionRates.get(monedaOrigen);
        double tasaDestino = conversionRates.get(monedaDestino);

        // Convertir a moneda base (por ejemplo, USD) y luego a la moneda de destino
        return (cantidad / tasaOrigen) * tasaDestino;
    }

}
