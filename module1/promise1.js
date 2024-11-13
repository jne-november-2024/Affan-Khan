function fun2() {
    console.log("Fun2 is started...");
    
    let p1 = new Promise((resolve, reject) => {
        let success = false;
        if (success) {
            resolve("task completed...");
        } else {
            reject("an error occurred");
        }
    });

    p1.then((result) => {
        console.log(result);
    }).catch((error) => {
        console.log(error);
    });

    console.log("function 2 is ending...");
}

fun2();
