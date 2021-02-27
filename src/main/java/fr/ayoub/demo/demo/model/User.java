package fr.ayoub.demo.demo.model;

public class User {

    private Long id;
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User(String name, Long id) {
        this.name = name;
        this.id = id;
    }
}
