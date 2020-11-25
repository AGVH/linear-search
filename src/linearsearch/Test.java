/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

/**
 *
 * @author nepolmene
 */
public class Test {

    public static void main(String[] args) {
        String myString[] = {"h", "ee", "l", "l", "w"};
        String coincidence = "h";
        System.out.println("Looking for : " + coincidence);
        LinearSearch mySearch = new LinearSearch(myString, coincidence);
        mySearch.search();
    }
}
