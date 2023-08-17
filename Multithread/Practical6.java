class Score {
    private String subjectCode;
    private String subjectName;
    private int marks;

    public Score(String subjectCode, String subjectName, int marks) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getMarks() {
        return marks;
    }
}

class Student {
    private String name;
    private int semester;
    private Score[] scores;

    public Student(String name, int semester, Score[] scores) {
        this.name = name;
        this.semester = semester;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public Score[] getScores() {
        return scores;
    }

    public double calculateGPA() {
        int totalMarks = 0;
        int totalSubjects = scores.length;

        for (Score score : scores) {
            totalMarks += score.getMarks();
        }

        return totalMarks / (double) totalSubjects;
    }
}

public class Practical6 {
    public static void main(String[] args) {
        // Create scores for subjects in a semester
        Score[] semester1Scores = {
            new Score("S1", "C", 80),
            new Score("S2", "c++", 75),
            new Score("S3", "DBMS", 90),
            new Score("S4", "COA", 85),
            new Score("S5", "WDD", 92),
            new Score("S6", "OS", 88)
        };

        Score[] semester2Scores = {
            new Score("S1", "Java", 85),
            new Score("S2", "DSA", 92),
            new Score("S3", "DAA", 78),
            new Score("S4", "Networking", 80),
            new Score("S5", "IT", 88)
        };

        // Create students
        Student student1 = new Student("Biswajeet", 1, semester1Scores);
        Student student2 = new Student("Amit", 2, semester2Scores);

        // Process results
        displayResult(student1);
        displayResult(student2);
    }

    public static void displayResult(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Semester: " + student.getSemester());
        System.out.println("Scores:");

        for (Score score : student.getScores()) {
            System.out.println("Subject: " + score.getSubjectName());
            System.out.println("Subject Code: " + score.getSubjectCode());
            System.out.println("Marks: " + score.getMarks());
            System.out.println();
        }

        double gpa = student.calculateGPA();
        System.out.println("SGPA: " + gpa);
        System.out.println("--------------------------");
    }
}