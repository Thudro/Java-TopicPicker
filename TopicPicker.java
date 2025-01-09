import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TopicPicker{
    public static void main(String[] args){
        // Three hash maps for three subjects
        HashMap<String, List<String>> subjects = new HashMap<>();

        subjects.put("Computer Science", List.of(
            "The characteristics of contemporary processors, input, output and storage devices",
            "Software and software development",
            "Exchanging data",
            "Data types, data structures and algorithms",
            "Legal, moral, cultural and ethical issues",
            "Elements of computational thinking",
            "Problem solving and programming",
            "Algorithms",
            "Analysis of the problem",
            "Design of the solution",
            "Developing the solution",
            "Evaluation"
        ));

        // Electronics Subtopics
        subjects.put("Electronics", List.of(
            "Basic electrical circuits",
            "Resistance and resistivity",
            "Capacitors",
            "Inductors",
            "AC theory",
            "Semiconductors",
            "Diodes",
            "Transistors",
            "Operational amplifiers",
            "Logic gates and combinational logic systems",
            "Boolean algebra",
            "Sequential logic systems",
            "Microcontrollers",
            "Communication systems",
            "Power supplies",
            "Amplifiers",
            "Oscillators",
            "Digital systems",
            "Control systems",
            "System design",
            "System construction",
            "System testing and evaluation"
        ));

        // Engineering Subtopics
        subjects.put("Engineering", List.of(
            "Mathematics for engineering",
            "Science for engineering",
            "Principles of mechanical engineering",
            "Principles of electrical and electronic engineering",
            "Health and safety in engineering",
            "Mechanical operations",
            "Electrical operations",
            "Engineering design",
            "Computer-aided design (CAD)",
            "Manufacturing processes",
            "Materials science",
            "Business for engineering",
            "Lean and quality",
            "Project management"
        ));


        try (Scanner input = new Scanner(System.in)) {
            System.out.println("List Of Subjects: ");
            System.out.println("----------------------------|");
            List<String> subjectNames = new ArrayList<>(subjects.keySet());

            for (int i = 0; i < subjectNames.size(); i++) {
                System.out.println((i + 1) + ". " + subjectNames.get(i));
        }
            System.out.println("----------------------------|");
            System.out.println("Enter Subject Number: ");
            int subjectChoice = input.nextInt() - 1;
            String subjecString = subjectNames.get(subjectChoice);
            System.out.println("You picked: " + subjecString);

            List<String> subtopics = subjects.get(subjecString);

            Random random = new Random();
            String randomSubtopic = subtopics.get(random.nextInt(subtopics.size()));
            System.out.println("Topic Picked: " + randomSubtopic);
        }

    }
}