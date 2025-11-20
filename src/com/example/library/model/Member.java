package com.example.library.model;

public final class Member {
    private final String id;
    private final String name;
    private final String email;

    public Member(String id, String name, String email) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("ID requis");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Nom requis");
        if (email == null || !email.contains("@")) throw new IllegalArgumentException("Email invalide");
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Member{id='" + id + "', name='" + name + "', email='" + email + "'}";
    }
}