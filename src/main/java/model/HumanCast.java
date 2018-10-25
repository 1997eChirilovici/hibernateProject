package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "human_cast", schema = "hibernatedb", catalog = "")
public class HumanCast {
    private int id;

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

        if (id != humanCast.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
