<template>
    <div class="bg-black">
        <SpeedInsights />
        <Navbar />
        <slot />
    </div>
</template>
<script setup lang="ts">
import { SpeedInsights } from "@vercel/speed-insights/nuxt"

useSeoMeta({
    title: 'Mikael Muniz Ribeiro - Portfolio',
    ogTitle: 'Mikael Muniz Ribeiro - Portfolio',
    description: 'This is my amazing site, let me tell you all about it.',
    ogDescription: 'This is my amazing site, let me tell you all about it.',
    viewport: 'width=device-width, initial-scale=1',
})
</script>
<style>
@import url('../global/style.css');
/* Outros estilos */
</style>