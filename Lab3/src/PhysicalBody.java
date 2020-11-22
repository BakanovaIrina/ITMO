public abstract class PhysicalBody {
    private String name;
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void replace(String location) {
        setLocation(location);
        System.out.println(getName() + " переместили в место, где " + location);
    }
}