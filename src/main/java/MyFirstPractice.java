public class MyFirstPractice {

    public static void main(String[] args) {

        int a = 37;
        int b = 10;

        // Арифметические операнды:

        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Деление: " + (a / b));
        System.out.println("Деление с остатком: " + (a % b));
        System.out.println("Инкремент: " + (a++) + " " + (++b));
        System.out.println("Проверка операции инкремента: " + a + " " + b);
        System.out.println("Декремент: " + (a--) + " " + (--b));
        System.out.println("Проверка операции декремента: " + a + " " + b);


        //Логические операнды и операнды сравнения:

        System.out.println("Равно: " + (a == b));
        System.out.println("Не равно: " + (a != b));
        System.out.println("Больше или равно или меньше или равно: " + (a >= b || a <= b));
        System.out.println("Больше и меньше: " + (a > b && b < a));

        // Добиваемся переполнения
        byte c = 127;
        c++;
        System.out.println(c);

        //Вычисления комбинаций типов данных
        int o = 25;
        double k = 12.5;

        System.out.println("Сумма = " + (o+k));
        System.out.println("Разность = " + (o-k));
        System.out.println("Умножение = " + (o*k));
        System.out.println("Деление = " + (o/k));

        //Циклы

        //if - else
        int count = 7;
        if (count > 10) {
            System.out.println("Пицца");
        } else if (count > 6) {
            System.out.println("Гамбургер");
        } else {
            System.out.println("Сэндвич");
        }

        //while
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        //for
        for (int d = 100; d >= 0; d--) {
            if (d % 3 == 0) {
                System.out.println(d);
            }
        }

        //switch-case
        int dayOfWeek = 5;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thuesday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }

    }
}
