import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        System.out.println("nhap so luong");
        int size = scanner.nextInt();
        if (size > 20) {
            System.out.println("vuot qua so luong toi da");
        } else {
            arr = new int[size];
            int i = 0;
            while (i < arr.length) {
                System.out.println("Vi tri thu " + (i + 1));
                arr[i] = scanner.nextInt();
                i++;
            }
            int max = arr[0];
            int index = 0;
            for (int j = 0; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    index = j + 1;
                }
            }
            System.out.println("so lon nhat la:" + max + " o vi tri " + index);
        }
    }
}
