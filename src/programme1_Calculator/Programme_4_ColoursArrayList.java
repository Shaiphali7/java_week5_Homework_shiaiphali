package programme1_Calculator;

import java.util.AbstractList;
import java.util.ArrayList;

/*
Write a Java program to create a new array list, add some colours (string)
and printout the collection using for each loop.
 */
public class Programme_4_ColoursArrayList
{
    public static void main(String[] args) {
        AbstractList<String> colorList=new ArrayList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Green");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Orange");
        colorList.add("Purple");
        colorList.add("Cyan");
        for(String colourList:colorList)
        {
            System.out.println(colourList+",");
        }


    }
}
