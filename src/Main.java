import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Resume resume1 = new Resume();
        String name = "";
        String address = "";
        System.out.println("We are creating a resume!");
        System.out.println("Please provide your name: ");
        name = keyboard.nextLine();
        resume1.setName(name);
        System.out.println("Please provide your email address: ");
        address = keyboard.nextLine();
        resume1.setAddress(address);
        System.out.println("Now we will enter information for your previous jobs: ");
        ArrayList<String>sDates = new ArrayList<>();
        ArrayList<Resume> allJobs = new ArrayList<>();

        ArrayList<String>eDates = new ArrayList<>();
        while(true){
            ArrayList<String>Jobs = new ArrayList<>();
            String company = "";
            System.out.println("Please enter the name of your previous company: ");
            company = keyboard.nextLine();
            resume1.setCompany(company);
            Jobs.add(resume1);


            System.out.println("Please enter your job title at that company: ");
            String title = "";
            title = keyboard.nextLine();
            resume1.setTitle(title);

            System.out.println("Please enter the date you started with the company: ");
            int sdate = 0;
            sdate = keyboard.nextInt();
            keyboard.nextLine();
            resume1.setSdate(sdate);

            System.out.println("Please enter your last date with the company: ");
            int edate = 0;
            edate = keyboard.nextInt();
            keyboard.nextLine();
            resume1.setEdate(edate);

            System.out.println("Provide a job description: ");
            String description = "";
            description = keyboard.nextLine();
            resume1.setDescription(description);

            System.out.println("Would you like to add another description? If yes, please provide it below. " +
                    "If no, please type 'no' to continue.");
            String danswer = "";
            danswer = keyboard.nextLine();

//            while(true){
//                System.out.println("Please add another description: ");
//                String danswer1 = "";
//                danswer1 = keyboard.nextLine();
//            }

            if (danswer.equalsIgnoreCase("no")){
                System.out.println("Do you want to enter another job (yes/no)?");

                String noMoreJobs = "";
                noMoreJobs = keyboard.nextLine();

                if (noMoreJobs.equalsIgnoreCase("no")){
                    System.out.println("You have completed your resume!");
                    break;
                }
            }
        }

        System.out.println("You have completed your resume!");
        for ()






    }
}
