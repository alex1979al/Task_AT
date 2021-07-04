package com.company;

public class Oprosnik3 {
    public static void minPobochDiag(){
        int[][] massive = new int[][]
                {
                        {45,6,87,53,71},
                        {81,37,34,5,59},
                        {77,8,91,60,47},
                        {74,3,21,97,32},
                        {52,0,47,81,64}
                };
        int minimum = massive[0][massive.length-1];
        for(int i=0; i<massive.length;++i){
            if(massive[i][massive.length-1-i]<minimum)
                minimum=massive[i][massive.length-1-i];
        }
        System.out.println(minimum);
    }

    public static void main(String[] args) {
        minPobochDiag();
    }

}
