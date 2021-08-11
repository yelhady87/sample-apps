package com.incorta.sample.todo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class ListItem {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;

    public ListItem() {}

    public ListItem(String title) {
        this(title, "");
    }

    public ListItem(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListItem listItem = (ListItem) o;
        return id.equals(listItem.id) && title.equals(listItem.title) && description.equals(listItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListItem{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
