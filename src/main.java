import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int min = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i=0;i<array.length;i++){
            System.out.println("Enter element["+i+"]: ");
            array[i] = scanner.nextInt();
        }

        for (int i=1;i<array.length;i++){
            if (array[i] < array[min])
                min = i;
        }

        System.out.println("Min value in array is: "+ array[min]);
    }
}
