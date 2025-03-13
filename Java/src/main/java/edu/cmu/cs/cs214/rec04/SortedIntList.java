package edu.cmu.cs.cs214.rec04;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedIntList extends AbstractIntList {
    private List<Integer> list = new ArrayList<>();
      private int totalAdded = 0; // To count the number of attempted insertions

    @Override
    public boolean add(int num) {
        boolean added = list.add(num);  // Add the number to the list
        Collections.sort(list);         // Keep the list sorted
        if (added) {
              totalAdded++; // Increment the count of successful additions
          }
          return added;
    }

    @Override
    public int get(int index) {
        return list.get(index);
    }

    @Override
    public boolean remove(int num) {
        return list.remove(Integer.valueOf(num));
    }

    @Override
    public boolean removeAll(IntegerList otherList) {
        boolean removed = false;
        for (int i = 0; i < otherList.size(); i++) {
            removed |= this.remove(otherList.get(i));
        }
        return removed;
    }

    @Override
    public int size() {
        return list.size();
    }
    @Override
      public int getTotalAdded() {
          return totalAdded; // Return the count of total additions
      }
}