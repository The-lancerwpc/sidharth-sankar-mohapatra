input = {a:1, b:2, c:3}

function obj2arr(obj) {
    return Object.entries(obj).map(([key, value]) => {
        return {[key]: value}
    })
}

const arr = obj2arr(input);
console.log(arr);