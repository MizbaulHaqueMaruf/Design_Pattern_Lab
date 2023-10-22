public class TreeBuilder {
    private String type;

    public TreeBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public Tree build() {
        return new Tree(type);
    }
}
