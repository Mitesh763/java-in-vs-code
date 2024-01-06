
import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;
    private String id;

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", ID: " + id;
    }
}

public class clg_24_class {
    private static final String FILE_PATH = "students.dat";

    public static void main(String[] args) {
        // Write student information to a file
        writeStudentInfo();

        // Read student information from the file
        readStudentInfo();
    }

    private static void writeStudentInfo() {
        try (FileOutputStream fileOut = new FileOutputStream(FILE_PATH);
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            Student student1 = new Student("John Doe", 20, "12345");
            Student student2 = new Student("Jane Smith", 22, "67890");

            objectOut.writeObject(student1);
            objectOut.writeObject(student2);

            System.out.println("Student information written to the file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readStudentInfo() {
        try (FileInputStream fileIn = new FileInputStream(FILE_PATH);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            System.out.println("Reading student information from the file:");
            Student student;
            while ((student = (Student) objectIn.readObject()) != null) {
                System.out.println(student);
            }

        } catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
