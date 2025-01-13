public class Main 
{
    public static void main(String[] args) 
    {
        // Test case 1: Empty input string
        RecursiveArray array1 = new RecursiveArray("");
        System.out.println("Array 1: " + array1);

        // Test case 2: Non-empty input string with integers
        RecursiveArray array2 = new RecursiveArray("1,2,3,4,5");
        System.out.println("Array 2: " + array2);
        
        //toString
        // Test case 1: Empty array
        RecursiveArray array3 = new RecursiveArray("");
        System.out.println("Array 3 (toString): " + array3.toString());

        // Test case 2: Array with single element
        RecursiveArray array4 = new RecursiveArray("1");
        System.out.println("Array 4 (toString): " + array4.toString());

        // Test case 3: Array with multiple elements
        RecursiveArray array5 = new RecursiveArray("1,2,3,4,5");
        System.out.println("Array 5 (toString): " + array5.toString());
        RecursiveArray array6 = new RecursiveArray("");
        array6.append(1);
        System.out.println("Array 6 (Append): " + array6);

        RecursiveArray array7 = new RecursiveArray("1");
        array7.append(2);
        System.out.println("Array 7 (Append): " + array7);

        RecursiveArray array8 = new RecursiveArray("1,2,3,4,5");
        array8.append(6);
        System.out.println("Array 8 (Append): " + array8);

        // Test cases for prepend
        RecursiveArray array9 = new RecursiveArray("");
        array9.prepend(1);
        System.out.println("Array 9 (Prepend): " + array9);

        RecursiveArray array10 = new RecursiveArray("1");
        array10.prepend(0);
        System.out.println("Array 10 (Prepend): " + array10);

        RecursiveArray array11 = new RecursiveArray("2,3,4,5");
        array11.prepend(1);
        System.out.println("Array 11 (Prepend): " + array11);

        //contains
        // Test case 1: Array is empty
        RecursiveArray array12 = new RecursiveArray("");
        System.out.println("Array 12 (Contains 1): " + array12.contains(1));

        // Test case 2: Array has one element and it matches
        RecursiveArray array13 = new RecursiveArray("1");
        System.out.println("Array 13 (Contains 1): " + array13.contains(1));

        // Test case 3: Array has one element but it doesn't match
        RecursiveArray array14 = new RecursiveArray("2");
        System.out.println("Array 14 (Contains 1): " + array14.contains(1));

        // Test case 4: Array has multiple elements and one of them matches
        RecursiveArray array15 = new RecursiveArray("1,2,3,4,5");
        System.out.println("Array 15 (Contains 3): " + array15.contains(3));

        // Test case 5: Array has multiple elements but none match
        RecursiveArray array16 = new RecursiveArray("1,2,3,4,5");
        System.out.println("Array 16 (Contains 6): " + array16.contains(6));

        //isascending 
        // Test case 1: Empty array
        RecursiveArray array17 = new RecursiveArray("");
        System.out.println("Array 17 (isAscending): " + array17.isAscending());

        // Test case 2: Array with one element
        RecursiveArray array18 = new RecursiveArray("1");
        System.out.println("Array 18 (isAscending): " + array18.isAscending());

        // Test case 3: Array with multiple elements in ascending order
        RecursiveArray array19 = new RecursiveArray("1,2,3,4,5");
        System.out.println("Array 19 (isAscending): " + array19.isAscending());

        // Test case 4: Array with multiple elements not in ascending order
        RecursiveArray array20 = new RecursiveArray("56,34,12,1");
        System.out.println("Array 20 (isAscending): " + array20.isAscending());

        // Test case 5: Array with multiple elements all equal
        RecursiveArray array21 = new RecursiveArray("1,1,1,1,1");
        System.out.println("Array 21 (isAscending): " + array21.isAscending());

        //isdescending
        // Test case 1: Empty array
        RecursiveArray array22 = new RecursiveArray("");
        System.out.println("Array 22 (isDescending): " + array22.isDescending());

        // Test case 2: Array with one element
        RecursiveArray array23 = new RecursiveArray("1");
        System.out.println("Array 23 (isDescending): " + array23.isDescending());

        // Test case 3: Array with multiple elements in descending order
        RecursiveArray array24 = new RecursiveArray("34,33,24,23");
        System.out.println("Array 24 (isDescending): " + array24.isDescending());

        // Test case 4: Array with multiple elements not in descending order
        RecursiveArray array25 = new RecursiveArray("1,2,4,3,5");
        System.out.println("Array 25 (isDescending): " + array25.isDescending());

        // Test case 5: Array with multiple elements all equal
        RecursiveArray array26 = new RecursiveArray("1,1,1,1,1");
        System.out.println("Array 26 (isDescending): " + array26.isDescending());

        //sortascending
        RecursiveArray array27 = new RecursiveArray("");
        array27.sortAscending();
        System.out.println("Array 27 (Sorted ascending): " + array27);

        // Test case 2: Array with one element
        RecursiveArray array28 = new RecursiveArray("1");
        array28.sortAscending();
        System.out.println("Array 28 (Sorted ascending): " + array28);

        // Test case 3: Array with multiple elements in ascending order
        RecursiveArray array29 = new RecursiveArray("11,15,17,19");
        array29.sortAscending();
        System.out.println("Array 29 (Sorted ascending): " + array29);

        // Test case 4: Array with multiple elements in descending order
        RecursiveArray array30 = new RecursiveArray("5,4,3,2,1");
        array30.sortAscending();
        System.out.println("Array 30 (Sortedascending): " + array30);

        // Test case 5: Array with multiple elements, some repeated
        RecursiveArray array31 = new RecursiveArray("3,1,4,1,5,9,2,6,5,3,5");
        array31.sortAscending();
        System.out.println("Array 31 (Sorted ascending): " + array31);

        // Test case 6: Array with multiple elements in descending order
        RecursiveArray array32 = new RecursiveArray("89,87,54,2");
        array32.sortAscending();
        System.out.println("Array 32 (Sorted ascending): " + array32);

        //sortdescending
        // Test case 1: Empty array
        RecursiveArray array33 = new RecursiveArray("");
        array33.sortDescending();
        System.out.println("Array 33 (Sorted in Descending Order): " + array33);

        // Test case 2: Array with one element
        RecursiveArray array34 = new RecursiveArray("1");
        array2.sortDescending();
        System.out.println("Array 34 (Sorted in Descending Order): " + array34);

        // Test case 3: Array with multiple elements in ascending order
        RecursiveArray array35 = new RecursiveArray("1,2,3,4,5");
        array35.sortDescending();
        System.out.println("Array 35 (Sorted in Descending Order): " + array35);

        // Test case 4: Array with multiple elements in descending order
        RecursiveArray array36 = new RecursiveArray("5,4,3,2,1");
        array36.sortDescending();
        System.out.println("Array 36 (Sorted in Descending Order): " + array36);

        // Test case 4: Array with multiple elements in descending order
        RecursiveArray array37 = new RecursiveArray("99,55,33,22");
        array37.sortDescending();
        System.out.println("Array 37 (Sorted in Descending Order): " + array37);

        // Test case 5: Array with multiple elements, some repeated
        RecursiveArray array38 = new RecursiveArray("3,1,4,1,5,9,2,6,5,3,5");
        array38.sortDescending();
        System.out.println("Array 38 (Sorted in Descending Order): " + array38);

        // Test case 5: Array with multiple elements, some repeated
        RecursiveArray array39 = new RecursiveArray("65,37,86,10,38");
        array39.sortDescending();
        System.out.println("Array 39 (Sorted in Descending Order): " + array39);
    }
    

    
    
}