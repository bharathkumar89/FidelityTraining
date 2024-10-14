class Person {

    public String gender;
    public int age;
    private String name;

    public static void main(String[] args) {
        Person obj= new Person();
        obj.age=23;
        obj.gender="male";
        obj.setName("Bharath Kumar");
        System.out.println(obj.age);
        System.out.println(obj.gender);
        System.out.println(obj.getName());


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}