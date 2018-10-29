package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Human {
    private int id;
    private String nameHuman;

    public Human() {
    }

    public Human(String nameHuman) {
        this.nameHuman = nameHuman;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name_human")
    public String getNameHuman() {
        return nameHuman;
    }

    public void setNameHuman(String nameHuman) {
        this.nameHuman = nameHuman;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (id != human.id) return false;
        if (nameHuman != null ? !nameHuman.equals(human.nameHuman) : human.nameHuman != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nameHuman != null ? nameHuman.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", nameHuman='" + nameHuman + '\'' +
                '}';
    }
}
