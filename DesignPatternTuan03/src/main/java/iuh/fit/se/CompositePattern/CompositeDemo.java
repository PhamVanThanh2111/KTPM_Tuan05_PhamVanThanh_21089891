package iuh.fit.se.CompositePattern;

public class CompositeDemo {
    public static void main(String[] args) {
        // Tạo tập tin
        File file1 = new File("document.txt");
        File file2 = new File("image.png");

        // Tạo thư mục chính
        Directory root = new Directory("Root");

        // Tạo thư mục con
        Directory subDir1 = new Directory("Documents");
        Directory subDir2 = new Directory("Images");

        // Thêm tập tin vào thư mục con
        subDir1.addComponent(file1);
        subDir2.addComponent(file2);

        // Thêm thư mục con vào thư mục chính
        root.addComponent(subDir1);
        root.addComponent(subDir2);

        // Hiển thị cấu trúc thư mục
        root.showInfo();
    }
}