public class Main {
    public static void main(String[] args) {
        // task #1
        int age = 15;
        if (age >= 18)
        {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else
        {
            System.out.println("Если возраст человека равен " + age + ", " +
                    "то он не достиг совершеннолетия, нужно немного подождать");
        }

        // task #2
        int temp = 16;
        if (temp < 5)
        {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        else
        {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        // task #3
        int speed = 100;
        if (speed > 60)
        {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        else
        {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        // task #4
        int ageOfHuman = 25;
        if (ageOfHuman >= 2 && ageOfHuman <= 6)
        {
            System.out.println("Если возраст человека равен " + ageOfHuman + ", то ему нужно ходить в детский сад");
        }
        else if (ageOfHuman >= 7 && ageOfHuman <= 17)
        {
            System.out.println("Если возраст человека равен " + ageOfHuman + ", то ему нужно ходить в школу");
        }
        else if (ageOfHuman >= 18 && ageOfHuman <= 24)
        {
            System.out.println("Если возраст человека равен " + ageOfHuman + ", то его место в университете");
        }
        else
        {
            System.out.println("Если возраст человека равен " + ageOfHuman + ", то ему пора ходить на работу");
        }

        // task #5
        int ageOfChild = 15;
        if (ageOfChild <= 5)
        {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему нельзя кататься на аттракционе");
        }
        else if (ageOfChild >5 && ageOfChild <= 14)
        {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе в сопровождении");
        }
        else
        {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        // task #6
        int capacity = 102;
        int sittingPlace = 60;
        int passengers = 60;
        if (passengers < sittingPlace)
        {
            System.out.println("В вагоне "+ passengers+ " человек, ещё остались сидячие места");
        }
        else if (passengers >= sittingPlace && passengers < capacity)
        {
            System.out.println("В вагоне " + passengers + " человек, остались только стоячие места");
        }
        else
        {
            System.out.println("В вагоне " + passengers + " человек, мест нет");
        }

        // talk #7
        int one = 13;
        int two = 11;
        int three = 12;
        if (one > two)
        {
            if (one > three)
            {
                System.out.println("Наибольшее число — " + one + " из чисел: "+ one + "; " + two + "; " + three);
            }
            else
            {
                System.out.println("Наибольшее число — " + three + " из чисел: "+ one + "; " + two + "; " + three);
            }
        }
        else if (two > three)
        {
            System.out.println("Наибольшее число — " + two + " из чисел: "+ one + "; " + two + "; " + three);

        }
        else
        {
            System.out.println("Наибольшее " + three + " из чисел: "+ one + "; " + two + "; " + three);
        }
    }
}