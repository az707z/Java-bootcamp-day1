void main() {
        Scanner input = new Scanner(System.in);
        //1-Develop a program that takes the weight (in kilograms) and height (in meters)
//as input and calculates the BMI, then prints it.
        int weight = 70;
        double height = 1.75;
        System.out.println("EX:1: The BMI is :" + weight / (height * height));
//2. Write a program that takes the obtained marks and total marks as input and
//calculates the percentage, then prints it.
        float Marks = 85f;
        int Total_Marks = 100;
        System.out.println("EX:2: Percentage: " + (Marks / Total_Marks) * 100 + "%");
/*3.Create a program that takes an amount in one currency and an exchange rate
        as input, then converts and prints the amount in another currency.*/
        int Amount_USA = 100;
        double Exchange_Rate = 0.85;
        System.out.println("EX:3: Amount in EUR:" + (Amount_USA*Exchange_Rate));
        //4. Create a program that takes a string as input, calculates its length, and then
        //reverses the string using the StringBuilder class, finally printing both the length and
        //reversed string.
        String hello ="Hello, world!";
        System.out.println("EX4: The String length is: "+hello.length());
        System.out.println("EX:4: "+new StringBuilder(hello).reverse());//The sours for this information in this link:https://www.w3schools.com/java/ref_stringbuilder_reverse.asp and then i use the print condition
        //
    /*5. Develop a program that takes a sentence as input and extracts a substring from
    it, then prints the extracted substring.*/
        //
        String sentence="The quick brown fox jumps over the lazy dog";/* I lernd the idea of the subSequence in this link:https://www.w3schools.com/java/ref_string_subsequence.asp*/
        System.out.println("Enter The First Index:");
        int start = input.nextInt();
        System.out.println("Enter The Second index:");
        int end = input.nextInt();
        System.out.println("ex:5: "+sentence.subSequence(start,end));
//
    /* 6.Write a program that takes a sentence and a keyword as input, then check if
    the keyword is present in the sentence and prints the result.*/
//
        String stetment2 ="The quick brown fox jumps over the lazy dog";
        System.out.println(stetment2);
        input.nextLine();
        System.out.println("Enter a Keyword to check: ");
        String keyWord = input.nextLine();
        boolean found = stetment2.contains(keyWord);
        System.out.println("EX:6: Keyword " +keyWord+ " is" + (found ? " present " : " absent ")+"in the sentence.");//I found the source for this condition in this link : https://dev.java/learn/language/constructs/numbers-strings/strings/
//
  /*7.Develop a program that takes a sentence and a word to replace as input, then
      replace all occurrences of the word with another word and prints the modified
      sentence.*/
//
        String modifiedSentence = sentence.replace("fox", "cat");
        System.out.println("EX:7: "+modifiedSentence);
//
   /*8.Write a program that takes two strings as input and check if they are equal,
ignoring the case, then prints whether they are equal or not.*/
//
        System.out.println("Enter The First Word: ");
        String first = input.nextLine();
        System.out.println("Enter The Second Word");
        String second =input.nextLine();
        boolean equal = first.equalsIgnoreCase(second);
        System.out.println(equal ? "EX:8: The strings are equal." : "The strings are different.");


    

}
