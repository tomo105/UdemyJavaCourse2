package exc20_Collections3_Set_HashSet;

public class Dog {
    private final String name;

    public String getName() {
        return name;
    }

    public Dog(String name) {
        this.name = name;
    }

    //make final to make sure you can not
    // overwritten it in subclasses
    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Dog) {
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        }
        return false;
    }
}
