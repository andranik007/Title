package com.example.podgotovca1.Entity;

public enum Role {
    USER("Пользователь"),
    ADMIN("Администратор");

    private final String name;

    Role(String name) {this.name = name;}
}