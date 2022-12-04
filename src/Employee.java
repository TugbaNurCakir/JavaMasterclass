public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String city;
    private String job;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    Employee(String name, String surname, int salary, String city, String job){
        setName(name);
        setSurname(surname);
        setSalary(salary);
        setCity(city);
        setJob(job);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("tugbanur", "cakir", 1000, "Ankara", "Developer");
        System.out.println("Employee1: "+e1.name+" "+e1.surname+" "+e1.salary+" "+e1.city+" "+e1.job);
    }
}
