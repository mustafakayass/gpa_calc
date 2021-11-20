import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Set the variables
        int Math, Phy, Chem, Turkish, History, Music;

        //Set the scanner class
        Scanner input = new Scanner(System.in);

        //Take the data from user
        System.out.print("Write the Math Score : ");
        Math = input.nextInt();


        //Take the data from user
        System.out.print("Write the Phy Score : ");
        Phy = input.nextInt();


        //Take the data from user
        System.out.print("Write the Chem Score : ");
        Chem = input.nextInt();


        //Take the data from user
        System.out.print("Write the Turkish Score : ");
        Turkish = input.nextInt();


        //Take the data from user
        System.out.print("Write the History Score : ");
        History = input.nextInt();


        //Take the data from user
        System.out.print("Write the Music Score : ");
        Music = input.nextInt();

        int sum = Math + Phy + Chem + Turkish + History + Music;
        double gpa = sum / 6;
        System.out.println("Your GPA is : "+ gpa);

        boolean Passed = (gpa==50) || (gpa>50);

        String str = Passed ? "You passed the term" : "You failed the term";
        System.out.println(str);

    }
}
