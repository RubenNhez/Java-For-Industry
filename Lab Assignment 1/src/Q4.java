public class Q4 {
    public static void main(String[] args) throws java.io.IOException{
        //write your answer here
        char Menu;
        do {
            System.out.println("Select: 1 for Current Accounts");
            System.out.println("Select: 2 for Credit Cards");
            System.out.println("Select: 3 for Loans");
            System.out.println("Select: 4 for Savings accounts");
            System.out.println("Select: h to stop");
             Menu = (char) System.in.read();
            System.in.read();
            switch (Menu) {
                case '1':
                    System.out.println("Current Accounts");
                    break;
                case '2':
                    System.out.println("Credit Cards");
                    break;
                case '3':
                    System.out.println("Loans");
                    break;
                case '4':
                    System.out.println("Savings Accounts");
                    break;
            }


        }while (Menu != 'h') ;
    }
}
