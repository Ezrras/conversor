# Conversor de Monedas

Este proyecto es una aplicación Java que permite realizar conversiones entre diversas monedas utilizando tasas de cambio actualizadas desde una API.

## Descripción

El conversor de monedas utiliza una conexión a la API [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de conversión en tiempo real. A través de un menú interactivo, el usuario puede seleccionar las monedas de origen y destino, ingresar la cantidad deseada, y obtener el resultado de la conversión.

## Funcionalidades

- Conversión entre las siguientes monedas:
  - Dólar estadounidense (USD)
  - Peso argentino (ARS)
  - Real brasileño (BRL)
  - Peso colombiano (COP)
- Manejo de errores para monedas no soportadas.
- Actualización dinámica de las tasas de conversión.

## Estructura del Proyecto

### 1. `Principal`
Contiene el método principal que ejecuta el programa, mostrando un menú para interactuar con el usuario. Permite seleccionar opciones para convertir entre diferentes monedas o salir del programa.

### 2. `ConversorMonedas`
Clase que encapsula la lógica para realizar la conversión entre monedas.

#### Método principal:
- `convertir(String monedaOrigen, String monedaDestino, double cantidad)`
  - Realiza la conversión entre las monedas especificadas.
  - Maneja excepciones para entradas no válidas.

### 3. `Monedas`
Un registro que representa las tasas de conversión obtenidas de la API.

#### Atributos:
- `base_code`: Código de la moneda base.
- `conversion_rates`: Mapa que asocia cada moneda con su tasa de conversión.

### 4. `ConsultaMoneda`
Clase que realiza las solicitudes a la API para obtener las tasas de conversión y devuelve un objeto `Monedas`.

#### Método principal:
- `buscaMoneda(String moneda)`
  - Realiza una consulta a la API para obtener las tasas de conversión relativas a la moneda base.

## Requisitos

- Java 11 o superior.
- Dependencia de la librería `Gson` para trabajar con JSON.
- Conexión a Internet para realizar las consultas a la API.

## Ejecución

1. Clona este repositorio:
   ```bash
   git clone <URL del repositorio>
## Licencia

Este proyecto está licenciado bajo la Licencia MIT. 

Puedes usar, modificar y distribuir este código libremente siempre y cuando incluyas la nota de copyright y la licencia. Para más información, consulta el archivo `LICENSE` en este repositorio.

**Nota:** Este proyecto utiliza la API de ExchangeRate-API, la cual puede tener sus propias políticas de uso. Revisa su documentación para garantizar el cumplimiento.
