import mainView from "../views/mainView.js";

function start() {
    console.log("batata yo");
    mainView.clear()
    mainView.start();
}

export default {
    start,
    hash: 'main'
}