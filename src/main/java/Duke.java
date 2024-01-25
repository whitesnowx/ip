import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.StringReader;

public class Duke {

    public static void main(String[] args) throws Exception{

        String NAME = "pipi"; // TENTATIVE

//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String ln = sc.nextLine();

        bot_functions.shifted_print(bot_functions.greetingString(NAME));

        boolean exitFlag = false;

        while (!exitFlag) {
            String input_command = br.readLine();

            if (input_command.equalsIgnoreCase("exit")) {
                bot_functions.shifted_print(bot_functions.signoffString());
                exitFlag = true;

            } else {
                bot_functions.shifted_print(bot_functions.echoString(input_command));
            }
        }

        System.exit(0);

    }

    public static class bot_functions {
        public static final String HORIZONTAL_LINE = "____________________________________________________________\n";

        public static String greetingString(String name){
            String msg = "";
            msg += String.format("%35s", "૮ ˶ᵔ ᵕ ᵔ˶ ა\n");
            msg += "heyo! my name is " + name + "\n";
            msg += "What would you like for me to do?\n";
            return msg;
        }

        public static String sadcat() {
            return
                    "⠀               />    フ\n" +
                            "               | 　_  _|\n" +
                            "             ／` ミ＿_xノ\n" +
                            "          /　　　     |\n" +
                            "         /　 ヽ　     ﾉ\n" +
                            "        │　    |　|　|\n" +
                            "    ／￣|　    |　|　|\n" +
                            "    | (￣ ヽ＿ヽ_)__)\n" +
                            "    ＼二つ⠀⠀\n";
        }
        public static String signoffString(){
            String msg = "";
            msg += "okay then, bye\n";
//            msg += String.format("%40s", "( •̯́ ^ •̯̀)]\n");
            msg += sadcat();

            return msg;
        }

        public  static String echoString(String text) {
            return text;
        }

        public static void shifted_print(String text) throws Exception{
            BufferedReader br = new BufferedReader(new StringReader(text));
            String readText = br.readLine();
            String output = "";
            output += "      " + HORIZONTAL_LINE;
            while (readText != null) {
                output = output + "      " + readText + "\n";
                readText = br.readLine();
            }
            output += "      " + HORIZONTAL_LINE;
            System.out.print(output);
        }

    }
}

