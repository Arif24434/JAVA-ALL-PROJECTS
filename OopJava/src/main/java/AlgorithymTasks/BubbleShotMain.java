package AlgorithymTasks;

import AlgorithymTasks.BubbleShot;

import java.util.Arrays;
public class BubbleShotMain {

    public static void main(String[] args) {

        int [] numbers = {5,1,4,2,8,9 };

        var sorter = new BubbleShot();
        sorter.shot(numbers);
        System.out.println(Arrays.toString(numbers));

    }

}
