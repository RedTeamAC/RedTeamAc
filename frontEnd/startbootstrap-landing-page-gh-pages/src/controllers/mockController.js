import eventApi from '../services/eventApi.js';

function start() {
    console.log('starting mock')
    eventApi.addEvent();
}

export default {
    start,
    hash: 'mock'
}