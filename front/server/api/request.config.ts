const baseUrlApi = "http://localhost:5106";

export async function post(url: string, body: any) {
    try {
        const response = await fetch(baseUrlApi + url, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json',
            },
            body: JSON.stringify(body)
        });

        const data = await response.json();
        
        return data;
    } catch (err) {
        console.error(err);
        throw err;
    }
};

export async function get(url: string) {
    try {
        const response = await fetch(baseUrlApi + url, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json',
            }
        });

        return response;
    } catch (err) {
        console.error(err);
        throw err;
    }
};

export async function patch(url: string, body: any) {
    try {
        const response = await fetch(baseUrlApi + url, {
            method: 'PATCH',
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json',
            },
            body: JSON.stringify(body)
        });

        const data = await response.json();
        
        return data;
    } catch (err) {
        console.error(err);
        throw err;
    }
};