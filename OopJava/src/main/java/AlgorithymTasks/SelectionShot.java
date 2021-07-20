package AlgorithymTasks;

import java.util.Arrays;

public class SelectionShot {

    public void sort(int[] array){

        for (var i = 1; i < array.length; i ++){

            var current = array[i];
            var j = i-1;
            while (j >= 0 && array [j]>current){
                array[j+1]=array[j];
                j--;
            }
            array [j+1]= current;
        }

    }

    public static void main(String[] args) {
        int[] numbers = {64,25,12,22,11};
        var sorter = new SelectionShot();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}
