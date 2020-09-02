package ArrayList;

public class MyArrayList {

	private int size = 0;
	private Object[] elements;
	private int currentSize = 0;

	public MyArrayList() {
		this.currentSize = 10;
		elements = new Object[this.currentSize];
	}

	public MyArrayList(int size) {
		this.currentSize = size;
		elements = new Object[this.currentSize];
	}

	public void add(Object data) {
		if (this.size < this.elements.length) {
			this.elements[this.size] = data;
			size++;
		} else {
			this.currentSize = 2 * this.currentSize;
			Object[] newArray = new Object[this.currentSize];

			for (int i = 0; i < this.elements.length; i++) {
				newArray[i] = this.elements[i];
			}
			newArray[size] = data;
			size++;
			this.elements = newArray;
		}
	}

	public Object getInder(int index) {
		if (index < this.elements.length) {
			return this.elements[index];
		}
		return null;
	}

	public int getsize() {
		return this.size;
	}

}
