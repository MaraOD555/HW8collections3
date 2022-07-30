package pro.sky.HW8collections3.Employees;

import java.util.Objects;

public class Employees {
    private final String firstName;
    private final String lastName;
    private final String id;


    public Employees(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;


    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees)) return false;
        Employees employees = (Employees) o;
        return Objects.equals(getFirstName(), employees.getFirstName()) && Objects.equals(getLastName(), employees.getLastName()) && Objects.equals(getId(), employees.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getId());
    }

    @Override
    public String toString() {
        return "Employees{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}


