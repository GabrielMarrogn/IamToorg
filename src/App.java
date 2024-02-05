import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i < a; i++){
            br.readLine();
        }

        for(int i = 0; i < a; i++){
            System.out.println("I am Toorg!");
        }
    }
}
