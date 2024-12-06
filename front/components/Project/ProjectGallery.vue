<template>
  <section class="project-gallery">
    <h2 class="section-title">{{ title }}</h2>
    <div class="gallery-grid">
      <img 
        v-for="(image, index) in images" 
        :key="index"
        :src="image.url" 
        :alt="image.alt" 
        class="gallery-image"
      >
    </div>
  </section>
</template>

<script setup>
defineProps({
  title: {
    type: String,
    default: 'Galeria'
  },
  images: {
    type: Array,
    required: true
  }
})
</script>

<style scoped>
.gallery-grid {
  @apply grid grid-cols-1 md:grid-cols-3 gap-4 mt-8;
}

.gallery-image {
  @apply w-full h-64 object-cover rounded-lg transition-transform hover:scale-105;
}
</style> 