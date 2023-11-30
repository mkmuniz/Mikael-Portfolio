import type { DehydratedState, VueQueryPluginOptions } from "@tanstack/vue-query";
import { VueQueryPlugin, QueryClient, hydrate, dehydrate } from "@tanstack/vue-query";
// Nuxt 3 app aliases
import { useState } from "#app";

export default defineNuxtPlugin((nuxt) => {
    const vueQueryState = useState<DehydratedState | null>("vue-query");

    // Modify your Vue Query global settings here
    // Existing code...
    const queryClient = new QueryClient({
        defaultOptions: {
            queries: {
                staleTime: Infinity,
            },
        }
    });
    // Ensure that `defaultQueryOptions` is used according to the library's updated API
    // For example, if the new property is `defaultOptions`, update accordingly
    const options: VueQueryPluginOptions = { queryClient };

    nuxt.vueApp.use(VueQueryPlugin, options);
    // Remaining code...


    if (process.server) {
        nuxt.hooks.hook("app:rendered", () => {
            vueQueryState.value = dehydrate(queryClient);
        });
    }

    if (process.client) {
        nuxt.hooks.hook("app:created", () => {
            hydrate(queryClient, vueQueryState.value);
        });
    }
});