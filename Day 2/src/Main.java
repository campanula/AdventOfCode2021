import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    File file = new File("input.txt");

    public void partOne() {
        int depth = 0;
        int pos = 0;
        int amount;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                String[] substrings = line.split(" ");

                switch (substrings[0].toLowerCase()) {
                    case "forward":
                        amount = Integer.parseInt(substrings[1]);
                        pos = pos + amount;
                        break;

                    case "up":
                        amount = Integer.parseInt(substrings[1]);
                        depth = depth - amount;
                        break;

                    case "down":
                        amount = Integer.parseInt(substrings[1]);
                        depth = depth + amount;
                        break;

                    default:
                        throw new Exception("Unknown " + substrings[0]);

                }
            }
            System.out.println(pos * depth);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void partTwo() {
        int depth = 0;
        int pos = 0;
        int amount;
        int aim = 0;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                String[] substrings = line.split(" ");

                switch (substrings[0].toLowerCase()) {
                    case "forward":
                        amount = Integer.parseInt(substrings[1]);
                        pos = pos + amount;
                        depth = depth + (aim * amount);
                        break;

                    case "up":
                        amount = Integer.parseInt(substrings[1]);
                        aim = aim - amount;
                        break;

                    case "down":
                        amount = Integer.parseInt(substrings[1]);
                        aim = aim + amount;
                        break;

                    default:
                        throw new Exception("Unknown " + substrings[0]);

                }
            }
            System.out.println(pos * depth);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main mn = new Main();
        mn.partOne();
        mn.partTwo();
    }
}
