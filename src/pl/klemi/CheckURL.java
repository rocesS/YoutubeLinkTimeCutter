package pl.klemi;

import java.net.URL;

public class CheckURL {

    public static boolean validateURL(String urlString)
    {
        try
        {
            new URL(urlString).toURI();
        }
        catch (Exception e)
        {
            System.out.println(e);
            return false;
        }

        return true;
    }
}
