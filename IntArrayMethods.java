import java.util.Arrays;

public class IntArrayMethods {
    public static int arraySum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
//   arraySum sums the values of the integers contained in the given array and
//   returns that value.

public static double arrayMean(int[] a) {
    double sum = 0;
    for (int i = 0; i < a.length; i++) {
        sum += a[i];
    }
    return sum / a.length;
}
//   arrayMean calculates the average of the values of the given array and returns
//   that value as a double

public static int arrayMin(int[] a) {
    int min = a[0];
    for (int i = 0; i < a.length; i++) {
        if (a[i] <= min) {
            min = a[i];
        }
    }
    return min;
}
//   arrayMin finds the minimum value that occurs in the array and returns that
//   value.

public static int arrayMax(int[] a) {
    int max = a[0];
    for (int i = 0; i < a.length; i++) {
        if (a[i] >= max) {
            max = a[i];
        }
    }
    return max;
}
//   arrayMax finds the maximum value that occurs in the array and returns that
//   value.

public static boolean[] arrayLocalMin(int[] a) {
    boolean[] values = new boolean[a.length];
    for (int i = 0; i < a.length; i++) {
        if (i == 0) {
            values[i] = false;
        } else if (i == a.length - 1) {
            values[i] = true;
        } else {
            if (a[i] < a[i-1] && a[i] < a[i+1]) {
                values[i] = true;
            } else {
                values[i] = false;
            }
        }
    }
    return values;
}
//   arrayLocalMin determines the locations of any local minimums in the array. A
//   local minimum is defined as a value that is strictly less than either of its
//   neighbors. arrayLocalMin returns an array of booleans where the value at
//   each index is true if the value in the original array is a local minimum and
//   false otherwise.

public static boolean[] arrayLocalMax(int[] a) {
    boolean[] values = new boolean[a.length];
    for (int i = 0; i < a.length; i++) {
        if (i == 0) {
            values[i] = true;
        } else if (i == a.length - 1) {
            values[i] = false;
        } else {
            if (a[i] > a[i-1] && a[i] > a[i+1]) {
                values[i] = true;
            } else {
                values[i] = false;
            }
        }
    }
    return values;
}
//   arrayLocalMax determines the locations of any local maximums in the array. A
//   local maximum is defined as a value that is strictly greater than either of its
//   neighbors. arrayLocalMax returns an array of booleans where the value at
//   each index is true if the value in the original array is a local maximum and
//   false otherwise.

public static int arrayMode(int[] a) {
    Arrays.sort(a);
    int currentLength = 0;
    int largestLength = 0;
    int mode = 0;
    for (int i = 0; i < a.length; i++) {
        if (i == 0 || a[i] != a[i-1]) {
            currentLength = 0;
        }
        currentLength++;
        if (currentLength > largestLength) {
            largestLength = currentLength;
            mode = a[i];
        }
    }
    return mode;
}
//   arrayMode finds the mode of the array. If multiple modes occur, then arrayMode
//   returns the value of the first mode that occurs in the array.

public static int arrayCount(int[] a, int b) {
    int occurences = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] == b) {
            occurences++;
        }
    }
    return occurences;
}
//   arrayCount determines the number of occurences of the parameter b in the array
//   and returns that value.

public static boolean arrayContainsDuplicates(int[] a) {
    Arrays.sort(a);
    boolean duplicates = false;
    for (int i = 0; i < a.length; i++) {
        if (i != 0 && a[i] == a[i-1]) {
            duplicates = true;
        }
    }
    return duplicates;
}
//   arrayCountainsDuplicates determines if any duplicate values exist within the
//   array and returns true if this occurs and false otherwise.

public static boolean arrayAllEqual(int[] a) {
    boolean allEqual = true;
    for (int i = 0; i < a.length; i++) {
        if (i != 0 && a[i] != a[i-1]) {
            allEqual = false;
        }
    }
    return allEqual;
}
//   arrayAllEqual determines if all of the items in the array are the same and
//   returns true if this is the case and false otherwise.

public static double[] arrayRollingAverage(int[] a, int b) {
    double[] rollingAverages = new double[a.length];
    double sum = 0;
    int amount = 0;

    for (int i = 0; i < a.length; i++) {
        sum += a[i];
        amount = b;
        if (i > b - 1) {
            sum -= a[i - b];
        } else {
            amount = i + 1;
        }
        rollingAverages[i] = sum / amount;
    }
    return rollingAverages;
}
//   arrayRollingAverage calculates a rolling average of b values for each index in
//   the array. These values are stored and then returned in an array of doubles.
//   For example, the returned value at index i should contain the average of the
//   value at index i and the additional b-1 values before it. If less than b-1
//   values occur before index i, then an average will be calculated using just the
//   existing values.

public static int[] arrayShift(int[] a, int b) {
    int[] shiftedArray = new int[a.length];

    for (int i = 0; i < a.length; i++) {
        int newIndex = i + b;
        if (newIndex >= a.length) {
            newIndex -= a.length;
        }
        shiftedArray[newIndex] = a[i];
    }
    return shiftedArray;
}
//   arrayShift returns an array of values shifted by b places from the original
//   array. For example, an item at index i will be shifted to index i+b. If i+b is
//   out of bounds of the array, then values should wrap back around to the start
//   of the array.

public static int[] arrayReverse(int[] a) {
    int[] reversedArray = new int[a.length];
    for (int i = 0; i < a.length; i++) {
        reversedArray[i] = a[a.length - 1 - i];
    }
    return reversedArray;
}
//   arrayReverse returns the original array in reverse order.

}
