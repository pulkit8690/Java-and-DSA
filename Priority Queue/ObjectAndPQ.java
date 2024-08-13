import java.util.*;

public class ObjectAndPQ {
     static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank)
        {
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("XYZ", 3));
        pq.add(new Student("ABC", 1));
        pq.add(new Student("DEF", 2));
        pq.add(new Student("MNO", 4));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }

    }
}
