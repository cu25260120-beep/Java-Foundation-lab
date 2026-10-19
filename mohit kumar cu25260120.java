
Lab Sheet-01 | BCA III Semester

 Q1. Write a Java program to display your name, age, and college name using appropriate data types.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        String name = "Mohit";
        int age = 19;
        String college = "COER University";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }
}
```

**Output:**

```text
Name: Mohit
Age: 19
College: COER University
```

 Q2. Input two integers and display the results of addition, subtraction, multiplication, division, and modulus.

**Program:**

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + (a / b));
            System.out.println("Modulus: " + (a % b));
        }
    }
}
```

**Output:**

```text
Input: 10 3
Addition: 13
Subtraction: 7
Multiplication: 30
Division: 3
Modulus: 1
```

 Q3. Write a Java program to check whether a number is even or odd using the modulus operator and if-else.

**Program:**

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}
```

**Output:**

```text
Input: 7
Odd number
```

 Q4. Demonstrate relational operators by comparing two numbers.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
    }
}
```

**Output:**

```text
true
false
false
true
```

 Q5. Accept a floating-point number and explicitly convert it into an integer. Display both values.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        double num = 12.75;
        int value = (int) num;

        System.out.println("Original: " + num);
        System.out.println("Converted: " + value);
    }
}
```

**Output:**

```text
Original: 12.75
Converted: 12
```

 Q6. Accept a character and print its ASCII value.

**Program:**

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        System.out.println("ASCII value: " + (int) ch);
    }
}
```

**Output:**

```text
Input: A
ASCII value: 65
```

 Q7. Check whether a number is divisible by both 3 and 5 using logical operators.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int n = 15;

        if (n % 3 == 0 && n % 5 == 0)
            System.out.println("Divisible by both 3 and 5");
        else
            System.out.println("Not divisible by both");
    }
}
```

**Output:**

```text
Divisible by both 3 and 5
```

### Q8. Check whether an input character is a vowel or consonant using if-else.

**Program:**

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if ("aeiou".indexOf(ch) != -1)
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
```

**Output:**

```text
Input: e
Vowel
```

### Q9. Input marks in three subjects, calculate total and percentage, and display pass or fail. Passing requires at least 40% in every subject.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int a = 70, b = 65, c = 80;
        int total = a + b + c;
        double percentage = total / 3.0;

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);

        if (a >= 40 && b >= 40 && c >= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
```

**Output:**

```text
Total: 215
Percentage: 71.66666666666667
Pass
```

### Q10. Write a Java program to find the greatest of two numbers using if-else.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int a = 20, b = 15;

        if (a > b)
            System.out.println("Greatest: " + a);
        else if (b > a)
            System.out.println("Greatest: " + b);
        else
            System.out.println("Both are equal");
    }
}
```

**Output:**

```text
Greatest: 20
```

### Q11. Input three numbers and print the largest using nested if-else.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        if (a >= b) {
            if (a >= c)
                System.out.println(a);
            else
                System.out.println(c);
        } else {
            if (b >= c)
                System.out.println(b);
            else
                System.out.println(c);
        }
    }
}
```

**Output:**

```text
25
```

### Q12. Accept a year and check whether it is a leap year.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int year = 2024;

        if (year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}
```

**Output:**

```text
Leap year
```

### Q13. Check whether a number is positive, negative, or zero.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int n = -5;

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}
```

**Output:**

```text
Negative
```

### Q14. Accept a character and identify whether it is a digit, uppercase letter, lowercase letter, or special character.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        char ch = 'A';

        if (Character.isDigit(ch))
            System.out.println("Digit");
        else if (Character.isUpperCase(ch))
            System.out.println("Uppercase letter");
        else if (Character.isLowerCase(ch))
            System.out.println("Lowercase letter");
        else
            System.out.println("Special character");
    }
}
```

**Output:**

```text
Uppercase letter
```

### Q15. Check whether a three-digit number is an Armstrong number.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int n = 153, temp = n, sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if (sum == n)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
```

**Output:**

```text
Armstrong number
```

### Q16. Calculate income tax according to the given income slabs.

* Income up to ₹2,50,000: No tax
* ₹2,50,001 to ₹5,00,000: 5%
* ₹5,00,001 to ₹10,00,000: 20%
* Above ₹10,00,000: 30%

**Program:**

```java
class Main {
    public static void main(String[] args) {
        double salary = 400000, tax;

        if (salary <= 250000)
            tax = 0;
        else if (salary <= 500000)
            tax = salary * 0.05;
        else if (salary <= 1000000)
            tax = salary * 0.20;
        else
            tax = salary * 0.30;

        System.out.println("Tax: " + tax);
    }
}
```

**Output:**

```text
Tax: 20000.0
```

*Note: This program applies the assignment's stated percentage to the entire salary.*

### Q17. Accept an integer and check whether it is a palindrome using arithmetic operations and type casting.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int n = 121, temp = n, rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (n == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
```

