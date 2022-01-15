public class Person {
    private String name;


    public Person(String initialName)
    {
        this.name = initialName;

    }

    public Person()
    {

    }

    public void setName( String fullName) {
        this.name = fullName;

    }

    public String getName() {
        return this.name;
        //return null;
    }

    public String toString() {
        String result = this.name;
        return result;

    }

}
