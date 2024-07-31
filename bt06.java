package org.example;
import java.util.*;
import java.util.stream.Collectors;

public class bt06 {
    public static void main(String[] args) {
        List<String> arrays = Arrays.asList("Phương thức collect() làm một trong những phương thức xử lý tiêu biểu của interface Stream. Khi phương thức này được gọi thì việc filter hay mapping ở hai ví dụ trên mới thực sự được thực hiện.");
        System.out.println("Nội dung mảng:\n" + arrays);
        String chuanHoa = String.valueOf(arrays.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()));
        System.out.println("Chuỗi sau khi được chuẩn Hóa:\n" + chuanHoa);
    }
}



// items.stream().map(item -> item.toUpperCase());