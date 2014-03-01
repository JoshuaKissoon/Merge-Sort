package mergesort;

/**
 * Testing the MergeSort algorithm implementation by sorting objects
 *
 * @author Joshua Kissoon
 * @since 20140301
 */
public class MergeSortClassTest
{

    private final Person[] persons;

    public MergeSortClassTest()
    {
        /* Creating a set of persons */
        persons = new Person[10];
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
    }

    public Person[] getPersons()
    {
        return this.persons;
    }

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

    public static void main(String[] args)
    {
        MergeSortClassTest test = new MergeSortClassTest();

        /* Create a new instance of the mergesort Algorithm and sort the array of persons */
        MergeSort<Person> sort = new MergeSort<>(test.getPersons());
        sort.sort();

        /* Printing the sorted items */
        System.out.println("Printing Sorted Items: ");
        for (Person x : sort.getSortedItems())
        {
            System.out.println(x);
        }
    }
}
