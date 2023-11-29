import java.util.Scanner;

public class Exam02 {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột: ");
        int colum = Integer.parseInt(sc.nextLine());
        //Khai bao mang 2 chieu
        int[][] arr = new int[row][colum];
        //In menu va chuc nang
        do {
            System.out.println(" ************************MENU**************************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng theo ma trận");
            System.out.println("3. Tính số lượng các phần tử chia hết cho 2 và 3 trong mảng");
            System.out.println("4. In các phần tử và tổng các phần tử nằm trên đường biên, đường chéo chính và đường chéo phụ");
            System.out.println("5. Sử dụng thuật toán sắp xếp lựa chọn sắp xếp các phần tử tăng dần theo cột của mảng");
            System.out.println("6. In ra các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sử dụng thuật toán chèn (Insertion sort) sắp xếp các phần tử trên đường chéo chính của mảng giảm dần");
            System.out.println("8. Nhập giá trị một mảng 1 chiều gồm m phần tử và chỉ số dòng muốn chèn vào mảng, thực hiện chèn vào mảng 2 chiều");
            System.out.println("9. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhap gia tri cac phan tu mang:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < colum; j++) {
                            System.out.printf("numbers[%d][%d]", i, j);
                            arr[i][j] =  Integer.parseInt(sc.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng theo ma trận:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < colum; j++) {
                            System.out.printf("%d\t", arr[i][j]);
                        }
                        System.out.printf("\n");
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    int count=0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < colum; j++) {
                            if (arr[i][j] % 2 == 0 && arr[i][j] % 3 == 0){
                                count++;
                            }
                        }
                    }
                    System.out.printf("Co %d phan tu chia het 2 va 3 trong mang",count);
                    break;
                case 4:
                    System.out.println("In giá trị các phần tử trên đường biên:");
                    int s1=0,s2=0;
                    for (int i = 0; i < row; i++) {
                        s1=s1+arr[i][0]+arr[i][colum-1];
                    }
                    for (int j = 1; j < colum; j++) {
                        s2=s2+arr[0][j]+arr[row-1][j];
                    }
                    int sum = s1+s2;
                    System.out.println("Tong phan tu bien:"+sum);

                    int sum1 = 0;
                    System.out.println("In các phần tử và tổng các phần tử trên đường chéo chính:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < colum; j++) {
                            if (i == j) {
                                sum1 += arr[i][j];
                                System.out.printf("%4d \t", arr[i][j]);
                            }

                        }

                    }
                    System.out.printf("Tong duong cheo chinh = %d \n",sum1);

                    int sum2 = 0;
                    System.out.println("In  các phần tử và tổng trên đường chéo phu:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < colum; j++) {
                            if (i + j == row-1) {
                                sum2 += arr[i][j];
                                System.out.printf("%4d \t", arr[i][j]);
                            }
                        }
                    }
                    System.out.printf("Tong duong cheo phu = %d \n",sum2);
                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Cac phan tu la so nguyen to trong mang:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < colum; j++) {
                            boolean isPrime = isPrimeNumber(arr[i][j]);
                            if (isPrime == true) {
                                System.out.printf("%d\t", arr[i][j]);
                            }

                        }

                    }
                    break;
                case 7:
                    System.out.println("Các phần tử trên đường chéo chính:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < colum; j++) {
                            if (i == j) {
                                System.out.printf("%4d \t", arr[i][j]);
                            }
                        }
                    }
                    System.out.println("Sap xep cac phan tu tren duong cheo chinh giam dan:");

                    break;
                case 8:
                    System.out.println("Nhập giá trị cần chèn: ");
                    int addValue=Integer.parseInt(sc.nextLine());
                    System.out.println(" Nhập vị trí cần chèn: ");
                    int indexValue=Integer.parseInt(sc.nextLine());
                    int [][] newArr= new int[row+1][colum+1];

                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Xin moi nhap tu 1 den 9");
                    break;
            }
        } while (true);
    }
}
