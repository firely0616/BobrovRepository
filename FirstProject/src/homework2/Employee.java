package homework2;

public class Employee {
    String name;

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public double getSalary() {
        return salary;
    }

    public String getMail() {
        return mail;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    String place;
    double salary;
    String mail;
    int age;
    String phone;
    Employee(String name, String place, String mail, String phone, double salary, int age){
        this.name=name;
        this.place=place;
        this.mail=mail;
        this.phone=phone;
        this.salary=salary;
        this.age=age;
    }
    public void printEmployee() {
        System.out.println("Имя сотрудника - "+name+" Должность - "+place+" Почта - "+mail+" Телефон"+phone+" Зарплата - "+salary+" Возраст - " + age);
    }
}
