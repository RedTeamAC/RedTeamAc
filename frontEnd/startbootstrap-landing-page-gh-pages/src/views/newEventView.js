function start() {
    clear();
    //present form
    let html = '<form>' +
        '<div class="form-row">' +
        '<div class="form-group">' +
        '<label for="inputAddress2">Name</label>' +
        '<input type="text" class="form-control" id="inputAddress2" placeholder="Event name">' +
        '</div>' +
        '<div class="form-group col-md-6">' +
            '<label for="inputEmail4">Email</label>' +
            '<input type="email" class="form-control" id="inputEmail4" placeholder="Email">' +
        '</div>' +
        '</div>' +
        '<div class="form-group">' +
        '<label for="inputAddress">Location</label>' +
        '<input type="text" class="form-control" id="inputAddress" placeholder="Event location">' +
        '</div>' +
        '<div class="form-row">' +
        '<div class="form-group col-md-6">' +
            '<label for="inputCity">Contact</label>' +
            '<input type="text" class="form-control" id="inputCity">' +
        '</div>' +
        '<div class="form-group col-md-6">' +
            '<label for="inputCity">Event Type</label>' +
            '<input type="text" class="form-control" id="inputCity">' +
        '</div>' +
        '</div>' +
        '<button type="submit" class="btn btn-primary btn-create-new-event">Sign in</button>' +
    '</form>';

    $('#event').html(html);

    $('.btn-create-new-event').on('click', () => {window.location.hash = 'mock'});
}

function clear() {
    $('#event').empty();
}

export default {
    start,
    clear
}