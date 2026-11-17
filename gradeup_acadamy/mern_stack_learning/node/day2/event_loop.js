// console.log(`

//     1. The Main Thread (Single-Threaded)

//     • Call Stack: All your standard JavaScript code runs here, one line at
//     a time.
//     • The Event Loop: This is a continuous loop running on the main
//     thread. Its only job is to check if the Call Stack is empty, and if 
//     so, push waiting callbacks from the queues onto the Call Stack to be 
//     executed.

//  `);

// console.log(`

//     2. Background Threads (Handled by the Runtime)

//     JavaScript engines (like V8) do not have built-in timers, network 
//     handlers, or file system access. Those are provided by the host 
//     environment (Web APIs in the browser, or C++ APIs / libuv in Node.js)


//     3. How They Communicate

//     • Step 1: JavaScript sends an async task (like fetch()) to the browser
//      or Node.js runtime and moves on to the next line of code.
//     • Step 2: A background thread completes the work (downloads the data).
//     • Step 3: That background thread places your callback function into a
//      Task Queue (or Microtask Queue for Promises).
//     • Step 4: The Event Loop sees that the main Call Stack is empty, picks 
//     up the callback from the queue, and executes it back on the Main Thread.

//     Microtasks vs. Macrotasks
//     Web Workers or Node.js Worker Threads
//     Node.js libuv thread pool
// `);



const fs = require('fs');

console.log('1. Synchronous Main Line');

setImmediate(() => console.log('3. Check (setImmediate)'));

setTimeout(() => console.log('2. Timer (setTimeout) Macrotask queue runs last'), 0);

process.nextTick(() => console.log(`
    4. Microtask (process.nextTick)
    Microtask queue runs immediately after sync code
    `));

Promise.resolve().then(() => console.log('5. Microtask (Promise)'));

fs.readFile(__filename, () => {
    console.log('6. I/O Callback');
});

console.log('7. Synchronous End Line');