**Output:**

```text
Palindrome
```

### Q18. Accept a number and check whether it is prime or not using if-else.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int n = 7;
        boolean prime = n >= 2;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }
}
```

**Output:**

```text
Prime number
```

### Q19. Accept a character operator and perform the corresponding operation on two numbers.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int a = 10, b = 5;
        char op = '+';

        if (op == '+')
            System.out.println(a + b);
        else if (op == '-')
            System.out.println(a - b);
        else if (op == '*')
            System.out.println(a * b);
        else if (op == '/' && b != 0)
            System.out.println(a / b);
        else
            System.out.println("Invalid operator or division");
    }
}
```

**Output:**

```text
15
```

### Q20. Accept age and gender and determine marriage eligibility using nested if-else. Male minimum age is 21 and female minimum age is 18.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int age = 22;
        char gender = 'M';

        if (gender == 'M' || gender == 'm') {
            if (age >= 21)
                System.out.println("Eligible");
            else
                System.out.println("Not eligible");
        } else if (gender == 'F' || gender == 'f') {
            if (age >= 18)
                System.out.println("Eligible");
            else
                System.out.println("Not eligible");
        } else {
            System.out.println("Invalid gender");
        }
    }
}
```

**Output:**

```text
Eligible
```

### Q21. Accept three angles and check whether they form a valid triangle.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int a = 60, b = 60, c = 60;

        if (a > 0 && b > 0 && c > 0 &&
            a + b + c == 180)
            System.out.println("Valid triangle");
        else
            System.out.println("Invalid triangle");
    }
}
```

**Output:**

```text
Valid triangle
```

### Q22. Input the length and breadth of a rectangle and check whether it is a square.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int length = 10, breadth = 10;

        if (length == breadth)
            System.out.println("It is a square");
        else
            System.out.println("It is a rectangle");
    }
}
```

**Output:**

```text
It is a square
```

### Q23. Convert temperature from Celsius to Fahrenheit using type casting and expressions.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = (double) (celsius * 9 / 5) + 32;

        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
```

**Output:**

```text
Fahrenheit: 77.0
```

### Q24. Check whether a number is perfect. A perfect number equals the sum of its proper divisors.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int n = 6, sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }

        if (n > 0 && sum == n)
            System.out.println("Perfect number");
        else
            System.out.println("Not a perfect number");
    }
}
```

**Output:**

```text
Perfect number
```

 Q25. Accept two integers and a logical operator as a character. Perform the logical operation and display the result.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int a = 10, b = 5;
        char op = '&';

        if (op == '&')
            System.out.println(a != 0 && b != 0);
        else if (op == '|')
            System.out.println(a != 0 || b != 0);
        else
            System.out.println("Invalid operator");
    }
}
```

**Output:**

```text
true
```

*Here, `&` represents logical AND and `|` represents logical OR. Nonzero integers are treated as true.*

### Q26. Input a five-digit number and check whether its first and last digits are the same.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int n = 12341;

        if (n >= 10000 && n <= 99999 &&
            n / 10000 == n % 10)
            System.out.println("Digits are the same");
        else
            System.out.println("Digits are different");
    }
}
```

**Output:**

```text
Digits are the same
```

 Q27. Input the cost price and selling price of an item. Determine the profit or loss.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int cp = 500, sp = 600;

        if (sp > cp)
            System.out.println("Profit: " + (sp - cp));
        else if (cp > sp)
            System.out.println("Loss: " + (cp - sp));
        else
            System.out.println("No profit, no loss");
    }
}
```

**Output:**

```text
Profit: 100
```

 Q28. Accept a number and display the number of digits using expressions and if-else.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int n = 12345;
        int temp = Math.abs(n);
        int count = 0;

        if (temp == 0)
            count = 1;
        else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
```

**Output:**

```text
Number of digits: 5
```

 Q29. Input a person's height in centimetres and classify them as short, average, or tall.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        int height = 165;

        if (height < 150)
            System.out.println("Short");
        else if (height <= 170)
            System.out.println("Average");
        else
            System.out.println("Tall");
    }
}
```

**Output:**

```text
Average
```

 Q30. Write a Java program to simulate a simple calculator using if-else.

**Program:**

```java
class Main {
    public static void main(String[] args) {
        double a = 20, b = 10;
        char op = '*';

        if (op == '+')
            System.out.println(a + b);
        else if (op == '-')
            System.out.println(a - b);
        else if (op == '*')
            System.out.println(a * b);
        else if (op == '/' && b != 0)
            System.out.println(a / b);
        else
            System.out.println("Invalid operator or division");
    }
}
```

**Output:**

```text
200.0
```

