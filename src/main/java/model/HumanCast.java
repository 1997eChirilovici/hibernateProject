package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "human_cast", schema = "hibernatedb", catalog = "")
public class HumanCast {
    private int id;
    private Gender genderByIdGender;
    private Human humanByIdHuman;

    public HumanCast() {
    }

    public HumanCast(Gender genderByIdGender, Human humanByIdHuman) {
        this.genderByIdGender = genderByIdGender;
        this.humanByIdHuman = humanByIdHuman;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanCast humanCast = (HumanCast) o;
        return id == humanCast.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @ManyToOne
    @JoinColumn(name = "id_gender", referencedColumnName = "id", nullable = false)
    public Gender getGenderByIdGender() {
        return genderByIdGender;
    }

    public void setGenderByIdGender(Gender genderByIdGender) {
        this.genderByIdGender = genderByIdGender;
    }

    @ManyToOne
    @JoinColumn(name = "id_human", referencedColumnName = "id", nullable = false)
    public Human getHumanByIdHuman() {
        return humanByIdHuman;
    }

    public void setHumanByIdHuman(Human humanByIdHuman) {
        this.humanByIdHuman = humanByIdHuman;
    }

    @Override
    public String toString() {
        return "HumanCast{" +
                " genderByIdGender=" + genderByIdGender +
                ", humanByIdHuman=" + humanByIdHuman +
                '}';
    }
}
