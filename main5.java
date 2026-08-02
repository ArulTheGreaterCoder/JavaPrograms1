import java.util.*;

class Student{
    private String name;
    private int id;
    private ArrayList courses;
    public Student(String name, int id){
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }
    public void addCourse(Course course){
        courses.add(course);
    }
    public void removeCourse(Course course){
        courses.remove(course);
    }
    public ArrayList getCourses(){
        return courses;
    }
    public double getGPA(){
        if (courses.isEmpty()) return 0.0; 
        double total = 0;
        int count = 0;
        for(Course course: courses){
            total+=course.getGrade();
        }return total/count;
    }
    public String getTranscript(){
        StringBuilder transacript = new StringBuilder();
        transcript.append("Name: ").append(name).append("\n");
        transcript.append("ID: ").append(id).append("\n");
    for (Course course : courses){
        transcript.append("Course: ")
        .append(course.getName())
        .append("(").append(course.getCredits()).append(" credits)\n")
        .append("Grade")
        .append(course.getGrade())
        .append("(").append(course.getLetterGrade()).append(")\n\n");
    }
    return transcript.tostring();
}
}
class Course{
    private String name;
    private int credits;
    private double grade;
    public Course(String name, int credits){
        this.name = name;
        this.credits = credits;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
    public double getGrade(){
        return grade;
    }
    public int getCredits(){
        return credits;
    }
    public String getName(){
        return name;
    }
    public String getLetterGrade(){
        if (grade >= 4.0) return "A";
        else if (grade >= 3.7) return "A-";
        else if (grade >= 3.3) return "B+";
        else if (grade >= 3.0) return "B";
        else if (grade >= 2.7) return "B-";
        else return "C";
    }
}
public class main5{
    public static void main(String[] args){
        Course course1 = new Course("Computer SCience",4);
        course1.setGrade(3.7);
        Student student1 = new Student("Alice",1234);
        student1.addCourse(course1);
        System.out.println("Alice's Initial Grade: "+student1.getGrade());
        Course math = new Course("Math", 3);
        student1.addCourse(math);
        math.setGrade(4.0);
        System.out.println("Alice's Updated GPA: "+ student1.getGPA());
        Course csBob = new Course("Computer Science",4);
        csBob.setGrade(3.0);
        Course mathBob = new Course("Math",3);
        mathBob.setGrade(3.5);
        Student student2 = new Student("Bob",5678);
        System.out.println("\nBob's GPA: "+student2.getGPA());
        System.out.println("Bob's Transcript:\n" + student2.getTranscript());        
    }
}