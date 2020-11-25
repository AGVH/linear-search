/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

public class LinearSearch {

    private final String myString[];
    private final int n;
    private final String coincidence;
    private String positions = "";

    public LinearSearch(String[] myString, String coincidence) {
        this.myString = myString;
        this.n = this.myString.length;
        this.coincidence = coincidence;
    }

    public void search() {
        for (int i = 0; i < this.n; i++) {
            if (coincidence.equals(this.myString[i])) {
                positions += String.valueOf(i)+" , ";
            }
        }
        if(positions.isBlank()){
            System.out.println(this.coincidence + " not found");
        }
        else{
            System.out.println(this.coincidence + " found at position(s): " + positions);
        }
    }
}
