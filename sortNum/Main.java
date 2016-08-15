import java.io.*;
public class Main {
  public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      String[] element= line.split(" ");
      double[] list=new double[element.length];
      for (int i=0; i<element.length; i++ ) {
        list[i]=Double.parseDouble(element[i]);
      }
      for (int i=0; i<sortedList(list).length; i++) {
        System.out.print(sortedList(list)[i]+" ");
      }
    }
  }
  public static double[] sortedList (double[] list){
    for (int i=0; i<list.length; i++) {
      for (int y=list.length-1; y>i; y--) {
        if (list[i]>list[y]) {
          double temp=list[y];
          list[y]=list[i];
          list[i]=temp;
        }
      }
    }
    return list;
  }
}

  //  System.out.println(Arrays.toString(sortedList(list)));

// import java.io.*;
// public class Main {
//   public static double[] sortedList (double[] list){
//     for (int i = 0; i<list.length-1; i++){
//       for (int y=list.length-1; y>0; y--) {
//         if(list[x]>list[y]){
//           double temp= list[x];
//           list[x]=list[y];
//           list[y]=temp;
//         }
//       }
//     }
//     System.out.print(Arrays.toString(sortedList));
//   }
//
//
//
//
//   public static void main (String[] args) throws IOException {
//     File file = new File(args[0]);
//     BufferedReader buffer = new BufferedReader(new FileReader(file));
//     String line;
//
//
//     while ((line = buffer.readLine()) != null) {
//       line = line.trim();
//       String[] data = line.split(" ");
//       for (int i=0; i<data.length; i++) {
//         double[] list = new double[data.length];
//         list[i]=Double.parseDouble(data[i]);
//         System.out.println(list);
//       }
//
//     }
//   }
// }
