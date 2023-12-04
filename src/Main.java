import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[] naturalNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(SumArray.sumArray(naturalNumbers));

        TodoList todoList = new TodoList();
        for (int i = 1; i < 11; i++) {
            todoList.add("Meeting" + i);
        }

        todoList.print();

        todoList.remove(10);

        todoList.add("Meeting11");

        todoList.print();

//        String sampleText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque a justo tellus. Quisque cursus mauris mauris, a pulvinar justo sodales ut. Maecenas accumsan magna odio. Quisque vehicula, lacus a pulvinar viverra, massa tellus aliquam augue, tempus condimentum ante nibh ac arcu. In consequat odio interdum mi tempus, in venenatis nisi dapibus. Suspendisse quis eros sem. Proin odio metus, aliquam at felis at, maximus pellentesque diam. Aenean eros felis, placerat sit amet mi nec, imperdiet lobortis neque. Integer egestas sodales orci, id finibus nunc euismod in. Integer sit amet venenatis leo, nec fringilla libero. Etiam vel volutpat est. Suspendisse a sapien tincidunt, vulputate dolor feugiat, tincidunt mi.";
//        HashMap<String, Integer> wordCountMap = CountingWordsInText.countWords(sampleText);
//
//        // Print the word count map
//        for (String word : wordCountMap.keySet()) {
//            System.out.println(word + ": " + wordCountMap.get(word));
//        }

//        Student student1 = new Student("John", "Doe", 20, 170);
//        Student student2 = new Student("Alice", "Smith", 22, 165);
//        Student student3 = new Student("Bob", "Johnson", 21, 175);
//        Student student4 = new Student("Eva", "Williams", 23, 160);
//        Student student5 = new Student("Jorge", "Doe", 19, 170);
//
//        List<Student> studentList = new ArrayList<>(List.of(student1, student2, student3, student4, student5));
//
//        for (Student student : studentList){
//            System.out.println(student);
//        }
//        System.out.println();
//
//        Collections.sort(studentList);
//
//        studentList.forEach(System.out::println);
    }
}