package com.logics.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        
        int[] n={12,23,34,45,545,23};
        int max = Arrays.stream(n).max().getAsInt();
        System.out.println("Maximum Number in the Array "+max); //Finding the max element in array using stream api
        int min = Arrays.stream(n).min().getAsInt();
        System.out.println("Minimum Number in the Array "+min); //Finding the min element in array using stream api

        int sum = Arrays.stream(n).sum(); //Finding sum of the arrays
        System.out.println("Sum of the array "+sum);

        //Filter & Collect

        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> evenNumbers = numbers.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println("The Even Numbers in the list "+evenNumbers);

        //Transformation Map
        List<String> words=Arrays.asList("apple", "banana", "cherry");

        List<String> upperWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("The upper word in the list "+upperWords);

        //Find Duplicates / Distinct Elements

        List<Integer> duplicateList = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 1);

        List<Integer> uniqueNumbers = duplicateList.stream().distinct().collect(Collectors.toList());

        System.out.println("The UniqueNumber in the List "+uniqueNumbers);

        //Find Max, Min, and Average
        List<Integer> n1 = Arrays.asList(12, 45, 7, 23, 89, 34);

        int max1 = n1.stream().max(Integer::compare).orElse(0);
        int min1 = n1.stream().min(Integer::compare).orElse(0);
        double avg = n1.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println("Max: " + max1); // Max: 89
        System.out.println("Min: " + min1); // Min: 7
        System.out.println("Avg: " + avg); // Avg: 35.0


        //Grouping Data (Collectors.groupingBy)
        //Question: Group a list of words by their length.

        List<String> grpwWords = Arrays.asList("cat", "dog", "elephant", "bear", "fox");

        Map<Integer, List<String>> groupedByLength = grpwWords.stream().collect(Collectors.groupingBy(String::length));

        System.out.println("The group of the list with there length "+groupedByLength);

       // Question: Find the frequency of each character in a given String using Stream API.

        String input = "Vineet is the JAVA Developer";
        Map<Character, Long> charCount = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount); // Output: { =4, A=2, D=1, e=6, h=1, i=2, J=1, l=1, n=1, o=1, p=1, r=1, s=1, t=2, v=1, V=2}


        // Question: Find the 2nd largest number in an unsorted list.
        List<Integer> numList = Arrays.asList(10, 35, 89, 45, 89, 23);

        int secondMax = numList.stream()
                .distinct()                     // Remove duplicate highests
                .sorted(Comparator.reverseOrder()) // Sort descending
                .skip(1)                        // Skip the 1st highest
                .findFirst().orElse(0);
        System.out.println("Second Highest: " + secondMax);

//        Question: Given a list of lists (nested lists), flatten them into a single list.

        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Java", "Spring"),
                Arrays.asList("Python", "Django"),
                Arrays.asList("JavaScript", "React")
        );

        List<String> flatList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());

        System.out.println(flatList);
        // Output: [Java, Spring, Python, Django, JavaScript, React]

    }
}
