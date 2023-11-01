package Model.Entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private Integer Id;
    private String Name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;

        return Objects.equals(Id, that.Id);
    }

    @Override
    public String toString() {
        return "Department{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Id != null ? Id.hashCode() : 0;
    }

    public Department(Integer id, String name) {
        Id = id;
        Name = name;
    }

    public Department() {
    }

}
