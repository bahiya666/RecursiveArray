Overview
The RecursiveArray class provides an implementation of a dynamic array using recursive methods for operations like appending, prepending, searching, sorting, and more. The class allows you to manipulate and process an array of integers, leveraging recursion to perform standard array manipulations in a more elegant, recursive manner.

Key Features
Array Initialization from String:

The constructor takes an input string (comma-separated integers) and initializes the array.
The input string is parsed, and integers are recursively added to the array.
Appending and Prepending Elements:

Append elements to the end or prepend them to the beginning of the array recursively.
Search for Elements:

The contains method checks whether a given integer exists in the array using recursion.
Array Order Checks:

Methods to check if the array is sorted in ascending or descending order recursively.
Sorting the Array:

The sortAscending and sortDescending methods implement recursive bubble sort to sort the array in ascending or descending order.
Array Display:

The array is displayed as a comma-separated string, with support for an empty array.

Recursion Explanation
The class uses recursion in the following areas:

Array Initialization: The constructor parses the input string and recursively adds the elements to the array.
Appending and Prepending: The copyArray helper methods are recursive, allowing for efficient copying of arrays during append or prepend operations.
Search: The containsHelper method uses recursion to search for an element in the array.
Sorting: The sorting algorithms (recursiveBubbleSort and recursiveBubbleSortDescending) use recursion to repeatedly compare and swap elements in the array.
Performance Considerations
Time Complexity of Sorting: Both sortAscending and sortDescending use a recursive bubble sort algorithm. This algorithm has a time complexity of O(n²) in the worst case.
Space Complexity: The space complexity is O(n) for recursion calls and array storage.

Compilation:
javac *.java 
java Main  
