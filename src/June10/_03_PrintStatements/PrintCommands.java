package June10._03_PrintStatements;

public class PrintCommands {
    public static void main(String[] args) {


        //println
        System.out.println("Hello, World!");
        System.out.println(123);
        System.out.println(true);


        //print
        System.out.print("Hello ");
        System.out.print("World!");


        //printf
        //%d --> int,byte,long,short - datatype
        //%s --> String
        //%f --> float, double
        //%b --> boolean

        int age = 25;
        String name = "Ramya";
        double score = 95.5;
        System.out.printf("Name: %s, Age: %d, Score: %.2f\n", name, age, score);

        System.out.print("Hello ");
        System.out.println("World!");
        System.out.printf("Today is %d/%d/%d\n", 7, 7, 2025);

        int a = 10;
        int b = 20;
        System.out.printf("%d +%d", a, b);



    }
}
