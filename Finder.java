import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Finder {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> all = new ArrayList<>();
        TreeSet<Student> smart = new TreeSet<Student>();
        Student a = new Student("Anna", 56);
        all.add(a);
        Student b = new Student("Beth", 97);
        all.add(b);
        Student c = new Student("Clay", 21);
        all.add(c);
        Student d = new Student("Dave", 78);
        all.add(d);
        Student e = new Student("Elle", 13);
        all.add(e);
        Student f = new Student("Fred", 6);
        all.add(f);
        Scanner sc = new Scanner(System.in);
        System.out.println("Если Вы хотите добавить нового студента, введите 1. \n" +
                "Если Вы хотите посмотреть список студентов, набравших проходной балл, " +
                "введите 2.");
        int user = sc.nextInt();
        if(user == 1){
            System.out.println("Ввведите имя студента:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();
            System.out.println("Ввведите балл студента:");
            int score = sc.nextInt();
            Student x = new Student(name, score);
            all.add(x);
        }else{
            for(Student p: all){
                if(p.score >= 50){
                    smart.add(p);
                }
            }
            for(Student x: smart){
                System.out.println(x);
            }
        }
    }
}

