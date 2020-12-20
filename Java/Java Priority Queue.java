// Daniel Su 2020 20 Decemeber 
// https://github.com/DanGitSu
// sudaniel9@gmail.com

// Write Up for https://www.hackerrank.com/challenges/java-priority-queue/problem

// References
// https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html
// https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html
// https://www.youtube.com/watch?v=t0Cq6tVNRBA&ab_channel=HackerRank

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.\
 */
class Student{
    private int id;
    private String name;
    private double cgpa;

    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    int getID(){
        return id;
    }

    String getName(){
        return name;
    }

    double getCGPA(){
        return cgpa;
    }

}

class Priorities{
    // Idea is to create a Min Heap like data structure that will keep the 0th element
    // to be the min and any changes will have to bubble from the bottom.
    // https://www.youtube.com/watch?v=t0Cq6tVNRBA&ab_channel=HackerRank explains this well

    private List <Student> q = new ArrayList<>();
    int size = 0;

    List<Student> getStudents(List<String> events){
        for (String e: events){ // events loop
            Scanner in = new Scanner(e);
            String event = in.next();
            System.out.println(event);
            if(event == "ENTER"){  // check if Served or Enter
                String name = in.next();
                double cgpa = in.nextDouble();
                int id = in.nextInt();
                Student s = new Student(id,name,cgpa);
                // 45,"DAVE",4.5
                add(s);
            }else{
                removeMin();
            }
        }
        return q;
    }

    private void removeMin(){
        q.remove(0);
        size--;

    }

    private void swapTwo(int parent, int current){// swap algorithim
        Student temp = q.get(parent);
        q.set(parent, q.get(current));
        q.set(current, temp);
    }

    private void bubbleToTop(){
        int current = size;
        if (size > 1){
            for (int parent=current-1; parent<0; parent--){
                if (compare(parent, current)){ 
                    swapTwo(parent, current);
                }else{
                    break;
                }
                current--;
            }
        }
    }

    private boolean compare(int parent, int current){ // return true when current is higher than parent
        if (q.get(current).getCGPA() > q.get(parent).getCGPA()){
            return true;
        }else if (q.get(current).getName().compareTo(q.get(parent).getName()) > 0){
            return true;
        }else if (q.get(current).getID() < q.get(parent).getID()){
            return true;
        }else{
            return false;
        }
    }

    private void add(Student s){
        q.add(s);
        size++;
        bubbleToTop();
    }

}

 
public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}