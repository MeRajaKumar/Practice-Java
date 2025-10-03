def binary_search(arr, key):
    low, high = 0, len(arr) - 1
    
    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == key:
            return mid
        elif arr[mid] < key:
            low = mid + 1
        else:
            high = mid - 1
    return -1

# Example
arr = [5, 12, 18, 23, 45, 89]
key = 23
result = binary_search(arr, key)

if result != -1:
    print(f"Element {key} found at index {result}")
else:
    print(f"Element {key} not found")
