import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Creator {
    // Yout directory after C:/user/
    public final String YOUR_DIRECTORY_HERE = "/go/src/algoritimos-e-programacao/src/com/kaua/zaloha/";
    public final String FILE_NAME = "ex";
    public final String FILE_PACKAGE_NAME = "com.kaua.lista04";

    public final String JAVA_INITIAL_STRUCT = "package " + FILE_PACKAGE_NAME + ";" +
            "\n\npublic class " + FILE_NAME + " {\n" +
            "   public static void main(String[] args) {\n" +
            "       //QUESTION" +
            "\n" +
            "   }\n" +
            "}";

    public final String DIR = System.getProperty("user.home") + YOUR_DIRECTORY_HERE;
    public final String NAME = FILE_NAME + ".java";

    public FileWriter writer;
    public ArrayList<String> questions = new ArrayList<String>();

    public void init() {
        try {
            loadQuestions();

            for (int i = 0; i < questions.size(); i++) {
                writer = new FileWriter(DIR + (NAME.replace(".java", (i + 1) + ".java")));
                write(writer, questions.get(i), i + 1);
                writer.close();

                System.out.println("File Created: " + DIR + NAME);
            }

        } catch (Exception e) {
            System.out.println("Err: " + e.getMessage());
        }
    }

    public void write(FileWriter writer, String question, int fileNumber) throws IOException {
        String newString = "//";
        char[] charArr = question.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            newString += charArr[i];
        }
        int max = 50;
        String sysout = "       System.out.println(" + "\"" + question + "\"" + ");";
        charArr = sysout.toCharArray();
        newString += "\n\n";
        for (int i = 0; i < charArr.length; i++) {
            newString += charArr[i];
        }
        newString += "\n\n\n";

        writer.write((JAVA_INITIAL_STRUCT.replace("//QUESTION", newString)).replace(FILE_NAME, FILE_NAME + fileNumber));
    }

    public void loadQuestions() throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("questions.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            char[] charArr = everything.toCharArray();


            //ISSUE HERE
            int nextQuestion = 2;


            String tempString = "";
            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] == '\n') {
                    if (i != charArr.length - 1) {
                        if (String.valueOf(charArr[i + 1]).equalsIgnoreCase(nextQuestion + "") || String
                                .valueOf((charArr[i + 1] + "") + (charArr[i + 2] + "")).equalsIgnoreCase(nextQuestion + "")) {
                            nextQuestion++;
                            questions.add(tempString);
                            tempString = "";
                        } else {
                            tempString += " ";
                        }
                    } else {
                        questions.add(tempString);
                        tempString = "";
                    }
                } else {
                    tempString += charArr[i];
                }
            }

            for (String q : questions) {
                System.out.println("--");
                System.out.println(q);
            }
        }
    }

    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.init();
    }
}
