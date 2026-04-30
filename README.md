# 🌦️ WeatherApiClient – Weather API Connector

Este proyecto contiene la clase `WeatherApiClient`, encargada de consumir una API externa de clima (OpenWeatherMap) y devolver la información meteorológica de una ciudad específica.

---

## 📌 Descripción

`WeatherApiClient` es un cliente HTTP en Java que realiza peticiones GET a la API de OpenWeatherMap para obtener datos del clima en formato JSON.

Su responsabilidad principal es:

- Construir la URL de la API
- Enviar la petición HTTP
- Gestionar la respuesta del servidor
- Devolver los datos como `String`

---

## 🛠️ Tecnologías utilizadas

- Java
- HTTPURLConnection
- OpenWeatherMap API
- Variables de entorno (`API_KEY`)

---

## 🔑 Requisitos

- Java 8 o superior
- API Key válida de OpenWeatherMap
- Conexión a internet

---

## ⚙️ Configuración

Antes de ejecutar el cliente, configura la API Key como variable de entorno:

### Linux / Mac
```bash
export API_KEY=tu_api_key
```
### Windows
```bash
setx API_KEY "tu_api_key"
````

## 📦 Uso de la clase
## Ejemplo de uso
```bash
</> java
String response = WeatherApiClient.getWeather("Madrid");
System.out.println(response);
```
##📡 Endpoint utilizado
```bash
https://api.openweathermap.org/data/2.5/weather
```
## Parámetros:

-q → ciudad
-appid → API Key
-units → métrico (°C)
----

## ⚠️ Manejo de errores

La clase lanza excepciones en caso de:

- API Key inválida o ausente (HTTP 401)
- Ciudad no encontrada (HTTP 404)
- Problemas de conexión
---

## 🚀 Ejemplo de respuesta
```bash
{
  "weather": [
    {
      "description": "clear sky"
    }
  ],
  "main": {
    "temp": 18.5
  }
}
```
### 🧠 Responsabilidad de la clase

- ✔ Solo consumo de API
- ✔ No contiene tests
- ✔ No contiene lógica de validación de QA
- ✔ Solo devuelve datos en bruto

### 👨‍💻 Autor
Ledialí Carrillo Fernández

