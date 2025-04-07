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
    title: 'Mikael Muniz Ribeiro - Desenvolvedor Full Stack',
    ogTitle: 'Mikael Muniz Ribeiro - Desenvolvedor Full Stack',
    description: 'Sou Mikael Muniz Ribeiro, Desenvolvedor Full Stack Pleno com formação pela Universidade Mackenzie. Atuo com back-end e front-end, liderando projetos de tecnologia para grandes marcas do setor médico.',
    ogDescription: 'Desenvolvedor Full Stack com experiência em projetos estratégicos para grandes marcas. Conheça meu portfólio e trajetória profissional.',
    viewport: 'width=device-width, initial-scale=1',
})

</script>
<style>
@import url('../global/style.css');
</style>