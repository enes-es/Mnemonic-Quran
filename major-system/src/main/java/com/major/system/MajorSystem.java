package com.major.system;
import java.util.ArrayList;

final class MajorSystem {

    ArrayList<Number> numbers;
    public static void main(String[] args) {
        
        //menu
        /*
         * 1. Practice random number?
         * 2. Practice ascending starting from?
         * 3. Practice descending starting from?
         */

    }


    public void doPractice() {

    }

    private void initializeNumbers() {
        numbers = null;

        //IMPROVEMENT:
        //make 0 to 99 empty Number instances to put in numbers.
        //load logs values from the file into numbers.
    }

    private void printMenu() {
        System.out.println("1. Practice random nubmer?");
        System.out.println("2. Practice ascending from?");
        System.out.println("3. Practice descending from?");
    }

    private void practiceRandom() {
        //practice until user gives input quit.
    }


    private void practiceAscendingFrom(Integer start) {
        //practice until user gives input quit.
    }

    private void practiceDescendingFrom(Integer start) {

    }

    private void saveLogs() {

    }


}