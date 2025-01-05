import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TopicPicker{
    public static void main(String[] args){
        // Three hash maps for three subjects
        HashMap<String, List<String>> subjects = new HashMap<>();


        subjects.put("Computer Science", List.of("Structure and function of the processor", "Types of processor", "Input, output and storage"));

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter subject: ");
            String subjecString = input.nextLine();
            System.out.println("You picked: " + subjecString);

            List<String> subtopics = subjects.get(subjecString);

            Random random = new Random();
            String randomSubtopic = subtopics.get(random.nextInt(subtopics.size()));
            System.out.println("Topic Picked: " + randomSubtopic);
        }

    }
}