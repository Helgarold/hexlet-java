package io.hexlet;

public class Url {
    private final String url;
    private String protocol;
    private String host;

    public Url(String url) {
        this.url = url;
        parseUrl();
    }

    private void parseUrl() {
        String[] parts = url.split("://");
        if (parts.length == 2) {
            this.protocol = parts[0];
            this.host = parts[1].split("/")[0]; // Извлекаем хост до первого слэша
        } else {
            throw new IllegalArgumentException("Invalid URL format");
        }
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }
}
