public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task #1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 2
        System.out.println("Task #2");

        dog =  dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 3
        System.out.println("Task #3");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 4
        System.out.println("Task 4");

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        //Task 5
        System.out.println("Task 5");

        var frog = 3.5;
        System.out.println(frog);

        frog *= 10;
        System.out.println(frog);

        frog /= 3.5;
        System.out.println(frog);

        frog += 4;
        System.out.println(frog);

        //Task 6
        System.out.println("Task 6");

        var weight1 = 78.2;
        var weight2 = 82.7;

        var weightSum = (weight1 + weight2);
        System.out.println(weightSum);

        var weightDiff = (weight2 - weight1);
        System.out.println(weightDiff);

        //Task 7
        System.out.println("Task 7");

        var diff = weight2 % weight1;
        System.out.println(diff);

        //Task 8
        System.out.println("Task 8");

        var hoursWork = 640;
        var hoursPerEmployee = 8;
        var countOfEmployees = hoursWork / hoursPerEmployee;
        System.out.println("Всего работников в компании: " + countOfEmployees + " человек.");

        countOfEmployees += 94;
        var newHoursWork = countOfEmployees * hoursPerEmployee;

        System.out.println("Если в компании работает: " + countOfEmployees + " человек, то всего: " + newHoursWork + " часов работы может быть поделено между сотрудниками.»");
    }
}