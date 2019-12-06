const image_map = {
    MEAL: "img/meals.jpg",
    WORKSHOP: "img/workshop.jpg",
    ADVENTURE: "img/nature.jpg",
    CONCERT: "img/concert.jpg",
    LADIES_NIGHT_OUT: "img/cocktail.jpg",
};

function renderEvent(events) {
    console.log(events);
    
    let html = events.reduce((acc, detail) => {
        acc += '<div class="event">';
        acc += "<img class=\"event_img\" src=" + image_map[detail.type] + " />";
        acc += `<div id=\"event_text\"><ul style=\"list-style-type:none;\"><li id=\"name_event\">${detail.name}</li>`;
        acc += `<li>${detail.location}</li>`;
        acc += `<li>${detail.description}</li>`;
        acc += '<button type=\"button\" class=\"btn btn-info\">Buy ticket</button></div></ul></div>';
        return acc;
    }, '');
    //html += '<button type=\"button\" class=\"btn btn-info\">Buy ticket</button>\"</div></ul></div>';

    $('#event').append($(html));
}

function start() {
    clear();
}

function clear() {
    $('#event').empty();
}

export default {
    start,
    renderEvent,
    clear
}