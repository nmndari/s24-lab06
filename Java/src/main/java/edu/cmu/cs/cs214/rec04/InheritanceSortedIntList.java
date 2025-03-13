package edu.cmu.cs.cs214.rec04;

public class InheritanceSortedIntList extends SortedIntList {
    private int totalAdded = 0; // Нэмэгдсэн элементүүдийн тоо

        // Overriding add() to ensure correct tracking of total additions
        @Override
        public boolean add(int num) {
            boolean added = super.add(num);  // Call the parent class's add method
            if (added) {
                totalAdded++;  // Increment only when an element is actually added
            }
            return added;
        }

        // Overriding addAll() to track additions correctly
        @Override
        public boolean addAll(IntegerList list) {
            boolean result = false;
            for (int i = 0; i < list.size(); i++) {
                result |= this.add(list.get(i));  // Calls the overridden add() method
            }
            return result;
        }

    // Нэмэгдсэн нийт элементийн тоог буцаах
    public int getTotalAdded() {
        return totalAdded;
    }
}