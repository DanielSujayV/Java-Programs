import java.io.*;
import java.util.*;

public class SortAndSave {

    public static void main(String[] args) {
        String[] datasets = { "Data-50000.csv", "Data-625000.csv" };

        for (String dataset : datasets) {
            String datasetSize = dataset.replaceAll("\\D+", ""); // Extract 50000 or 625000

            double[] data = readCSV(dataset);
            if (data == null) {
                System.out.println("Failed to read: " + dataset);
                continue;
            }

            // Merge Sort
            double[] mergeSorted = data.clone();
            mergeSort(mergeSorted, 0, mergeSorted.length - 1);
            saveSortedCSV(mergeSorted, datasetSize, "Merge");

            // Selection Sort (now also enabled for 625000)
            double[] selectionSorted = data.clone();
            System.out.println("Starting Selection Sort on dataset size: " + datasetSize);
            long start = System.currentTimeMillis();
            selectionSort(selectionSorted);
            long end = System.currentTimeMillis();
            System.out.printf("Selection Sort on Data-%s took %.2f seconds%n", datasetSize, (end - start) / 1000.0);
            saveSortedCSV(selectionSorted, datasetSize, "Selection");
        }
    }

    // Read CSV into array
    public static double[] readCSV(String filePath) {
        List<Double> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String value : line.split(",")) {
                    list.add(Double.parseDouble(value.trim()));
                }
            }
            return list.stream().mapToDouble(Double::doubleValue).toArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Save sorted data to CSV
    public static void saveSortedCSV(double[] data, String datasetSize, String algorithm) {
        String fileName = String.format("Team4-Sorted Output-Data-%s-%s.csv", datasetSize, algorithm);
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < data.length; i++) {
                writer.print(data[i]);
                if (i != data.length - 1) writer.print(",");
            }
            System.out.println("Saved: " + fileName);
        } catch (IOException e) {
            System.err.println("Failed to save file: " + fileName);
            e.printStackTrace();
        }
    }

    // Merge Sort
    public static void mergeSort(double[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(double[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1, n2 = right - mid;
        double[] L = new double[n1];
        double[] R = new double[n2];
        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2)
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // Selection Sort
    public static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            double temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
