package JavaCollectionFramework;

public class Students implements Comparable<Students> {

    public int age;
    public String name;
    public int weight;

    public Students(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        if(this.age==o.age){
            return this.name.compareTo(o.name);
        }
        return this.age - o.age;   // Ascending order by age

    }
}