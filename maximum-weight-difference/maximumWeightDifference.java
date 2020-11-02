/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.nio.charset.StandardCharsets;
import java.io.*;

class GFG {
	public static void main (final String[] args) {
        var name = "maximum-weight-difference/input.txt";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(name),
                StandardCharsets.UTF_8))) {
            final int numOfTests = Integer.parseInt(br.readLine());

            for (int test = 0; test < numOfTests; test++) {
                // final int n = Integer.parseInt(br.readLine().trim());
                final String[] nk  = br.readLine().trim().split("\\s+");
                final String[] stringArrayIn = br.readLine().trim().split("\\s+");


            }
            br.close();

        }
        catch(Exception e) {

        }
	}
}
