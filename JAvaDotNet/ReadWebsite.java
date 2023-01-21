
import java.io.*;
import java.net.*;

public class ReadWebsite {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://www.lagrandee.edu.np/");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String show;
        while ((show = br.readLine()) != null) {
            System.out.println(show);
        }
    }
}
