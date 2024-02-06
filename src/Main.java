//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("First task: " + dog + ", " + cat + ", " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper+ 4;
        System.out.println("Second task: " + dog + ", " + cat + ", " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper- 7639;
        System.out.println("Third task: " + dog + ", " + cat + ", " + paper);

        var friend = 19;
        friend = (friend + 2) / 7;
        System.out.println("Forth task: " + friend);

        var frog = 3.5;
        System.out.print("Fifth task: " + frog + " => ");
        frog = frog * 10;
        System.out.print(frog+ " => ");
        frog = frog / 3.5;
        System.out.print(frog + " => ");
        frog = frog + 4;

        System.out.println(frog);
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var bothBoxers = firstBoxer + secondBoxer;
        var difference = secondBoxer % firstBoxer;
        //or difference = secondBoxer - firstBoxer
        System.out.println("Sixth task" + bothBoxers);

        System.out.println("Seventh task: " + difference);

        var hours = 640;
        var hoursPerPerson = 8;
        var workers = hours / hoursPerPerson;
        System.out.println("Eighth task: ");
        System.out.println("Всего работников в компании — " + workers + " человек");
        workers = workers + 94;
        hours = workers * hoursPerPerson;
        System.out.print("Если в компании работает " + workers + " человек, то всего ");
        System.out.print(hours + " часов работы может быть поделено между сотрудниками");
    }
}