package FinalProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.print("Please specify your request and desired time : ");
        Scanner input = new Scanner(System.in);
        String request = input.nextLine();
        Services.getServicesAndDate(request);

    }
}
