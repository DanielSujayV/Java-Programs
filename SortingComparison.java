import java.io.*;
import java.util.*;

public class SortingComparison {

    // Counter class
    static class Counter {
        int count = 0;
    }

    // Merge Sort
    public static void mergeSort(int[] arr, Counter counter) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left, counter);
        mergeSort(right, counter);

        merge(arr, left, right, counter);
    }

    private static void merge(int[] arr, int[] left, int[] right, Counter counter) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            counter.count++;
            if (left[i] <= right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // Selection Sort
    public static void selectionSort(int[] arr, Counter counter) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                counter.count++;
                if (arr[j] < arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    // Load CSV
    public static int[] loadCSV(String filename) throws IOException {
        List<Integer> data = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            data.add(Integer.parseInt(line.trim()));
        }
        reader.close();
        return data.stream().mapToInt(i -> i).toArray();
    }

    // Save CSV
    public static void saveCSV(int[] arr, String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (int val : arr) writer.write(val + "\n");
        writer.close();
    }

    // Reverse array
    public static int[] reverse(int[] arr) {
        int[] rev = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < rev.length / 2; i++) {
            int tmp = rev[i];
            rev[i] = rev[rev.length - 1 - i];
            rev[rev.length - 1 - i] = tmp;
        }
        return rev;
    }

    // Run and report
    public static void runAndReport(String label, int[] data, boolean useMergeSort) throws IOException {
        int[] arr = Arrays.copyOf(data, data.length);
        Counter counter = new Counter();
        long start = System.nanoTime();
        if (useMergeSort) mergeSort(arr, counter);
        else selectionSort(arr, counter);
        long end = System.nanoTime();

        double timeMs = (end - start) / 1e6;
        String algo = useMergeSort ? "MergeSort" : "SelectionSort";
        System.out.printf("%-50s | Time (ms): %10.4f | Comparisons: %d%n", label + " - " + algo, timeMs, counter.count);

        String csvName = "Team 4-Sorted Output-" + label + "-" + algo + ".csv";
        saveCSV(arr, csvName);
    }

    public static void main(String[] args) throws IOException {
        int[] data50000 = loadCSV("Data-50000.csv");
        int[] data625000 = loadCSV("Data-625000.csv");

        // Prepare input variations
        Map<String, int[]> inputs = new LinkedHashMap<>();

        // Dataset 1
        inputs.put("Data-50000-Random", Arrays.copyOf(data50000, data50000.length));
        int[] sorted50000 = Arrays.copyOf(data50000, data50000.length); Arrays.sort(sorted50000);
        inputs.put("Data-50000-Sorted", sorted50000);
        inputs.put("Data-50000-Reverse", reverse(sorted50000));

        // Dataset 2
        inputs.put("Data-625000-Random", Arrays.copyOf(data625000, data625000.length));
        int[] sorted625000 = Arrays.copyOf(data625000, data625000.length); Arrays.sort(sorted625000);
        inputs.put("Data-625000-Sorted", sorted625000);
        inputs.put("Data-625000-Reverse", reverse(sorted625000));

        // Run both algorithms
        for (String key : inputs.keySet()) {
            runAndReport(key, inputs.get(key), true);  // Merge Sort
        }
        for (String key : inputs.keySet()) {
            runAndReport(key, inputs.get(key), false); // Selection Sort
        }
    }
}
