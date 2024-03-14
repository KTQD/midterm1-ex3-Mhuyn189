import java.io.*;
public class Main {
    public static void main(String[] args) {

        try {
            // Đọc nội dung từ file input.txt
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }
            bufferedReader.close();

            // Thay thế toàn bộ các từ "Nha Trang" bằng từ "Vũng Tàu"
            String replace = content.toString().replaceAll("Nha Trang", "Vũng Tàu");

            // Ghi nội dung đã thay thế ra file output.txt
            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(replace);
            bufferedWriter.close();

            System.out.println("Đã thay thế và ghi nội dung ra file output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
