import controllers from './controllers/index.js';

const defaultRoute = 'main';

function start() {
    window.onhashchange = window.onhashchange || function () {

        $('.search').on('click', () => {window.location.hash = 'search'});

        const controllerName = Object.keys(controllers).find(
            key => `#${controllers[key].hash}` === this.window.location.hash);

        if (!controllerName) {
            window.location.hash = defaultRoute;
            return;
        }

        controllers[controllerName].start();
    };

    if (!window.location.hash) {
        window.location.hash = `#${defaultRoute}`;
    }

}

export default {
    start
};