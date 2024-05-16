
//Vẫn có một ngoại lệ tiềm ẩn mà chúng ta có thể xử lý bằng cách sử dụng khối try-catch. 
//Ngoại lệ đó là NullPointerException khi intNumber là null và được sử dụng trong Integer.toHexString(intNumber).

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer intNumber = null;

        try {
            System.out.println("Hãy nhập vào một số nguyên: ");
            String strNumber = input.nextLine();
            intNumber = Integer.valueOf(strNumber);
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập vào một số nguyên hợp lệ.");
        }

        try {
            System.out.println("Chuyển thành Hexa: " + Integer.toHexString(intNumber));
        } catch (NullPointerException e) {
            System.out.println("Không thể chuyển đổi thành Hexa do giá trị không hợp lệ.");
        }
    }
}
