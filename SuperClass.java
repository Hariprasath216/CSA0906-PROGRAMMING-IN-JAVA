class SuperClass {
    int value;

    // Parameterized constructor
    SuperClass(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("SuperClass value: " + value);
    }
}

class SubClass extends SuperClass {
    int value;

    // Parameterized constructor calling super class constructor
    SubClass(int superClassValue, int subClassValue) {
        super(superClassValue); // Call the parameterized constructor of the superclass
        this.value = subClassValue;
    }

    // Method hiding: hiding the display method in the superclass
    void display() {
        super.display(); // Call the display method of the superclass
        System.out.println("SubClass value: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        // Test cases
        SubClass obj = new SubClass(100, 200);
        obj.display(); // Display values from both SuperClass and SubClass

        // Additional test cases
        SubClass obj2 = new SubClass(10, 20);
        obj2.display();

        SubClass obj3 = new SubClass(-20, -30);
        obj3.display();

        SubClass obj4 = new SubClass(0, 0);
        obj4.display();

        // The following test case will result in a compilation error
        // SubClass obj5 = new SubClass("EIGHT", "FIVE");
        // obj5.display();

        // The following test case will result in a compilation error
        // SubClass obj6 = new SubClass(10.57, 12.58);
        // obj6.display();
    }
}
