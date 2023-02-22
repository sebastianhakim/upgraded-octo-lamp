import java.util.ArrayList;
import java.util.Random;

class People implements Comparable<People> {
 int weight;

 public People(int weight) {
   this.weight = weight;
 }

 public int compareTo(People ppl){
   return weight - ppl.weight;
 }


@Override
 public String toString() {
  return "" + weight;
 }
}


public class Bubble {

    

        public static void bubbleSort(int[] array) {
            int n = array.length;
                for (int i = 0; i < n-1; i++)
                    for (int j = 0; j < n-i-1; j++)
                        if (array[j] > array[j+1])
                        {
                            int temp = array[j];
                            array[j] = array[j+1];
                            array[j+1] = temp;
                        }
                    }
    
        public static <E extends Comparable<E>> void bubbleSort(ArrayList<E> a) {
            for (int i = a.size(); i > 1; i--)
                    for (int j = 0; j < i - 1; j++)
                        if (a.get(j).compareTo(a.get(j+1)) > 0)
                        {
                            E temp = a.get(j);
                            a.set(j, a.get(j+1));
                            a.set(j+1, temp);
                        }



        }

 
 
    public static void main(String[] args) throws Exception {
        ArrayList<People> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i ++) {
             arrayList.add(new People(random.nextInt(50, 250)));
         }
        System.out.println(arrayList.toString());
        bubbleSort(arrayList);
        System.out.println(arrayList.toString());
      
        
      }
}
      




