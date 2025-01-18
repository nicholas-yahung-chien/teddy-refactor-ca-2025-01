package tw.teddysoft.entities;

public record ProjectName(String name) {

    public static ProjectName of(String string) {
        return new ProjectName(string);
    }
 
    @Override
    public String toString() {
        return name;
    }
}
