import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        
        int max = Integer.MIN_VALUE;
        
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++)
                max = Math.max(max, 
                arr.get(i-1).get(j-1) + arr.get(i-1).get(j) + arr.get(i-1).get(j+1) +
                arr.get(i).get(j) + 
                arr.get(i+1).get(j-1) + arr.get(i+1).get(j) + arr.get(i+1).get(j+1));
        }
        
        System.out.println(max);
    }
}
