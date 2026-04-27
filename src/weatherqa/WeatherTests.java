package weatherqa;

public class WeatherTests {

    public static void testValidCity() {
        try {
            String response = WeatherApiClient.getWeather("Madrid");

            if (response != null && response.contains("temp")) {
                System.out.println("✔ PASS: Madrid → temperatura recibida");
            } else {
                System.out.println("❌ FAIL: Madrid → sin temperatura");
            }

        } catch (Exception e) {
            System.out.println("❌ FAIL (exception): Madrid → " + e.getMessage());
        }
    }

    public static void testInvalidCity() {
        try {
            WeatherApiClient.getWeather("CiudadInexistente123");

            System.out.println("❌ FAIL: ciudad inválida no detectada");

        } catch (Exception e) {
            System.out.println("✔ PASS: ciudad inválida manejada correctamente");
        }
    }

    public static void testAPIKeyMissing() {
        try {
            WeatherApiClient.getWeather("Madrid");

            System.out.println("❌ FAIL: API Key inválida no detectada");

        } catch (Exception e) {
            System.out.println("✔ PASS: error de API Key controlado");
        }
    }
}