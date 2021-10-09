package interviewpreparationkit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {
    private Result() {
        throw new IllegalStateException("Utility class");
    }
    public static void minimumBribes(List<Integer> q) {
        int dif = 0;
        boolean chaotic = false;
        for(int i =0 ; i< q.size(); i++){
            if(q.get(i) - (i+1)>2){
                chaotic = true;
                break;
            }else{
                int startindex = Math.max(0,q.get(i)-2);
                for(int j = startindex  ; j < i ; j++){
                    if(q.get(j) > q.get(i))
                        dif++;
                }
            }
        }
        System.out.println(chaotic?"Too chaotic":dif);


    }

}
public class NewYearChaos {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] qTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> q = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qTemp[i]);
                q.add(qItem);
            }

            Result.minimumBribes(q);
        }

        bufferedReader.close();
    }
}
