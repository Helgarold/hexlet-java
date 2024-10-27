package io.hexlet;

public class App {

    public static String checkSecurity(Url url) {
        String hostName = url.getHost();
        if ("https".equals(url.getProtocol())) {
            return String.format("Connection to %s is secure", hostName);
        } else if ("http".equals(url.getProtocol())) {
            return String.format("Connection to %s is not secure", hostName);
        } else {
            return "Unknown protocol";
        }
    }

    // Здесь можно добавить основной метод для тестирования
    public static void main(String[] args) {
        Url url1 = new Url("https://google.com");
        System.out.println(App.checkSecurity(url1)); // "Connection to google.com is secure"

        Url url2 = new Url("http://example.com");
        System.out.println(App.checkSecurity(url2)); // "Connection to example.com is not secure"
    }
}
