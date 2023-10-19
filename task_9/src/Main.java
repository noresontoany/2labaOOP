
import task_9.Array_9;
import task_9.Text;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("constructor");
        System.out.print("Задача №1: ");
        int[][] nums = new int[in.nextInt()][in.nextInt()];
        Array_9 Arr =  new Array_9(nums);
        Arr.fill_array();
        Arr.check_array();

        System.out.print("Задача №2: ");
        Arr.new_array();

        System.out.print("Задача №3: ");
        System.out.print("Input  words: ");
        in.nextLine();
        String text = in.nextLine();
        Text Str = new Text(text);
        Str.replace_words();
        System.out.print("\n");

        System.out.print("Задача №4: ");
        Arr.min_elem();

        System.out.print("no_constructor 3x3 and 'try hhh 2 df er goddess'");
        Array_9 Arr_2 =  new Array_9();
        Text Str_2 = new Text();
        Arr_2 .fill_array();
        Arr_2 .check_array();
        Arr_2.new_array();
        Str_2.replace_words();
        System.out.print("Задача №4: ");
        Arr_2.min_elem();

    }

}



