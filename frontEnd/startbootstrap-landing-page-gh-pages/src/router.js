import controllers from './controllers/index.js';

const defaultRoute = 'main';

function start() {
    window.onhashchange = window.onhashchange || function () {

        $('.btn-info').on('click', () => { window.location.hash = 'search' });
        $('.btn-create-new-event').on('click', () => { window.location.hash = 'mock' });

        console.log('---------------');
        console.log(controllers);
        console.log(this.window.location.hash);

        const controllerName = Object.keys(controllers).find(
            key => `#${controllers[key].hash}` === this.window.location.hash);


        console.log(Object.keys(controllers).find(
            key => `#${controllers[key].hash}` === this.window.location.hash))


        if (!controllerName) {
            window.location.hash = defaultRoute;
            return;
        }

        console.log(controllerName);

        controllers[controllerName].start();
    };

    if (!window.location.hash) {
        window.location.hash = `#${defaultRoute}`;
    }

}

export default {
    start
};