package task.ForLessonFifth;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = {new Employee("Водкин Петр Александрович", "Адвокат",

                "vodka@ku.vru", "8(962)565-55-66", 50000, 35),
                new Employee("Китоваленок Игорь Александрович", "Тракторист",
                        "tract@ku.vru", "8(928)706-89-37", 40000, 30),
                new Employee("Дырдыркин Дмитрий Вовкович", "Шишкосбиватель",
                        "osia@ku.vru", "8(965)665-55-69", 50000000, 15),
                new Employee("Федоркин Роман Дмитриевич", "Электрик",
                        "elli@ku.vru", "8(978)751-23-87", 90000, 90),
                new Employee("Карманчик Федор Федорович", "Фрилансер",
                        "fric@ku.vru", "8(967)345-57-56", 551000, 150),
        };
        for (Employee x : employee) {
            if (x.getAge() > 40) {
                x.info();
            }
        }

                "vodka@ku.vru", "8 (962) 565-55-66", 50000, 35),
                new Employee("Китоваленок Игорь Александрович", "Тракторист",
                "tract@ku.vru", "8 (928) 706-89-37", 40000, 30),
                new Employee("Дырдыркин Дмитрий Вовкович", "Шишкосбиватель",
                "osia@ku.vru", "8 (965) 665-55-69", 50000000, 15),
                new Employee("Федоркин Роман Дмитриевич", "Электрик",
                "elli@ku.vru", "8 (978) 751-23-87", 90000, 90),
                new Employee("Карманчик Федор Федорович", "Фрилансер",
                "fric@ku.vru", "8 (967) 345-57-56", 551000, 150),
        };
        for (Employee x : employee) {
            x.info();
            }

    }

}
