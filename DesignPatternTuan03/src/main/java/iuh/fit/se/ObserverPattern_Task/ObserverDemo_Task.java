package iuh.fit.se.ObserverPattern_Task;

public class ObserverDemo_Task {
    public static void main(String[] args) {
        Task task1 = new Task("Thiết kế giao diện", "Chưa bắt đầu");
        TeamMember member1 = new TeamMember("Linh");
        TeamMember member2 = new TeamMember("Minh");

        task1.addObserver(member1);
        task1.addObserver(member2);

        // Cập nhật trạng thái công việc
        task1.setStatus("Đang thực hiện");
        task1.setStatus("Hoàn thành");
    }
}
