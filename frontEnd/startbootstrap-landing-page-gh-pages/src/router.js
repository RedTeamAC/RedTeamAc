import controllers from './controllers/index.js';

const defaultRoute = 'main';

function start() {
    window.onhashchange = window.onhashchange || function () {

        console.log('#1');
        const controllerName = Object.keys(controllers).find(
            key => `#${controllers[key].hash}` === window.location.hash
        );

        console.log(controllers);
        console.log(controllerName);
        
        if (!controllerName) {
            window.location.hash = defaultRoute;
            console.log('#2');
            return;
        }

        console.log('#3');
        controllers[controllerName].start();
    };

    if (!window.location.hash) {
        window.location.hash = `#${defaultRoute}`;
    }

}

export default {
    start
};