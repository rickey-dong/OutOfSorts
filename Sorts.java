import java.util.Arrays;
public class Sorts
{
  public static void bubbleSort(int[] data)
  {
    //[2,3,4,5,1]
    int temporary = 0;
    //System.out.println(Arrays.toString(data)); //DELETE THIS AFTER YOU ARE DONE
    for (int i = data.length; i > 0; i--)
    {
      temporary = 0;
      for (int j = 1; j < i; j++)
      {
        if (data[j] < data[j-1])
        {
          temporary = data[j]; //1
          data[j] = data[j-1]; //[6,6]
          data[j-1] = temporary; //[1,6]
          temporary = 1;
          //System.out.println(Arrays.toString(data)); //DELETE THIS AFTER YOU ARE DONE
        }
      }
      if (temporary == 0)
      {
        i = -1;
      }
      //System.out.println(Arrays.toString(data)); //DELETE THIS AFTER YOU ARE DONE
    }
  }
  public static void selectionSort(int[] data)
  {
    int currentSmallest = 0;
    int tempPosition = 0;
    for (int i = 0; i < data.length - 1; i++)
    {
      currentSmallest = data[i];
      tempPosition = 0;
      for (int j = i + 1; j < data.length; j++)
      {
        if (data[j] < currentSmallest)
        {
          currentSmallest = data[j];
          tempPosition = j;
        }
      }
      if (tempPosition != 0)
      {
        data[tempPosition] = data[i];
      }
      data[i] = currentSmallest;
      //System.out.println(Arrays.toString(data)); //DELETE THIS AFTER YOU ARE DONE
    }
  }
  public static void insertionSort(int[] data)
  {
    int insertThis = 0;
    for (int i = 1; i < data.length; i++)
    {
      if (data[i] < data[i-1]) //check to see if there is an unsorted number
      {                        //at the current index on the right side of the array
        insertThis = data[i];
        for (int j = i; j >= 0; j--)
        {
          if (j == 0 || insertThis >= data[j - 1]) //have you reached the far left of the array or
          {                                        //has there been found a suitable place to insert the number?
            data[j] = insertThis;                  //then, insert it!
            j = 0;
          }
          else                                     //otherwise, keep on making space for the to-be inserted number
          {
            data[j] = data[j-1];
            //System.out.println(Arrays.toString(data)); //DELETE THIS AFTER YOU ARE DONE
          }
        }
      }
    }
  }
}