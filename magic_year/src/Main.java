import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean flag = false;
        boolean againFlag;
        Calculator myCalculator =new Calculator();

        int mySalary = 0;
        int myYearStartWork = 0;
        boolean isNum;
        do{
            System.out.println("Welcome to the magic year calculator!\n");
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please enter your name:");
            String name = userInput.nextLine();
            System.out.print("Please enter your surname:");
            String surname = userInput.nextLine();
            mySalary = getMySalary(myCalculator, mySalary, userInput);

            do{
                System.out.print("Please enter your work start year:");
                String yearStartWork = userInput.nextLine();
                isNum = Validation.isNum(yearStartWork);
                if(isNum){
                    myYearStartWork = myCalculator.magicYear(Integer.parseInt(yearStartWork));
                }
            }while (!isNum);

            System.out.println("Your magic age details are:");
            System.out.println(
                    String.format("Name: %s %s", name, surname ));
            System.out.println(
                    String.format("Monthly Salary: %d", mySalary ));
            System.out.println(
                    String.format("Magic Year: %d", myYearStartWork ));

            System.out.print("Do you want to calculate again?(Y/N): ");

            do{

                String input = userInput.next();
                String inputUpper = String.format(input.toUpperCase());

                switch (inputUpper){
                    case "Y":
                        flag = true;
                        againFlag = false;
                        break;
                    case "N":
                        flag = false;
                        againFlag = false;
                        System.out.println("See you later!");
                        break;
                    default:
                        System.out.print("Sorry, I don't understand, please type Y or N");
                        againFlag = true;
                }

            } while (againFlag);
        }
        while(flag);



    }

    private static int getMySalary(Calculator myCalculator, int mySalary, Scanner myObj) {
        boolean isNum;
        do{
            System.out.print("Please enter your annual salary:");
            String salary = myObj.nextLine();
            isNum = Validation.isNum(salary);
            if(isNum){
                mySalary = myCalculator.monthSalary(Integer.parseInt(salary));
            }
        }while (!isNum);
        return mySalary;
    }
}


