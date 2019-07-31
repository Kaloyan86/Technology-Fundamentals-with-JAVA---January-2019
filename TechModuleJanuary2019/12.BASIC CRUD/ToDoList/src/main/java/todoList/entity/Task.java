package todoList.entity;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    private long id;
    private String title;
    private String comments;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    @Column(columnDefinition = "text", nullable = false)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Task(long id, String title, String comments) {
        this.id = id;
        this.title = title;
        this.comments = comments;
    }

    public Task() {
    }
}
