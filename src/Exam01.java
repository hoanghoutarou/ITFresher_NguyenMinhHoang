import java.util.Scanner;

public class Exam01 {
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //Khai bao mang so nguyen 100 phan tu
        int[] arr = new int[100];
        int n=0;
        int temp = arr[0];
        Scanner sc = new Scanner(System.in);
        //In menu va yeu cau
        do {
            System.out.println(" ************************MENU**************************");
            System.out.println("1. Nhập giá trị n phần tử của mảng (n nhập từ bàn phím)");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương (>0) trong mảng");
            System.out.println("4. In ra vị trí (chỉ số) các phần tử có giá trị bằng k trong mảng (k nhập từ bàn phím) ");
            System.out.println("5. Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần");
            System.out.println("6. Tính số lượng các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng theo thứ tự tăng \n dần, các phần tử lẻ chia hết cho 3 ở cuối mảng theo thứ tự giảm dần,\n" +
                    "các phần tử còn lại ở giữa mảng theo thứ tự tăng dần");
            System.out.println("8. Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng (sắp xếp giảm dần) đúng vị trí");
            System.out.println("9. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhap so phan tu trong mang:");
                    n = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap gia tri phan tu");
                    for (int i = 0;i<n;i++){
                        System.out.printf("arr[%d]=",i);
                        arr[i]=Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Gia tri cac phan tu trong mang:");
                    for (int i =0;i<n;i++){
                        System.out.printf("%d\t",arr[i]);
                    }
                    System.out.println();
                    break;
                case 3:
                    int sum = 0;
                    System.out.println("Gia tri cac phan tu duong");
                    for (int i =0 ; i<n;i++){
                        if (arr[i]>0){
                            System.out.printf("%d\t",arr[i]);
                            sum += arr[i];
                        }
                    }
                    double tbc = sum/n;
                    System.out.printf("Trung binh cong cac phan tu duong: %f \n",tbc);
                    break;
                case 4:
                    System.out.println("Nhap vao mot so:");
                    int k = Integer.parseInt(sc.nextLine());
                    System.out.printf("Cac vi tri chi so co gia tri = %d \n",k );
                    for (int i =0 ; i<n;i++){
                        if (arr[i]==k){
                            System.out.printf("arr[%d]= %d \n",i,k);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Dãy số truoc khi sắp xếp:");
                    for (int i =0;i<n;i++){
                        System.out.printf("%d\t ",arr[i]);
                    }
                    System.out.println();
                    System.out.println("Day so sau khi sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần:");
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i+1; j < n; j++) {
                            if (arr[j] > arr[i]) {
                                // hoán đổi 2 phần tử
                                temp = arr[j];
                                arr[j] = arr[i];
                                arr[i] = temp;
                            }
                        }
                        System.out.printf("%d\t",arr[i]);
                    }
                    break;
                case 6:
                    int count=0;
                    for (int i = 0; i <n; i++) {
                        boolean isPrime = isPrimeNumber(arr[i]);
                        if (isPrime == true) {
                            count++;
                        }
                    }
                    System.out.printf("Co %d phan tu la so nguyen to trong mang",count);
                    break;
                case 7:

                    break;
                case 8:
                    System.out.println("Nhập giá trị cần chèn: ");
                    int addValue=Integer.parseInt(sc.nextLine());
                    System.out.println(" Nhập vị trí cần chèn: ");
                    int indexValue=Integer.parseInt(sc.nextLine());
                    int [] newArr= new int[n+1];
                    for(int i=0, j=0;i<newArr.length;i++){
                        if(i==indexValue){
                            newArr[i]=addValue;
                        }
                        else {
                            newArr[i]=arr[j];
                            j++;
                        }
                    }
                    System.out.println("Sau khi chèn: ");
                    for (int i =0;i<n;i++){
                        System.out.printf("%d\t",newArr[i]);
                    }
                    System.out.println();
                    System.out.println("Sap xep giam dan:");
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i+1; j < n; j++) {
                            if (arr[j] > arr[i]) {
                                // hoán đổi 2 phần tử
                                temp = arr[j];
                                arr[j] = arr[i];
                                arr[i] = temp;
                            }
                        }
                        System.out.printf("%d\t",arr[i]);
                    }
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Xin moi nhap tu 1 den 9");
                    break;
            }
        }while (true);
    }
}