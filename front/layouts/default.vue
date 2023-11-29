<template>
    <div class="bg-black">
        <Navbar />
        <slot />
        <Footer />
    </div>
</template>
<script setup lang="ts">
useSeoMeta({
    title: 'Mikael Muniz Ribeiro - Portfolio',
    ogTitle: 'Mikael Muniz Ribeiro - Portfolio',
    description: 'This is my amazing site, let me tell you all about it.',
    ogDescription: 'This is my amazing site, let me tell you all about it.',
})
</script>
<style>
@import url('../global/style.css');
/* Outros estilos */
</style>