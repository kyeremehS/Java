import java.util.Scanner;

public class jb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of hours worked: ");
        double hours = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        System.out.println("Enter the gender of employee");
        String gender = scanner.nextLine();

        System.out.println("Enter number of children: ");
        int children_num = scanner.nextInt();
        scanner.nextLine(); //consume newline character

        System.out.println("Enter the gender of child: ");
        String child_gender = scanner.nextLine();


        double grosspay;

        if (hours <= 40) {
            if (gender.equals("male")) {
                grosspay = hours * 500;
            } else {
                grosspay = hours * 550;
            }
        } else {
            double overtime = (hours - 40);
            if (gender.equals("male")) {
                grosspay = (40 * 500) + (overtime * 750);
            } else {
                grosspay = (40 * 550) + (overtime * 825);
            }
        }

        //Computing taxes
        final double IncomeTax = 0.15 * grosspay;
        final double NHCL = 0.025 * grosspay;
        final double DistrictTax = 0.01 * grosspay;

        double Edufund;
        //Computation for Edufund
        if( children_num <= 3){
            Edufund = 0;
        }
        else{
            double more = (children_num - 3);
            if(child_gender.equals("male")){
                Edufund = more * 10;
            }
            else{
                Edufund = more * 20;
            }
        }

        double NetPay = grosspay - (IncomeTax + NHCL + DistrictTax + Edufund);
        
        System.out.println("The GrossPay is " + "$"+ grosspay);
        System.out.println("The NetPay is " +"$" +NetPay);
        
        scanner.close();
    }
}
