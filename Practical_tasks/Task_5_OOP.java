package io.hexlet;

public class User {
    private final int id; // Идентификатор пользователя
    private final String nickname; // Ник пользователя

    // Конструктор
    public User(int id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    // Геттер для идентификатора
    public int getId() {
        return id;
    }

    // Геттер для ника
    public String getNickname() {
        return nickname;
    }

    // Метод для сравнения пользователей
    public boolean isEqual(User otherUser) {
        return this.id == otherUser.getId(); // Сравниваем идентификаторы пользователей
    }
}
