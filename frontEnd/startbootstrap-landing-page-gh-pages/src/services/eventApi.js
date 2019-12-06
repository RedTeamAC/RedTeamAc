const api = {
    baseUrl: 'http://192.168.2.12:8080/events/api/event/list'
}

const newEvent = {
    name: "Beyonce",
    location: "PORTO",
    contact: "966111222",
    description: "Single Ladies Only",
    minAttendance: "10",
    maxAttendance: "50",
    type: "CONCERT"
}

function addEvent() {
    console.log('batata');
    return new Promise((resolve, reject) => {
        $.ajax({
            type: "POST",
            url: "http://192.168.2.12:8080/events/api/event/add",
            data: JSON.stringify(newEvent),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
        })
            .done(resolve)
            .fail(reject);
    });
}

function list() {
    return new Promise((resolve, reject) => {
        $.ajax({
            url: `${api.baseUrl}`
        })
            .done(response => {
                resolve(response.map((data) => ({
                    name: data.name,
                    location: data.location,
                    contact: data.contact,
                    description: data.description,
                    type: data.type
                })));
            }).fail(reject);
    });
}

export default {
    list,
    addEvent
};

