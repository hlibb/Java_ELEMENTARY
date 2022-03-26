package lesson3;


import java.util.Arrays;
import java.util.Objects;

public class Script {
    public static void main(String[] args) {
        String script = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        String[] scriptSplitArray = script.split("Z");
        String [] resultStringArray = new String[scriptSplitArray.length];
        for (int i = 0; i < scriptSplitArray.length; i++) {
            char[] scriptCharArray = scriptSplitArray[i].toCharArray();
            if (scriptCharArray.length == 0) continue;
            int index = 0;
            char[] scriptTempResultCharArray = new char[scriptSplitArray[i].length()];
            for (int j = scriptSplitArray[i].length(); j > 0; j--) {
                 scriptTempResultCharArray[index] = scriptSplitArray[i].toCharArray()[j - 1];
                 index++;
            }
            String resultString = new String(scriptTempResultCharArray);
            resultStringArray[i] = resultString;
        }
        for (String s : resultStringArray) {
            if (s == null) continue;
            System.out.print(s + " ");
        }
    }
}