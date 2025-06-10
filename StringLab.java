public class StringLab {
    public static void main (String[] args) {
        // === Task 1; Working with String Methods ===
        String str = " Welcome to the Java String Lab! ";
        System.out.printls ("Original String: " + str);
        System.out.println(str.length());
        System.out.println(str.charAt(7));
        System.out.println(str.substring(16,20));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("Java"));
        System.out.println(str.contains("Lab"));
        System.out.println(str.replace("Java","Java Programming"));
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
            System.out.println(str.trim());
            System.out.println(str.equals("java string lab!"));
            System.out.println(str.equalsIgnoreCase("java string lab"));
            // === Task 2: Loop Challenges with Strings ===
            // For Loop: Count Vowels
            int vowelCount = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch = 'O' 
                || ch == 'U') {
                    vowelCount++;
                }
            }
            System.out.println("Vowel count : " + vowelCount);
            // While Loop: Check for palindrome
            String palindrome = "racecar";
            int left = 0;
            int right = palindrome.length() - 1;
            noolean isPalindrome = true;
            while (left < right) {
                if (palindrome.charAt(left) != palindrome.charAt(right)) {
                    is Palindrome = false;
                    break;
                }
                left++;
                right--;
            }
            System.out.println("Is palindrome: " + isPalindrome);
            //Do-While Loop: Input Validation
            Scanner scanner = new Scanner(System.in);
            String input;
            do {
                System.out.println("Enter a sentence:");
                input= scanner.nextLine();
            }
            while (!input.contains("java"));
            System.out.println("Thank you!");
            // === Task 3: Working with StringBuilder ===
            StringBuilder sb = new StringBuilder("StringBuilder Lab");
            sb.append(" - Learning Java");
            sb.insert(sb.indexOf("Lab") + 3, " is fun");
            sb.delete(sb.indexOf("Learning"), sb.indexOf("Learning") +8);
            System.out.println(sb.reverse().toString());
            // ===Task 4: working  with StringBuffer ===
            StringBuffer sBuffer = new StringBuffer ("Multithreading Lab");
            sBuffer.append(" - Learning Java");
            sBuffer. insert(sBuffer.indexOf("Lab") + 3, " is fun");
            sBuffer.delete(sBuffer.indexOf("Learning"), sBuffer.indexOf("Learning") + 8);
            System.out.println(sBuffer.reverse().toString());
        }
    }
