/**
 * 705. Design HashSet
 * Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

void add(key) Inserts the value key into the HashSet.
bool contains(key) Returns whether the value key exists in the HashSet or not.
void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
 
 */
class MyHashSet {

    /** Initialize your data structure here. */
    HashSet<Integer> hashset = null;
    public MyHashSet() {
        hashset = new HashSet<>();
    }
    
    public void add(int key) {
        hashset.add(key);
    }
    
    public void remove(int key) {
        hashset.remove(key);
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return hashset.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */