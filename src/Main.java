public class Main {
    public static void main(String[] args) {
        //task1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = firstName +middleName + lastName;
        System.out.println("ФИО сотрудника - "+ fullName);
        //task2
        String fullName1 = "Ivanov Ivan Ivanovich";
        fullName1 = fullName1.replace("i", "I");
        fullName1 = fullName1.replace("v", "V");
        fullName1 = fullName1.replace("a", "A");
        fullName1 = fullName1.replace("n", "N");
        fullName1 = fullName1.replace("o", "O");
        fullName1 = fullName1.replace("c", "C");
        fullName1 = fullName1.replace("h", "H");
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName1);
        //task3
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника  - " + fullName2);


    }
}