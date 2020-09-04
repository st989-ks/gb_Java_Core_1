package task.ForLessonFifth;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

<<<<<<< HEAD
    public Employee(String fullName, String position, String email,
                    String telephone, int salary, int age) {
=======
    public Employee (String fullName, String position, String email,
               String telephone,int salary,int age) {
>>>>>>> fb1b839... HWLesson5 1
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
<<<<<<< HEAD

=======
>>>>>>> fb1b839... HWLesson5 1
        return age;
    }

    public int getSalary() {
<<<<<<< HEAD

=======
>>>>>>> fb1b839... HWLesson5 1
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
<<<<<<< HEAD

=======
>>>>>>> fb1b839... HWLesson5 1
        return fullName;
    }

    public String getPosition() {
<<<<<<< HEAD

=======
>>>>>>> fb1b839... HWLesson5 1
        return position;
    }

    public String getTelephone() {
<<<<<<< HEAD

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

=======
        return telephone;
    }
    public void info() {

        System.out.printf("\nФИО - %-20s\nДолжность - %-20s" +
                        "\nПочта - %-20s\nТелефон - %-20s\nЗарплата - %-20d\n" +
                        "Возраст - %-20d\n",
                fullName, position, email,telephone,salary,age);
>>>>>>> fb1b839... HWLesson5 1
    }
}
