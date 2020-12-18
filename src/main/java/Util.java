import java.util.List;

public class Util {

    public int calculateAverage(int ... v) {
        int count = 0;
        for (int number : v) {
            count += number;
        }
        return count / v.length;
    }

    public String joinString(List<String> listOfStrings, char separator) {
        String result = "";
        for (String string : listOfStrings) {
            result += string + separator;
        }
        return result.substring(0, result.length() - 1);
    }
}
