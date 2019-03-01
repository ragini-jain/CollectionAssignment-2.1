package com.glo.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListExampleController {

	 
	/**
	 * Task 1:  create a new arraylist, add some colors (string) and print out the collection.
	 * @param args
	 */
	public static void main(String args[]) {
		 System.out.println("**********List Of Colours***********");
		  List<String> colorList = Arrays.asList("Red", "Yellow","Blue","Green","Black","Pink");
		  colorList.forEach(System.out::println);
		  List<String> list = new ArrayList<String>(colorList);
		  list.forEach(System.out::println);
		  iterateElements(list);
		  reverseElements(list);
		  addElement(list);
		  removeElement(list);
		  sortElements(list);
		  extractList(list);
		  replaceElements(list);
		  getElementsByPosition(list);
		  increaseArraySize(list);
		  compareArray(list);
		  copyArrayList(list);
		  getElement(list);
		  	}
    /**
     * Task : 2 iterate through all elements in a array list
     * @param colourList
     */
	public static void  iterateElements(List<String> colourList) {
		System.out.println("\n *********Iterate Elements From List Using Iterator*************");
		Iterator<String> iterator = colourList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	
	/**
	 * Task :3 insert an element into the array list at the first position.
	 * @param colourList
	 */
	public static void addElement(List<String> colourList) {
		  System.out.println("\n*********** Added White At First Position*******");
		  colourList.add(1,"White");
		  colourList.forEach(System.out::println);
	}
	
	/**
	 * Task : 4 retrieve an element (at a specified index) from a given array list.
	 */
	public static void getElement(List<String> colourList) {
		System.out.println("****Elements AT 3 Position******" + colourList.get(3));
	}
	
	/**
	 * Task 6: remove the third element from a arraylist
	 * task 5:update specific array element by given element.
	 * @param colourList
	 */
	public static void removeElement(List<String> colourList) {
		System.out.println("\n*********** Remove Elements From List***********");
		colourList.remove(3);
		colourList.forEach(System.out::println);
	}
     /**
      * Task :7 search an element in a array list.
      * @param colourList
      */
	public static void searchElement(List<String> colourList) {
		System.out.println("\n**************Search Elements******************");
		if(colourList.contains("Red")) {
			System.out.println("Find Elements Red");
		}else {
			System.out.println("Elememts Not fOUND");
		}
		
	}
	
	/**
	 * Task 8 : sort a given array list.
	 * 
	 * @param colourList
	 */
	public static void sortElements(List<String> colourList) {
		System.out.println("\n ***************Sorted List Of Elements*********");
		Collections.sort(colourList);
		colourList.forEach(System.out::println);
	}
	
	/**
	 * Task :9 copy one arraylist into another.
	 * @param colourList
	 */
	public static void copyArrayList(List<String> colourList) {
		  System.out.println("\n*********Copy Elements into New Array***********");
		  List<String> list = new ArrayList<String>(colourList);
		  list.forEach(System.out::println);
	}
	
	/**
	 * Task 10
	 * @param colourList
	 */
	public static void reverseElements(List<String> colourList) {
		  System.out.println("\n************* Reverse Array List*********");
		  Collections.reverse(colourList);
		  colourList.forEach(System.out::println);
	}
	
	/**
	 * Task 11 : extract a portion of a array list.
	 * @param colourList
	 */
	public static void extractList(List<String> colourList) {
		System.out.println("\n New Extract List");
		List<String> extractList = colourList.subList(0, 3);
		  System.out.println("List of first three elements: " + extractList);
	}
	
	/**
	 * Task 12 :compare two array lists.
	 * @param colourList
	 */
	public static void compareArray(List<String> colourList) {
		List<String> list1 = new ArrayList<String>(colourList);
		List<String> list2 = Arrays.asList("Black", "White", "Pink");
		if(list1.equals(list2)) { System.out.println("\n************Array Are Same*************");
		}else {
			System.out.println("\n*********Array Are Different***********");
		}
		
	}
	
	/**
	 * TAsk 13 : increase the size of an array list.
	 * @param colourList
	 */
	public static void increaseArraySize(List<String> colourList) {
		System.out.println("\n***********Increase Size of Array************");
		((ArrayList<String>) colourList).ensureCapacity(15);
		colourList.add("Brown");
		colourList.forEach(System.out::println);
	}
	
	/**
	 * Task :14  replace the second element of a ArrayList with the specified element.
	 * @param colourList
	 */
	public static void replaceElements(List<String> colourList) {
		System.out.println("\n New Array After Replacements");
		colourList.get(3).replace("Ragini", "Red");
		colourList.forEach(System.out::println);
	}
	
	/**
	 * Task 15 : print all the elements of a ArrayList using the position of the elements.
	 * @param colourList
	 */
	public static void getElementsByPosition(List<String> colourList) {
		System.out.println("\n*********Get All elements With Position**********");
	    Map<String, Integer> colourMap = new HashMap<String, Integer>();
	    int size = colourList.size()-1;
	    for(int i=0;i<=size;i++) {
	      colourMap.put(colourList.get(i),i);
	    }
	    System.out.println(colourMap);
	}
}
