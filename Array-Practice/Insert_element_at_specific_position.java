// Insert element at specific position
// note:Remember: arrays are fixed-size → inserting means creating a new array or shifting elements.

// Method 1️⃣ Insert element at specific index (MOST COMMON)
int[] arr = {10, 20, 30, 40, 50};
int index = 3;
int element = 99;

int[] newArr = new int[arr.length + 1];

for (int i = 0, j = 0; i < newArr.length; i++) {
    if (i == index) {
        newArr[i] = element;
    } else {
        newArr[i] = arr[j++];
    }
}

// Print
for (int x : newArr) {
    System.out.print(x + " ");
}
// output: 10 20 30 99 40 50


// Method 2️⃣ Insert using two loops (easiest to understand)int[] arr = {10, 20, 30, 40, 50};
int index = 2;
int element = 99;

int[] newArr = new int[arr.length + 1];

// Copy before index
for (int i = 0; i < index; i++) {
    newArr[i] = arr[i];
}

// Insert element
newArr[index] = element;

// Copy after index
for (int i = index; i < arr.length; i++) {
    newArr[i + 1] = arr[i];
}

for (int x : newArr) {
    System.out.print(x + " ");
}

// Method 3️⃣ Insert at beginning
int[] arr = {2, 3, 4};
int element = 1;

int[] newArr = new int[arr.length + 1];
newArr[0] = element;

for (int i = 0; i < arr.length; i++) {
    newArr[i + 1] = arr[i];
}
// ouput: 1 2 3 4


// Method 4️⃣ Insert at end
int[] arr = {1, 2, 3};

int[] newArr = new int[arr.length + 1];
for (int i = 0; i < arr.length; i++) {
    newArr[i] = arr[i];
}

newArr[arr.length] = 4;


// Method 5️⃣ Best real-life way → ArrayList
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);

list.add(1, 99); // index, element
System.out.println(list);


