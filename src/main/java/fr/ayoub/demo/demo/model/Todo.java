package fr.ayoub.demo.demo.model;

public class Todo {

    private Long id;
    private Long userId;
    private String title;
    private String content;

    public Long getUserId(){
        return this.userId;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Todo(Long id, Long userId, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.userId = userId;
    }

    public Todo(){

    }
}
