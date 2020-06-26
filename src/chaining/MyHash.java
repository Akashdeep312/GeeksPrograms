package chaining;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHash {

	int BUCKET;
	LinkedList<Integer>[] table;

	MyHash() {
		this.BUCKET = 10;
		this.table = new LinkedList[BUCKET];

	}

	MyHash(int size) {
		this.BUCKET = size;
		this.table = new LinkedList[BUCKET];
	}

	int hash(int key) {
		return key % BUCKET;
	}

	void delete(int key) {
		int i = hash(key);
		table[i].remove(key);
	}

	void insert(int key) {
		int i = hash(key);
		if (table[i] == null) {
			table[i] = new LinkedList<Integer>();
		}
		table[i].add(key);
	}

	boolean search(int key) {
		int i = hash(key);
		if (table[i] != null) {
			for (Integer t : table[i]) {
				if (key == t)
					return true;
			}
		} else {
			return false;
		}

		return false;
	}

	@Override
	public String toString() {
		return "MyHash [BUCKET=" + BUCKET + ", table=" + Arrays.toString(table) + "]";
	}

}
