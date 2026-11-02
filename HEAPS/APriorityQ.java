
import java.util.Comparator;
import java.util.PriorityQueue;
public class APriorityQ {
    static class Student implements Comparable<Student> { // jab class k andr priority define krni ho tab implement krna hota h ek interface  // overriding
        String name; // ab ye chae name k basis pe ya rank ya roll no pr compare kr skti h
        int rank;

        public Student(String name, int rank) { // constru
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
       // PriorityQueue<Integer> pq = new PriorityQueue<>();// also store boolean
       // if we want reverse order and more value elem ko jada priority mile
       PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  // reverse order and comparator are interfaces in java 
        pq.add(3);  //O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek());  //O(1)
            pq.remove(); // O(logn)  highest priority wala elem by default remove hota hh
        }
    }
}
