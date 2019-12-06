function start() {
    $('#event').append('<div class="col-12 col-md-3 mx-auto"><button type="submit" class="btn btn-block btn-lg btn-primary">Register Event</button></div>');
}

function clear() {
    $('#event').empty();
}

export default {
    start,
    clear
}