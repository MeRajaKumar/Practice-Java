// 1. simple way
class ReverseJava{
    public static void main(String[] args) {
        String str = "Hello World";
        String reversedStr = "";

        for(int i = str.length() - 1; i >= 0; i--){
            reversedStr += str.charAt(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}
// output:
// Original String: Hello World 
// Reversed String: dlroW olleH

// 2. reverse but at the word level
class ReverseJava{
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        String reversedStr = "";

        for(int i = words.length - 1; i >= 0; i--){
            reversedStr += words[i] + " ";
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr.trim());
    }
}
// output:
// Original String: Hello World 
// Reversed String: World Hello


// 3. reverse but at the same index but in reversed order
class ReverseJava{
    public static void main(String[] args) {
        String str = "Hello World";
        char[] charArray = str.toCharArray();
        char[] reversedCharArray = new char[charArray.length];

        for(int i = 0; i < charArray.length; i++){
            reversedCharArray[i] = charArray[charArray.length - 1 - i];
        }

        String reversedStr = new String(reversedCharArray);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}
// output:
// Original String: Hello World 
// Reversed String: dlroW olleH

// 4. Using StringBuilder
class ReverseJava{
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}
// output:
// Original String: Hello World
// Reversed String: dlroW olleH

// 5. Using Recursion
class ReverseJava{
    public static void main(String[] args) {
        String str = "Hello World";
        String reversedStr = reverseString(str);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }

    public static String reverseString(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}

// output:
// Original String: Hello World
// Reversed String: dlroW olleH




