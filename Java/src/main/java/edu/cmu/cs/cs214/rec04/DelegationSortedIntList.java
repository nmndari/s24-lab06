package edu.cmu.cs.cs214.rec04;

public class DelegationSortedIntList implements IntegerList {

    private final SortedIntList internalList; // A private SortedIntList object to delegate functionality
    private int totalAdded; // To count the number of attempted insertions

    // Constructor
    public DelegationSortedIntList() {
        internalList = new SortedIntList(); // Initialize the internal SortedIntList
        totalAdded = 0; // Initialize the count of insertions
    }

    // Adds a single element to the list
    @Override
    public boolean add(int num) {
        totalAdded++;  // Increment the count of insertions
        return internalList.add(num);  // Delegate the add operation to the internal list
    }

    // Adds all elements from another list to this list
    @Override
    public boolean addAll(IntegerList list) {
        boolean success = false;
        for (int i = 0; i < list.size(); i++) {
            success |= this.add(list.get(i));  // Delegate each element's insertion to add
        }
        return success;
    }

    // Retrieves an element at the specified index
    @Override
    public int get(int index) {
        return internalList.get(index);  // Delegate the get operation to the internal list
    }

    // Removes a specified element from the list
    @Override
    public boolean remove(int num) {
        return internalList.remove(num);  // Delegate the remove operation to the internal list
    }

    // Removes all elements from the provided list
    @Override
    public boolean removeAll(IntegerList list) {
        return internalList.removeAll(list);  // Delegate the removeAll operation to the internal list
    }

    // Returns the number of elements in the list
    @Override
    public int size() {
        return internalList.size();  // Delegate the size operation to the internal list
    }

    // Returns the number of attempted insertions (not the current size)
    @Override
    public int getTotalAdded() {
        return totalAdded;  // Return the count of insertions
    }
}