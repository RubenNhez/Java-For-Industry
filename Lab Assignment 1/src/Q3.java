public class Q3 {
    public static void main(String[] args) {

        double salary = 60000;
        double tax = 0;
        double taxablesalary = salary;
        //write your code here to calculate the tax of the variable salary, make sure you try multiple values
        // to test your work
        if(salary > 50000) {
            tax = ((salary - 50000) * 0.40);
            taxablesalary = 50000;
        } if (taxablesalary > 30000) {
            tax += ((taxablesalary - 30000) * 0.20);
            taxablesalary = 30000;
        } if (taxablesalary > 15000) {
            tax += ((taxablesalary - 15000) * 0.05);
            taxablesalary = 15000;
        }
        else{
//4000+4000+750
    }
        tax = tax*100/100;
        System.out.println("The tax is " + String.format("%.2f",tax));
    }
}