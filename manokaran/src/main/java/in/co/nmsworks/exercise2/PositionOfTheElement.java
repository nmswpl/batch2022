package in.co.nmsworks.exercise2;

// Position of the Element
public class PositionOfTheElement
{
    public static void main(String[] args)
    {
        int[] array = {1,7,41};
        int elementIndex = -1;
        int searchElement = 41;
        System.out.println("search element : " + searchElement);
        for (int i = 0; i < array.length; i ++)
        {
            if (array[i] == searchElement)
            {
                elementIndex = i;
                break;
            }
        }
        System.out.println("Element Index : " + elementIndex);
    }
}
