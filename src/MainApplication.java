import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
    }

    public static void question1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Câu 1:
                    - Viết chương trình nhập vào 2 số nguyên m, n
                    - Xác định và xuất số nguyên lớn nhất
                """);

        // INPUT
        System.out.print("Nhập vào số nguyên m: ");
        int m = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào số nguyên n: ");
        int n = Integer.parseInt(sc.nextLine());

        // PROCESS
        int maxNumber = m > n ? m : n;
        String result = "Số lớn nhất: " + maxNumber;

        // OUTPUT
        System.out.println(result);
    }

    public static void question2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Câu 2:
                    - Cho người dùng nhập vào 3 số nguyên
                    - Viết chương trình xuất 3 số theo thứ tự tăng dần
                """);

        // INPUT
        System.out.print("Nhập vào số nguyên thứ 1: ");
        int first = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào số nguyên thứ 2: ");
        int second = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào số nguyên thứ 3: ");
        int third = Integer.parseInt(sc.nextLine());

        // PROCESS
        int min, midd, max;

        if (first < second) {
            min = first;
            max = second;
        } else {
            min = second;
            max = first;
        }

        if (third <= min) {
            midd = min;
            min = third;
        } else if (max <= third) {
            midd = max;
            max = third;
        } else {
            midd = third;
        }

        String result = "Thứ tự tăng dần: " + min + ", " + midd + ", " + max;

        // OUTPUT
        System.out.println(result);
    }

    public static void question3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Câu 3:
                    - Tương tự câu 2, nhưng cho phép: Hỏi người dùng muốn xuất theo thứ tự nào (1-Tăng dần, 2-Giảm dần)
                    - Viết chương trình xuất 3 số theo thứ tự
                """);

        // INPUT
        System.out.print("Nhập vào số nguyên thứ 1: ");
        int first = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào số nguyên thứ 2: ");
        int second = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vào số nguyên thứ 3: ");
        int third = Integer.parseInt(sc.nextLine());

        int sort;

        System.out.print("Nhập thứ tự sắp xếp: (1-Tăng dần; 2-Giảm dần): ");
        while (true) {
            sort = Integer.parseInt(sc.nextLine());

            if (sort >= 1 && sort <= 2) break;

            System.out.print("Vui lòng nhập lại thứ tự cần sắp xếp (1-Tăng dần; 2-Giảm dần): ");
        }

        // PROCESS
        int num1, num2, num3;

        if (first < second) {
            num1 = first;
            num3 = second;
        } else {
            num1 = second;
            num3 = first;
        }

        if (third <= num1) {
            num2 = num1;
            num1 = third;
        } else if (num3 <= third) {
            num2 = num3;
            num3 = third;
        } else {
            num2 = third;
        }


        String result = "Thứ tự " + (sort == 1 ? "tăng dần: " + num1 + ", " + num2 + ", " + num3 : "giảm dần: " + num3 + ", " + num2 + ", " + num1);

        // OUTPUT
        System.out.println(result);
    }

    public static void question4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Câu 4:
                    - Viết chương trình cho phép nhập vào số nguyên có hai chữ số
                    - Hãy in ra cách đọc của số nguyên này.
                """);

        // INPUT
        int number;

        System.out.print("Nhập vào số nguyên có 2 chữ số: ");

        while (true) {
            number = Integer.parseInt(sc.nextLine());

            if (number >= 10 && number <= 99) break;
            System.out.print("Vui lòng nhập lại số nguyên có 2 chữ số: ");
        }

        // PROCESS
        int tensDigit = number / 10;
        int unitDigit = number % 10;

        String tens;
        String unit;

        switch (tensDigit) {
            case 1:
                tens = "mười";
                break;
            case 2:
                tens = "hai mươi";
                break;
            case 3:
                tens = "ba mươi";
                break;
            case 4:
                tens = "bốn mươi";
                break;
            case 5:
                tens = "năm mươi";
                break;
            case 6:
                tens = "sáu mươi";
                break;
            case 7:
                tens = "bảy mươi";
                break;
            case 8:
                tens = "tám mươi";
                break;
            default:
                tens = "chín mươi";
                break;
        }

        switch (unitDigit) {
            case 1:
                unit = tensDigit == 1 ? "một" : "mốt";
                break;
            case 2:
                unit = "hai";
                break;
            case 3:
                unit = "ba";
                break;
            case 4:
                unit = "bốn";
                break;
            case 5:
                unit = "lăm";
                break;
            case 6:
                unit = "sáu";
                break;
            case 7:
                unit = "bảy";
                break;
            case 8:
                unit = "tám";
                break;
            case 9:
                unit = "chín";
                break;
            default:
                unit = "";
                break;
        }

        String result = "Số " + number + " đọc là: " + tens + " " + unit;

        // OUTPUT
        System.out.println(result.trim());
    }

    public static void question5() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Câu 5:
                    - Hãy viết chương trình “Chào Hỏi" các thành viên của gia đình có đặc điểm sau đây:
                        - Đầu tiên máy sẽ hỏi ai đang sử dụng máy
                        - Sau đó căn cứ vào câu trả lời nhận được mà máy cần đưa ra một câu chào hợp lý, dễ thương
                    - Giả sử, trong gia đình có 4 thành viên là : Bố (B), Mẹ (H), anh trai (A) và em gái (E)
                """);

        // INPUT
        System.out.print("Vui lòng cho biết ai đang sử dụng máy tính (Bố (B), Mẹ (H), Anh trai (A), Em gái (E): ");
        String role;
        while (true) {
            role = sc.nextLine();

            if (role.matches("B|A|E|H")) break;

            System.out.print("Vui lòng nhập lại vai trò (Bố (B), Mẹ (H), Anh trai (A), Em gái (E): ");
        }

        // PROCESS
        String greeting;

        if (role.equals("B")) greeting = "Chào ông! Máy tính đã sẵn sàng";
        else if (role.equals("H")) greeting = "Chào bà! Siêu thị đang có khuyến mãi";
        else if (role.equals("A")) greeting = "Chào cậu chủ! Cửa hàng game đang hạ giá";
        else greeting = "Xin chào cô chủ! Sắp có buổi ca nhạc, cô có muốn xem qua nó không";

        // OUTPUT
        System.out.println(greeting);
    }
}
