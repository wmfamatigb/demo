package fr.ayoub.demo.demo.model;

public class AddTodoRequest {

    private Long userId;
    private String title;
    private String content;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public AddTodoRequest(Long userId, String title, String content) {
        this.userId = userId;
        this.title = title;
        this.content = content;
    }
}
