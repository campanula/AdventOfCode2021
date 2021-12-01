
import java.io.*;
import java.util.ArrayList;

public class Main {
    File file = new File("depthlist.txt");
    int count;
    int count2;
    ArrayList<Integer> array = new ArrayList<>();

    public void readFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                array.add(Integer.parseInt(line));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void partOne() {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i + 1).compareTo(array.get(i)) > 0) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }

    public void partTwo(){
        for (int i = 0; i < array.size() - 3; i++) {
            if (array.get(i + 3).compareTo(array.get(i)) > 0){
                count2 = count2 + 1;
            }
        }
        System.out.println(count2);
    }

    public static void main(String[] args) {
        Main mn = new Main();
        mn.readFile();
        mn.partOne();
        mn.partTwo();
    }
}


