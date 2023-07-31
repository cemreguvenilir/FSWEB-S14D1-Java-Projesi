package model;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary < 0 ? 0 : salary;
    }

    public void work(){
        System.out.println("Employee starts to working");
    }
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(" id " + id);
        builder.append(" name " + name);
        return builder.toString();
    }
}
