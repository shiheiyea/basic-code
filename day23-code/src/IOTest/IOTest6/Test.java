package IOTest.IOTest6;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day23-code\\src\\IOTest\\IOTest6\\names.txt"));

        ArrayList<Student> list = new ArrayList<>();

        String str;
        while ((str = br.readLine()) != null) {
            String[] arr = str.split("-");
            list.add(new Student(arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3])));
        }
        br.close();

        int count = list.get(0).getFlag();

        int i = 1;
        for (; i < list.size(); i++) {
            if (count != list.get(i).getFlag()) {
                break;
            }
        }

        if (i == list.size() && count != 0) {
            for (Student student : list) {
                student.setFlag(0);
            }
        }


        Random r = new Random();

        while (true) {
            int index = r.nextInt(list.size()) ;
            Student student = list.get(index);
            if (student.getFlag() != 1) {
                System.out.println(student);
                student.setFlag(1);
                break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("day23-code\\src\\IOTest\\IOTest6\\names.txt"));
        for (Student student : list) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();

    }
}
