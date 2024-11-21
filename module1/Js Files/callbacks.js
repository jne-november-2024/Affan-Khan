function name(names, callbacks) {
    console.log("hi");
    callbacks();  
    console.log("end of name");
}

function callbacks() {
    console.log("hello in callback");
}

name("affan", callbacks);
