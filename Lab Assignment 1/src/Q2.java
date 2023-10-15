public class Q2 {
    public static void main(String[] args) {
        //part 1: display even numbers between 1 and 100
        int numbers = 100;
        System.out.println("List of even numbers from 1 to 100 :");
        for (int i = 1; i < numbers; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //part 2: display odd numbers between 1 and 100
        int number = 100;
        System.out.println("List of odd numbers from 1 to 100 :");
        for (int i = 1; i < number; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        //part 3: display all the multiples of 4 between 1 and 100
        int multiple = 100;
        System.out.println("List of multiples of 4:");
        for (int i = 1; i < multiple; i++) {
            if (i % 4 == 0)
                System.out.println(i);
        }


        //part 4: display all the numbers between 1 and 100 replacing multiples of 3 with Java
        //multiples of 5 with Script and multiples of 3 and 5 with JavaScript
        int displays = 100;
        System.out.println("The numbers are:");
        for (int j = 1; j < displays; j++) {
            if (j % 3 == 0)
                System.out.println("Java");
            else if (j % 5 == 0) {
                System.out.println("Script");
            }
            else {
                System.out.println(j);
            }
        }
    }
}





