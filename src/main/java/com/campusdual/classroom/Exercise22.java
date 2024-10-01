package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("GKFFD");
        myList.add("TNANA");
        myList.add("MPMSL");
        myList.add("PSWME");
        myList.add("LZMLF");
        myList.add("JYEBV");
        myList.add("YELNT");
        myList.add("JSNKR");
        myList.add("JFESF");
        myList.add("TMJLL");
        return myList;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            String element = customList.get(i);
            System.out.println(element + " " + i);
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> myList = createArrayList();
        printElementsAndIndex(myList);
        addElementToList(myList, "AAAAA");
        printElementsAndIndex(myList);
    }


}
