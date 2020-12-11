package HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Konketenation {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String summa = "";

        String q = "";

        String b="stop";
        while(!q.equals(b)){

            q = reader.readLine();
            if(q!=args[args.length - 1])
                summa += q + ",";


        }

        System.out.println(summa+".");

    }
}
