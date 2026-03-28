def linear_search(arr, key):
    for i in range(len(arr)):
        if arr[i] == key:
            return i  # return index
    return -1  # not found

# Example
arr = [12, 45, 7, 23, 89]
key = 23
result = linear_search(arr, key)

if result != -1:
    print(f"Element {key} found at index {result}")
else:
    print(f"Element {key} not found")
