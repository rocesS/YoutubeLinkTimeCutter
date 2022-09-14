package pl.klemi;

import java.net.URL;

public class CheckURL {

    public static boolean validateURL(String userLink)
    {
        try
        {
            new URL(userLink.toUri)
        }
        catch (Exception e)
        {

        }


        return true;
    }
}
