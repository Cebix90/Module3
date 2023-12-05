import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTests {
    @Test
    public void testCompareToUnsortedAndSortedListWithNegativeResult(){
        Student student1 = new Student("John", "Doe", 20, 170);
        Student student2 = new Student("Alice", "Smith", 22, 165);
        Student student3 = new Student("Bob", "Johnson", 21, 175);
        Student student4 = new Student("Eva", "Williams", 23, 160);
        Student student5 = new Student("Jorge", "Doe", 19, 170);

        List<Student> studentBeforeSort = new ArrayList<>(List.of(student1, student2, student3, student4, student5));
        List<Student> studentAfterSort = new ArrayList<>(List.of(student1, student2, student3, student4, student5));
        Collections.sort(studentAfterSort);

        Assertions.assertNotEquals(studentBeforeSort.toArray(), studentAfterSort.toArray());
    }

    @Test
    public void testCompareToUnsortedAndSortedListWithPositiveResult(){
        Student student1 = new Student("Alice", "Smith", 22, 165);
        Student student2 = new Student("Bob", "Johnson", 21, 175);
        Student student3 = new Student("Bob", "Johnson", 20, 175);
        Student student4 = new Student("John", "Doe", 20, 170);

        List<Student> studentBeforeSort = new ArrayList<>(List.of(student1, student2, student3, student4));

        Student student5 = new Student("John", "Doe", 20, 170);
        Student student6 = new Student("Bob", "Johnson", 20, 175);
        Student student7 = new Student("Bob", "Johnson", 21, 175);
        Student student8 = new Student("Alice", "Smith", 22, 165);
        List<Student> studentAfterSort = new ArrayList<>(List.of(student5, student6, student7, student8));
        Collections.sort(studentBeforeSort);

        Assertions.assertArrayEquals(studentBeforeSort.toArray(), studentAfterSort.toArray());
    }
}
