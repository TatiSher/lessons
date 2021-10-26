package skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task7();
    }




    private static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника — " + fullName + ".");
    }

    private static void task2() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        String fullName1 = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1 + ".");
    }

    private static void task3() {
        String fullName2 = "Ivanov Ivan Ivanovich";
        fullName2 = fullName2.replace(" ", ";");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName2 + ".");
    }

    private static void task4() {
        String fullName3 = "Иванов Семён Семёнович";
        fullName3 = fullName3.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName3 + ".");
    }

    private static void task5() {
        String fullName4 = "Ivanov-Ivan-Ivanovich";

        String firstName1 = "Ivan";
        int idx1 = firstName1.indexOf('I');
//        System.out.println("Index of 'I' is  " + idx1);
        int idx2 = firstName1.lastIndexOf('n');
//        System.out.println("last Index of 'n' is  " + idx2);

        String lastName1 = "Ivanov";
        int idx3 = lastName1.indexOf('I');
        int idx4 = lastName1.lastIndexOf('v');
//        System.out.println("last Index of 'n' is  " + idx4);

        String middleName1 = "Ivanovich";
        int idx5 = middleName1.indexOf('I');
//        System.out.println("Index of 'I' is  " + idx5);
        int idx6 = middleName1.lastIndexOf('h');
//        System.out.println("last Index of 'n' is  " + idx6);

        System.out.println("Имя сотрудника — " + firstName1.substring(idx1, (idx2 + 1)));
        System.out.println("Фамилия сотрудника — " + lastName1.substring(idx3, (idx4 + 1)));
        System.out.println("Отчество сотрудника — " + middleName1.substring(idx5, (idx6 + 1)));
    }

    private static void task7() {
        StringBuilder str1 = new StringBuilder("135");
        str1.append("246");
        System.out.println(str1.toString());
    }
}
