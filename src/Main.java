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
        int clientOS = 0;

        int ios = 0;
        int android = 1;

        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2011;
        int clientOS = 1;


        int ios = 0;
        int android = 1;

        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        else if(clientDeviceYear >= 2015){
                if (clientOS == 0){
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }else if(clientOS == 1){
                    System.out.println("Установите версию приложения для Android по ссылк");
                }
            }
    }
    public static void task3() {
        System.out.println("Задача 3");

        int yers = 1700;

        if (yers % 100 ==0 && yers % 400 !=0 || yers % 4 !=0){
            System.out.println(+yers + " год не является високосным");
        }
        else if ( yers % 100 ==0 && yers % 400 ==0 || yers % 4 ==0) {
            System.out.println(+yers + " год  является високосным");

        }
    }
    public static void task4() {
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int day = 1;

        if (deliveryDistance <=20){
            System.out.println("Потребуется дней:" + day+ ".");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            day +=1;
            System.out.println("Потребуется дней:" + day+ ".");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            day +=2;
            System.out.println("Потребуется дней:" + day+ ".");
        }else if (deliveryDistance > 100){
            System.out.println(" доставки нет");

        }
    }
    public static void task5() {
        System.out.println("Задача 5");

        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
                System.out.println("январь зима");
                break;
            case 2:
                System.out.println("февраль зима");
                break;
            case 3:
                System.out.println("март весна");
                break;
            case 4:
                System.out.println("апрель весна");
                break;
            case 5:
                System.out.println("май весна");
                break;
            case 6:
                System.out.println("июнь лето");
                break;
            case 7:
                System.out.println("июль лето");
                break;
            case 8:
                System.out.println("август лето");
                break;
            case 9:
                System.out.println("сентябрь осень");
                break;
            case 10:
                System.out.println("октябрь осень");
                break;
            case 11:
                System.out.println("ноябрь осень");
                break;
            case 12:
                System.out.println("декабрь зима");
                break;
            default:
                System.out.println("такого месяца нет");
        }
    }

}
