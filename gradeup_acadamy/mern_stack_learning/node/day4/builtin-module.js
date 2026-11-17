const os = require("os");
const path = require("path");
const fs = require("fs");

// console.log("Operating System:", os.platform());
// console.log("Architecture:", os.arch());
// console.log("CPU Information:", os.cpus().length);
// console.log("Free Memory:", os.freemem());
// console.log("Total Memory:", os.totalmem());
// console.log("Home Directory:", os.homedir());



// const filePath = "users/data/profile.txt";

// console.log("Directory:", path.dirname(filePath));
// console.log("File Name:", path.basename(filePath));
// console.log("Extension:", path.extname(filePath));
// console.log("Absolute Path:", path.resolve(filePath));


fs.writeFileSync("message.txt", "Hello Node.js!");

const data = fs.readFileSync("message.txt", "utf8");

// require("fs") loads the file system module.
// writeFileSync() creates or replaces the file.
// readFileSync() reads its contents.
// "utf8" tells Node.js to decode the file as text.

console.log(data);