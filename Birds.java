/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * You have been asked to help study the population of birds migrating across the continent. Each type of bird you are interested in will be identified by an integer value. Each time a particular kind of bird is spotted, its id number will be added to your array of sightings. You would like to be able to find out which type of bird is most common given a list of sightings. Your task is to print the type number of that bird and if two or more types of birds are equally common, choose the type with the smallest ID number.

For example, assume your bird sightings are of types arr=[1,1,2,2,3] . There are two each of types 1 and 2, and one sighting of type 3.
* Pick the lower of the two types seen twice: type 1.

Function Description

Complete the migratoryBirds function in the editor below. It should return the lowest type number of the most frequently sighted bird.

migratoryBirds has the following parameter(s):

arr: an array of integers representing types of birds sighted
 */
import java.util.*;

public class Birds {

    public static void main(String[] args) {
        int c = 0;
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        //2 3 4 5 43 2 1 3 4
        List<Integer> type = new ArrayList<Integer>();
        List<Integer> freq = new ArrayList<Integer>();
        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
        System.out.println();
        while(arr.size()>=1) {
            c = 1;
            int i=0;
            for (int j = 1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    c++;
                    type.add(arr.get(i));
                    arr.remove(j);
                    j--;
                    //freq.add(c);
                }
                
            }
            
            //System.out.println("After removing "+arr.get(i));
            arr.remove(i);
            /*for (int i1 : arr) {
                        System.out.print(i1 + " ");
                    }
            System.out.println();
            System.out.println(c);*/
            freq.add(c);
            
        }
        System.out.println("-----------------------------------");
       for (int i : type) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : freq) {
            System.out.print(i + " ");
        }
        int max = freq.get(0);
        int ty = type.get(0);
        for (int i = 1; i < freq.size(); i++) {
            if (max < freq.get(i)) {
                max = freq.get(i);
                ty = type.get(i);
            } else if (max == freq.get(i)) {
                if (type.get(i) < ty) {
                    ty = type.get(i);
                }
            } else {
            }
        }
        System.out.println();
        System.out.println(ty);
    }
}
