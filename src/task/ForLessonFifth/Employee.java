package task.ForLessonFifth;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email,
                    String telephone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public int getSalary() {

        return salary;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {

        return fullName;
    }

    public String getPosition() {

        return position;
    }

    public String getTelephone() {

        return telephone;
    }


    public void info() {

        System.out.printf("\n%-12s%s%n" +
                        "%-12s%s%n" +
                        "%-12s%s%n" +
                        "%-12s%s%n" +
                        "%-12s%d%n" +
                        "%-12s%d%n",
                "ФИО -", fullName,
                "Должность -", position,
                "Почта -", email,
                "Телефон -", telephone,
                "Зарплата -", salary,
                "Возраст -", age);

    }
}
