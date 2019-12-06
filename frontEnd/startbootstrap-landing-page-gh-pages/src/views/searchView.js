const image_map = {
    MEAL: "img/meals.jpg",
    WORKSHOP: "img/workshop.jpg",
    ADVENTURE: "img/nature.jpg",
    CONCERT: "img/concert.jpg",
    LADIES_NIGHT_OUT: "img/cocktail.jpg",
    
}

function renderEvent(event) {
    let html = event.reduce((acc, detail) => {
        acc += "<img class=\"event_img\" src=" + image_map[detail.image] + " />";
        acc += `<div id=\"event_text\"><ul style=\"list-style-type:none;\"><li id=\"name_event\">${detail.name}</li>`;
        acc += `<li>${detail.location}</li>`;
        acc += `<li>${detail.description}</li>`;
        return acc;
    }, '<div class="event">');
    html += '<button type=\"button\" class=\"btn btn-info\">Buy ticket</button>\"</div></ul></div>';

    $('#event').append($(html));
}

function render(events) {
    if (events) {
        events.forEach(renderEvent(event));
    }
}

function start() {
    clear();
}

function clear() {
    $('#event').empty();
}

export default {
    start,
    render,
    clear
}