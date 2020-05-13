package testHtml;

/**
 * @author dyh
 * @date 2020/4/28
 */
public class Person {
    private String name;
    private Double percemt;

    public Person(String name, Double percemt) {
        this.name = name;
        this.percemt = percemt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPercemt() {
        return percemt;
    }

    public void setPercemt(Double percemt) {
        this.percemt = percemt;
    }
}
