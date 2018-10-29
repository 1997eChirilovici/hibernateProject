package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gender {
    private int id;
    private String titleGender;

    public Gender() {
    }

    public Gender(String titleGender) {
        this.titleGender = titleGender;
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
    @Column(name = "title_gender")
    public String getTitleGender() {
        return titleGender;
    }

    public void setTitleGender(String titleGender) {
        this.titleGender = titleGender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gender gender = (Gender) o;

        if (id != gender.id) return false;
        if (titleGender != null ? !titleGender.equals(gender.titleGender) : gender.titleGender != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (titleGender != null ? titleGender.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id=" + id +
                ", titleGender='" + titleGender + '\'' +
                '}';
    }
}
