input =  [{ a: 1 }, { b: 2 }, { c: 3 }];
function arr2obj(arr) {
    return arr.reduce((resObj, obj) => {
        return {...resObj, ...obj};
    }, {});
}
const obj = arr2obj(input);
console.log(obj);