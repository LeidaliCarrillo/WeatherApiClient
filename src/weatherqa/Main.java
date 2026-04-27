package weatherqa;

public class Main {

    public static void main(String[] args) {

        System.out.println("🚀 Iniciando tests de Weather API QA...\n");

        WeatherTests.testValidCity();
        WeatherTests.testInvalidCity();
        WeatherTests.testAPIKeyMissing();

        System.out.println("\n✔ Ejecución finalizada");
    }
}