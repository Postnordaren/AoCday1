import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            String input = Files.readString(Path.of("d01t.txt"));
            ArrayList<Integer> left = new ArrayList<>();
            ArrayList<Integer> right = new ArrayList<>();

            String[] rows = input.split("\n");
            for (int i = 0; i < rows.length; i++) {
                String row = rows[i];
              String[] cook = row.split("   ");
              left.add(Integer.parseInt(cook[0]));
              right.add(Integer.parseInt(cook[1]));
            }
            Collections.sort(left);
            Collections.sort(right);

            int sum = 0;

            for(int i = 0; i < left.size(); i++) {
                sum += Math.abs(left.get(i)-right.get(i));

            }
            System.out.println(sum);

            int sum2 = 0;

            for (int i = 0; i < left.size(); i++) {
                Integer slay = left.get(i);

                Integer fucku = Collections.frequency(right, slay);

                int poop = slay * fucku;
                sum2 += poop;

            }

            System.out.println(sum2);



        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

