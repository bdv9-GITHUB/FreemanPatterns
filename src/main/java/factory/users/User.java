package factory.users;

import java.util.*;

public class User {
    private int id;
    private String name;
    private int age;
    private Sex sex;

    private static Map<Integer, User> allUsers;
    private static int countId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return  age == user.age &&
                name.equals(user.name) &&
                sex == user.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex);
    }

    public User(String name, int age, Sex sex) {
        if ( allUsers == null) {
            allUsers = new HashMap<>();
        }

        this.name = name;
        this.age = age;
        this.sex = sex;

        if (!hasUser()) {
            countId++;
            this.id = countId;
            allUsers.put(id, this);
        }
    }

    private boolean hasUser() {
        for (User user : allUsers.values()) {
            if (user.equals(this) && user.hashCode() == this.hashCode()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "id = " + id +
                "name = " + name +
                "age = " + age +
                "sex = " + sex;
    }

    public static List<User> getAllUsers(){
        return new ArrayList<>(allUsers.values());
    }
}
