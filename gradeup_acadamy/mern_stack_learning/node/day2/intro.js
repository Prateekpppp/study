console.log(`
    Node.js is commonly described as a combination of:
    1. V8 engine => Executes JavaScript code.
    2. Node.js APIs and bindings => Provide functionality that 
    JavaScript does not get from the language itself.
        Example:-
            const fs = require("fs");
            const http = require("http");
            const path = require("path");
            These modules provide access to files, HTTP servers, 
            and file paths.
    3. Libuv => Libuv is a C library used by Node.js for asynchronous 
    I/O, event-loop implementation, and thread-pool operations.
    It helps Node.js handle operations such as:
    - File system operations.
    - DNS operations.
    - Certain cryptographic operations.
    - Network I/O.
    - Timers and event-loop scheduling.
    4. Event loop => The event loop coordinates when callbacks 
    are executed.
    For example, suppose a file takes 2 seconds to read.
    Node.js doesn't need to stop executing all other JavaScript while 
    waiting for that file operation to finish.
    Instead, it can continue processing other work.
    5. Operating system facilities
    `);
