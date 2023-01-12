import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        List<String> array1 = Arrays.asList("Morango", "Uva", "Acerola", "Manga", "Kiwi", "Banana");
        List<String> array2 = Arrays.asList("Pêra", "Caju", "Uva", "Manga", "Maçã", "Banana");
        List<String> repetitions = new ArrayList<>();

        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
                if (array1.get(i).equals(array2.get(j))) {
                    repetitions.add(array1.get(i));
                }
            }

        }
        if (repetitions.isEmpty())
            System.out.println("Não há elementos repetidos.");
        else
            System.out.println(repetitions);
    }
}
