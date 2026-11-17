// Web Workers allow you to run JavaScript code on a separate background thread in the browser, keeping your main UI thread smooth and responsive during heavy tasks. You create one by putting your heavy logic in a separate .js file and instantiating new Worker('file.js') from your main script.


// worker.js
self.onmessage = function (event) {
    const inputNumber = event.data;

    // Simulate a heavy calculation
    let total = 0;
    for (let i = 0; i < inputNumber; i++) {
        total += i;
    }

    // Send the final result back to the main thread
    self.postMessage(total);
};


// main.js
// 1. Spawn the background worker
const myWorker = new Worker("worker.js");

// 2. Send data to the worker to start the job
console.log("Sending heavy task to worker...");
myWorker.postMessage(1000000000);

// 3. Listen for the result from the worker
myWorker.onmessage = function (event) {
    console.log("Result received from worker:", event.data);
};

// 4. Handle any errors inside the worker
myWorker.onerror = function (error) {
    console.error("Worker error:", error.message);
};

console.log("Main thread is still free and responsive!");


// From the main thread:
myWorker.terminate();

// Or from inside worker.js:
self.close();



// When Should You Use a Web Worker?

// • Good use cases: Image or video processing, parsing massive JSON/CSV files, complex math/physics calculations, and client-side encryption.
// • Bad use cases: Simple API calls (fetch), basic DOM updates, or quick loops—the overhead of spinning up a worker will actually be slower than just using the main thread.