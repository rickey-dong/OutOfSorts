public class SortsTester
{
  public static void main(String[] args)
  {
    System.out.println("----One-off Array Sorting-----");
    int[] ourData = {6,1,2,3,4,5};
    Sorts.bubbleSort(ourData);
    System.out.println("-----One-off Array Sorting-----");
    int[] myData = {2,3,4,5,1};
    Sorts.bubbleSort(myData);
    System.out.println("----Size Zero Array Sorting----");
    int[] badData = {};
    Sorts.bubbleSort(badData);
    System.out.println("----Repeated Values Array Sorting----");
    int[] repeatData = {3,3,3,3,6,4};
    Sorts.bubbleSort(repeatData);
    System.out.println("----Sorted Values Array Sorting----");
    int[] alreadySorted = {1,2,3,4,5,6};
    Sorts.bubbleSort(alreadySorted);
    System.out.println("----Reverse Sorted Values Array Sorting----");
    int[] reverseSorted = {6,5,4,3,2,-4};
    Sorts.bubbleSort(reverseSorted);
  }
}