Merge-Sort
==========

A Java implementation of Merge Sort that uses Generics. Since Java Generics is used, the Object being sorted must implement the Comparable interface.

Here is an example of sorting an integer array:

```java

/* Using Merge sort with a set of Integers */
Integer[] items =
{
    8, 10, 13, 5, 14, 11, 7, 12, 1, 4, 17, 20, 18, 6, 9, 15, 19, 2, 16
};

/* Create a new instance of the mergesort Algorithm and sort the array of integers */
MergeSort<Integer> mergeSort = new MergeSort<>(items);
mergeSort.sort();

/* Printing the array to check whether they are in sorted order */
System.out.println("Printing Sorted Items: ");
for (Integer x : mergeSort.getSortedItems())
{
    System.out.print(x + " ");
}

```

Sorting of more complex objects can also be done. Lets take an example of sorting a set of Persons.

```java

/**
 * Class used to represent a person
 */
private class Person implements Comparable<Person>
{
        private final String name;
        
        public Person(String name)
        {
            this.name = name;
        }
        
        public String getName()
        {
            return this.name;
        }
        
        /**
         * This method is called by the sorting algorithm
         * We compare persons and decide their sorting order based on their name
         */
        @Override
        public int compareTo(Person otherPerson)
        {
            return (this.name.compareTo(otherPerson.getName()));
        }
        
        @Override
        public String toString()
        {
            return "Person -- Name: " + this.name;
        }
}

/* Creating a set of persons */
Person[] persons = new Person[10];
persons[0] = new Person("Joshua");
persons[1] = new Person("James");
persons[2] = new Person("Alexander");
persons[3] = new Person("Morkel");
persons[4] = new Person("Zoey");
persons[5] = new Person("Tamara");
persons[6] = new Person("Lambert");
persons[7] = new Person("Christian");
persons[8] = new Person("Reba");
persons[9] = new Person("Ganesh");

/* Create a new instance of the mergesort Algorithm and sort the array of persons */
MergeSort<Person> sort = new MergeSort<>(persons);
sort.sort();

/* Printing the sorted items */
System.out.println("Printing Sorted Items: ");
for (Person x : sort.getSortedItems())
{
    System.out.println(x);
}

```

The examples are also included in the source files
