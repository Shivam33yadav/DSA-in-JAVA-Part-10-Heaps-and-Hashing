import java.util.*;
public class GWeakestSoldier {
    static class Row implements Comparable<Row> {
        int soldiers;
        int idx;

        public Row(int solders, int idx) { //constructor
             this.soldiers = soldiers;
             this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if(this.soldiers == r2.soldiers) { //agr soldiers ka count same hota h tb idx k basis pr sort kro
            return this.idx - r2.idx;
            }else {
                return this.soldiers - r2.soldiers; // nhi to soldiers k base pr sort kro
            }
        }
    }
    public static void main(String[] args) {
     int army[][] =  {{1, 0, 0, 0},
                      {1, 1, 1, 1},
                      {1, 0, 0, 0},
                      {1, 0, 0, 0}};

          int k = 2;

          PriorityQueue<Row> pq = new PriorityQueue<>();

          for(int i =0; i<army.length; i++) {
            int count = 0;
            for(int j = 0; j < army[0].length;j++) {
               count += army[i][j] == 1 ? 1 : 0; // cont m ya to 1 ko add ya to 0 (ternary operator)
            }
            pq.add(new Row(count, i));  
          }
           for(int i = 0; i<k; i++) {
            System.out.println("R"+pq.remove().idx);
           }
    }
}
