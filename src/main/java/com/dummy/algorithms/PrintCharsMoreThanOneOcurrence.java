import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintCharsMoreThanOneOcurrence {

  public static List<Character> evaluateWord(String aword) {
    Map<Character, Integer> map = new HashMap<>();
    for (char ch : aword.toCharArray()) {
      map.compute(ch, (k,v) -> (v==null) ? 1 :v+1);
    }

    List<Character> chars = map.entrySet()
        .stream()
        .filter(e -> e.getValue() > 1)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
    return chars;
  }

  public static void main(String[] args) {
    String aword = "qwaeretyqqa";
    //String aword = "qwerty";

    List<Character> chars = evaluateWord(aword);
    System.out.println(chars);
  }
}
