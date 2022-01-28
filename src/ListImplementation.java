public class ListImplementation {

    private int count;
    private int[] list;
    private int length;

    public ListImplementation(int length) {
        count = 0;
        this.length = length;
        list = new int[length];
    }

    public void insert(int number) {
        // Check if array is full
        if(count < length) {
            list[count] = number;
            count += 1;
        } else {
            extendArray();
            insert(number);
        }
        // This runs twice

    }

    public void removeAt(int index) {
        // Move numbers right of the index one step to the left
        for(int i = index; i < length - 1; i++) {
            list[i] = list [i + 1];
        }
        count -= 1;
    }

    public void insertAt(int index, int item) {
        // Check íf there is at least 1 empty spot in the array
        // Move numbers starting 1 slot to the right starting at the end until the index
        if(count < length) {
            for(int i = count; i > index; i--) {
               list[i] = list [i - 1];
            }
            list[index] = item;
        }else{
            extendArray();
            insertAt(index, item);
        }

    }

    public void extendArray() {
        // double the size of the array
        // copy items
        int[] newArray = new int[length * 2];

        for(int i = 0; i < count; i++) {
            newArray[i] = list[i];
        }
        list = newArray;
        length = length * 2;
    }

    public void printList(){
        for (int item: list
             ) {
            System.out.print(item + ", ");
        }
        System.out.println("");
    }

    // Finds the first appearance of a given item
    public void indexOf(int number) {
        for (int i = 0; i < length; i++) {
            if(list[i] == number) {
                System.out.println(i);
            }
        }
    }
}
