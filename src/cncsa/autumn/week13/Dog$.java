package cncsa.autumn.week13;

public class Dog$ {
    private String name;
    private int age;

    public Dog$(String aName, int aAge) {
        name = aName;
        age = aAge;
    }

    public int getPersonYears() {
        return age * 7;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "The dog's name is " + getName() + ", dog age is " + getAge() + ", and person age is " + getPersonYears() + ".";
    }
}
