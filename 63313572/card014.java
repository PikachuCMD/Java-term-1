private static Integer[] removeDuplicates(Integer[] origArray) {
    Integer[] tempArray = new Integer[origArray.length];
    int indexJ = 0;
    for (int indexI = 0; indexI < origArray.length - 1; indexI++) 
    {
        Integer currentElement = origArray[indexI];
        if (currentElement != origArray[indexI+1]) {
            tempArray[indexJ++] = currentElement;
        }
    }
    tempArray[indexJ++] = origArray[origArray.length-1];
    return tempArray;
}