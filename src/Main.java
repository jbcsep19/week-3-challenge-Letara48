import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
//        Resume resume1 = new Resume(); //jobs
        Resume resume2 = new Resume(); //intro
        Resume dates1 = new Resume(); // Start Dates
        Resume dates2 = new Resume(); // End Dates
        ArrayList<Resume> allJobs = new ArrayList<>();//jobs listing
        String userInput = "";
        String name = "";
        String address = "";
        String company = "";
        String title = "";
        String edate = "";
        String sdate = "";
        String description = "";
        String danswer = "";
        String danswer1 = "";
        String danswer2 = "";
        System.out.println("We are creating a resume!");
        ArrayList<Resume> intro = new ArrayList<>(); //Intro list
        System.out.println("Please provide your name: ");
        name = keyboard.nextLine();
        resume2.setName(name);

        System.out.println("Please provide your email address: ");
        address = keyboard.nextLine();
        resume2.setAddress(address);
        intro.add(resume2);

        int counter = 1;
        ArrayList<Resume> sDates = new ArrayList<>();

        ArrayList<Resume> eDates = new ArrayList<>();
//        Jobs.add(resume1);
        while (true){
            counter = counter + 1;
            Resume resume1 = new Resume();
            System.out.println("Please provide your previous employer:");
//            System.out.println("Job #" + counter + ":");
            company = keyboard.nextLine();
            resume1.setCompany(company);

            System.out.println("Job title:");
            title = keyboard.nextLine();
            resume1.setTitle(title);

            System.out.println("Start Date: ");
            sdate = keyboard.nextLine();
            resume1.setSdate(sdate);
            dates1.setSdate(sdate);
            sDates.add(dates1);


            System.out.println("End Date: ");
            edate = keyboard.nextLine();
            resume1.setEdate(edate);
            dates2.setEdate(edate);
            eDates.add(dates2);


            while (true){
            System.out.println("Job Description: ");
            description = keyboard.nextLine();
            resume1.setDescription(description);
            allJobs.add(resume1);


            System.out.println("Do you want to add another job description? (y/n)");
            danswer = keyboard.nextLine();
            if (danswer.equalsIgnoreCase("n")){
                break;
            }}
            System.out.println("Do you want to add another job? (y/n).");
            userInput = keyboard.nextLine();
            if(userInput.equalsIgnoreCase("n")){
                break;
            }

//            counter = counter + 1;

        }

        System.out.println("This is your resume: ");
        System.out.println(resume2.getHeading());
        for (Resume resume1 : allJobs){
//            System.out.println("Job " + counter);
            System.out.println(resume1.getJobs());


//            counter += resume1;

        }int size = allJobs.size();

        int sum = 1;
        for ( int i = 0; i <size; i++){
            sum += i ;

        }
        System.out.println("You have listed " + sum + " jobs.");


        }
    }












