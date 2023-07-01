public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();


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
                System.out.println("Ваша ОС не поддерживается");
        }

        // Пишем код для задачи 1
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int clientOS = 0;
        int iOS = 2019;
        int android = 2014;

        switch (clientOS) {
            case 0:
                if (iOS > clientDeviceYear)
                    System.out.println("Установите версию приложения для iOS по ссылке");
          else
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                break;
            case 1:
                if (android > clientDeviceYear)
                    System.out.println("Установите версию приложения для Android по ссылке");
          else
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;

                    default:
                        System.out.println("Ваша ОС не поддерживается");
                        // Пишем код для задачи 2
                }

        }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;

        if (year % 4 == 0 && year % 400 == 0 && year % 100 != 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");

            // Пишем код для задачи 3

        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней 1: для доставки ");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней 2: для доставки");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней 3 для доставки: ");
        } else
            System.out.println("Доставки нет");
        // Пишем код для задачи 4

    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 10;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;

            default:
                System.out.println("Номер месяца больше 13");

                // Пишем код для задачи 5

        }
    }
}







