package temp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {17, 10, 8, 13, 5, 7, 8, 30};

		// Init the element list
		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < array.length; i++) {
		    elements.add(new Element(i, array[i]));
		}

		// Sort and print
		Collections.sort(elements);
		Collections.reverse(elements); // If you want reverse order
		for (Element element : elements) {
		    System.out.println(element.value + " " + element.index);
		}
	}

}
class Element implements Comparable<Element> {

    int index, value;

    Element(int index, int value){
        this.index = index;
        this.value = value;
    }

    public int compareTo(Element e) {
        return this.value - e.value;
    }
}
