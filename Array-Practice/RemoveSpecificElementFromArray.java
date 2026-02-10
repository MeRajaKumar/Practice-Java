// ques Remove specific element from array
// Arrays in Java are fixed-size, so you can’t truly “delete” an element — you shift elements and create a new logical size.

// Case 1️⃣ Remove by VALUE (e.g. remove 5)
int[] arr = {1, 2, 5, 3, 5, 6};
int remove = 5;

int newSize = 0;

// Count elements not equal to remove
for (int i = 0; i < arr.length; i++) {
    if (arr[i] != remove) {
        newSize++;
    }
}

// Create new array
int[] result = new int[newSize];
int index = 0;

// Copy elements
for (int i = 0; i < arr.length; i++) {
    if (arr[i] != remove) {
        result[index++] = arr[i];
    }
}

// Print result
for (int x : result) {
    System.out.print(x + " ");
}


// Case 2️⃣ Remove by INDEX (e.g. index 2)int[] arr = {10, 20, 30, 40, 50};
int removeIndex = 2;

int[] result = new int[arr.length - 1];
int j = 0;

for (int i = 0; i < arr.length; i++) {
    if (i != removeIndex) {
        result[j++] = arr[i];
    }
}

for (int x : result) {
    System.out.print(x + " ");
}
// output: 10 20 40 50



// Case 3️⃣ Remove FIRST occurrence only
int[] arr = {1, 2, 5, 3, 5, 6};
int remove = 5;

boolean removed = false;
int[] temp = new int[arr.length - 1];
int j = 0;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == remove && !removed) {
        removed = true;   // skip first occurrence
        continue;
    }
    if (j < temp.length) {
        temp[j++] = arr[i];
    }
}


// Case 4️⃣ Best practical approach → ArrayList
ArrayList<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(5);

list.remove(Integer.valueOf(5)); // remove by value
