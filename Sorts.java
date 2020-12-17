import java.util.Arrays;
public class Sorts
{
  public static void bubbleSort(int[] data)
  {
    //[2,3,4,5,1]
    int temporary = 0;
    System.out.println(Arrays.toString(data)); //DELETE THIS AFTER YOU ARE DONE
    for (int i = data.length; i > 0; i--)
    {
      for (int j = 1; j < i; j++)
      {
        if (data[j] < data[j-1])
        {
          temporary = data[j]; //1
          data[j] = data[j-1]; //[6,6]
          data[j-1] = temporary; //[1,6]
          System.out.println(Arrays.toString(data)); //DELETE THIS AFTER YOU ARE DONE
        }
      }
    }
  }
}