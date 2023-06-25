public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();




    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("У вас актуальная версия");
        }

        // Пишем код для задачи 1
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int clientOS = 0;
        int IOS = 2019;
        int Android = 2014;

        switch (clientOS) {
            case 0:
                if (IOS >= clientDeviceYear)
                    System.out.println("Установите версию приложения для iOS по ссылке");
                else if (IOS <= clientDeviceYear)
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                break;

            case 1:
                if (Android >= clientDeviceYear)
                    System.out.println("Установите версию приложения для Android по ссылке");
                else if (IOS <= clientDeviceYear)
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                break;

            default:
                System.out.println("У вас актуальная версия");
                // Пишем код для задачи 2
        }

    }
    public static void task3() {
        System.out.println("Задача 3");
        int нear = 2021;
        int LeapYear = 4;

        // Пишем код для задачи 3

    }
}
