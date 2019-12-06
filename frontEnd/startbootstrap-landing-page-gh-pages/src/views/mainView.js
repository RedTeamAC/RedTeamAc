function start() {
    $('#event').append('<button type="submit" class="btn btn-block btn-lg btn-primary sign-company">Register Company</button>');
    $('#event').append('<button type="submit" class="btn btn-block btn-lg btn-primary sign-event">Register Event</button>');
    $('.sign-event').on('click', () => {window.location.hash = 'newEvent'});
    $('#event').append('<button type="submit" class="btn btn-block btn-lg btn-primary sign-user">Register User</button>');
}

function clear() {
    $('#event').empty();
}

export default {
    start,
    clear
}