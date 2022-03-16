public class Animals {
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }
}

class Main {
    public static void main(String[] args) {
        Animals Tiger = new Animals();
        Animals dogs = new Animals();
        Animals Lion = new Animals();
        Tiger.setName("Tiger : Wild animal");
        dogs.setName("Dog : Domestic animal");
        Lion.setName("Lion : Wild animal");
        System.out.println(Tiger.getName());
        System.out.println(dogs.getName());
        System.out.println(Lion.getName());
    }
}
