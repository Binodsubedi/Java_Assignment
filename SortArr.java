import java.util.ArrayList;
import java.util.List;

public class SortArr {

    public static void main(String[] args) {

        String[] list = new String[3];

        // int count = 0;

        list[0] = "meow";
        list[1] = "Neonnn";
        list[2] = "warpp";

        // Copy for updating

        // int Initiator_len = list[0].length();

        String[] listUpdate = list.clone();

        String buffer = "";

        int total_len = list.length;

        for (int i = 0; i < total_len; i++) {

            int len = list[i].length();

            int countIn = 0;

            Boolean checkAfter = false;

            for (String x : list) {

                if (list[i] == x) {

                    checkAfter = true;
                }

                if (len > x.length() && checkAfter == true) {

                    buffer = list[i];

                    listUpdate[i] = list[countIn];

                    listUpdate[countIn] = buffer;

                    System.out.println(listUpdate);

                }

                countIn++;
            }

        }

        System.out.print(listUpdate[0] + "\n" + listUpdate[1] + "\n" + listUpdate[2]);
    }
}
