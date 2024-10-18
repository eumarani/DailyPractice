public class AtoI {

        public static int conversion(String input) {
            String s = input.trim(); // Trim whitespace from the start and end
            if (s.isEmpty()) {
                return -1; // Return -1 for empty input
            }

            StringBuilder sb = new StringBuilder();
            boolean isNegative = false;
            boolean numberStarted = false;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                // Handle sign
                if (c == '-') {
                    if (numberStarted) {
                        break; // Invalid if a number has already started
                    }
                    isNegative = true;
                    continue;
                }
                if (c == '+') {
                    if (numberStarted) {
                        break; // Invalid if a number has already started
                    }
                    isNegative = false;
                    continue;
                }

                // Handle digits
                if (c >= '0' && c <= '9') {
                    sb.append(c);
                    numberStarted = true;
                } else {
                    // If we have started a number and hit a non-digit, return -1
                    if (numberStarted) {
                        return -1;
                    }
                    // If we haven't started a number, ignore leading invalid characters
                }
            }

            // If no digits were found, return -1
            if (sb.length() == 0) {
                return -1;
            }

            // Convert to integer
            int result = Integer.parseInt(sb.toString());
            return isNegative ? -result : result;
        }

        public static void main(String[] args) {
            String str1 = "123";      // Should return 123
            String str2 = "-123";     // Should return -123
            String str3 = "1a23";     // Should return -1 (Invalid entry)

            System.out.println(conversion(str1)); // Output: 123
            System.out.println(conversion(str2)); // Output: -123
            System.out.println(conversion(str3)); // Output: -1
        }
    }


