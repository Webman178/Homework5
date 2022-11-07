public class Main {
    public static void main(String[] args) {
        //Задача1
        System.out.println("Задача1");
    int clientOS = 1;
    int iOS = 0;
    int Android = 1;
    if (clientOS == iOS) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    }
    if (clientOS == Android) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }

        //Задача2
        System.out.println("Задача2");
        int clientDeviceYear = 2009;
        if (clientOS == iOS && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == iOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (clientOS == Android && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == Android && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача3
        System.out.println("Задача3");
        int year = 2021;
        int leapYear = (year % 4);
        if (leapYear == 0 && (year % 400 == 0 || year % 100 != 0))
            System.out.println(year + " год является високосным");
        else
        System.out.println(year + " год не является високосным");

        //Задача4
        System.out.println("Задача4");
        int deliveryDistance = 95;
        int deliveryFirstDay = 20;
        int deliveryAfterTheFirstDay = 40;
        int ternDelivery = deliveryDistance - deliveryFirstDay - deliveryAfterTheFirstDay;
        if (deliveryFirstDay - deliveryDistance >= 0)
        System.out.println("Потербуется 1 день");
        else if (deliveryFirstDay + deliveryAfterTheFirstDay - deliveryDistance >= 0)
        System.out.println("Потребуется 2 дня");
        else if (deliveryFirstDay + deliveryAfterTheFirstDay + deliveryAfterTheFirstDay - deliveryDistance >= 0)
            System.out.println("Потребуется 3 дня");
        else
            System.out.println("Доставка не осуществляется");

        //Задача5
        System.out.println("Задача5");
        int monthNumber = 13;
        if (monthNumber <= 12) {
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
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
        }

        }else {
            System.out.println("Такого месяца существует");
        }

    }
}