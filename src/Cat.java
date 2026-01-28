public class Cat {
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void speak(){
        System.out.println(name + " says 'Meow'");
    }

    public void printInfo(){
        System.out.println("Your cat's name is " + name + ", and it is " + age + " years old, and its color is " + color + ".");
    }
}

