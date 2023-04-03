package part5.task22;

public class ArraySum {
    public static void main(String[] args) {
        int[] num = {123, 123, 234, 345, 456, 435, 234, 123, 456, 57};
        int min = num[0];
        int minIndex = 0;
        int max = num[0];
        int maxIndex = 0;
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                maxIndex = i;
            }
            if (num[i] < min) {
                min = num[i];
                minIndex = i;
            }
        }
        int maxIndexLowest = maxIndex;
        int maxIndexHighest = maxIndex;
        for (int i = maxIndex; i < num.length; i++) {
            if (num[i] == max) {
                maxIndexHighest = i;
            }
        }
        int minIndexLowest = minIndex;
        int minIndexHighest = minIndex;
        for (int i = minIndex; i < num.length; i++) {
            if (num[i] == min) {
                minIndexHighest = i;
            }
        }

        if ((minIndexLowest < maxIndexLowest) && (minIndexHighest < maxIndexHighest)) {
            for (int i = minIndexLowest + 1; i < maxIndexHighest; i++) {
                sum += num[i];
            }
        }
        if ((maxIndexLowest < minIndexLowest) && (maxIndexHighest < minIndexHighest)) {
            for (int i = maxIndexLowest + 1; i < minIndexHighest; i++) {
                sum += num[i];
            }
        }
        if ((minIndexLowest < maxIndexLowest) && (maxIndexHighest < minIndexHighest)) {
            if ((maxIndexHighest - minIndexLowest) >= (minIndexHighest - maxIndexLowest)) {
                for (int i = minIndexLowest + 1; i < maxIndexHighest; i++) {
                    sum += num[i];
                }
            } else {
                for (int i = maxIndexLowest + 1; i < minIndexHighest; i++) {
                    sum += num[i];
                }
            }
        }
        if ((maxIndexLowest < minIndexLowest) && (minIndexHighest < maxIndexHighest)) {
            if ((maxIndexHighest - minIndexLowest) >= (maxIndexLowest - minIndexHighest)) {
                for (int i = minIndexLowest + 1; i < maxIndexHighest; i++) {
                    sum += num[i];
                }
            } else {
                for (int i = maxIndexLowest + 1; i < minIndexHighest; i++) {
                    sum += num[i];
                }
            }
        }
        System.out.println(sum);
    }
}
