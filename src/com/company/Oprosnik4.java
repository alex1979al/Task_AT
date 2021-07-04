package com.company;

public class Oprosnik4 {
    public static void MirroringMassive(){
        int[] massive = new int[]
                {23,1,0,45,14,92,38,2,64};


        int x = massive.length;
        int temp;

        for (int i = 0; i < x/2; i++) {
            temp = massive[x - i - 1];
            massive[x - i - 1] = massive[i];
            massive[i] = temp;
        }
        //Выводим отзеркаленный массив в консоль
        System.out.print("Отзеркаленный массив"+ " - ");
        for (int i=0; i<massive.length; i++){
            System.out.print(massive[i]+" ");
        }

    }

    public static void main(String[] args) {
        MirroringMassive();
    }
}
