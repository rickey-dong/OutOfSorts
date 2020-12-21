import java.util.Random;
import java.util.Arrays;
public class SortsTester
{
  public static void main(String[] args)
  {
    /*
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
    System.out.println("----Random Seed Array Sorting----");
    Random rng = new Random(124);
    int[] randomData = new int[5];
    for (int i = 0; i < 5; i++)
    {
      randomData[i] = rng.nextInt() % 1000;
    }
    Sorts.bubbleSort(randomData);
    System.out.println("----Random Array Sorting----");
    Random rngesus = new Random();
    int[] moreRandomData = new int[5];
    for (int i = 0; i < 5; i++)
    {
      moreRandomData[i] = rngesus.nextInt() % 100;
    }
    Sorts.bubbleSort(moreRandomData);
    System.out.println("----Two Pass Only Array Sorting----");
    int[] twoPass = {2,1,3,4,5};
    Sorts.bubbleSort(twoPass);
    */
    /*int[] ourData = {64,25,12,22,11};
    Sorts.selectionSort(ourData);
    int[] myData = {7,4,8,3};
    Sorts.selectionSort(myData);
    int[] hisData = {6,4,1};
    Sorts.selectionSort(hisData);*/
    System.out.println("----One-off Array Sorting-----");
    int[] ourData = {6,1,2,3,4,5};
    int[] ourData2 = Arrays.copyOf(ourData, ourData.length);
    Arrays.sort(ourData2);
    Sorts.selectionSort(ourData);
    System.out.println(Arrays.equals(ourData, ourData2));
    System.out.println("-----One-off Array Sorting-----");
    int[] myData = {2,3,4,5,1};
    int[] myData2 = Arrays.copyOf(myData, myData.length);
    Arrays.sort(myData2);
    Sorts.selectionSort(myData);
    System.out.println(Arrays.equals(myData, myData2));
    System.out.println("----Size Zero Array Sorting----");
    int[] badData = {};
    Sorts.selectionSort(badData);
    System.out.println("----Repeated Values Array Sorting----");
    int[] repeatData = {3,3,3,3,6,4};
    int[] repeatData2 = Arrays.copyOf(repeatData, repeatData.length);
    Arrays.sort(repeatData2);
    Sorts.selectionSort(repeatData);
    System.out.println(Arrays.equals(repeatData, repeatData2));    
    System.out.println("----Sorted Values Array Sorting----");
    int[] alreadySorted = {1,2,3,4,5,6};
    int[] alreadySorted2 = Arrays.copyOf(alreadySorted, alreadySorted.length);
    Arrays.sort(alreadySorted2);
    Sorts.selectionSort(alreadySorted);
    System.out.println(Arrays.equals(alreadySorted, alreadySorted2));
    System.out.println("----Reverse Sorted Values Array Sorting----");
    int[] reverseSorted = {6,5,4,3,2,-4};
    int[] reverseSorted2 = Arrays.copyOf(reverseSorted, reverseSorted.length);
    Arrays.sort(reverseSorted2);
    Sorts.selectionSort(reverseSorted);
    System.out.println(Arrays.equals(reverseSorted, reverseSorted2));
    System.out.println("----Random Seed Array Sorting----");
    Random rng = new Random(124);
    int[] randomData = new int[5];
    for (int i = 0; i < 5; i++)
    {
      randomData[i] = rng.nextInt() % 1000;
    }
    int[] randomData2 = Arrays.copyOf(randomData, randomData.length);
    Arrays.sort(randomData2);
    Sorts.selectionSort(randomData);
    System.out.println(Arrays.equals(randomData, randomData2));
    System.out.println("----Random Array Sorting----");
    Random rngesus = new Random();
    int[] moreRandomData = new int[5];
    for (int i = 0; i < 5; i++)
    {
      moreRandomData[i] = rngesus.nextInt() % 100;
    }
    int[] moreRandomData2 = Arrays.copyOf(moreRandomData, moreRandomData.length);
    Arrays.sort(moreRandomData2);
    Sorts.selectionSort(moreRandomData);
    System.out.println(Arrays.equals(moreRandomData, moreRandomData2));
    System.out.println("----Another One-off Array Sorting----");
    int[] twoPass = {2,1,3,4,5};
    int[] twoPass2 = Arrays.copyOf(twoPass, twoPass.length);
    Arrays.sort(twoPass2);
    Sorts.selectionSort(twoPass);
    System.out.println(Arrays.equals(twoPass, twoPass2));
  }
}