package map.test.member;

public class Member {
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
