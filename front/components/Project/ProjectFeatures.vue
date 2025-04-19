<template>
  <section class="project-features">
    <h2 class="section-title">{{ title }}</h2>
    <div class="features-grid">
      <div v-for="feature in features" :key="feature.title" class="feature-card">
        <NuxtImg
          :src="feature.image" 
          :alt="feature.title"
          class="feature-image"
        />
        <h3 class="feature-title">{{ feature.title }}</h3>
        <p>{{ feature.description }}</p>
      </div>
    </div>
  </section>
</template>

<script setup>
defineProps({
  title: {
    type: String,
    default: 'Características'
  },
  features: {
    type: Array,
    required: true
  }
})
</script>

<style scoped>
.features-grid {
  @apply grid grid-cols-1 md:grid-cols-3 gap-8 mt-8;
}

.feature-card {
  @apply bg-zinc-900 p-6 rounded-lg transform transition-all duration-300 hover:scale-105 hover:shadow-xl;
}

.feature-image {
  @apply w-full h-48 object-cover rounded-lg mb-4;
}

.feature-title {
  @apply text-xl font-semibold mb-2 text-white;
}
</style> 