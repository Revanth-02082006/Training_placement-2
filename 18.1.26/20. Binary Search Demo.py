def binary_search(arr,x):
    l,r=0,len(arr)-1
    while l<=r:
        mid=(l+r)//2
        if arr[mid]==x: return mid
        elif arr[mid]<x: l=mid+1
        else: r=mid-1
    return -1

print(binary_search([1,3,5,7,9],7))
