
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] data= line.split(",");
            int X = Integer.parseInt(data[0]);
            int N = Integer.parseInt(data[1]);
            int Y = data.length;
            int r=1;
            String[] output= new String[Y];
            for (int i=0; i<X; i++) {
              r=N*i;
              if (r>=X) {
                  output[i]=Integer.toString(i)
                }

                System.out.println(String.join(" ",output));
              }
            }
            System.out.println(String.join(" ", output));
          }
        }
