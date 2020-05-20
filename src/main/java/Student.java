import java.util.ArrayList;

public class Student {

    private String name;
    private long id;

    // initializes the grades property as an empty ArrayList.
    private ArrayList<Integer> grades;

    public Student(String name, long id){
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getAverage(){
        double sum = 0;
        for (int grade: this.grades){
            sum += grade;
        }
        return sum / this.grades.size();

    }









}
