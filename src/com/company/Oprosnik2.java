package com.company;

public class Oprosnik2 {
    public static void FindMaximumMassive(){
        int[] massive = new int[]
                {2,120,0,45,-121,92,81,41,10};


        int x = massive.length;
        int maximum = massive[0];



        for (int i = 1; i < x; i++) {
            if(massive[i]>maximum)
                maximum=massive[i];
        }
        System.out.print(maximum);


    }

    public static void main(String[] args) {
        FindMaximumMassive();
    }

}
