import java.util.ArrayList;
import java.util.List;
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


public class Merge <T extends Comparable<T>> {


	public List<T> mergeSort(List<T> original) {
		List<T> left = new ArrayList<>();
		List<T> right = new ArrayList<>();
		int center;
		if (original.size() == 1) {
			return original;
		} else {
			center = original.size() / 2;
			for (int i = 0; i < center; i++) {
				left.add(original.get(i));
			}
			for (int i = center; i < original.size(); i++) {
				right.add(original.get(i));
			}
			left = mergeSort(left);
			right = mergeSort(right);
			merge(left,right,original);
		}
		return original;
	}
	
	private void merge(List<T>left, List<T>right, List<T>original) {
		int leftIndex=0;
		int rightIndex=0;
		int originalIndex=0;
		
		while(leftIndex<left.size() && rightIndex<right.size()) {
			
			if(left.get(leftIndex).compareTo(right.get(rightIndex))<0) {
				original.set(originalIndex, left.get(leftIndex));
				leftIndex++;
			}else {
				original.set(originalIndex, right.get(rightIndex));
				rightIndex++;
			}
			originalIndex++;
		}
		
		while(leftIndex<left.size()) {
			original.set(originalIndex, left.get(leftIndex));
			originalIndex++;
			leftIndex++;
		}
		while(rightIndex<right.size()) {
			original.set(originalIndex, right.get(rightIndex));
			originalIndex++;
			rightIndex++;
		}
	}


    public static void main(String[] args) throws Exception {
        ArrayList<People> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i ++) {
             arrayList.add(new People(random.nextInt(50, 250)));
         }
		 
        System.out.println(arrayList.toString());
        (new Merge<People>()).mergeSort(arrayList);
        System.out.println(arrayList.toString());
        
        
        
        
        
        
        

}

   

}