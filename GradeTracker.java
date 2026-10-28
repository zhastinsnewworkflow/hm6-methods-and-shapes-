public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your score: ");
    System.out.println(StudentGrader(input.nextInt()));
}

public static String StudentGrader(int grade) {
    if (grade >= 90 && grade <= 100) {
        return "A";
    } else if (grade >= 80 && grade <= 90) {
        return "B";
    } else if (grade >= 70 && grade <= 80) {
        return "C";
    } else if (grade >= 60 && grade <= 70) {
        return "D";
    }
    else if (grade > 101) {
        return "Invalid value";
    }
    return "F";
}