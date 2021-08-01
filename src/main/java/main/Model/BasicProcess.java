package main.Model;

import javax.persistence.*;


@Entity
@Table(name="basicprocess")
public class BasicProcess {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @Column(name = "name")
    private String name;

    @Column(name = "id")
    private Integer id;

    @Column(name = "color")
    private String color;

    @Column(name = "level")
    private String level;

    @Column(name = "form")
    private Integer form;

    @Column(name = "position")
    private Integer position;

    @Column(name = "visibleName")
    private String visibleName;

    @Column(name = "isVisible")
    private Boolean isVisible;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setForm(Integer form) {
        this.form = form;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public void setVisibleName(String visibleName) {
        this.visibleName = visibleName;
    }

    public void setVisible(Boolean visible) {
        isVisible = visible;
    }

    public String getLevel() {
        return level;
    }

    public Integer getForm() {
        return form;
    }

    public Integer getPosition() {
        return position;
    }

    public String getVisibleName() {
        return visibleName;
    }

    public Boolean getVisible() {
        return isVisible;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
