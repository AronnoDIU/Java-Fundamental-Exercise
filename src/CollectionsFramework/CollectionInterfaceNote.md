# **Collections in JAVA**
The Collection in Java is a framework that provides an architecture to store and manipulate the group of
objects. Java Collections can achieve all the operations that you perform on data such as searching,
sorting, insertion, manipulation, and deletion. Java Collection means a single unit of objects.
Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes
(ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

### **What is Collection in Java?**
A Collection represents a single unit of objects, i.e., a group.

### What is a framework in Java?
* It provides ready-made architecture.
* It represents a set of classes and interfaces.
* It is optional.

### What is a Collection framework?
The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:
1. Interfaces and its implementations, i.e., classes
2. Algorithms

[comment]: <> (This is a comment, it will not be included)
[comment]: <> (in the output file unless you use it in)
[comment]: <> (a reference style link.)

[comment]: <> (Hierarchy of Collection Framework)
![](C:\Users\aronn\IdeaProjects\zzzLinksFolder\hierarchy-of-collection-framework-in-java.webp)

## A. List Interface
A List is an ordered Collection (sometimes called a sequence). Lists may contain duplicate elements.
In addition to the operations inherited from Collection, the List interface includes operations for the following:

   1. Positional access — manipulates elements based on their numerical position in the list.
This includes methods such as get, set, add, addAll, and remove.
   2. Search — searches for a specified object in the list and returns its numerical position.Search 
methods include indexOf and lastIndexOf.
   3. Iteration — extends Iterator semantics to take advantage of the list's sequential nature.
The listIterator methods provide this behavior.
   4. Range-view — The sublist method performs arbitrary range operations on the list.

### List Algorithms 
Most polymorphic algorithms in the Collections class apply specifically to List. 
Having all these algorithms at your disposal makes it very easy to manipulate lists. Here's a
summary of these algorithms, which are described in more detail in the Algorithms section.

| Methods            | Descriptions                                                                                                                                          |
|--------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| Sort               | sorts a List using a merge sort algorithm, <br/>which provides a fast, stable sort. <br/>(A stable sort is one that does not reorder equal elements.) |
| shuffle            | randomly permutes the elements in a List.                                                                                                             |
| reverse            | reverses the order of the elements in a List.                                                                                                         |
| Rotate             | rotates all the elements in a List by a specified distance.                                                                                           |
| swap               | swaps the elements at specified positions in a List.                                                                                                  |
| replaceAll         | replaces all occurrences of one specified value with another.                                                                                         |
| fill               | overwrites every element in a List with the specified value.                                                                                          |
| Copy               | copies the source List into the destination List.                                                                                                     |
| binarySearch       | searches for an element in an ordered List using the binary search algorithm.                                                                         |
| indexOfSubList     | returns the index of the first sublist of one List that is equal to another.                                                                          |
| lastIndexOfSubList | returns the index of the last sublist of one List that is equal to another.                                                                           |



### A1. ArrayList class
It Is most likely Arrays, but variable size DataStructure. Which is usually the better-performing implementation

### A2. LinkedList class
Collects or adds a different type of object. Which offers better performance under certain circumstances.

### A3. Vector class
It is most likely the ArrayList class, but it offers Thread Safety

### A3a. Stack class
Are commonly used with FIFO or LIFO methods

## B. Queue Interface:
Used with FIFO methods, A Queue is a collection for holding elements prior to processing. Besides basic Collection operations,
queues provide additional insertion, removal, and inspection operations.

Queues typically, but not necessarily, order elements in a FIFO (first-in-first-out) manner.
Among the exceptions are priority queues, which order elements according to their values (Object Ordering).
Whatever ordering is used, the head of the queue is the element that would be removed by a call to remove
or poll. In a FIFO queue, all new elements are inserted at the tail of the queue. Other kinds of queues
may use different placement rules. Every Queue implementation must specify its ordering properties.

### Queue Interface Structure:

| Type of Operation | Throws exception | Returns special value |
|-------------------|------------------|-----------------------|
| Insert            | add(e)           | offer(e)              |
| Remove            | remove()         | poll()                |
| Examine           | element()        | peek()                |


### Object Ordering:

#### Classes Implementing Comparable

| Class        | Natural Ordering                            |
|--------------|---------------------------------------------|
| Byte         | Signed numerical                            |
| Character    | Unsigned numerical                          |
| Long         | Signed numerical                            |
| Integer      | Signed numerical                            |
| Short        | Signed numerical                            |
| Double       | Signed numerical                            |
| Float        | Signed numerical                            |
| BigInteger   | Signed numerical                            |
| BigDecimal   | Signed numerical                            |
| Boolean      | Boolean.FALSE < Boolean.TRUE                |
| File         | System-dependent lexicographic on path name |
| String       | Lexicographic                               |
| Date         | Chronological                               |
| CollationKey | Locale-specific lexicographic               |


### B1. PriorityQueue class
A PriorityQueue is used when the objects are supposed to be processed based
on the priority. It is known that a Queue follows the First-In-First-Out algorithm, but sometimes the
elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue
comes into play. The PriorityQueue is based on the priority heap.

### B2. Deque Interface
Usually pronounced as deck, a deque is a double-ended-queue. A double-ended-queue
is a linear collection of elements that supports the insertion and removal of elements at both end points.
The Deque interface is a richer abstract data type than both Stack and Queue because it implements both
stacks and queues at the same time. The Deque interface defines methods to access the elements at
both ends of the Deque instance. Methods are provided to insert, remove, and examine the elements.
Predefined classes like ArrayDeque and LinkedList implement the Deque interface.

Note that the Deque interface can be used both as last-in-first-out stacks and first-in-first-out queues.
The methods given in the Deque interface are divided into three parts:

### B2a. LinkedList class
the array implementation cannot be used for the large-scale applications where the
queues are implemented. One of the alternatives of array implementation is linked list implementation of queue.

### B2b. ArrayDeque class
Resizable-array implementation of the Deque interface. Array deque have no
Capacity restrictions; they grow as necessary to support usage. They are not thread-safe; in the absence
of external synchronization, they do not support concurrent access by multiple threads. Null elements are
prohibited. This class is likely to be faster than Stack when used as a stack, and faster than LinkedList
when used as a queue.

### Insert
**The addfirst and offerFirst methods insert elements at the beginning of the Deque instance.
The methods addLast and offerLast insert elements at the end of the Deque instance. When the capacity
of the Deque instance is restricted, the preferred methods are offerFirst and offerLast because
addFirst might fail to throw an exception if it is full.**

### Remove
**The removeFirst and pollFirst methods remove elements from the beginning of the Deque instance.
The removeLast and pollLast methods remove elements from the end. The methods pollFirst and pollLast
return null if the Deque is empty, whereas the methods removeFirst and removeLast throw an exception
if the Deque instance is empty.**

### Retrieve
**The methods getFirst and peekFirst retrieve the first element of the Deque instance.
These methods don't remove the value from the Deque instance. Similarly, the methods getLast
and peekLast retrieve the last element. The methods getFirst and getLast throw an exception
if the deque instance is empty, whereas the methods peekFirst and peekLast return NULL.**

The 12 methods for insertion, removal and retrieval of Deque elements are summarized in the following table:

### Deque Methods

### Summary of Deque methods
|         | First Element (Head) |               | Last Element (Tail) |               |
|---------|----------------------|---------------|---------------------|---------------|
|         | Throws exception     | Special value | Throws exception    | Special value |
| Insert  | addFirst(e)          | offerFirst(e) | addLast(e)          | offerLast(e)  |
| Remove  | removeFirst()        | pollFirst()   | removeLast()        | pollLast()    |
| Examine | getFirst()           | peekFirst()   | getLast()           | peekLast()    |

### Comparison of Queue and Deque methods
| Queue Method | Equivalent Deque Method |
|--------------|-------------------------|
| add(e)       | addLast(e)              |
| offer(e)     | offerLast(e)            |
| remove()     | removeFirst()           |
| poll()       | pollFirst()             |
| element()    | getFirst()              |
| peek()       | peekFirst()             |

### Comparison of Stack and Deque methods

| Stack Method | Equivalent Deque Method |
|--------------|-------------------------|
| push(e)      | addFirst(e)             |
| pop()        | removeFirst()           |
| peek()       | peekFirst()             |



## C. Set Interface
A Set is a Collection that cannot contain duplicate elements. It models the mathematical
set abstraction. The Set interface contains only methods inherited from Collection and adds the restriction
that duplicate elements are prohibited. Set also adds a stronger contract on the behavior of the equals
and hashCode operations, allowing Set instances to be compared meaningfully even if their implementation
types differ. Two Set instances are equal if they contain the same elements.

### Set Interface Bulk Operations
Bulk operations are particularly well suited to Sets; when applied, they
perform standard set-algebraic operations. Suppose s1 and s2 are sets. Here's what bulk operations do:

  * s1.containsAll(s2) — returns true if s2 is a subset of s1. (s2 is a subset of s1 if set s1 contains all the elements in s2.)
  * s1.addAll(s2) — transforms s1 into the union of s1 and s2. (The union of two sets is the set containing all the elements contained in either set.)
  * s1.retainAll(s2) — transforms s1 into the intersection of s1 and s2. (The intersection of two sets is the set containing only the elements common to both sets.)
  * s1.removeAll(s2) — transforms s1 into the (asymmetric) set difference of s1 and s2.(For example, the set difference of s1 minus s2 is the set containing all the elements found in s1 but not in s2.)

**The Java platform contains three general-purpose Set implementations:**

### C1. HashSet class
Which stores its elements in a hash table, is the best-performing implementation. However, it makes no guarantees concerning the order of iteration. TreeSet,

### C2. LinkedHashSet class
Which is implemented as a hash table with a linked list running through it,
orders its elements based on the order in which they were inserted into the set (insertion-order).
LinkedHashSet spares its clients from the unspecified, generally chaotic ordering provided by
HashSet at a cost that is only slightly higher.

## C3. The SortedSet Interface
A SortedSet is a Set that maintains its elements in ascending order,
sorted according to the elements' natural ordering or according to a Comparator provided at SortedSet
creation time. In addition to the normal Set operations,
the SortedSet interface provides operations for the following:

  * Range view — allows arbitrary range operations on the sorted set
  * Endpoints — returns the first or last element in the sorted set
  * Comparator access — returns the Comparator, if any, used to sort the set

**Set Operations**
The operations that SortedSet inherits from Set behave identically on sorted sets and normal sets with two exceptions:

  * The Iterator returned by the iterator operation traverses the sorted set in order.
  * The array returned by toArray contains the sorted set's elements in order.

Although the interface doesn't guarantee it, the toString method of the Java platform's SortedSet
implementations returns a string containing all the elements of the sorted set, in order.

### C3a. TreeSet class
Which stores its elements in a red-black tree, orders its elements based on their values; it is substantially slower than HashSet.

## D. The Map Interface
A Map is an object that maps keys to values. A map cannot contain duplicate keys:
Each key can map to at most one value. It models the mathematical function abstraction. The Map interface
includes methods for basic operations (such as put, get, remove, containsKey, containsValue, size, and empty),
bulk operations (such as putAll and clear), and collection views (such as keySet, entrySet, and values).

**The Java platform contains three general-purpose Map implementations:**

### D1. HashTable class
### D2. LinkedHashMap class
### D3. HashMap class

**And another one is,**
### D4a. TreeMap --> implements SortedMap --> implements Map

Their behavior and performance are precisely analogous to HashSet, TreeSet, and LinkedHashSet.

#### Collection Views: The Collection view methods allow a Map to be viewed as a Collection in these three ways:

  * keySet — the Set of keys contained in the Map.
  * values — The Collection of values contained in the Map. This Collection is not a Set, because multiple keys can map to the same value.
  * entrySet — the Set of key-value pairs contained in the Map. The Map interface provides a small nested interface called Map.Entry, the type of the elements in this Set.

## SortedMap Interface
A SortedMap is a Map that maintains its entries in ascending order, sorted
according to the keys' natural ordering, or according to a Comparator provided at the time of the
SortedMap creation. Natural ordering and Comparators are discussed in the Object Ordering section.
The SortedMap interface provides operations for normal Map operations and for the following:

* Range view — performs arbitrary range operations on the sorted map
* Endpoints — returns the first or the last key in the sorted map
* Comparator access — returns the Comparator, if any, used to sort the map


### Hashtable class
Implements a hash table, which maps keys to values. Any non-null object can be used
as a key or as a value. To successfully store and retrieve objects from a hashtable, the objects used as
keys must implement the hashCode method and the equals method. The java.util.Hashtable class is a class
in Java that provides a key-value data structure, similar to the Map interface.

However, the Hashtable class has since been considered obsolete and its use is generally discouraged.
This is because it was designed prior to the introduction of the Collections framework and does not
implement the Map interface, which makes it difficult to use in conjunction with other parts of the
framework. In addition, the Hashtable class is synchronized, which can result in slower performance
compared to other implementations of the Map interface.

In general, it’s recommended to use the Map interface or one of its implementations (such as HashMap
or ConcurrentHashMap) instead of the Hashtable class.

**Features of Hashtable:**
* It is similar to HashMap, but is synchronized.
* Hashtable stores key/value pair in hash table.
* In Hashtable, we specify an object that is used as a key, and the value we want to
* associate with that key. The key is then hashed, and the resulting hash code is used
* as the index at which the value is stored within the table.
* The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
* HashMap doesn’t provide any Enumeration, while Hashtable provides no fail-fast Enumeration.


## Methods of Collection interface

There are many methods declared in the Collection interface. They are as follows:

| Method                     | Description                                                                                                                                                          |
|----------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| add(Object)                | This method is used to add an object to the collection.                                                                                                              |
| addAll(Collection c)       | This method adds all the elements in the given collection to this collection.                                                                                        |
| clear()                    | This method removes all of the elements from this collection.                                                                                                        |
| contains(Object o)         | This method returns true if the collection contains the specified element.                                                                                           |
| containsAll(Collection c)  | This method returns true if the collection contains all the elements in the given collection.                                                                        |
| equals(Object o)           | This method compares the specified object with this collection for equality.                                                                                         |
| hashCode()                 | This method is used to return the hash code value for this collection.                                                                                               |
| isEmpty()                  | This method returns true if this collection contains no elements.                                                                                                    |
| iterator()                 | This method returns an iterator over the elements in this collection.                                                                                                |
| max()                      | This method is used to return the maximum value present in the collection.                                                                                           |
| parallelStream()           | This method returns a parallel Stream with this collection as its source.                                                                                            |
| remove(Object o)           | This method is used to remove the given object from the collection. <br/>If there are duplicate values, then this method removes the first occurrence of the object. |
| removeAll(Collection c)    | This method is used to remove all the objects mentioned in the given collection from the collection.                                                                 |
| removeIf(Predicate filter) | This method is used to remove all the elements of this collection that satisfy the given predicate.                                                                  |
| retainAll(Collection c)    | This method is used to retain only the elements in this collection that are contained in the specified collection.                                                   |
| size()                     | This method is used to return the number of elements in the collection.                                                                                              |
| spliterator()              | This method is used to create a Spliterator over the elements in this collection.                                                                                    |
| stream()                   | This method is used to return a sequential Stream with this collection as its source.                                                                                |
| toArray()                  | This method is used to return an array containing all of the elements in this collection.                                                                            |

**// OR,**

| No. | Method                                               | Description                                                                                                     |
|-----|------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|
| 1   | public boolean add(E e)                              | It is used to insert an element in this collection.                                                             |
| 2   | public boolean addAll(Collection<? extends E> c)     | It is used to insert the specified collection elements in the invoking collection.                              |
| 3   | public boolean remove(Object element)                | It is used to delete an element from the collection.                                                            |
| 4   | public boolean removeAll(Collection<?> c)            | It is used to delete all the elements of the specified collection from the invoking collection.                 |
| 5   | default boolean removeIf(Predicate<?super E> filter) | It is used to delete all the elements of the collection that satisfy the specified predicate.                   |
| 6   | public boolean retainAll(Collection<?> c)            | It is used to delete all the elements of invoking collection except the specified collection.                   |
| 7   | public int size()                                    | It returns the total number of elements in the collection.                                                      |
| 8   | public void clear()                                  | It removes the total number of elements from the collection.                                                    |
| 9   | public boolean contains(Object element)              | It is used to search an element.                                                                                |
| 10  | public boolean containsAll(Collection<?> c)          | It is used to search the specified collection in the collection.                                                |
| 11  | public Iterator iterator()                           | It returns an iterator.                                                                                         |
| 12  | public Object[] toArray()                            | It converts collection into array.                                                                              |
| 13  | public <T> T[] toArray(T[] a)                        | It converts collection into array. Here, the runtime type of the returned array is that of the specified array. |
| 14  | public boolean isEmpty()                             | It checks if collection is empty.                                                                               |
| 15  | default Stream<E> parallelStream()                   | It returns a possibly parallel Stream with the collection as its source.                                        |
| 16  | default Stream<E> stream()                           | It returns a sequential Stream with the collection as its source.                                               |
| 17  | default Spliterator<E> spliterator()                 | It generates a Spliterator over the specified elements in the collection.                                       |
| 18  | public boolean equals(Object element)                | It matches two collections.                                                                                     |
| 19  | public int hashCode()                                | It returns the hash code number of the collection.                                                              |


## Iterator interface
Iterator interface provides the facility of iterating the elements in a forward direction only.

**Methods of Iterator interface**
There are only three methods in the Iterator interface. They are:

| No. | Method                   | Description                                                                   |
|-----|--------------------------|-------------------------------------------------------------------------------|
| 1   | public boolean hasNext() | It returns true if the iterator has more elements otherwise it returns false. |
| 2   | public Object next()     | It returns the element and moves the cursor pointer to the next element.      |
| 3   | public void remove()     | It removes the last elements returned by the iterator. It is less used.       |
