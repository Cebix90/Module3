import java.util.HashMap;

public class CountingWordsInText {
    public static HashMap<String, Integer> countWords(String text){
        HashMap<String, Integer> hashMap = new HashMap<>();

        if (text == null || text.isEmpty()) {
            return hashMap;
        }

        String[] words = text.replaceAll("\\p{Punct}", "").toLowerCase().split("\\s+");

        for (String word : words) {
            if(!hashMap.containsKey(word)) {
                hashMap.put(word, 1);
            } else {
                int currentCount = hashMap.get(word);
                hashMap.replace(word, currentCount + 1);
            }
        }

        return hashMap;
    }
}
