import { get } from "./request.config";

export async function getAllProjects() {
    try {
        const data = await get('/Project');

        return data;
    } catch (err: any) {
        console.error(err);
        throw err;
    }
};