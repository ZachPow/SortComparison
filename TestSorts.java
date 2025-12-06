import java.util.ArrayList;

public class TestSorts {

    public static void main(String args[]) {

        int[] arr = new int[1000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        long time = Sorter.InsertionSort(arr);

        ArrayList<ArrayList<Time>> timeList = new ArrayList<>();
        ArrayList<Time> insertionTimes = new ArrayList<>();
        insertionTimes.add(new Time(time, 1000));
        timeList.add(insertionTimes);

        TimeGraph g = new TimeGraph(timeList);
    }
}
