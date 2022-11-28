import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int days = Integer.parseInt(reader.readLine());

        System.out.println(rentalCarCost(days));
        

    }
        private static int rentalCarCost(int days){
int rent = 40* days;
if(days<1){return 0;}
if(days >=7){
    rent -= 50;} else if (days>=3){rent -= 20;}

return rent;


        }

    }
