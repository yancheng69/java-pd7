class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init() {
    System.out.println("Enter your age:");
    int age = Input.readInt();
    System.out.println("Your age is: " + age);

    System.out.println("Enter your GPA:");
    double gpa = Input.readDouble();
    System.out.println("Your GPA is: " + gpa);

    System.out.println("Enter your first name:");
    String firstName = Input.readString();
    System.out.println("Your first name is: " + firstName);

    System.out.println("Do you want to continue to play? Enter true or false:");
    boolean continuePlaying = Input.readBoolean();
    System.out.println("Continue playing: " + continuePlaying);
  }
}
