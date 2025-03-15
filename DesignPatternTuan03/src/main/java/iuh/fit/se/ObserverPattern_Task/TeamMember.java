package iuh.fit.se.ObserverPattern_Task;

public class TeamMember implements TaskObserver {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String newStatus) {
        System.out.println("Thành viên " + name + " được thông báo: Công việc '" + taskName + "' đã thay đổi trạng thái thành '" + newStatus + "'");
    }
}
