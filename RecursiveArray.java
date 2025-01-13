public class RecursiveArray {
    public Integer[] array;

    public RecursiveArray() 
    {
        this.array = new Integer[0];
    }

    public RecursiveArray(String input) //the input comes as a string but our array is integer
    {
        if (input.isEmpty())
        {
            this.array = new Integer[0]; //no input->make array size 0
        }
        else
        {
            String[] elements =input.split(",\\s*"); //created an array for string and stored te input in it
            
            this.array = initializeArray(elements, 0, new Integer[elements.length]);

            
        }

    }

    // Recursive helper method to initialize the array from string elements
    private Integer[] initializeArray(String[] elements, int index, Integer[] result) 
    {
        if (index < elements.length) 
        {
            String element = elements[index].replaceAll(",", "").trim();
            result[index] = Integer.parseInt(element);
            return initializeArray(elements, index + 1, result);
        } 
        else 
        {
            return result;
        }
    }

    @Override
    public String toString() {
        if (array.length == 0) {
            return "Empty Array";
        }
        return "[" + arrayToString(0) + "]";
    }
    
    private String arrayToString(int index) {
        if (index == array.length) {
            return "";
        }
        if (index == 0) {
            return array[index] + arrayToString(index + 1);
        }
        return "," + array[index] + arrayToString(index + 1);
    }
    
    public void append(Integer value)
    {
        if (array.length==0)
        {
            array=new Integer[]{value};
        }
        else
        {
            Integer[] newarr=new Integer[array.length+1];
            copyArray(array, newarr, 0);
            newarr[array.length] =value;
            array=newarr;
        }
    }
    private void copyArray(Integer[] original, Integer[] newarr, int index)
    {
        if (index < original.length)
        {
            newarr[index] =original[index];
            copyArray(original,newarr, index + 1);
        }
    }

    public void prepend(Integer value) 
    {
        if (array.length == 0) {
            array = new Integer[]{value};
        } 
        else 
        {
            Integer[] newarr = new Integer[array.length + 1];
            newarr[0] = value; // Place the new value at the beginning
            copyArray(array, newarr, 0, 1); // Copy the original array starting from index 0 to index 1
            array = newarr;
        }
    }
    
    private void copyArray(Integer[] original, Integer[] newarr, int originalIndex, int newIndex) 
    {
        if (originalIndex < original.length) 
        {
            newarr[newIndex] = original[originalIndex];
            copyArray(original, newarr, originalIndex + 1, newIndex + 1);
        }
    }
    

    public boolean contains(Integer value) 
    {
        if (value == null || array.length == 0) 
        {
            return false;
        }
        return containsHelper(value, 0);
    }

    private boolean containsHelper(Integer value, int index) 
    {
        if (index == array.length) 
        {
            return false;
        }
    
        if (array[index].equals(value)) 
        {
            return true;
        }
    
        return containsHelper(value, index + 1);
    }

    public boolean isAscending() {
        if (array.length <= 1) {
            return true;
        }
        return isAscendingHelper(0, array.length - 1); // Pass the start and end indices of the array
    }
    
    private boolean isAscendingHelper(int start, int end) {
        // Base case: If we reach the end of the array, return true
        if (start == end) {
            return true;
        }
    
        // Check if the current element is greater than the next element
        if (array[start] > array[start + 1]) {
            return false;
        }
    
        // Recur with the next element
        return isAscendingHelper(start + 1, end);
    }
    
    public boolean isDescending() {
        if (array.length <= 1) {
            return true;
        }
        return isDescendingHelper(0, array.length - 1); // Pass the start and end indices of the array
    }
    
    private boolean isDescendingHelper(int start, int end) {
        // Base case: If we reach the end of the array, return true
        if (start == end) {
            return true;
        }
    
        // Check if the current element is less than the next element
        if (array[start] < array[start + 1]) {
            return false;
        }
    
        // Recur with the next element
        return isDescendingHelper(start + 1, end);
    }
    
    
    public void sortAscending() {
        recursiveBubbleSort(0, 0);
    }
    
    private void recursiveBubbleSort(int startIndex, int swapped) {
        if (startIndex >= array.length - 1) {
            if (swapped == 0) {
                return; // Base case: No swaps, array is already sorted
            }
            recursiveBubbleSort(0, 0); // Start sorting again from the beginning
            return;
        }
    
        if (array[startIndex] > array[startIndex + 1]) {
            // Swap elements if they are in the wrong order
            int temp = array[startIndex];
            array[startIndex] = array[startIndex + 1];
            array[startIndex + 1] = temp;
            swapped = 1; // Set swapped flag
        }
    
        // Recur with the next element
        recursiveBubbleSort(startIndex + 1, swapped);
    }
    
    public void sortDescending() {
        recursiveBubbleSortDescending(0, 0);
    }
    
    private void recursiveBubbleSortDescending(int startIndex, int swapped) {
        if (startIndex >= array.length - 1) {
            if (swapped == 0) {
                return; // Base case: No swaps, array is already sorted
            }
            recursiveBubbleSortDescending(0, 0); // Start sorting again from the beginning
            return;
        }
    
        if (array[startIndex] < array[startIndex + 1]) {
            // Swap elements if they are in the wrong order for descending order
            int temp = array[startIndex];
            array[startIndex] = array[startIndex + 1];
            array[startIndex + 1] = temp;
            swapped = 1; // Set swapped flag
        }
    
        // Recur with the next element
        recursiveBubbleSortDescending(startIndex + 1, swapped);
    }
}    