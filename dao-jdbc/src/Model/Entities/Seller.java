package Model.Entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {
    @Serial
    private static final long serialVersionUID = 1;

    public Seller() {
    }

    public Integer getId() {
        return Id;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Seller{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", BirthDate=" + BirthDate +
                ", BaseSalary=" + BaseSalary +
                ", Department=" + Department +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Seller)) return false;
        if (!super.equals(object)) return false;

        Seller seller = (Seller) object;

        if (Id != null ? !Id.equals(seller.Id) : seller.Id != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (Id != null ? Id.hashCode() : 0);
        return result;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public Double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        BaseSalary = baseSalary;
    }

    public Department getDepartment() {
        return Department;
    }

    public void setDepartment(Department department) {
        Department = department;
    }

    public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department department) {
        Id = id;
        Name = name;
        Email = email;
        BirthDate = birthDate;
        BaseSalary = baseSalary;
        Department = department;
    }

    private Integer Id;
    private String Name;
    private String Email;
    private Date BirthDate;
    private Double BaseSalary;
    private Department Department;
}