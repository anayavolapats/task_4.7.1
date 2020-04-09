public class Student implements Comparable<Student> {

    String name;
    public int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name: '" + name + '\'' +
                ", score: " + score +
                '}';
    }

    @Override
    public int compareTo(Student a) {
        if(this.score == a.score) {
            return 0;
        }else if(this.score > a.score){
            return 1;
        }else {
            return -1;
        }
    }
}
