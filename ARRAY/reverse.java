public class reverse {
    public static void reverse1(int number[]) {
        int first = 0, last = number.length - 1;
        while (first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;

        }
    }

    public static void main(String args[]) {
        int number[] = { 12, 14, 16, 18, 20, 22, 24 };
        reverse1(number);
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + "");
        }
        System.out.println();

    }

}
