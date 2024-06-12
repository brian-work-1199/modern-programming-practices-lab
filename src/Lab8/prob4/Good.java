package Lab8.prob4;

import java.util.List;
import java.util.stream.Collectors;

public class Good {
    public static void main(String[] args) {
        Good good = new Good();
        System.out.println(good.countWords(Words.listWords,'c','d',4));
    }

    public int countWords(List<String> words, char c, char d, int len){
        return (int) words.stream()
                            .filter(word -> word.indexOf(c) >= 0)
                            .filter(word -> word.indexOf(d) < 0)
                            .filter(word -> word.length() == len)
                            .count();
//        return (int) words.stream()
//                .filter(word -> word.contains(""+c))
//                .filter(word -> !word.contains(""+d))
//                .filter(word -> word.length() == len)
//                .count();
    }
}
