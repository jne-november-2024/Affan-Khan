let function1 = () => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve("Data From Function 1...");
        }, 5000);
    });
};

let function2 = () => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            reject("Data From Function 2 is not available...");
        }, 5000);
    });
};

Promise.allSettled([function1(), function2()])
    .then((results) => {
        results.forEach((result) => {
            if (result.status === 'fulfilled') {
                console.log("Success: " + result.value);
            } else {
                console.log("Failure: " + result.reason);
            }
        });
    })
    .catch((error) => {
       
        console.log("Error: " + error);
    });
