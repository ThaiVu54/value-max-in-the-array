import java.util.Scanner;

public class ValueMax {
    public static void main(String[] args) {
        //* khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        if (size > 20) {
            System.out.println("size should not exceed 20");
        } while (size > 20) ;

        //* nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("enter element" + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }

        //*in ra danh sách tài sản đã nhập
        System.out.print("property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        //* duyệt các phần tử trong mảng để tìm GTLN và vị trí
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("the largest property value in the list is " + max + " , at position" + index);
    }
}
