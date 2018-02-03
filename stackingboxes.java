// Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.*;

public class stackingboxes
{
    public static void main(String[] args) throws IOException
    {
        //Enter data using BufferReader
        BufferedReader reader =
                   new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        int stackSize = 3; //number of stacks required
        int[] stacks = {9,1,2,7,4,3,4,7,1,3,5,2}; //array of numbers
        int[] truckStacks = new int[stackSize]; //array for each stack spot
        int sumTruck = IntStream.of(stacks).sum(); //sum of array of numbers
        boolean flag = true;
        boolean flag2 = false;
        int first = truckStacks[0];
        int containers = sumTruck/stackSize; //size of each stack
        System.out.print(containers);
        int index = 0;
        int stackNum = 0;
        while (IntStream.of(truckStacks).sum() != sumTruck) {
          if(truckStacks[stackNum] != containers) {
            if(stacks[index]+truckStacks[stackNum] <= containers) {
              truckStacks[stackNum] += stacks[index];
              index++;
            }
            else {
              stackNum++;
            }
          }
        }
        System.out.print(truckStacks[0]);
        System.out.print(truckStacks[1]);
        System.out.print(truckStacks[2]);



    }
}
