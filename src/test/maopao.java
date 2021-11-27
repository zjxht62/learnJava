package test;

public class maopao {
    public static void main(String[] args) {
        int[] ints = new int[]{1,5,8,2,3,9,4};
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - 1 - i; j++) {
                if (ints[j]>ints[j+1]) {
                    int temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;

                }
            }
        }
        System.out.println("排序后的结果");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+" ");

        }
    }
}
