package iuh.fit.se.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showInfo() {
        System.out.println("Directory: " + name);
        System.out.println("List of components " + name);
        for (FileSystemComponent component : components) {
            component.showInfo();
        }
    }
}
