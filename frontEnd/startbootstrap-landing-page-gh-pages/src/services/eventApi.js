const api = {
    baseUrl: 'http://192.168.2.12:8080/events/api/events/list'
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
                    description: data.description
                })));
            })
            .fail(reject);
    });
}

export default {
    list
};

