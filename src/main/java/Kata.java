
public class Kata
{
    public static int[] foldArray(int[] array, int runs)
    {
        for (int i = 0; i < runs; i++) {
            int lengthArray= array.length;
            if (lengthArray == 1) return array;
            int[] secondArray;
            int[] firstArray;
            int nextIndex=0;

            int arrayDivideBy2 =lengthArray/2;
            if (lengthArray%2 ==0){
                firstArray = new int[arrayDivideBy2];
                secondArray = new int[arrayDivideBy2];
            }else{
                firstArray = new int[arrayDivideBy2+1];
                secondArray = new int[arrayDivideBy2];
            }
            System.arraycopy(array, 0, firstArray, 0, firstArray.length);
            nextIndex=firstArray.length;
            System.arraycopy(array, nextIndex, secondArray, 0, secondArray.length);

            Kata kata = new Kata();
            array = kata.add(firstArray,secondArray);

        }

        return array;
    }

    private int[] add(int[] firstArray,int[] secondArray){
        for (int i = 0; i < secondArray.length; i++) {
            firstArray[i] = firstArray[i] + secondArray[secondArray.length-1-i];
        }
        return firstArray;
    }
}