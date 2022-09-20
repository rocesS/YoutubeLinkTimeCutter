package pl.klemi;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userLink;
        int startMovieFromHours;
        int strtMovieFromMinute;
        int startMovieFromSecond;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wklej link do filmu YouTube:");

        userLink = scanner.next();

//Loop will work when inputed user's URL is valid

            if (CheckURL.validateURL(userLink)){
                System.out.println("Link Poprawny to będzie kontynuowane");
            } else {
                System.out.println("Podany link jest niepoprawny");
            }


    }
}
