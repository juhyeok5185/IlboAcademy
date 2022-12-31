package ex17;

public class Ex04Uswer {
    private String name;
    private String license;

    public Ex04Uswer() {
    }

    public Ex04Uswer(String name, String license) {
        this.name = name;
        this.license = license;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return this.license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", license='" + getLicense() + "'" +
                "}";
    }

}
