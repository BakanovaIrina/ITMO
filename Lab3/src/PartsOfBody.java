public enum PartsOfBody {
    Head("голова"),
    UpperBody("верхняя часть тела"),
    LowerBody("нижняя часть тела"),
    Feet("ноги");

    private final String name;

    PartsOfBody(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}