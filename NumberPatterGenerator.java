public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Choose the pattern type: ");
    System.out.println("1 - Right Triangle");
    System.out.println("2 - Inverted Right Triangle");
    System.out.println("3 - Pyramid");
    System.out.println("4 - Inverted Pyramid");
    System.out.print("Your choice: ");
    start(input.nextInt());
}

public static int start(int choice) {
    Scanner input = new Scanner(System.in);
    if (choice == 1) {
        first();
    } else if (choice == 2) {
        second();
    } else if (choice == 3) {
        third();
    }else if (choice == 4) {
        fourth();
    }
    return choice;
}

public static void first() {
    Scanner input = new Scanner(System.in);
    String sym = "*", zero = "*", two = "*";
    String hello, hello1;
    System.out.print("Size: ");
    int size = input.nextInt();
    System.out.println("Pattern: Right Triangle");
    System.out.println(zero);
    for (int i = 1; i < size; i++) {
        hello = sym += zero;
        System.out.println(hello);
    }
}

public static void second() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Size: ");
    int maxSize = scanner.nextInt();
    for (int i = maxSize; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void third() {
    Scanner input = new Scanner(System.in);
    System.out.print("Size: ");
    int height = input.nextInt();
    for (int i = 0; i < height; i++) {
        for (int j = 0; j < height - i - 1; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < (2 * i + 1); k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void fourth() {
    Scanner input = new Scanner(System.in);
    System.out.print("Size: ");
    int rows = input.nextInt();
    for (int i = rows; i >= 1; i--) {
        for (int j = 0; j < rows - i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < i; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
