class Person {
    private String name;
    public String gender;
    public int age;

    Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + getName() + ", Gender: " + gender + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", "Female", 25);
        System.out.println("Accessing name via getter: " + person.getName());
        person.setName("Alice Smith");
        person.display();
    }
}
