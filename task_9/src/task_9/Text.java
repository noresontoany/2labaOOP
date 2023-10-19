package task_9;


public class Text {
    private final String s;

    public Text() {
        this.s = "try hhh 2 df er goddess";
    }

    public Text(String txt) {
        this.s = txt;
    }
    private int count_words(String s) {

        boolean w_back = false;
        boolean space = false;
        boolean first = true;
        boolean first_one = true;
        int ch = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 32) {
                if (first) {
                    ch++;
                    first = false;
                    first_one = false;
                }
                w_back = true;
            }
            if (s.charAt(i) == 32 && !first_one) {
                space = true;
            }
            if (s.charAt(i) != 32 && w_back && space) {
                space = false;
                ch++;
            }

        }

        return ch;
    }
    public void replace_words() {
        int ch = count_words(s);
        boolean w_back = false;
        boolean f = true;
        boolean first_one = true;
        String[] str = new String[ch];
        int j = 0;
        for(int i = 0 ; i < s.length(); i++){
            if (s.charAt(i)!= 32 ){
                if(f) {
                    str[j] = String.valueOf(s.charAt(i));
                    f = false;
                    first_one = false;
                    w_back = true;
                }
                else{
                    str[j] +=s.charAt(i);
                }
            }
            else if(!first_one && w_back ){
                j++;
                f = true;
                w_back = false;
            }
        }
        for(int i = 0 ; i < str.length - 1; i++){
            String temp;
            for(int k = 0 ; k < str.length - i - 1; k++){
                if(str[k].length() < str[k+1].length()){
                    temp = str[k];
                    str[k] = str[k+1];
                    str[k+1] = temp;
                }
            }
        }
        String s_final ="";
        f = true;
        for (String string : str) {
            if (f) {
                s_final += string;
                f = false;
            } else {
                s_final += " " + string;
            }

        }

        System.out.print(s_final + "\n");

    }
}
