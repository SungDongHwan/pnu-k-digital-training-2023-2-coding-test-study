const arr = [1, 2];
let arr2 = [3, ...arr];
console.log(arr2);
arr[1] = 4;
console.log(arr)
console.log(arr2);

arr