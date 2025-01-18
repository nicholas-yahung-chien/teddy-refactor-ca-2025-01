package tw.teddysoft.entities;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private final List<Project> projects;

    public ToDoList() {
        this.projects = new ArrayList<>();
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public List<Task> getTasks(ProjectName projectName) {
        return projects.stream()
            .filter(project -> project.getName().equals(projectName))
            .findFirst()
            .orElse(null)
            .getTasks();
    }
}
